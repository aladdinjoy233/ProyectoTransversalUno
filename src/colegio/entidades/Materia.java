package colegio.entidades;

public class Materia {
// Atributos
  private int id;
  private String nombre;
  private int anio;
  private boolean activo;

// Constructores

  public Materia() {
  }

  public Materia(String nombre, int anio, boolean activo) {
    this.nombre = nombre;
    this.anio = anio;
    this.activo = activo;
  }

  public Materia(int id, String nombre, int anio, boolean activo) {
    this.id = id;
    this.nombre = nombre;
    this.anio = anio;
    this.activo = activo;
  }

// Getters y setters
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

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
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
    return "Materia{" + "nombre=" + nombre + ", anio=" + anio + ", activo=" + activo + '}';
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 47 * hash + this.id;
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
    final Materia other = (Materia) obj;
    if (this.id != other.id) {
      return false;
    }
    return true;
  }


}
