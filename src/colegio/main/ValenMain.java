package colegio.main;

import colegio.dao.*;
import colegio.entidades.*;
import java.util.*;
//import javax.swing.JOptionPane;

public class ValenMain {

    public static void main(String[] args) {

        Conexion c = new Conexion();
        AlumnoData ad = new AlumnoData(c);
        MateriaData md = new MateriaData(c);
        CursadaData cd = new CursadaData(c);

//--------------------------- inscribo alumno en materia ---------------------------------

        /*Alumno alum = ad.obtenerAlumno(4);
        Materia mat = md.obtenerMateria(2);
        Cursada curs = new Cursada(alum, mat, 1);
        cd.guardarCursada(curs);//Guardar en la BD la nota*/
        
//--------------------------- muestro alumnos inscriptos a dicha materia ---------------------------------
        
        ArrayList<Alumno> alumnosInscriptos = cd.alumnosConMateria(2);

        Alumno alum = new Alumno();
        
        for (Alumno alumno : alumnosInscriptos) {
            
            alum = ad.obtenerAlumno(alumno.getId());
            
            System.out.println("id:" + alum.getId());
            System.out.println(alum.getNombre() + " " + alum.getApellido());
            System.out.println(alum.getDni());
            System.out.println(alum.getFechNac());
            System.out.println(alum.isActivo());               
            
        }
    }

}
