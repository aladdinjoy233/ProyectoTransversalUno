package colegio.main;

import colegio.dao.*;
import colegio.entidades.*;
import java.util.*;
import javax.swing.JOptionPane;

public class EdderMain {

  public static void main(String[] args) {
    
      Conexion c = new Conexion();
      AlumnoData ad = new AlumnoData(c);
      MateriaData md = new MateriaData(c);
      CursadaData cd = new CursadaData(c);
      
      Alumno a = ad.obtenerAlumno(8);
      //Mostrar Materias Inscripto
      List <Materia> listMat = cd.verMateriasInscriptas(a);
      for (Materia aux : listMat) {
          System.out.println(aux);
      }
      cd.borrarCursada(21);
    
  }
  
}