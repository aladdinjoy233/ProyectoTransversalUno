package colegio.dao;

import colegio.entidades.Materia;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriaData {
//  Atributos

    private Connection con = null;

// Constructor
    public MateriaData(Conexion conexion) {
        con = conexion.getConexion();
    }

// Metodos 
    public boolean existeMateria(Materia materia) {
        boolean existe = false;

        String sql = "SELECT * FROM materia WHERE nombre = ? AND anio = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());

            ResultSet rs = ps.executeQuery();

            if (rs.next() && materia.getNombre().equalsIgnoreCase(rs.getString("nombre")) && materia.getAnio() == rs.getInt("anio")) {
                existe = true;
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al comparar materias" + ex);
        }

        return existe;
    }

    public boolean agregarMateria(Materia materia) {

        if (existeMateria(materia)) {
            JOptionPane.showMessageDialog(null, "Ya existe la materia");
            return false;
        }

        boolean insert = true;

        String sql = "INSERT INTO materia (nombre, anio, activo) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setId(rs.getInt(1));
            } else {
                insert = false;
            }

            ps.close();

        } catch (SQLException ex) {
            insert = false;
            JOptionPane.showMessageDialog(null, "Error al cargar materia");
        }

        return insert;
    }

    public ArrayList<Materia> obtenerMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE activo = 1";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            Materia materia;

            while (rs.next()) {
                materia = new Materia();

                materia.setId(rs.getInt("id"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("activo"));

                materias.add(materia);

            }
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias");
        }

        return materias;
    }

    public Materia obtenerMateria(int id) {
        Materia materia = new Materia();

        String sql = "SELECT * FROM materia WHERE id = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia.setId(rs.getInt("id"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("activo"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materia" + ex);
        }

        return materia;
    }

    public boolean desactivarMaterias(int id) {
        boolean borrado = false;

        String sql = "UPDATE materia SET activo = 0 WHERE id = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {
                borrado = true;
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materia" + ex);
        }

        return borrado;
    }

    public boolean modificarMateria(Materia materia) {
        boolean modificado = false;

        String sql = "UPDATE materia SET nombre = ?, anio = ?, activo = ? WHERE id = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getId());

            if (ps.executeUpdate() != 0) {
                modificado = true;
            }

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return modificado;
    }

    //Borrar una Materia (delete)
    public void borrarMateria(int id) {

        String sql = "DELETE FROM materia WHERE `materia`.`id` = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La materia a sido eliminada");
            ps.close();
        } catch (SQLException ex) {
            if (ex instanceof java.sql.SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "No se puede borrar porque la Materia esta asignada a uno o mas Alumnos.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al borrar una Materia." + ex);
            }
        }

    }

}
