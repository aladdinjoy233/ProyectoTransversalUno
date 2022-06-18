package colegio.main;

import colegio.dao.Conexion;
import colegio.entidades.*;
import java.sql.Connection;
import java.time.LocalDate;

public class ConnectionTest {

  public static void main(String[] args) {

// Probar conecion con base de datos
    Conexion c = new Conexion();
    Connection recibido = c.getConexion();

// Probar clases entidades
    Alumno alum = new Alumno("Luis", "Mercado", LocalDate.of(2000, 3, 22), 12345678, false);
    Materia mat = new Materia("Programacion", 1, true);
    Cursada curs = new Cursada(alum, mat, 5);

    System.out.println(curs);


  }
  
}
