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
    public List<Materia> verMateriasInscriptas(Alumno a){
        ArrayList<Materia> materias = new ArrayList();
        
        try{
            String sql = "SELECT * FROM cursada WHERE idAlumno = ? ;";
            
            PreparedStatement ps = con.prepareStatement(sql);            
            ps.setInt(1, a.getId());
            
            ResultSet rs = ps.executeQuery();
            
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, a.getNombre() + " no está inscripto en ninguna materia.");
            }
            rs.previous();  
            
            Materia mat;
            
            while(rs.next()){
                mat = matData.obtenerMateria(rs.getInt("idMateria"));
                                
                materias.add(mat);
            }
                        
            ps.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener las materias: " + e.getMessage());
        }
        
        return materias;
    } 
    
    //Dada una materia nos devuelva los alumnos inscriptos en ella.
    public ArrayList<Alumno> alumnosConMateria(int id) {

        ArrayList<Alumno> alumnosConMateria = new ArrayList();

        String sql = "SELECT * FROM cursada WHERE idMateria = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            Alumno alumno;

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No hay alumnos anotados");
                ps.close();
                return alumnosConMateria;
            }

            rs.previous();

            while (rs.next()) {
                alumno = new Alumno();

                alumno.setId(rs.getInt("idAlumno"));

//                alumno.setNombre(rs.getString("nombre"));
//                alumno.setApellido(rs.getString("apellido"));
//                alumno.setFechNac(rs.getDate("fechNac").toLocalDate());
//                alumno.setDni(rs.getLong("dni"));
//                alumno.setActivo(rs.getBoolean("activo"));

                alumnosConMateria.add(alumno);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener alumnos inscriptos " + ex);
        }

        return alumnosConMateria;
    }

}

//Funcionalidades que faltarían:
//Borrar una cursada (delete)
//Dado un alumno nos devuelva las materias en las que está inscripto
//Dado un alumno nos devuelva las materias en las que NO está inscripto
//Dada una materia nos devuelva los alumnos inscriptos en ella.

