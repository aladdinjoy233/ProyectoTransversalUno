/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.vistas;

import colegio.dao.*;
import colegio.entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UltrabookSamsung
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {

  /**
   * Creates new form FormularioInscripcion
   */
  private AlumnoData ad;
  private CursadaData cd;
  private MateriaData md;
  private DefaultTableModel modelo;

  public FormularioInscripcion(Conexion con) {
    initComponents();
    jbtAnular.setEnabled(false);
    jbtInscribir.setEnabled(false);
    
    ad = new AlumnoData(con);
    cd = new CursadaData(con);
    md = new MateriaData(con);
     
    modelo = (DefaultTableModel) jtMaterias.getModel();
    
    llenarConAlumnos();
    
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbListaAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();
        jbtInscribir = new javax.swing.JButton();
        jbtAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCI??N");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("ALUMNO");

        jcbListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("LISTADO DE MATERIAS");

        jrbInscriptas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbInscriptas);
        jrbInscriptas.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jrbInscriptas.setText("INSCRIPTAS");
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jrbNoInscriptas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbNoInscriptas);
        jrbNoInscriptas.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jrbNoInscriptas.setText("NO INSCRIPTAS");
        jrbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptasActionPerformed(evt);
            }
        });

        jbtInscribir.setBackground(new java.awt.Color(255, 255, 255));
        jbtInscribir.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jbtInscribir.setText("INSCRIBIR");
        jbtInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInscribirActionPerformed(evt);
            }
        });

        jbtAnular.setBackground(new java.awt.Color(255, 255, 255));
        jbtAnular.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jbtAnular.setText("ANULAR INSCRIPCION");
        jbtAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAnularActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtMaterias.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Nombre", "A??o"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtMaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(jbSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jrbInscriptas)
                                .addGap(18, 18, 18)
                                .addComponent(jrbNoInscriptas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInscriptas)
                    .addComponent(jrbNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaAlumnosActionPerformed
    borrarFilas();
    }//GEN-LAST:event_jcbListaAlumnosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
    dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        
        jbtAnular.setEnabled(true);
        jbtInscribir.setEnabled(false);
        verInscriptas();
        
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed
        
        jbtAnular.setEnabled(false);
        jbtInscribir.setEnabled(true);
        verNoInscriptas();
        
    }//GEN-LAST:event_jrbNoInscriptasActionPerformed

    private void jbtInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInscribirActionPerformed
         
        int fila = jtMaterias.getSelectedRow();
        
        if(fila != -1){
            
            Alumno a = (Alumno)jcbListaAlumnos.getSelectedItem();
            
            int id = (Integer)modelo.getValueAt(fila, 0);
            String nombre = (String)modelo.getValueAt(fila, 1);
            int anio = (Integer)modelo.getValueAt(fila, 2);
            
            Materia m = new Materia(id,nombre,anio,true);
            
            Cursada c = new Cursada(a,m,0);
            
            cd.guardarCursada(c);
            
            JOptionPane.showMessageDialog(this, "Se inscribi?? a " + a.getNombre() + " " + a.getApellido() + " en " + m.getNombre());
            
            verNoInscriptas();
            
        } else{
            JOptionPane.showMessageDialog(this, "Seleccione una materia.");
        }
        
    }//GEN-LAST:event_jbtInscribirActionPerformed

    private void jbtAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAnularActionPerformed
        
         int fila = jtMaterias.getSelectedRow();
        
         if(fila != -1){
             
             Alumno a = (Alumno)jcbListaAlumnos.getSelectedItem();
             
             int idMateria = (Integer)modelo.getValueAt(fila, 0);
             String nombre = (String)modelo.getValueAt(fila, 1);
             
             cd.eliminarCursada(a.getId(), idMateria);
             
             JOptionPane.showMessageDialog(this, "Se desinscribi?? a " + a.getNombre() + " " + a.getApellido() + " en " + nombre);
             
             verInscriptas();
             
         } else{
            JOptionPane.showMessageDialog(this, "Seleccione una materia.");
        }
        
    }//GEN-LAST:event_jbtAnularActionPerformed
        
  private void llenarConAlumnos() {
    ArrayList<Alumno> listaAlumnos = ad.obtenerAlumnos();
    Collections.sort(listaAlumnos, new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1){
            return t.getNombre().compareTo(t1.getNombre());
        }
    });
    for (Alumno a : listaAlumnos) {
      jcbListaAlumnos.addItem(a);
    }
  }
  
  private void verInscriptas(){
      
        borrarFilas();
      
        Alumno seleccionado=(Alumno)jcbListaAlumnos.getSelectedItem();
        
        ArrayList<Materia> lista = (ArrayList)cd.verMateriasInscriptas(seleccionado);
        
        for(Materia m:lista){
        
            modelo.addRow(new Object[]{m.getId(),m.getNombre(),m.getAnio()});
        }
  }
  
  private void verNoInscriptas(){
      
      borrarFilas();
      
      Alumno seleccionado=(Alumno)jcbListaAlumnos.getSelectedItem();
        
        ArrayList<Materia> lista = (ArrayList)cd.verMateriasNoInscriptas(seleccionado);
        
        for(Materia m:lista){
        
            modelo.addRow(new Object[]{m.getId(),m.getNombre(),m.getAnio()});
        }
  }
    
  private void borrarFilas(){
    
     int a = modelo.getRowCount()-1;
      
      for(int i = a; i > -1; i--){
          modelo.removeRow(i);
      }   
    
    
      
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbtAnular;
    private javax.swing.JButton jbtInscribir;
    private javax.swing.JComboBox<Alumno> jcbListaAlumnos;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
}
