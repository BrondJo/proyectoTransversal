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
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author joelb
 */
public class EliminarAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarAlumno
     */
    public EliminarAlumno() {
        initComponents();
        jLabel1.setOpaque(true);
        jLabel1.setBackground(new Color(2, 64, 126));
        jPanel1.setBackground(new Color(223, 232, 225));
        jbEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jbEliminar.setBackground(new Color(2, 64, 126));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbEliminar.setBackground(new Color(223, 232, 225));
            }
        });

        jbBuscar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jbBuscar.setBackground(new Color(2, 64, 126));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbBuscar.setBackground(new Color(223, 232, 225));
            }
        });

        jbLimpiar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jbLimpiar.setBackground(new Color(2, 64, 126));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jbLimpiar.setBackground(new Color(223, 232, 225));
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
        jtfID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        jbLimpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alumno");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminarUsuario.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELIMINAR ALUMNO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese el ID del alumno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, 30));

        jtfID.setBackground(new java.awt.Color(230, 244, 245));
        jtfID.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 110, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 110, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("DNI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 70, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("APELLIDO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jtfNombre.setBackground(new java.awt.Color(230, 244, 245));
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, -1));

        jtfApellido.setBackground(new java.awt.Color(230, 244, 245));
        jtfApellido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, -1));

        jtfDni.setBackground(new java.awt.Color(230, 244, 245));
        jtfDni.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 180, -1));

        jbEliminar.setBackground(new java.awt.Color(230, 244, 245));
        jbEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbEliminarMouseExited(evt);
            }
        });
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, 30));

        jbBuscar.setBackground(new java.awt.Color(230, 244, 245));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscarUsuario.png"))); // NOI18N
        jbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbBuscarMouseExited(evt);
            }
        });
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 60, 60));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("FECHA NAC.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 90, -1));

        calendario.setBackground(new java.awt.Color(230, 244, 245));
        calendario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 180, -1));

        jbLimpiar.setBackground(new java.awt.Color(230, 244, 245));
        jbLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbLimpiarMouseExited(evt);
            }
        });
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMouseEntered
        // TODO add your handling code here:
        jbEliminar.setBackground(new Color(2, 64, 126));
    }//GEN-LAST:event_jbEliminarMouseEntered

    private void jbEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMouseExited
        // TODO add your handling code here:
        jbEliminar.setBackground(new Color(223, 232, 225));
    }//GEN-LAST:event_jbEliminarMouseExited

    private void jbBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseEntered
        // TODO add your handling code here:
        jbBuscar.setBackground(new Color(2, 64, 126));
    }//GEN-LAST:event_jbBuscarMouseEntered

    private void jbBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseExited
        // TODO add your handling code here:
        jbBuscar.setBackground(new Color(223, 232, 225));
    }//GEN-LAST:event_jbBuscarMouseExited

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jtfID.getText());
        AlumnoData alu = new AlumnoData();
        Alumno alumnoEncontrado = alu.buscarAlumnoId(id);
        if (alumnoEncontrado != null) {
            jtfNombre.setText(alumnoEncontrado.getNombre());
            jtfApellido.setText(alumnoEncontrado.getApellido());
            String dni = String.valueOf(alumnoEncontrado.getDni());
            jtfDni.setText(dni);
            LocalDate localDate = alumnoEncontrado.getFechaNacimiento();
            Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            calendario.setDate(date);//
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (jtfID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos vacíos");
        } else {

            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar este alumno?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_NO_OPTION) {
                int id = Integer.parseInt(jtfID.getText());
                AlumnoData alu = new AlumnoData();
                alu.eliminarAlumno(id);
            } else if (resp == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Operación cancelada", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtfID.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfDni.setText("");
        calendario.setDate(null);

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseEntered
        // TODO add your handling code here:
        jbLimpiar.setBackground(new Color(2, 64, 126));
    }//GEN-LAST:event_jbLimpiarMouseEntered

    private void jbLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimpiarMouseExited
        // TODO add your handling code here:
        jbLimpiar.setBackground(new Color(223, 232, 225));
    }//GEN-LAST:event_jbLimpiarMouseExited


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
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
