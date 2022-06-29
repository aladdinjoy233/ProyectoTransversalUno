package colegio.vistas;

import colegio.entidades.Materia;
import javax.swing.JOptionPane;
import colegio.dao.*;

public class MateriaVista extends javax.swing.JInternalFrame {

    private Conexion c = new Conexion();
    private MateriaData md = new MateriaData(c);

    public MateriaVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jcEstado = new javax.swing.JCheckBox();
        JbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Materias");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año");

        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAnioActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jcEstado.setText("Estado");
        jcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstadoActionPerformed(evt);
            }
        });

        JbSalir.setText("Salir");
        JbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(29, 29, 29)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JbSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jbBuscar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jbBorrar)
                        .addGap(45, 45, 45)
                        .addComponent(jbActualizar)
                        .addGap(47, 47, 47)
                        .addComponent(jbLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(117, 117, 117)
                            .addComponent(jcEstado))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JbSalir))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbActualizar)
                    .addComponent(jbBorrar)
                    .addComponent(jbGuardar))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampos() {
        jtCodigo.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jcEstado.setSelected(false);
    }

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        String nombre = jtNombre.getText();
        int anio = Integer.parseInt(jtAnio.getText());
        boolean estado = jcEstado.isSelected();

        Materia materia = new Materia(nombre, anio, estado);

        if (md.agregarMateria(materia)) {
            JOptionPane.showMessageDialog(this, "Materia agregada con exito");
        }

        jtCodigo.setText(materia.getId()+"");
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

         String nombre = jtNombre.getText();
        int anio = Integer.parseInt(jtAnio.getText());
        int id = Integer.parseInt(jtCodigo.getText());

        Materia materia = new Materia(nombre, anio, true);
        md.existeMateria(materia);

        if (md.existeMateria(materia) == false) {
            JOptionPane.showMessageDialog(this, nombre + " no existe o esta inactiva");
        } else {
            md.borrarMateria(id);
            JOptionPane.showMessageDialog(this, nombre + " fue borrado exitosamente");
        }

    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed

        String nombre = jtNombre.getText();
        int anio = Integer.parseInt(jtAnio.getText());
        boolean estado = jcEstado.isSelected();
        int id = Integer.parseInt(jtCodigo.getText());
        
        Materia materia = new Materia(id,nombre, anio, estado);
        
        md.modificarMateria(materia);
        JOptionPane.showMessageDialog(this, "materia fue actualizada");

    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        int id = Integer.parseInt(jtCodigo.getText());
        Materia materia = md.obtenerMateria(id);

//todavia queda validar si existe materia con dicho ID--
        jtNombre.setText(materia.getNombre());
        jtAnio.setText(String.valueOf(materia.getAnio()));
        jcEstado.setSelected(materia.isActivo());

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAnioActionPerformed

    }//GEN-LAST:event_jtAnioActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed

    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void JbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JbSalirActionPerformed
    private void jcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEstadoActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
