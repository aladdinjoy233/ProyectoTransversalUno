package colegio.dao;

import colegio.entidades.Alumno;
import java.sql.Date;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnoData {
//    Atributos
  private Connection con = null;

//    Construcor
  public AlumnoData(Conexion conexion) {
    con = conexion.getConexion();
  }

//    Metodos
  public boolean agregarAlumno(Alumno alumno) {
    
    boolean insert = true;
    
    String sql = "INSERT INTO alumno (nombre, apellido, fechNac, dni, activo) VALUES (?, ?, ?, ?, ?)";
    
    try {
      PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      ps.setString(1, alumno.getNombre());
      ps.setString(2, alumno.getApellido());
      ps.setDate(3, Date.valueOf(alumno.getFechNac()));
      ps.setLong(4, alumno.getDni());
      ps.setInt(5, alumno.isActivo() ? 1 : 0);
      
      ps.executeUpdate();
      ResultSet rs = ps.getGeneratedKeys();
      
      if (rs.next()) {
        alumno.setId(rs.getInt(1));
      } else {
        insert = false;
      }
      
      ps.close();
      
    } catch(SQLException ex) {
      insert = false;
      if (ex instanceof java.sql.SQLIntegrityConstraintViolationException) {
        JOptionPane.showMessageDialog(null, "Ya existe un alumno con ese DNI");
      } else {
        JOptionPane.showMessageDialog(null, "Error al agregar alumno " + ex);      
      }
    }
    
    return insert;
  }
  
  public ArrayList<Alumno> obtenerAlumnos() {
    ArrayList<Alumno> alumnos = new ArrayList<>();
    
    String sql = "SELECT * FROM alumno WHERE activo = 1";
    
    try {
      
      PreparedStatement ps = con.prepareStatement(sql);
      
      ResultSet rs = ps.executeQuery();
      Alumno alumno;
      
      while (rs.next()) {
        alumno = new Alumno();
        
        alumno.setId(rs.getInt("id"));
        alumno.setNombre(rs.getString("nombre"));
        alumno.setApellido(rs.getString("apellido"));
        alumno.setFechNac(rs.getDate("fechNac").toLocalDate());
        alumno.setDni(rs.getLong("dni"));
        alumno.setActivo(rs.getBoolean("activo"));
        
        alumnos.add(alumno);
      }
      
      ps.close();
      
    } catch(SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener alumnos");
    }
    
    return alumnos;
  }
  
  public Alumno obtenerAlumno(int id) {
    Alumno alumno = new Alumno();
    
    String sql = "SELECT * FROM alumno WHERE id = ?";
    
    try {
      
      PreparedStatement ps = con.prepareStatement(sql);
      
      ps.setInt(1, id);
      
      ResultSet rs = ps.executeQuery();

      if (rs.next()) {
        alumno.setId(rs.getInt("id"));
        alumno.setNombre(rs.getString("nombre"));
        alumno.setApellido(rs.getString("apellido"));
        alumno.setFechNac(rs.getDate("fechNac").toLocalDate());
        alumno.setDni(rs.getLong("dni"));
        alumno.setActivo(rs.getBoolean("activo"));
      }
      
      ps.close();

    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener alumno" + ex);
    }
    
    return alumno;
  }
  
  public boolean desactivarAlumnos(int id) {
    boolean borrado = false;
    
    String sql = "UPDATE alumno SET activo = 0 WHERE id = ?";
    
    try {
      
      PreparedStatement ps = con.prepareStatement(sql);
      
      ps.setInt(1, id);
      
      if (ps.executeUpdate() != 0) {
        borrado = true;
      }
      
      ps.close();
      
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al obtener alumno" + ex);
    }
    
    return borrado;
  }
  
  public boolean modificarAlumno(Alumno alumno) {
    boolean modificado = false;
    
    String sql = "UPDATE alumno SET nombre = ?, apellido = ?, fechNac = ?, dni = ?, activo = ? WHERE id = ?";
    
    try {
      
      PreparedStatement ps = con.prepareStatement(sql);
      
      ps.setString(1, alumno.getNombre());
      ps.setString(2, alumno.getApellido());
      ps.setDate(3, Date.valueOf(alumno.getFechNac()));
      ps.setLong(4, alumno.getDni());
      ps.setBoolean(5, alumno.isActivo());
      ps.setInt(6, alumno.getId());
      
      if (ps.executeUpdate() != 0) {
        modificado = true;
      }
      
      ps.close();
      
    } catch (SQLException ex) {
      Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return modificado;
  }
}
