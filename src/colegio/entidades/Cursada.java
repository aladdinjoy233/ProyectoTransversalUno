package colegio.entidades;

public class Cursada {

// Atributos
  private int id;
  private Alumno alumno;
  private Materia materia;
  private double nota;

// Constructores

  public Cursada() {
  }

  public Cursada(Alumno alumno, Materia materia, double nota) {
    this.alumno = alumno;
    this.materia = materia;
    this.nota = nota;
  }

  public Cursada(int id, Alumno alumno, Materia materia, double nota) {
    this.id = id;
    this.alumno = alumno;
    this.materia = materia;
    this.nota = nota;
  }

// Getters y setters

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Materia getMateria() {
    return materia;
  }

  public void setMateria(Materia materia) {
    this.materia = materia;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }

  @Override
  public String toString() {
    return "Cursada{" + "alumno=" + alumno + ", materia=" + materia + ", nota=" + nota + '}';
  }

  @Override
  public int hashCode() {
    int hash = 7;
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
    final Cursada other = (Cursada) obj;
    if (this.id != other.id) {
      return false;
    }
    return true;
  }

}
