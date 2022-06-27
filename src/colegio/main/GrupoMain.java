package colegio.main;

import colegio.dao.AlumnoData;
import colegio.dao.Conexion;
import colegio.dao.CursadaData;
import colegio.dao.MateriaData;
import colegio.entidades.*;
import java.util.*;

public class GrupoMain {

  public static void main(String[] args) {

    Conexion c = new Conexion();
    AlumnoData ad = new AlumnoData(c);
    MateriaData md = new MateriaData(c);
    CursadaData cd = new CursadaData(c);
    
//    Mostrar materias de un alumno
    Alumno alum = ad.obtenerAlumno(10);
    
    List<Materia> materias = cd.verMateriasInscriptas(alum);
    System.out.println("====== Allan cursa estas materias ======");
    materias.forEach(materia -> System.out.println(materia));
    
//    Mostrar alumnos de una materia
    List<Alumno> alumnos = cd.alumnosConMateria(1);
    
    System.out.println("====== Alumnos que cursan ingles ======");
    alumnos.forEach(alumno -> System.out.println(alumno));

  }

}
