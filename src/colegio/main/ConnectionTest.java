package colegio.main;

import colegio.dao.Conexion;
import java.sql.Connection;

public class ConnectionTest {

  public static void main(String[] args) {

    Conexion c = new Conexion();

    Connection recibido = c.getConexion();

  }
  
}
