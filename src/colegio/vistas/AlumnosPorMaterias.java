/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.vistas;

import colegio.dao.AlumnoData;
import colegio.dao.Conexion;
import colegio.dao.CursadaData;
import colegio.dao.MateriaData;
import colegio.entidades.Alumno;
import colegio.entidades.Cursada;
import colegio.entidades.Materia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Valeria
 */
public class AlumnosPorMaterias extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    private ArrayList<Cursada> listaCursadas;
    private ArrayList <Materia> listaMaterias;
    private CursadaData cursadaData;
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    private ArrayList<Alumno> listaAlumnos;
    private Conexion conexion;
            
    /**
     * Creates new form AlumnosPorMaterias
     */
    public AlumnosPorMaterias() {
        initComponents();
        conexion = new Conexion();
        modelo = new DefaultTableModel();
        
        cursadaData = new CursadaData(conexion);
        listaCursadas = (ArrayList)cursadaData.obtenerCursadas();
        
        materiaData = new MateriaData(conexion);
        listaMaterias = (ArrayList)materiaData.obtenerMaterias();
        
        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList)alumnoData.obtenerAlumnos();
        
        cargarMaterias();
        armarCabeceraTabla();
        cargarDatos();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumnos = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("- LISTADOS DE ALUMNOS POR MATERIAS -");

        jLabel2.setText("MATERIA");

        cbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateriaActionPerformed(evt);
            }
        });

        tAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tAlumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateriaActionPerformed
        // TODO add your handling code here:
        cargarDatos();
    }//GEN-LAST:event_cbMateriaActionPerformed

public void cargarMaterias(){
    
    for(Materia item : listaMaterias){
        
        cbMateria.addItem(item);
    }
    
}

public void armarCabeceraTabla(){
    
    ArrayList<Object> columns = new ArrayList<Object>();
    columns.add("ID");
    columns.add("Nombre");
    columns.add("Nota");
    
    for(Object it : columns){  
        modelo.addColumn(it);
    }
    
    tAlumnos.setModel(modelo);
}

public void borrarFilasTabla(){
    
    int a = modelo.getRowCount()-1;
    
    for(int i=a; i>=0;i--){
        modelo.removeRow(i);
    }
}

public void cargarDatos(){
   
    borrarFilasTabla();
    
    Materia mat = (Materia)cbMateria.getSelectedItem();
    
    for(Cursada m : listaCursadas){
        if(m.getMateria().getId() == mat.getId()){
            modelo.addRow(new Object []{m.getAlumno().getId(),m.getAlumno().getNombre(),m.getNota()});
        }
    }
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tAlumnos;
    // End of variables declaration//GEN-END:variables
}
