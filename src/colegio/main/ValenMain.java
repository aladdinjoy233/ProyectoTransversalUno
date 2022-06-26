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

        for (Alumno alumno : alumnosInscriptos) {

            System.out.println("-----------------");
            System.out.println("id:" + alumno.getId());
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
            System.out.println(alumno.getDni());
            System.out.println(alumno.getFechNac());
            System.out.println(alumno.isActivo());

        }
    }
}

