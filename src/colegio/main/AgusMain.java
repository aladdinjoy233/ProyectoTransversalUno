package colegio.main;

import colegio.dao.*;
import colegio.entidades.*;
import java.util.*;
import javax.swing.JOptionPane;

public class AgusMain {

  public static void main(String[] args) {
    
      Conexion c = new Conexion();
      AlumnoData ad = new AlumnoData(c);
      MateriaData md = new MateriaData(c);
      CursadaData cd = new CursadaData(c);
      
      //creo un alumno y dos materias
      Alumno a = ad.obtenerAlumno(1);
      Materia m1 = md.obtenerMateria(1);
      Materia m2 = md.obtenerMateria(2);
      
      //lo inscribo
      Cursada curs1 = new Cursada(a,m1,9);
      Cursada curs2 = new Cursada(a,m2,7);
      
      cd.guardarCursada(curs1);
      cd.guardarCursada(curs2);
      
      //muestro las materias donde esta inscripto
      List<Materia> materias = cd.verMateriasInscriptas(a);

      System.out.println("Materias en donde esta inscripto " + a.getNombre());

      for(Materia m : materias){         
        System.out.println("Materia: " + m.getNombre());
        System.out.println("Año: " + m.getAnio());
        
      }
            
      
  }
  
}
