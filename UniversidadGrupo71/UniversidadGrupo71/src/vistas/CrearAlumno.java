/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import AccesoADatos.AlumnoData;
import universidadgrupo71.entidades.Alumno;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
/**
 *
 * @author joelb
 */
public class CrearAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearAlumno
     */
    public CrearAlumno() {
        initComponents();
        jLabel1.setOpaque(true);
        jLabel1.setBackground(new Color(2, 64, 126));
        jPanel1.setBackground(new Color(223, 232, 225));
        calendario.setDateFormatString("dd/MM/yyyy");
        jbCrear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jbCrear.setBackground(new Color(2, 64, 126));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbCrear.setBackground(new Color(223, 232, 225));
            }
        });

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jrbActivo = new javax.swing.JRadioButton();
        jrbInactivo = new javax.swing.JRadioButton();
        jbCrear = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 255));
        setClosable(true);
        setTitle("Alumno");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agregarUsuario.png"))); // NOI18N
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(223, 232, 225));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 232, 225));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREAR ALUMNO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 110, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APELLIDO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 127, 80, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("N° DNI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("FECHA NAC.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 90, 50));

        calendario.setBackground(new java.awt.Color(230, 244, 245));
        calendario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 220, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ESTADO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 20));

        buttonGroup1.add(jrbActivo);
        jrbActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbActivo.setForeground(new java.awt.Color(0, 0, 0));
        jrbActivo.setText("ACTIVO");
        jPanel1.add(jrbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        buttonGroup1.add(jrbInactivo);
        jrbInactivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbInactivo.setForeground(new java.awt.Color(0, 0, 0));
        jrbInactivo.setText("INACTIVO");
        jPanel1.add(jrbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jbCrear.setBackground(new java.awt.Color(230, 244, 245));
        jbCrear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbCrear.setText("CREAR");
        jbCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCrearMouseExited(evt);
            }
        });
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });
        jPanel1.add(jbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        jtfNombre.setBackground(new java.awt.Color(230, 244, 245));
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 220, -1));

        jtfApellido.setBackground(new java.awt.Color(230, 244, 245));
        jtfApellido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 220, -1));

        jtfDni.setBackground(new java.awt.Color(230, 244, 245));
        jtfDni.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        // TODO add your handling code here:
        if (jtfNombre.getText().isEmpty() || jtfApellido.getText().isEmpty() || jtfDni.getText().isEmpty() || buttonGroup1.getSelection() == null || calendario.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Complete los campos vacíos");
        } else {
            try {
                boolean estado;
                String nombre = jtfNombre.getText();
                String apellido = jtfApellido.getText();
                int dni = Integer.valueOf(jtfDni.getText());
                LocalDate fecha = calendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (jrbActivo.isSelected()) {
                    estado = true;
                } else {
                    estado = false;
                }
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de crear este alumno?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if(resp == JOptionPane.YES_NO_OPTION){
                Alumno alumno = new Alumno(dni, apellido, nombre, fecha, estado);
                AlumnoData alu = new AlumnoData();
                alu.guardarAlumno(alumno);
                jtfNombre.setText("");
                jtfApellido.setText("");
                jtfDni.setText("");
                buttonGroup1.clearSelection();
                calendario.setDate(null);
                }
                else if(resp == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Operación cancelada","Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo números en DNI");
                jtfDni.setText("");//
            }
        }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCrearMouseEntered
        // TODO add your handling code here:
        jbCrear.setBackground(new Color(2, 64, 126));
    }//GEN-LAST:event_jbCrearMouseEntered

    private void jbCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCrearMouseExited
        // TODO add your handling code here:
        jbCrear.setBackground(new Color(223, 232, 225));
    }//GEN-LAST:event_jbCrearMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCrear;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JRadioButton jrbInactivo;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}