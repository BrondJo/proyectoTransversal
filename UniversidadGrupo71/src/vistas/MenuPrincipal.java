/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Rodri
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        escritorio = new javax.swing.JDesktopPane();
        botonCrearUsuario = new javax.swing.JButton();
        botonIniciarSesion = new javax.swing.JButton();
        fondoEscritorio = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuAlumno = new javax.swing.JMenu();
        menuItemCrearAlumno = new javax.swing.JMenuItem();
        menuItemModifAlumno = new javax.swing.JMenuItem();
        menuItemBorrarAlumno = new javax.swing.JMenuItem();
        menuMateria = new javax.swing.JMenu();
        menuItemCrearMateria = new javax.swing.JMenuItem();
        menuItemModifMateria = new javax.swing.JMenuItem();
        menuItemBorrarMateria = new javax.swing.JMenuItem();
        menuAdministracion = new javax.swing.JMenu();
        menuItemInscribir = new javax.swing.JMenuItem();
        menuItemAsignNota = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuItemBuscarAlumno = new javax.swing.JMenuItem();
        menuItemListarAlumno = new javax.swing.JMenuItem();
        menuItemBuscarMateria = new javax.swing.JMenuItem();
        menuItemListarMateria = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCrearUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar30px.png"))); // NOI18N
        botonCrearUsuario.setText("CREAR USUARIO");
        botonCrearUsuario.setContentAreaFilled(false);
        escritorio.add(botonCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 180, 40));

        botonIniciarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario30px.png"))); // NOI18N
        botonIniciarSesion.setText(" INICIAR SESION ");
        botonIniciarSesion.setContentAreaFilled(false);
        escritorio.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 180, 40));

        fondoEscritorio.setBackground(new java.awt.Color(204, 204, 204));
        fondoEscritorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoEscritorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ulpLogoFondo.png"))); // NOI18N
        fondoEscritorio.setOpaque(true);
        escritorio.add(fondoEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 910, 680));

        barraMenu.setPreferredSize(new java.awt.Dimension(301, 50));

        menuAlumno.setText("Alumno");

        menuItemCrearAlumno.setText("Crear");
        menuItemCrearAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuItemCrearAlumno);

        menuItemModifAlumno.setText("Modificar");
        menuAlumno.add(menuItemModifAlumno);

        menuItemBorrarAlumno.setText("Dar de baja");
        menuAlumno.add(menuItemBorrarAlumno);

        barraMenu.add(menuAlumno);

        menuMateria.setText("Materia");

        menuItemCrearMateria.setText("Crear");
        menuMateria.add(menuItemCrearMateria);

        menuItemModifMateria.setText("Modificar");
        menuMateria.add(menuItemModifMateria);

        menuItemBorrarMateria.setText("Borrar");
        menuMateria.add(menuItemBorrarMateria);

        barraMenu.add(menuMateria);

        menuAdministracion.setText("Administración");

        menuItemInscribir.setText("Inscribir");
        menuAdministracion.add(menuItemInscribir);

        menuItemAsignNota.setText("Asignar Nota");
        menuAdministracion.add(menuItemAsignNota);

        barraMenu.add(menuAdministracion);

        menuConsultas.setText("Consultas");

        menuItemBuscarAlumno.setText("Bucar alumno");
        menuConsultas.add(menuItemBuscarAlumno);

        menuItemListarAlumno.setText("Listar alumno");
        menuItemListarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarAlumnoActionPerformed(evt);
            }
        });
        menuConsultas.add(menuItemListarAlumno);

        menuItemBuscarMateria.setText("Buscar materia");
        menuConsultas.add(menuItemBuscarMateria);

        menuItemListarMateria.setText("Listar alumno");
        menuConsultas.add(menuItemListarMateria);

        barraMenu.add(menuConsultas);

        menuSalir.setText("Salir");
        barraMenu.add(menuSalir);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCrearAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCrearAlumnoActionPerformed

    private void menuItemListarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemListarAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonCrearUsuario;
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel fondoEscritorio;
    private javax.swing.JMenu menuAdministracion;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenuItem menuItemAsignNota;
    private javax.swing.JMenuItem menuItemBorrarAlumno;
    private javax.swing.JMenuItem menuItemBorrarMateria;
    private javax.swing.JMenuItem menuItemBuscarAlumno;
    private javax.swing.JMenuItem menuItemBuscarMateria;
    private javax.swing.JMenuItem menuItemCrearAlumno;
    private javax.swing.JMenuItem menuItemCrearMateria;
    private javax.swing.JMenuItem menuItemInscribir;
    private javax.swing.JMenuItem menuItemListarAlumno;
    private javax.swing.JMenuItem menuItemListarMateria;
    private javax.swing.JMenuItem menuItemModifAlumno;
    private javax.swing.JMenuItem menuItemModifMateria;
    private javax.swing.JMenu menuMateria;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
