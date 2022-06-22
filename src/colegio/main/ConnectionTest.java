package colegio.main;

import colegio.dao.AlumnoData;
import colegio.dao.Conexion;
import colegio.dao.MateriaData;
import colegio.entidades.*;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConnectionTest {

  public static void main(String[] args) {

// Probar conecion con base de datos
    Conexion c = new Conexion();
    AlumnoData ad = new AlumnoData(c);

    ArrayList<Alumno> alumnos = ad.obtenerAlumnos();
         
    for (Alumno alumno : alumnos) {
      System.out.println("== Alumno ==");
      System.out.println("Nombre: " + alumno.getNombre());
      System.out.println("Apellido: " + alumno.getApellido());
    }
    
    Alumno alum = ad.obtenerAlumno(2);
    
    alum.setApellido("chica");
    ad.modificarAlumno(alum);
    
   ad.desactivarAlumnos(2);
    
    //---------------------------------------------------------//
    
    MateriaData md = new MateriaData(c);
     ArrayList<Materia> materias = md.obtenerMaterias();

       for (Materia materia : materias) {
      System.out.println("== Materia ==");
      System.out.println("Nombre: " + materia.getNombre());
    }
      
     Materia mater = md.obtenerMateria(2);  
     mater.setNombre("lalalalallala");
     md.modificarMateria(mater);
     
     md.desactivarMaterias(2);
   
  }

}
