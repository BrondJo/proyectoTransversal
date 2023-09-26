/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AsignarNota extends javax.swing.JInternalFrame {
private AlumnoData alumData=new AlumnoData();
private MateriaData matData= new MateriaData();
private InscripcionData inscData= new InscripcionData(matData, alumData);
private Alumno alumno= new Alumno();
private Materia materia;
    /**
     * Creates new form AsignarNota
     */
    public AsignarNota() {
        initComponents();
        jboxAlumnos.addItem("Elegir alumno");
        modeloBoxAlumnos();        
        jboxMaterias.addItem("Elegir materia");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtNota = new javax.swing.JTextField();
        jbAsignar = new javax.swing.JButton();
        jboxAlumnos = new javax.swing.JComboBox<>();
        jboxMaterias = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Administración");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracionIco.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(223, 232, 225));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(2, 64, 126));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CALIFICACIONES");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        jLabel1.setBackground(new java.awt.Color(170, 194, 205));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID ALUMNO:");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, 25));

        jLabel2.setBackground(new java.awt.Color(170, 194, 205));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CALIFICACIÓN:");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 110, 25));

        jLabel3.setBackground(new java.awt.Color(170, 194, 205));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID MATERIA:");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 110, 25));

        jtNota.setEditable(false);
        jtNota.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtNota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNotaActionPerformed(evt);
            }
        });
        jtNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNotaKeyTyped(evt);
            }
        });
        jPanel1.add(jtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 76, 25));

        jbAsignar.setBackground(new java.awt.Color(2, 64, 126));
        jbAsignar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbAsignar.setForeground(new java.awt.Color(255, 255, 255));
        jbAsignar.setText("Asignar Nota");
        jbAsignar.setAutoscrolls(true);
        jbAsignar.setContentAreaFilled(false);
        jbAsignar.setEnabled(false);
        jbAsignar.setOpaque(true);
        jbAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAsignarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jboxAlumnos.setBackground(new java.awt.Color(223, 232, 225));
        jboxAlumnos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jboxAlumnos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jboxAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxAlumnosActionPerformed(evt);
            }
        });
        jPanel1.add(jboxAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 170, -1));

        jboxMaterias.setBackground(new java.awt.Color(223, 232, 225));
        jboxMaterias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jboxMaterias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jboxMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxMateriasActionPerformed(evt);
            }
        });
        jPanel1.add(jboxMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 1, 590, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNotaActionPerformed

    private void jbAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAsignarActionPerformed
        if (Integer.parseInt(jtNota.getText())>=0&&Integer.parseInt(jtNota.getText())<=10) {
        inscData.actualizarNota(alumno.getId(), materia.getId(), Integer.parseInt(jtNota.getText()));                 
        limpiar();       
        }else{
        JOptionPane.showMessageDialog(this, "Nota no valida. Solo valores entre 0 y 10");
        limpiar();
        } 
        jbAsignar.setEnabled(false);              
    }//GEN-LAST:event_jbAsignarActionPerformed

    private void jboxAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxAlumnosActionPerformed
           jboxMaterias.removeAllItems(); 
           limpiar();
        if (jboxAlumnos.getSelectedIndex()!=0) {
           alumno = (Alumno) jboxAlumnos.getSelectedItem();
           modeloBoxMaterias();  
        }else{
        jboxMaterias.addItem("Elegir materia");}
    }//GEN-LAST:event_jboxAlumnosActionPerformed

    private void jboxMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxMateriasActionPerformed
         jtNota.setEditable(false);
         limpiar();
        if (jboxMaterias.getSelectedIndex()!=0) {
          materia = (Materia) jboxMaterias.getSelectedItem();  
          jtNota.setEditable(true);
        }       
    }//GEN-LAST:event_jboxMateriasActionPerformed

    private void jtNotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNotaKeyTyped
        char c =evt.getKeyChar();
        if (c<'0'||c>'9')evt.consume();  
        else{
        jbAsignar.setEnabled(true);
        }
    }//GEN-LAST:event_jtNotaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAsignar;
    private javax.swing.JComboBox<Object> jboxAlumnos;
    private javax.swing.JComboBox<Object> jboxMaterias;
    private javax.swing.JTextField jtNota;
    // End of variables declaration//GEN-END:variables
private void limpiar(){
jtNota.setText("");
}
private void modeloBoxAlumnos(){  
    for (Alumno a : alumData.listarAlumnos()) {
        jboxAlumnos.addItem(a);
    }
}
private void modeloBoxMaterias(){
    jboxMaterias.removeAll();
    jboxMaterias.addItem("Elegir materia");
    for (Materia a : inscData.obtenerMateriasCursadas(alumno.getId())) {
        jboxMaterias.addItem(a);
    }   
}
}

