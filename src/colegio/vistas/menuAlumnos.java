/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.vistas;

import colegio.dao.AlumnoData;
import colegio.dao.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edder
 */
public class menuAlumnos extends javax.swing.JInternalFrame {
   
    /**
     * Creates new form menuAlumnos
     */
    public menuAlumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mAtitulo = new javax.swing.JLabel();
        mAid = new javax.swing.JTextField();
        mAlabelID = new javax.swing.JLabel();
        mAbtnBuscar = new javax.swing.JButton();
        mAlabelDni = new javax.swing.JLabel();
        mADni = new javax.swing.JTextField();
        mAlabelApellido = new javax.swing.JLabel();
        mAapellido = new javax.swing.JTextField();
        mAnombre = new javax.swing.JTextField();
        mAlabelNombre = new javax.swing.JLabel();
        mAestado = new javax.swing.JCheckBox();
        mAlabelFecha = new javax.swing.JLabel();
        mAcalendario = new com.toedter.calendar.JDateChooser();
        mAbtnGuardar = new javax.swing.JButton();
        mAbtnBorrar = new javax.swing.JButton();
        mABtnActualizar = new javax.swing.JButton();
        mAbtnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Panel de Alumnos");

        mAtitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mAtitulo.setForeground(new java.awt.Color(102, 102, 255));
        mAtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mAtitulo.setText("--Alumnos--");

        mAlabelID.setText("Legajo");

        mAbtnBuscar.setText("Buscar");
        mAbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAbtnBuscarActionPerformed(evt);
            }
        });

        mAlabelDni.setText("Dni");
        mAlabelDni.setMaximumSize(new java.awt.Dimension(32, 14));
        mAlabelDni.setMinimumSize(new java.awt.Dimension(32, 14));
        mAlabelDni.setName(""); // NOI18N

        mAlabelApellido.setText("Apellido");
        mAlabelApellido.setMaximumSize(new java.awt.Dimension(32, 14));
        mAlabelApellido.setMinimumSize(new java.awt.Dimension(32, 14));

        mAapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAapellidoActionPerformed(evt);
            }
        });

        mAlabelNombre.setText("Nombre");

        mAestado.setSelected(true);
        mAestado.setText("Estado");
        mAestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAestadoActionPerformed(evt);
            }
        });

        mAlabelFecha.setText("Fecha de Nac.");

        mAbtnGuardar.setText("Guardar");
        mAbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAbtnGuardarActionPerformed(evt);
            }
        });

        mAbtnBorrar.setText("Borrar");

        mABtnActualizar.setText("Actualizar");

        mAbtnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(mAlabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(mAtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mAid, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(mAbtnBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mAlabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mADni, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mAlabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mAlabelNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mAestado)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(mAnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(mAapellido))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(mAlabelFecha)
                        .addGap(18, 18, 18)
                        .addComponent(mAcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(mAbtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(mAbtnBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(mABtnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(mAbtnLimpiar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mAtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mAlabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mAid))
                    .addComponent(mAbtnBuscar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mAlabelDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mADni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mAlabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mAapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mAnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mAlabelNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mAlabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mAcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(mAestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mAbtnGuardar)
                    .addComponent(mAbtnBorrar)
                    .addComponent(mABtnActualizar)
                    .addComponent(mAbtnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAbtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mAbtnBuscarActionPerformed

    private void mAapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mAapellidoActionPerformed

    private void mAestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mAestadoActionPerformed

    private void mAbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAbtnGuardarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mAbtnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mABtnActualizar;
    private javax.swing.JTextField mADni;
    private javax.swing.JTextField mAapellido;
    private javax.swing.JButton mAbtnBorrar;
    private javax.swing.JButton mAbtnBuscar;
    private javax.swing.JButton mAbtnGuardar;
    private javax.swing.JButton mAbtnLimpiar;
    private com.toedter.calendar.JDateChooser mAcalendario;
    private javax.swing.JCheckBox mAestado;
    private javax.swing.JTextField mAid;
    private javax.swing.JLabel mAlabelApellido;
    private javax.swing.JLabel mAlabelDni;
    private javax.swing.JLabel mAlabelFecha;
    private javax.swing.JLabel mAlabelID;
    private javax.swing.JLabel mAlabelNombre;
    private javax.swing.JTextField mAnombre;
    private javax.swing.JLabel mAtitulo;
    // End of variables declaration//GEN-END:variables
}
