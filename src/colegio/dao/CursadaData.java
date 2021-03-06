package colegio.dao;

import colegio.entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;

public class CursadaData {
// Atributos

  private Connection con = null;
  private AlumnoData alumData;
  private MateriaData matData;

// Constructores
  public CursadaData(Conexion conexion) {
    con = conexion.getConexion();
    this.alumData = new AlumnoData(conexion);
    this.matData = new MateriaData(conexion);
  }

//  Metodos
  public boolean existeCursada(Cursada cursada) {
    boolean existe = false;

    String sql = "SELECT * FROM cursada WHERE idMateria = ? AND idAlumno = ? ;";

    try {

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, cursada.getMateria().getId());
      ps.setInt(2, cursada.getAlumno().getId());

      ResultSet rs = ps.executeQuery();

      if (rs.next() && cursada.getMateria().getId() == rs.getInt("idMateria") && cursada.getAlumno().getId() == rs.getInt("idAlumno")) {
        existe = true;
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al comparar cursadas " + ex);
    }

    return existe;
  }

  public boolean guardarCursada(Cursada cursada) {

    if (existeCursada(cursada)) {
      JOptionPane.showMessageDialog(null, cursada.getAlumno().getNombre() + " ya está inscripto en " + cursada.getMateria().getNombre());
      return false;
    }

    boolean guardado = false;

    String sql = "INSERT INTO cursada (idAlumno, idMateria, nota) VALUES (?, ?, ?)";

    try {
      PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      ps.setInt(1, cursada.getAlumno().getId());
      ps.setInt(2, cursada.getMateria().getId());
      ps.setDouble(3, cursada.getNota());

      ps.executeUpdate();

      ResultSet rs = ps.getGeneratedKeys();

      if (rs.next()) {
        cursada.setId(rs.getInt("id"));
        guardado = true;
      }

      ps.close();

    } catch (SQLException exc) {
      JOptionPane.showMessageDialog(null, "No se pudo agregar cursada" + exc);
    }

    return guardado;
  }

  public ArrayList<Cursada> obtenerCursadas() {
    ArrayList<Cursada> cursadas = new ArrayList<>();

    String sql = "SELECT * FROM cursada";

    try {
      PreparedStatement ps = con.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();

      Cursada cursada;

      while (rs.next()) {
        cursada = new Cursada();
        cursada.setId(rs.getInt("id"));

        Alumno a = alumData.obtenerAlumno(rs.getInt("idAlumno"));
        cursada.setAlumno(a);

        Materia m = matData.obtenerMateria(rs.getInt("idMateria"));
        cursada.setMateria(m);

        cursada.setNota(rs.getDouble("nota"));

        cursadas.add(cursada);
      }

      ps.close();

    } catch (SQLException exc) {
      JOptionPane.showMessageDialog(null, "No se pudo obtener cursadas " + exc);
    }

    return cursadas;
  }

  public boolean actualizarNota(Alumno alum, Materia mat, double nota) {
    boolean actualizado = false;

    String sql = "UPDATE cursada SET nota = ? WHERE idAlumno = ? AND idMateria = ?";

    try {

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setDouble(1, nota);
      ps.setInt(2, alum.getId());
      ps.setInt(3, mat.getId());

      if (ps.executeUpdate() != 0) {
        actualizado = true;
      }

      ps.close();

    } catch (SQLException exc) {
      JOptionPane.showMessageDialog(null, "No se pudo actualizar la nota " + exc);
    }

    return actualizado;
  }

  //Dado un alumno nos devuelva las materias en las que está inscripto
  public List<Materia> verMateriasInscriptas(Alumno a) {
    ArrayList<Materia> materias = new ArrayList();

    try {
      String sql = "SELECT * FROM cursada WHERE idAlumno = ? ;";

      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, a.getId());

      ResultSet rs = ps.executeQuery();

      if (!rs.next()) {
        JOptionPane.showMessageDialog(null, a.getNombre() + " no está inscripto en ninguna materia.");
      }
      rs.previous();

      Materia mat;

      while (rs.next()) {
        mat = matData.obtenerMateria(rs.getInt("idMateria"));

        materias.add(mat);
      }

      ps.close();

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Error al obtener las materias: " + e.getMessage());
    }

