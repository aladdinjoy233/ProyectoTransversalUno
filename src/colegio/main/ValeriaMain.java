package colegio.main;

import colegio.dao.*;
import colegio.entidades.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ValeriaMain {

    public static void main(String[] args) {
      
        Conexion con = new Conexion();  
        CursadaData cd = new CursadaData(con);
        AlumnoData ad = new AlumnoData(con);
        
        Alumno alumno = ad.obtenerAlumno(4);
        
        System.out.println("~~~~~MATERIAS EN LAS QUE NO ESTA INSCRIPTO~~~~~");
        for (Object mat : cd.verMateriasNoInscriptas(alumno)) {
            System.out.println(mat);
        }
    } 
}
