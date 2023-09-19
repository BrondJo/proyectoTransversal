package vistas;


import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo71.entidades.Materia;
import universidadgrupo71.entidades.Inscripcion;

public class InscripcionVista extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel();
private AlumnoData alumData=new AlumnoData();
private MateriaData matData=new MateriaData();
private InscripcionData inscData=new InscripcionData(matData, alumData);

   
    public InscripcionVista() {
        initComponents();
         armarModelo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtIdAlumno = new javax.swing.JTextField();
        jbVerMaterias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbInscripcion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);

        jLabel3.setBackground(new java.awt.Color(170, 194, 205));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID ALUMNO:");
        jLabel3.setOpaque(true);

        jtIdAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtIdAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtIdAlumnoKeyReleased(evt);
            }
        });

        jbVerMaterias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbVerMaterias.setText("Ver materias");
        jbVerMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerMateriasActionPerformed(evt);
            }
        });

        jtMaterias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jtMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMaterias);

        jbInscripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbInscripcion.setText("Inscribirme");
        jbInscripcion.setEnabled(false);
        jbInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscripcionActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(2, 64, 126));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("COLOCAR CALIFICACIONES");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbInscripcion)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jtIdAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(57, 57, 57)
                        .addComponent(jbVerMaterias)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVerMaterias)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbInscripcion)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVerMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerMateriasActionPerformed
        cargarMaterias(Integer.parseInt(jtIdAlumno.getText()));
    }//GEN-LAST:event_jbVerMateriasActionPerformed

    private void jbInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscripcionActionPerformed
        try {
           int filaSeleccionada= jtMaterias.getSelectedRow();
        if (jtMaterias.getSelectedRow()>-1) {
        Inscripcion ins1= new Inscripcion();
        ins1.setNota(0);
        ins1.setAlumno(alumData.buscarAlumnoId(Integer.parseInt(jtIdAlumno.getText())));
        ins1.setMateria(matData.buscarMateria((int)jtMaterias.getValueAt(filaSeleccionada, 0)));        
         inscData.guardarInscripcion(ins1);
        limpiar();
        cargarMaterias(Integer.parseInt(jtIdAlumno.getText()));}  
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error al inscribirte"); 
            limpiar();
        }
    }//GEN-LAST:event_jbInscripcionActionPerformed
    
    private void jtMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMateriasMouseClicked
       jbInscripcion.setEnabled(true);      
    }//GEN-LAST:event_jtMateriasMouseClicked

    private void jtIdAlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdAlumnoKeyReleased
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jtIdAlumnoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbInscripcion;
    private javax.swing.JButton jbVerMaterias;
    private javax.swing.JTextField jtIdAlumno;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    public void armarModelo(){
    
        modelo.addColumn("IdMateria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtMaterias.setModel(modelo);
    }
    
    public void cargarMaterias(int id){
        limpiar();
    List <Materia> materias=new ArrayList<>();
    materias = inscData.obtenerMateriasNoCursadas(id);
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{materia.getId(),materia.getNombre(),materia.getAnio()});
        }    
    }
    private void limpiar(){
    int filas =modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    
    }
}
