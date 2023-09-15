/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Rodri
 */
public class MenuPrincipal extends javax.swing.JFrame {

    ImageIcon imgAgregarUsuarioGr = new ImageIcon(getClass().getResource("/imagenes/agregarUs.png"));
    ImageIcon imgAgregarUsuarioCh = new ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"));

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
        jLabel1 = new javax.swing.JLabel();
        labelFooter = new javax.swing.JLabel();
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
        jMenu2 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad de La Punta");
        setBackground(new java.awt.Color(102, 102, 102));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/ulpLogoFondo.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setBackground(new java.awt.Color(223, 232, 225));
        escritorio.setBorder(null);
        escritorio.setEnabled(false);

        botonCrearUsuario.setBackground(new java.awt.Color(223, 232, 225));
        botonCrearUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar30px.png"))); // NOI18N
        botonCrearUsuario.setText("CREAR USUARIO");
        botonCrearUsuario.setContentAreaFilled(false);
        botonCrearUsuario.setOpaque(true);
        botonCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCrearUsuarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCrearUsuarioMouseReleased(evt);
            }
        });

        botonIniciarSesion.setBackground(new java.awt.Color(223, 232, 225));
        botonIniciarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario30px.png"))); // NOI18N
        botonIniciarSesion.setText(" INICIAR SESION ");
        botonIniciarSesion.setContentAreaFilled(false);
        botonIniciarSesion.setOpaque(true);
        botonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonIniciarSesionMouseReleased(evt);
            }
        });
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoUlp.png"))); // NOI18N

        escritorio.setLayer(botonCrearUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(botonIniciarSesion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 520));

        labelFooter.setBackground(new java.awt.Color(15, 63, 119));
        labelFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFooter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/footerUlpVirtual.png"))); // NOI18N
        labelFooter.setToolTipText("");
        labelFooter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        labelFooter.setOpaque(true);
        getContentPane().add(labelFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 1190, -1));

        barraMenu.setBackground(new java.awt.Color(15, 63, 119));
        barraMenu.setBorder(null);
        barraMenu.setEnabled(false);
        barraMenu.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        barraMenu.setName(""); // NOI18N
        barraMenu.setOpaque(true);
        barraMenu.setPreferredSize(new java.awt.Dimension(301, 100));

        menuAlumno.setBackground(new java.awt.Color(15, 63, 119));
        menuAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/virrete.png"))); // NOI18N
        menuAlumno.setText("Alumno");
        menuAlumno.setContentAreaFilled(false);
        menuAlumno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuAlumno.setOpaque(true);
        menuAlumno.setPreferredSize(new java.awt.Dimension(180, 33));
        menuAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAlumnoMouseExited(evt);
            }
        });

        menuItemCrearAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemCrearAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemCrearAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        menuItemCrearAlumno.setText("Nuevo");
        menuItemCrearAlumno.setOpaque(true);
        menuItemCrearAlumno.setPreferredSize(new java.awt.Dimension(111, 55));
        menuItemCrearAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItemCrearAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItemCrearAlumnoMouseExited(evt);
            }
        });
        menuItemCrearAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(menuItemCrearAlumno);

        menuItemModifAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemModifAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemModifAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarUsuario.png"))); // NOI18N
        menuItemModifAlumno.setText("Editar");
        menuItemModifAlumno.setOpaque(true);
        menuItemModifAlumno.setPreferredSize(new java.awt.Dimension(129, 55));
        menuAlumno.add(menuItemModifAlumno);

        menuItemBorrarAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemBorrarAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemBorrarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarUsuario.png"))); // NOI18N
        menuItemBorrarAlumno.setText("Baja");
        menuItemBorrarAlumno.setOpaque(true);
        menuItemBorrarAlumno.setPreferredSize(new java.awt.Dimension(145, 55));
        menuAlumno.add(menuItemBorrarAlumno);

        barraMenu.add(menuAlumno);
        menuAlumno.getAccessibleContext().setAccessibleDescription("");

        menuMateria.setBackground(new java.awt.Color(15, 63, 119));
        menuMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        menuMateria.setText("Materia");
        menuMateria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuMateria.setOpaque(true);
        menuMateria.setPreferredSize(new java.awt.Dimension(150, 33));
        menuMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMateriaMouseExited(evt);
            }
        });

        menuItemCrearMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemCrearMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemCrearMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarMateria.png"))); // NOI18N
        menuItemCrearMateria.setText("Nueva");
        menuItemCrearMateria.setOpaque(true);
        menuItemCrearMateria.setPreferredSize(new java.awt.Dimension(137, 55));
        menuMateria.add(menuItemCrearMateria);

        menuItemModifMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemModifMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemModifMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarMateria3.png"))); // NOI18N
        menuItemModifMateria.setText("Editar");
        menuItemModifMateria.setOpaque(true);
        menuItemModifMateria.setPreferredSize(new java.awt.Dimension(137, 55));
        menuMateria.add(menuItemModifMateria);

        menuItemBorrarMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemBorrarMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemBorrarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desecharMateria.png"))); // NOI18N
        menuItemBorrarMateria.setText("Borrar");
        menuItemBorrarMateria.setOpaque(true);
        menuItemBorrarMateria.setPreferredSize(new java.awt.Dimension(137, 55));
        menuMateria.add(menuItemBorrarMateria);

        barraMenu.add(menuMateria);

        menuAdministracion.setBackground(new java.awt.Color(15, 63, 119));
        menuAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion.png"))); // NOI18N
        menuAdministracion.setText("Administración");
        menuAdministracion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuAdministracion.setMaximumSize(new java.awt.Dimension(260, 32767));
        menuAdministracion.setOpaque(true);
        menuAdministracion.setPreferredSize(new java.awt.Dimension(240, 33));
        menuAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAdministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAdministracionMouseExited(evt);
            }
        });

        menuItemInscribir.setBackground(new java.awt.Color(87, 116, 134));
        menuItemInscribir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carpeta.png"))); // NOI18N
        menuItemInscribir.setText("Inscribir");
        menuItemInscribir.setMinimumSize(new java.awt.Dimension(150, 55));
        menuItemInscribir.setOpaque(true);
        menuItemInscribir.setPreferredSize(new java.awt.Dimension(180, 55));
        menuAdministracion.add(menuItemInscribir);

        menuItemAsignNota.setBackground(new java.awt.Color(87, 116, 134));
        menuItemAsignNota.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemAsignNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nota.png"))); // NOI18N
        menuItemAsignNota.setText("Asignar Nota");
        menuItemAsignNota.setOpaque(true);
        menuItemAsignNota.setPreferredSize(new java.awt.Dimension(115, 55));
        menuAdministracion.add(menuItemAsignNota);

        barraMenu.add(menuAdministracion);

        menuConsultas.setBackground(new java.awt.Color(15, 63, 119));
        menuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        menuConsultas.setText("Consultas");
        menuConsultas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuConsultas.setMaximumSize(new java.awt.Dimension(250, 32767));
        menuConsultas.setOpaque(true);
        menuConsultas.setPreferredSize(new java.awt.Dimension(240, 33));
        menuConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuConsultasMouseExited(evt);
            }
        });

        menuItemBuscarAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemBuscarAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemBuscarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarUsuario.png"))); // NOI18N
        menuItemBuscarAlumno.setText("Bucar alumno");
        menuItemBuscarAlumno.setOpaque(true);
        menuItemBuscarAlumno.setPreferredSize(new java.awt.Dimension(200, 55));
        menuConsultas.add(menuItemBuscarAlumno);

        menuItemListarAlumno.setBackground(new java.awt.Color(87, 116, 134));
        menuItemListarAlumno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemListarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listaUsuarios.png"))); // NOI18N
        menuItemListarAlumno.setText("Listar alumnos");
        menuItemListarAlumno.setOpaque(true);
        menuItemListarAlumno.setPreferredSize(new java.awt.Dimension(121, 55));
        menuItemListarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarAlumnoActionPerformed(evt);
            }
        });
        menuConsultas.add(menuItemListarAlumno);

        menuItemBuscarMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemBuscarMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemBuscarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarMateria.png"))); // NOI18N
        menuItemBuscarMateria.setText("Buscar materia");
        menuItemBuscarMateria.setOpaque(true);
        menuItemBuscarMateria.setPreferredSize(new java.awt.Dimension(131, 55));
        menuConsultas.add(menuItemBuscarMateria);

        menuItemListarMateria.setBackground(new java.awt.Color(87, 116, 134));
        menuItemListarMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menuItemListarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrarNotas.png"))); // NOI18N
        menuItemListarMateria.setText("Listar materias");
        menuItemListarMateria.setOpaque(true);
        menuItemListarMateria.setPreferredSize(new java.awt.Dimension(131, 55));
        menuConsultas.add(menuItemListarMateria);

        barraMenu.add(menuConsultas);

        jMenu2.setEnabled(false);
        jMenu2.setPreferredSize(new java.awt.Dimension(230, 55));
        barraMenu.add(jMenu2);

        menuSalir.setBackground(new java.awt.Color(15, 63, 119));
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.Ico.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuSalir.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuSalir.setOpaque(true);
        menuSalir.setPreferredSize(new java.awt.Dimension(100, 33));
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuSalirMouseExited(evt);
            }
        });
        barraMenu.add(menuSalir);
        menuSalir.getAccessibleContext().setAccessibleDescription("salir");

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCrearAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        //escritorio.add(fondoEscritorio);
        escritorio.moveToFront(this);
    }//GEN-LAST:event_menuItemCrearAlumnoActionPerformed

    private void menuItemListarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemListarAlumnoActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed

        LoginView vistaLogin = new LoginView();
        vistaLogin.setVisible(true);


    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void menuItemCrearAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemCrearAlumnoMouseEntered
        menuItemCrearAlumno.setIcon(imgAgregarUsuarioGr);
    }//GEN-LAST:event_menuItemCrearAlumnoMouseEntered

    private void menuItemCrearAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemCrearAlumnoMouseExited
        menuItemCrearAlumno.setIcon(imgAgregarUsuarioCh);
    }//GEN-LAST:event_menuItemCrearAlumnoMouseExited

    private void botonIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseEntered
        botonIniciarSesion.setBackground(new Color(230, 244, 245));

    }//GEN-LAST:event_botonIniciarSesionMouseEntered

    private void botonIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseExited
        botonIniciarSesion.setBackground(new Color(223, 232, 225));

    }//GEN-LAST:event_botonIniciarSesionMouseExited

    private void botonCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearUsuarioMouseEntered
        botonCrearUsuario.setBackground(new Color(230, 244, 245));
    }//GEN-LAST:event_botonCrearUsuarioMouseEntered

    private void botonCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearUsuarioMouseExited
        botonCrearUsuario.setBackground(new Color(223, 232, 225));
    }//GEN-LAST:event_botonCrearUsuarioMouseExited

    private void menuAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlumnoMouseEntered
        menuAlumno.setBackground(new Color(59,99,133));
    }//GEN-LAST:event_menuAlumnoMouseEntered

    private void menuAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlumnoMouseExited
        menuAlumno.setBackground(new Color(15,63,119));
    }//GEN-LAST:event_menuAlumnoMouseExited

    private void menuMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMateriaMouseEntered
        menuMateria.setBackground(new Color(59,99,133));
    }//GEN-LAST:event_menuMateriaMouseEntered

    private void menuMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMateriaMouseExited
        menuMateria.setBackground(new Color(15,63,119));
    }//GEN-LAST:event_menuMateriaMouseExited

    private void menuAdministracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAdministracionMouseEntered
        menuAdministracion.setBackground(new Color(59,99,133));
    }//GEN-LAST:event_menuAdministracionMouseEntered

    private void menuAdministracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAdministracionMouseExited
        menuAdministracion.setBackground(new Color(15,63,119));
    }//GEN-LAST:event_menuAdministracionMouseExited

    private void menuConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConsultasMouseEntered
        menuConsultas.setBackground(new Color(59,99,133));
    }//GEN-LAST:event_menuConsultasMouseEntered

    private void menuConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConsultasMouseExited
        menuConsultas.setBackground(new Color(15,63,119));
    }//GEN-LAST:event_menuConsultasMouseExited

    private void menuSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseEntered
        menuSalir.setBackground(new Color(59,99,133));
    }//GEN-LAST:event_menuSalirMouseEntered

    private void menuSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseExited
        menuSalir.setBackground(new Color(15,63,119));
    }//GEN-LAST:event_menuSalirMouseExited

    private void botonIniciarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMouseReleased
        botonCrearUsuario.setBackground(new Color(230, 244, 245));
    }//GEN-LAST:event_botonIniciarSesionMouseReleased

    private void botonIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarSesionMousePressed
        botonIniciarSesion.setBackground(new Color(170, 194, 205));
    }//GEN-LAST:event_botonIniciarSesionMousePressed

    private void botonCrearUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearUsuarioMousePressed
        botonCrearUsuario.setBackground(new Color(170, 194, 205));
    }//GEN-LAST:event_botonCrearUsuarioMousePressed

    private void botonCrearUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearUsuarioMouseReleased
        botonCrearUsuario.setBackground(new Color(230, 244, 245));
    }//GEN-LAST:event_botonCrearUsuarioMouseReleased

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel labelFooter;
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