    return materias;
  }

  //Dado un alumno nos devuelva las materias en las que NO está inscripto.
  public ArrayList<Materia> verMateriasNoInscriptas(Alumno alumno) {
    ArrayList<Materia> materias = new ArrayList();

    try {
      String sql = "SELECT * FROM materia WHERE id NOT IN (SELECT idMateria FROM cursada WHERE idAlumno = ?) AND activo = 1;";

      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, alumno.getId());

      ResultSet rs = ps.executeQuery();

      Materia m;

      while (rs.next()) {
        m = matData.obtenerMateria(rs.getInt("id"));

        materias.add(m);
      }
      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener las materias: " + ex.getMessage());
    }

    return materias;
  }

  //Dada una materia nos devuelva los alumnos inscriptos en ella.
  public ArrayList<Alumno> alumnosConMateria(Materia mat) {

    ArrayList<Alumno> alumnosConMateria = new ArrayList();

    String sql = "SELECT * FROM cursada WHERE idMateria = ? ";

    try {
      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, mat.getId());
      ResultSet rs = ps.executeQuery();

      Alumno alum = null;

      if (!rs.next()) {
        JOptionPane.showMessageDialog(null, "No hay alumnos anotados");
        ps.close();
        return alumnosConMateria;
      }

      rs.previous();

      while (rs.next()) {

        alum = new Alumno();
        alum = alumData.obtenerAlumno(rs.getInt("idAlumno"));
        alumnosConMateria.add(alum);
      }

      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener alumnos inscriptos " + ex);
    }

    return alumnosConMateria;
  }

  //Borrar una cursada
  public boolean borrarCursada(int id) {
    boolean resultado = false;
    String sql = "DELETE FROM cursada WHERE id = ?";

    try {
      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, id);

      if (ps.executeUpdate() != 0) {
        resultado = true;
        JOptionPane.showMessageDialog(null, "La Cursada ha sido eliminada");
      }
      ps.close();
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al Borrar Materias " + ex);
    }
    return resultado;
  }

  public ArrayList<Cursada> obtenerCursadasDeAlumno(Alumno alum) {
    ArrayList<Cursada> cursadas = new ArrayList<>();

    String sql = "SELECT * FROM cursada WHERE idAlumno = ?";

    try {

      PreparedStatement ps = con.prepareStatement(sql);

      ps.setInt(1, alum.getId());

      ResultSet rs = ps.executeQuery();

      Cursada cursada;

      while (rs.next()) {

        int idCursada = rs.getInt("id");
        Materia materia = matData.obtenerMateria(rs.getInt("idMateria"));
        Alumno alumno = alum;
        double nota = rs.getDouble("nota");

        cursada = new Cursada(idCursada, alumno, materia, nota);

        cursadas.add(cursada);

      }

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener cursadas " + ex);
    }

    return cursadas;
  }
  
  public boolean eliminarCursada(int idAlumno, int idMateria) {
        boolean result = true;
        String sql = "DELETE FROM cursada WHERE cursada.idAlumno =" + idAlumno+" and idMateria= "+idMateria;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            int rs = ps.executeUpdate();
            if (rs == 0) {
                result = false;
            }

            ps.close();
        } catch (SQLException ex) {
            result = false;
            JOptionPane.showMessageDialog(null, "Error de sintaxis\n" + ex);
        }

        return result;
    }
  
}

//Funcionalidades que faltarían:
//Borrar una cursada 
//Dado un alumno nos devuelva las materias en las que está inscripto
//Dado un alumno nos devuelva las materias en las que NO está inscripto
//Dada una materia nos devuelva los alumnos inscriptos en ella.

