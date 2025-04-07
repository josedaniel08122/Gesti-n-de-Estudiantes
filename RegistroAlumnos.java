/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica02;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josed
 */
public class RegistroAlumnos extends javax.swing.JFrame {

    DefaultTableModel modelo= new DefaultTableModel();
    ArrayList<Alumno> listaAlumnos= new ArrayList<>();
    public RegistroAlumnos() {
        initComponents();
        this.setTitle("REGISTROS DE ALUMNOS");
        this.setSize(720, 570);
        this.setLocationRelativeTo(null);
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CARRERA");
        modelo.addColumn("GRUPO");
        modelo.addColumn("SEMESTRE");
        modelo.addColumn("PROMEDIO");
        refrescarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboCarreraAlumno = new javax.swing.JComboBox<>();
        cboGrupoAlumno = new javax.swing.JComboBox<>();
        cboSemestreAlumno = new javax.swing.JComboBox<>();
        spnPromedioAlumno = new javax.swing.JSpinner();
        btnAgregarAlumno = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtNombreAlumno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistroAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRegistroAlumnos);
        if (tblRegistroAlumnos.getColumnModel().getColumnCount() > 0) {
            tblRegistroAlumnos.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 640, 210));

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, -1));

        jLabel2.setText("Carrera:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, -1));

        jLabel3.setText("Grupo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 60, -1));

        jLabel4.setText("Semestre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, -1));

        jLabel5.setText("Promedio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        cboCarreraAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ING. en Tecnologías de la Información y Comunicaciones", "ING. en Acuicultura", "ING. Mecánica", "ING. Electrónica", "ING. en Gestión Empresarial", "ING. Química", "LIC. en Administración", "ING. Ferroviaria" }));
        getContentPane().add(cboCarreraAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 20));

        cboGrupoAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));
        getContentPane().add(cboGrupoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 50, 20));

        cboSemestreAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segundo", "Cuarto", "Sexto", "Octavo" }));
        getContentPane().add(cboSemestreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        spnPromedioAlumno.setModel(new javax.swing.SpinnerNumberModel(10.0d, 5.0d, 10.0d, 0.1d));
        getContentPane().add(spnPromedioAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 60, -1));

        btnAgregarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarAlumno.setText("Agregar");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 120, 50));

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 110, 50));
        getContentPane().add(txtNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        try{
        
           Alumno alumno=new Alumno();
           alumno.setNombre(txtNombreAlumno.getText());
           alumno.setCarrera(cboCarreraAlumno.getSelectedItem().toString());
           alumno.setGrupo(Integer.parseInt(cboGrupoAlumno.getSelectedItem().toString()));
           alumno.setSemestre(cboSemestreAlumno.getSelectedItem().toString());
           alumno.setPromedio(Double.parseDouble(spnPromedioAlumno.getValue().toString()));
           listaAlumnos.add(alumno);
           refrescarTabla();
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL AGREGAR ALUMNO");
        }
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void refrescarTabla(){
        //Borrar todos los elementos del modelo
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        
        for(Alumno alumno: listaAlumnos){
            Object a[]=new Object[5];
            a[0]=alumno.getNombre();
            a[1]=alumno.getCarrera();
            a[2]=alumno.getGrupo();
            a[3]=alumno.getSemestre();
            a[4]=alumno.getPromedio();
            modelo.addRow(a);
        }
        
        tblRegistroAlumnos.setModel(modelo);
    }
    
    
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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JComboBox<String> cboCarreraAlumno;
    private javax.swing.JComboBox<String> cboGrupoAlumno;
    private javax.swing.JComboBox<String> cboSemestreAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnPromedioAlumno;
    private javax.swing.JTable tblRegistroAlumnos;
    private javax.swing.JTextField txtNombreAlumno;
    // End of variables declaration//GEN-END:variables
}
