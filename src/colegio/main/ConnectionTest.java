package colegio.main;

import colegio.dao.AlumnoData;
import colegio.dao.Conexion;
import colegio.dao.CursadaData;
import colegio.dao.MateriaData;
import colegio.entidades.*;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConnectionTest {

  public static void main(String[] args) {

// Probar conecion con base de datos
    Conexion c = new Conexion();
    AlumnoData ad = new AlumnoData(c);
    MateriaData md = new MateriaData(c);
    CursadaData cd = new CursadaData(c);
    
//-------------------------------------------Agregar Alumnos a la BD-------------------------------------     
//    Alumno a = new Alumno("Allan", "Chica", LocalDate.of(2002, Month.JANUARY, 22), 30357159, true);
//    Alumno b = new Alumno("Agustina", "Ojeda", LocalDate.of(2004, Month.MAY, 4), 31951753, true);
//    Alumno d = new Alumno("Valeria", "Miranda", LocalDate.of(1991, Month.FEBRUARY, 14), 30852456, true);
//    Alumno e = new Alumno("Valentin", "Casas", LocalDate.of(2002, Month.MAY, 10), 31258456, true);
//    Alumno f = new Alumno("Edder", "Santibanez", LocalDate.of(1985, Month.MAY, 30), 93962239, true);
//    
//    ad.agregarAlumno(a);
//    ad.agregarAlumno(b);
//    ad.agregarAlumno(d);
//    ad.agregarAlumno(e);
//    ad.agregarAlumno(f);
//---------------------------------------------Mostrar Alumnos en la Bd---------------------------------
//    ArrayList<Alumno> alumnos = ad.obtenerAlumnos();
//         
//    for (Alumno alumno : alumnos) {
//      System.out.println("== Alumno ==");
//      System.out.println("Nombre: " + alumno.getNombre());
//      System.out.println("Apellido: " + alumno.getApellido());
//    }
    
//-------------------------------------Modificar Alumnos en la BD----------------------------------    
//    Alumno alum = ad.obtenerAlumno(2);
//    
//    alum.setApellido("chica");
//    ad.modificarAlumno(alum);
//    
//   ad.desactivarAlumnos(2);
    
    //---------------------Modificar Materias en la BD------------------------------------//
    
//     ArrayList<Materia> materias = md.obtenerMaterias();
//
//       for (Materia materia : materias) {
//      System.out.println("== Materia ==");
//      System.out.println("Nombre: " + materia.getNombre());
//    }
//      
//     Materia mater = md.obtenerMateria(2);  
//     mater.setNombre("lalalalallala");
//     md.modificarMateria(mater);
//     
//     md.desactivarMaterias(2);


//----------------------Inscripcion a Materias Ya Creadas en la BD----------------------------//

//      CursadaData inscribMat = new CursadaData(c);//crear un objeto InscripcionDATA
//      Alumno alum = ad.obtenerAlumno(5);//crear un objeto Alumno y tomar el Objeto "ad" de AlumnoDATA para asignarle por ID un Alumno de la BD
//      Materia mat = md.obtenerMateria(1);//crear un objeto Materia y tomar el Objeto "md" de MateriaDATA para asignarle por ID una Materia de la BD
//      Cursada curs = new Cursada(alum, mat, 1);//Crear un objeto Cursada y asignandole los 2 objetos y la nota en la 3ra posicion.
     
//      inscribMat.guardarCursada(curs);//Guardar en la BD la nota
      
      //Mostrar como quedo la Lista//
//      ArrayList <Cursada>inscList = inscribMat.obtenerCursadas();
//      for(Cursada cursad : inscList ){
//          System.out.println("Apellido del Alumno: "+cursad.getAlumno().getApellido());
//          System.out.println("Materia: "+ cursad.getMateria().getNombre());
//          System.out.println("Nota: "+ cursad.getNota());
//      }     

//---------------------Modificar Notas de Materias en la BD------------------------------------//    
    
    ArrayList<Cursada> cursadas = cd.obtenerCursadas();
    
    cursadas.forEach(cursada -> {
      System.out.println("~~~ Cursada ~~~");
      System.out.println(cursada.getAlumno());
      System.out.println(cursada.getMateria());
      System.out.println(cursada.getNota());
    });
    
    Alumno alum = ad.obtenerAlumno(13);
    Materia mat = md.obtenerMateria(6);
    
    cd.actualizarNota(alum, mat, 10);
   
  }

}
