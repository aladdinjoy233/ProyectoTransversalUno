package colegio.entidades;

import java.time.LocalDate;

public class Alumno {

  private int id;
  private String nombre;
  private String apellido;
  private LocalDate fechNac;
  private long dni;
  private boolean activo;

// Constructoress
  public Alumno() {
  }

  public Alumno(String nombre, String apellido, LocalDate fechNac, long dni, boolean activo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechNac = fechNac;
    this.dni = dni;
    this.activo = activo;
  }

  public Alumno(int id, String nombre, String apellido, LocalDate fechNac, long dni, boolean activo) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechNac = fechNac;
    this.dni = dni;
    this.activo = activo;
  }

// Gett and sett
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public LocalDate getFechNac() {
    return fechNac;
  }

  public void setFechNac(LocalDate fechNac) {
    this.fechNac = fechNac;
  }

  public long getDni() {
    return dni;
  }

  public void setDni(long dni) {
    this.dni = dni;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

// Metodos
  @Override
  public String toString() {
    return nombre + " " + apellido + " - " + dni ;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 13 * hash + this.id;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Alumno other = (Alumno) obj;
    if (this.id != other.id) {
      return false;
    }
    return true;
  }


}
