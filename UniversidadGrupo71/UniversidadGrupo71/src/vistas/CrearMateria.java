/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import AccesoADatos.MateriaData;
import Entidades.Materia;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author joelb
 */
public class CrearMateria extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearAlumno
     */
    public CrearMateria() {
        initComponents();
        jLabel1.setOpaque(true);
        jLabel1.setBackground(new Color(2, 64, 126));
        jPanel1.setBackground(new Color(223, 232, 225));
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
        jbCrear = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfAnio = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 255));
        setClosable(true);
        setTitle("Materia");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarMateria.png"))); // NOI18N
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(223, 232, 225));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 232, 225));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREAR MATERIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("AÑO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 80, 20));

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
        jPanel1.add(jbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jtfNombre.setBackground(new java.awt.Color(230, 244, 245));
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 220, -1));

        jtfAnio.setBackground(new java.awt.Color(230, 244, 245));
        jPanel1.add(jtfAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 340));

        getAccessibleContext().setAccessibleName("Alumno");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        // TODO add your handling code here:
        if (jtfNombre.getText().isEmpty() || jtfAnio.getText().isEmpty() || buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Complete los campos vacíos");
        } else {
            try {
                String nombre = jtfNombre.getText();
                String apellido = jtfAnio.getText();
                int anio = Integer.parseInt(jtfAnio.getText());
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de crear esta materia?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_NO_OPTION) {
                    Materia mat = new Materia(nombre, anio, true);
                    MateriaData md = new MateriaData();
                    md.guardarMateria(mat);
                    jtfNombre.setText("");
                    jtfAnio.setText("");
                    buttonGroup1.clearSelection();
                } else if (resp == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo números en AÑO");
                jtfAnio.setText("");//
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCrear;
    private javax.swing.JTextField jtfAnio;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
