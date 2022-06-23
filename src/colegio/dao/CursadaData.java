package colegio.dao;

import colegio.entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
  public boolean guardarCursada(Cursada cursada) {
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
      
    } catch(SQLException exc) {
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
      
      while(rs.next()) {
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
      
    } catch(SQLException exc) {
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
      
    } catch(SQLException exc) {
      JOptionPane.showMessageDialog(null, "No se pudo actualizar la nota " + exc);
    }
    
    return actualizado;
  }
}
