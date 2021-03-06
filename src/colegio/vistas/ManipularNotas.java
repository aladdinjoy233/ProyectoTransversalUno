package colegio.vistas;

import colegio.dao.*;
import colegio.entidades.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManipularNotas extends javax.swing.JInternalFrame {

  public ManipularNotas(Conexion con) {
    initComponents();

    alumData = new AlumnoData(con);
    matData = new MateriaData(con);
    curData = new CursadaData(con);

    model = (DefaultTableModel) tbleMaterias.getModel();

    alumnos = alumData.obtenerAlumnos();

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

    jScrollPane2 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    pnlFondo = new javax.swing.JPanel();
    btnCancelar = new javax.swing.JButton();
    btnGuardar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbleMaterias = new javax.swing.JTable();
    cmboAlumnos = new javax.swing.JComboBox<>();
    lblAlumno = new javax.swing.JLabel();
    lblTitulo = new javax.swing.JLabel();
    btnSalir = new javax.swing.JToggleButton();

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane2.setViewportView(jTable1);

    pnlFondo.setBackground(new java.awt.Color(255, 255, 255));

    btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
    btnCancelar.setText("Cancelar");
    btnCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelarActionPerformed(evt);
      }
    });

    btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
    btnGuardar.setText("Guardar");
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGuardarActionPerformed(evt);
      }
    });

    tbleMaterias.setBackground(new java.awt.Color(255, 255, 255));
    tbleMaterias.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID", "Materia", "Nota"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, true
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tbleMaterias);

    cmboAlumnos.setBackground(new java.awt.Color(255, 255, 255));
    cmboAlumnos.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cmboAlumnosItemStateChanged(evt);
      }
    });
    cmboAlumnos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmboAlumnosActionPerformed(evt);
      }
    });

    lblAlumno.setText("Alumno:");

    lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    lblTitulo.setText("Carga de notas");

    btnSalir.setBackground(new java.awt.Color(255, 255, 255));
    btnSalir.setText("X");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
    pnlFondo.setLayout(pnlFondoLayout);
    pnlFondoLayout.setHorizontalGroup(
      pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pnlFondoLayout.createSequentialGroup()
        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(pnlFondoLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(lblTitulo)
            .addGap(86, 86, 86)
            .addComponent(btnSalir))
          .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
              .addGap(43, 43, 43)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlFondoLayout.createSequentialGroup()
              .addGap(132, 132, 132)
              .addComponent(lblAlumno)
              .addGap(18, 18, 18)
              .addComponent(cmboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(42, Short.MAX_VALUE))
      .addGroup(pnlFondoLayout.createSequentialGroup()
        .addGap(138, 138, 138)
        .addComponent(btnGuardar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnCancelar)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    pnlFondoLayout.setVerticalGroup(
      pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pnlFondoLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblTitulo)
          .addComponent(btnSalir))
        .addGap(23, 23, 23)
        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblAlumno)
          .addComponent(cmboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(37, 37, 37)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnCancelar)
          .addComponent(btnGuardar))
        .addContainerGap(67, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 6, Short.MAX_VALUE)
        .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void cmboAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboAlumnosActionPerformed

    }//GEN-LAST:event_cmboAlumnosActionPerformed

  private void cmboAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboAlumnosItemStateChanged
    actualizarDatos();
  }//GEN-LAST:event_cmboAlumnosItemStateChanged

  private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    actualizarDatos();
  }//GEN-LAST:event_btnCancelarActionPerformed

  private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    boolean notasActualizadas = false;

    Alumno alumnoSeleccionado = alumnos.get(cmboAlumnos.getSelectedIndex());

    for (int i = 0; i < model.getRowCount(); i++) {
      Materia mat = matData.obtenerMateria((Integer) model.getValueAt(i, 0));
      String calif = model.getValueAt(i, 2).toString();

      //      Validar numero ingresado
      try {
        double nota = Double.valueOf(calif);
        
        if (curData.actualizarNota(alumnoSeleccionado, mat, nota)) {
          notasActualizadas = true;
        }
        
      } catch (NumberFormatException exc) {
        JOptionPane.showMessageDialog(this, "Error: dato ingresado no es un numero");
        break;
      }
    }

    JOptionPane.showMessageDialog(this, (notasActualizadas ? "Las notas fueron actualizadas" : "No se pudo actualizar las notas"));

  }//GEN-LAST:event_btnGuardarActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    dispose();
  }//GEN-LAST:event_btnSalirActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancelar;
  private javax.swing.JButton btnGuardar;
  private javax.swing.JToggleButton btnSalir;
  private javax.swing.JComboBox<String> cmboAlumnos;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable jTable1;
  private javax.swing.JLabel lblAlumno;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JPanel pnlFondo;
  private javax.swing.JTable tbleMaterias;
  // End of variables declaration//GEN-END:variables

  private AlumnoData alumData;
  private MateriaData matData;
  private CursadaData curData;
  private ArrayList<Alumno> alumnos;
  private DefaultTableModel model;

  private void cargarDatos() {

    Collections.sort(alumnos, new Comparator<Alumno>() {
      @Override
      public int compare(Alumno t, Alumno t1) {
        return t.getApellido().compareTo(t1.getApellido());
      }
    });

    alumnos.forEach(alumno -> {
      cmboAlumnos.addItem(alumno.getApellido() + ", " + alumno.getNombre());
    });

  }

  private void actualizarDatos() {

    model.setRowCount(0);

    Alumno alumnoSeleccionado = alumnos.get(cmboAlumnos.getSelectedIndex());

    ArrayList<Cursada> cursadas = curData.obtenerCursadasDeAlumno(alumnoSeleccionado);

    cursadas.forEach(cursada -> {

      model.addRow(new Object[]{
        cursada.getMateria().getId(),
        cursada.getMateria().getNombre(),
        cursada.getNota()
      });

    });

    if (model.getRowCount() == 0) {
      btnGuardar.setEnabled(false);
    } else {
      btnGuardar.setEnabled(true);
    }

  }

}
