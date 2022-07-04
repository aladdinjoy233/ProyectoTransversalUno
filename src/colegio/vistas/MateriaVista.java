package colegio.vistas;

import colegio.entidades.Materia;
import javax.swing.JOptionPane;
import colegio.dao.*;
import java.awt.Color;

public class MateriaVista extends javax.swing.JInternalFrame {

   private MateriaData md;

  public MateriaVista(Conexion con) {
    initComponents();
    md = new MateriaData(con);
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JbSalir = new javax.swing.JButton();
        jtAnio = new javax.swing.JTextField();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jcEstado = new javax.swing.JCheckBox();
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("~MATERIAS~");

        JbSalir.setBackground(new java.awt.Color(102, 102, 102));
        JbSalir.setText("Salir");
        JbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162)
                .addComponent(JbSalir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jtAnio.setBackground(new java.awt.Color(255, 255, 255));
        jtAnio.setForeground(new java.awt.Color(153, 153, 153));
        jtAnio.setText(" ingrese año");
        jtAnio.setBorder(null);
        jtAnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAnioMouseClicked(evt);
            }
        });
        jtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAnioActionPerformed(evt);
            }
        });

        jtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jtCodigo.setForeground(new java.awt.Color(153, 153, 153));
        jtCodigo.setText(" ingrese codigo");
        jtCodigo.setBorder(null);
        jtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCodigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtCodigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtCodigoMouseExited(evt);
            }
        });
        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });

        jtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtNombre.setText(" ingrese nombre");
        jtNombre.setBorder(null);
        jtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtNombreMouseClicked(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jcEstado.setBackground(new java.awt.Color(255, 255, 255));
        jcEstado.setForeground(new java.awt.Color(0, 0, 0));
        jcEstado.setText("Estado");
        jcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstadoActionPerformed(evt);
            }
        });

        jbBorrar.setBackground(new java.awt.Color(255, 255, 255));
        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jbActualizar.setText("Actualizar");
        jbActualizar.setEnabled(false);
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setText("Limpiar datos");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtAnio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                    .addGap(92, 92, 92)
                                    .addComponent(jcEstado))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBorrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbBuscar)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void limpiarCampos() {
    jtCodigo.setText(" ingrese codigo");
    jtNombre.setText(" ingrese nombre");
    jtAnio.setText(" ingrese año");
    jcEstado.setSelected(false);
  }
    
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

          int id = Integer.parseInt(jtCodigo.getText());
    Materia materia = md.obtenerMateria(id);

//todavia queda validar si existe materia con dicho ID--
    jtNombre.setText(materia.getNombre());
    jtAnio.setText(String.valueOf(materia.getAnio()));
    jcEstado.setSelected(materia.isActivo());

    jbBorrar.setEnabled(true);
    jbActualizar.setEnabled(true);
    jbGuardar.setEnabled(false);
    
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed

    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAnioActionPerformed
  
    }//GEN-LAST:event_jtAnioActionPerformed

    private void jcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoActionPerformed
      
    }//GEN-LAST:event_jcEstadoActionPerformed

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

        Materia materia = new Materia(id, nombre, anio, estado);

        md.modificarMateria(materia);
        JOptionPane.showMessageDialog(this, "materia fue actualizada");

    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
        jbGuardar.setEnabled(true);
        jbBorrar.setEnabled(false);
        jbActualizar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        String nombre = jtNombre.getText();
        int anio = Integer.parseInt(jtAnio.getText());
        boolean estado = jcEstado.isSelected();

        Materia materia = new Materia(nombre, anio, estado);

        if (md.agregarMateria(materia)) {
            JOptionPane.showMessageDialog(this, "Materia agregada con exito");
        }

        jtCodigo.setText(materia.getId() + "");
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void JbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JbSalirActionPerformed

    private void jtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCodigoMouseClicked
    jtCodigo.setText("");

    }//GEN-LAST:event_jtCodigoMouseClicked

    private void jtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombreMouseClicked

    }//GEN-LAST:event_jtNombreMouseClicked

    private void jtAnioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAnioMouseClicked

    }//GEN-LAST:event_jtAnioMouseClicked

    private void jtCodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCodigoMouseEntered
        jtCodigo.setBackground(Color.GRAY);
        jtCodigo.setForeground(Color.WHITE);
    }//GEN-LAST:event_jtCodigoMouseEntered

    private void jtCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCodigoMouseExited
        jtCodigo.setBackground(Color.WHITE);
         jtCodigo.setForeground(Color.GRAY);
    }//GEN-LAST:event_jtCodigoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
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
