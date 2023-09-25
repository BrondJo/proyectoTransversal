/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

public class BuscarMateriaView extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla;
    private AlumnoData aluData = new AlumnoData();
    private MateriaData matData = new MateriaData();
    private InscripcionData insData = new InscripcionData(matData, aluData);
    private List<Alumno> alumnos;
    private Materia materia;
    private int idMateria;
    private String nota;

    public BuscarMateriaView() {
        initComponents();
        modeloTabla = (DefaultTableModel) tablaAlumnos.getModel();
        llenarComboMaterias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        panelBuscar = new javax.swing.JPanel();
        comboBoxMaterias = new javax.swing.JComboBox<>();
        textAnio = new javax.swing.JTextField();
        textId = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        labelMateria = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelAnio = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        botonMostrarAlumnos = new javax.swing.JButton();
        comboBoxOrdenar = new javax.swing.JComboBox<>();
        botonLimpiar = new javax.swing.JButton();
        botonPdf = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(650, 500));
        setPreferredSize(new java.awt.Dimension(650, 500));
        getContentPane().setLayout(null);

        panelFondo.setBackground(new java.awt.Color(223, 232, 225));
        panelFondo.setPreferredSize(new java.awt.Dimension(650, 500));
        panelFondo.setLayout(null);

        panelSuperior.setBackground(new java.awt.Color(2, 64, 126));

        botonCerrar.setBackground(new java.awt.Color(2, 64, 126));
        botonCerrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrar.setText("X");
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setOpaque(true);
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCerrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCerrarMouseReleased(evt);
            }
        });
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Búsqueda por Materia");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelFondo.add(panelSuperior);
        panelSuperior.setBounds(0, 0, 638, 50);

        panelTabla.setBackground(new java.awt.Color(223, 232, 225));

        tablaAlumnos.setBackground(new java.awt.Color(230, 244, 245));
        tablaAlumnos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "DNI", "NOTA"
            }
        ));
        tablaAlumnos.setRowHeight(30);
        tablaAlumnos.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tablaAlumnos);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelFondo.add(panelTabla);
        panelTabla.setBounds(0, 270, 640, 200);

        panelBuscar.setBackground(new java.awt.Color(223, 232, 225));
        panelBuscar.setLayout(null);

        comboBoxMaterias.setBackground(new java.awt.Color(223, 232, 225));
        comboBoxMaterias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboBoxMaterias.setToolTipText("");
        comboBoxMaterias.setOpaque(true);
        comboBoxMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMateriasActionPerformed(evt);
            }
        });
        panelBuscar.add(comboBoxMaterias);
        comboBoxMaterias.setBounds(10, 80, 240, 40);

        textAnio.setEditable(false);
        textAnio.setBackground(new java.awt.Color(230, 244, 245));
        textAnio.setForeground(new java.awt.Color(153, 153, 153));
        textAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAnio.setText("Año correspondiente");
        panelBuscar.add(textAnio);
        textAnio.setBounds(430, 80, 160, 40);

        textId.setBackground(new java.awt.Color(230, 244, 245));
        textId.setForeground(new java.awt.Color(153, 153, 153));
        textId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textId.setText("Código único de la materia");
        textId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textIdFocusLost(evt);
            }
        });
        textId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIdKeyTyped(evt);
            }
        });
        panelBuscar.add(textId);
        textId.setBounds(90, 30, 160, 40);

        textNombre.setEditable(false);
        textNombre.setBackground(new java.awt.Color(230, 244, 245));
        textNombre.setForeground(new java.awt.Color(153, 153, 153));
        textNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNombre.setText("Nombre");
        panelBuscar.add(textNombre);
        textNombre.setBounds(430, 30, 160, 40);

        labelMateria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelMateria.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelMateria.setText("MATERIA");
        panelBuscar.add(labelMateria);
        labelMateria.setBounds(350, 30, 70, 40);

        labelId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelId.setText("N° de ID");
        panelBuscar.add(labelId);
        labelId.setBounds(10, 30, 70, 40);

        labelAnio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelAnio.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelAnio.setText("AÑO");
        panelBuscar.add(labelAnio);
        labelAnio.setBounds(350, 80, 70, 40);

        botonBuscar.setBackground(new java.awt.Color(170, 194, 205));
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupaIco.png"))); // NOI18N
        botonBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setEnabled(false);
        botonBuscar.setOpaque(true);
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBuscarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonBuscarMouseReleased(evt);
            }
        });
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        panelBuscar.add(botonBuscar);
        botonBuscar.setBounds(260, 30, 40, 90);

        panelFondo.add(panelBuscar);
        panelBuscar.setBounds(20, 50, 600, 140);

        botonMostrarAlumnos.setBackground(new java.awt.Color(170, 194, 205));
        botonMostrarAlumnos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonMostrarAlumnos.setText("MOSTRAR ALUMNOS");
        botonMostrarAlumnos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonMostrarAlumnos.setContentAreaFilled(false);
        botonMostrarAlumnos.setEnabled(false);
        botonMostrarAlumnos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMostrarAlumnos.setOpaque(true);
        botonMostrarAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMostrarAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMostrarAlumnosMouseExited(evt);
            }
        });
        botonMostrarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarAlumnosActionPerformed(evt);
            }
        });
        panelFondo.add(botonMostrarAlumnos);
        botonMostrarAlumnos.setBounds(20, 190, 590, 40);

        comboBoxOrdenar.setBackground(new java.awt.Color(223, 232, 225));
        comboBoxOrdenar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Orden de la tabla>", "Por ID", "Por Nombre A-Z", "Por Nombre Z-A", "Por Apellido A-Z", "Por Apellido Z-A", "Por Dni", "Por Mayor Nota", "Por Menor Nota" }));
        comboBoxOrdenar.setToolTipText("");
        comboBoxOrdenar.setEnabled(false);
        comboBoxOrdenar.setOpaque(true);
        comboBoxOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrdenarActionPerformed(evt);
            }
        });
        panelFondo.add(comboBoxOrdenar);
        comboBoxOrdenar.setBounds(20, 230, 380, 40);

        botonLimpiar.setBackground(new java.awt.Color(170, 194, 205));
        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escoba.png"))); // NOI18N
        botonLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonLimpiar.setContentAreaFilled(false);
        botonLimpiar.setEnabled(false);
        botonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLimpiar.setOpaque(true);
        botonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonLimpiarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonLimpiarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonLimpiarMouseReleased(evt);
            }
        });
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        panelFondo.add(botonLimpiar);
        botonLimpiar.setBounds(400, 230, 110, 40);

        botonPdf.setBackground(new java.awt.Color(170, 194, 205));
        botonPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        botonPdf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botonPdf.setContentAreaFilled(false);
        botonPdf.setEnabled(false);
        botonPdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPdf.setOpaque(true);
        botonPdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPdfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonPdfMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPdfMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonPdfMouseReleased(evt);
            }
        });
        botonPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPdfActionPerformed(evt);
            }
        });
        panelFondo.add(botonPdf);
        botonPdf.setBounds(510, 230, 100, 40);

        getContentPane().add(panelFondo);
        panelFondo.setBounds(0, 0, 638, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        if (botonBuscar.isEnabled()) {
            botonBuscar.setBackground(new Color(59, 99, 133));
        }
    }//GEN-LAST:event_botonBuscarMouseEntered

    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
        if (botonBuscar.isEnabled()) {
            botonBuscar.setBackground(new Color(170, 194, 205));
        }
    }//GEN-LAST:event_botonBuscarMouseExited

    private void botonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMousePressed
        if (botonBuscar.isEnabled()) {
            botonBuscar.setBackground(new Color(170, 194, 205));
        }
    }//GEN-LAST:event_botonBuscarMousePressed

    private void botonBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseReleased
        if (botonBuscar.isEnabled()) {
            botonBuscar.setBackground(new Color(59, 99, 133));
        }
    }//GEN-LAST:event_botonBuscarMouseReleased

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        materia = matData.buscarMateria(Integer.parseInt(textId.getText()));
        mostrarDatosMateria();
        botonMostrarAlumnos.setEnabled(true);

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void textIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_textIdKeyTyped

    private void textIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIdFocusGained
        if (textId.getText().equals("Código único de la materia")) {
            textId.setText("");
            textId.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textIdFocusGained

    private void textIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIdFocusLost
        textoPredeterminadoId();

    }//GEN-LAST:event_textIdFocusLost

    private void textoPredeterminadoId() {
        if (textId.getText().equals("")) {
            textId.setText("Código único de la materia");
            textId.setForeground(new Color(153, 153, 153));
        }
    }
    private void textIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdKeyReleased

        if ((!textId.getText().equals("")) && (!textId.getText().equals("Código único de la materia"))) {
            botonBuscar.setEnabled(true);
            botonLimpiar.setEnabled(true);
            idMateria = Integer.parseInt(textId.getText());
            //comboBoxMaterias.setEnabled(false);
        } else {
            limpiarTodo();
        }
    }//GEN-LAST:event_textIdKeyReleased

    private void botonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseEntered
        botonCerrar.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_botonCerrarMouseEntered

    private void botonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseExited
        botonCerrar.setBackground(new Color(15, 63, 119));
    }//GEN-LAST:event_botonCerrarMouseExited

    private void botonCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMousePressed
        botonCerrar.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_botonCerrarMousePressed

    private void botonCerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseReleased
        botonCerrar.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_botonCerrarMouseReleased

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPdfActionPerformed

        try {
            Document documento = new Document();

            String ruta = System.getProperty("user.home");
            String ubicacion = "/Desktop/";
            String nombreArchivo = "Alumnos de " + matData.buscarMateria(idMateria).getNombre();
            String extension = ".pdf";
            if (comboBoxOrdenar.getSelectedIndex() != 0) {
                nombreArchivo += " " + comboBoxOrdenar.getSelectedItem();
            }

            //El OptionPane muestra la carpeta, concatenando la ruta, la ubicación y el nombre del archivo
            //y permite editar el texto por el usuario, cambiando la carpeta de destino
            String nombreEspecificado = ruta + ubicacion + JOptionPane.showInputDialog(this,
                    "Indique el nombre del archivo:\n" + ruta + ubicacion, nombreArchivo);

            String ubicacionEspecificada = nombreEspecificado + extension;
            try {
                PdfWriter.getInstance(documento, new FileOutputStream(ubicacionEspecificada));
            } catch (DocumentException ex) {
                JOptionPane.showMessageDialog(null, "Error al trabajar con el documento", "Ocurrió un problema", 0);
            }
            documento.open();

            PdfPTable tabla = new PdfPTable(tablaAlumnos.getColumnCount());

            for (int i = 0; i < tablaAlumnos.getColumnCount(); i++) {
                tabla.addCell(tablaAlumnos.getColumnName(i));
            }
            System.out.println("cantidad de filas de la tabla: " + tablaAlumnos.getRowCount());
            System.out.println("cantidad de columnas de la tabla: " + tablaAlumnos.getColumnCount());

//El for "j" recorre las filas de la tabla
//Por cada fila, el for "i" recorre cada una de las columnas y le asigna el valor obtenido de la tablaAlumnos
            System.out.println("Alumnos");
            for (int j = 0; j < tablaAlumnos.getRowCount(); j++) {
                System.out.println("");
                for (int i = 0; i < tablaAlumnos.getColumnCount(); i++) {
                    System.out.print(tablaAlumnos.getValueAt(j, i).toString() + " ");
                    tabla.addCell(tablaAlumnos.getValueAt(j, i).toString());
                }
            }
            try {
                documento.add(tabla);

            } catch (DocumentException ex) {
                JOptionPane.showMessageDialog(this, ex, "No se encontró la carpeta", 0);
                System.err.println(Arrays.toString(ex.getStackTrace()));
            }
            documento.close();
            if (!nombreEspecificado.contains("null")) {
                JOptionPane.showMessageDialog(null, "Busque el archivo en:\n" + ubicacionEspecificada, "Se descargó el archivo PDF", 1);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex, "No se pudo crear el archivo", 0);
            System.err.println(Arrays.toString(ex.getStackTrace()));
        }

    }//GEN-LAST:event_botonPdfActionPerformed


    private void botonPdfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPdfMouseEntered
        if (botonPdf.isEnabled()) {
            botonPdf.setBackground(new Color(59, 99, 133));
        }
    }//GEN-LAST:event_botonPdfMouseEntered

    private void botonPdfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPdfMouseExited
        if (botonPdf.isEnabled()) {
            botonPdf.setBackground(new Color(170, 194, 205));
        }
    }//GEN-LAST:event_botonPdfMouseExited

    private void comboBoxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrdenarActionPerformed
        ordenarAlumnos();
    }//GEN-LAST:event_comboBoxOrdenarActionPerformed

    private void comboBoxMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMateriasActionPerformed
        limpiarTodo();
        if (comboBoxMaterias.getSelectedIndex() != 0) {
            materia = (Materia) comboBoxMaterias.getSelectedItem();
            idMateria = materia.getId();
            botonBuscar.setEnabled(true);
            botonLimpiar.setEnabled(true);
            mostrarDatosMateria();
        }
    }//GEN-LAST:event_comboBoxMateriasActionPerformed

    private void botonMostrarAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMostrarAlumnosMouseEntered
        if (botonMostrarAlumnos.isEnabled()) {
            botonMostrarAlumnos.setBackground(new Color(59, 99, 133));
        }
    }//GEN-LAST:event_botonMostrarAlumnosMouseEntered

    private void botonMostrarAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMostrarAlumnosMouseExited
        if (botonMostrarAlumnos.isEnabled()) {
            botonMostrarAlumnos.setBackground(new Color(170, 194, 205));
        }
    }//GEN-LAST:event_botonMostrarAlumnosMouseExited

    private void botonMostrarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarAlumnosActionPerformed
        obtenerAlumnos(idMateria);
        botonPdf.setEnabled(true);
        comboBoxOrdenar.setEnabled(true);
    }//GEN-LAST:event_botonMostrarAlumnosActionPerformed

    private void botonLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMouseEntered
        if (botonLimpiar.isEnabled()) {
            botonLimpiar.setBackground(new Color(59, 99, 133));
        }
    }//GEN-LAST:event_botonLimpiarMouseEntered

    private void botonLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMouseExited
        if (botonLimpiar.isEnabled()) {
            botonLimpiar.setBackground(new Color(170, 194, 205));
        }
    }//GEN-LAST:event_botonLimpiarMouseExited

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarTodo();
        comboBoxMaterias.setSelectedIndex(0);
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMouseReleased
        botonLimpiar.setBackground(new Color(170, 194, 205));
    }//GEN-LAST:event_botonLimpiarMouseReleased

    private void botonLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMousePressed
        botonLimpiar.setBackground(new Color(170, 194, 205));
    }//GEN-LAST:event_botonLimpiarMousePressed

    private void botonPdfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPdfMousePressed
        botonPdf.setBackground(new Color(170, 194, 205));
    }//GEN-LAST:event_botonPdfMousePressed

    private void botonPdfMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPdfMouseReleased
        botonPdf.setBackground(new Color(59, 99, 133));
    }//GEN-LAST:event_botonPdfMouseReleased

    private void obtenerAlumnos(int idMateria) {
        alumnos = insData.obtenerAlumnosXMateria(idMateria);
        ordenarAlumnos();
    }

    private void ordenarAlumnos() {
        String orden = (String) comboBoxOrdenar.getSelectedItem();

        switch (orden) {
            case "Por Nombre A-Z":
                alumnos.sort(new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno alumno1, Alumno alumno2) {
                        return alumno1.getNombre().compareTo(alumno2.getNombre());
                    }
                });
                break;
            case "Por Nombre Z-A":
                alumnos.sort(new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno alumno1, Alumno alumno2) {
                        return alumno1.getNombre().compareTo(alumno2.getNombre());
                    }
                });
                Collections.reverse(alumnos);
                break;
            case "Por Apellido A-Z":
                alumnos.sort(new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno alumno1, Alumno alumno2) {
                        return alumno1.getApellido().compareTo(alumno2.getApellido());
                    }
                });
                break;
            case "Por Apellido Z-A":
                alumnos.sort(new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno alumno1, Alumno alumno2) {
                        return alumno1.getApellido().compareTo(alumno2.getApellido());
                    }
                });
                Collections.reverse(alumnos);
                break;
            case "Por Dni":
                alumnos.sort(new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno alumno1, Alumno alumno2) {
                        return alumno1.getDni() - alumno2.getDni();
                    }
                });
                break;
            case "Por Mayor Nota":
                alumnos.sort(new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno alumno1, Alumno alumno2) {
                        int cantidad1 = insData.obtenerAlumnosXMateria(alumno1.getId()).size();
                        int cantidad2 = insData.obtenerAlumnosXMateria(alumno2.getId()).size();
                        return cantidad1 - cantidad2;
                    }
                });
                break;
            case "Por Menor Nota":
                alumnos.sort(new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno alumno1, Alumno alumno2) {
                        int cantidad1 = insData.obtenerAlumnosXMateria(alumno1.getId()).size();
                        int cantidad2 = insData.obtenerAlumnosXMateria(alumno2.getId()).size();
                        return cantidad2 - cantidad1;
                    }
                });
                break;
            default:
                Collections.sort(alumnos);
        }
        llenarTabla();
    }

    private void llenarTabla() {
        limpiarTabla();
        modeloTabla.setRowCount(0);  //Reinicia el contador de filas de la tabla
        for (Alumno alumno : alumnos) { //Recorre el ArrayList de Alumnos que ha sido ordenado previamente
            //se obtienen las incripciones de cada alumno
            List<Inscripcion> inscripciones = insData.obtenerInscripcionesPorAlumno(alumno.getId());
            for (Inscripcion inscripcion : inscripciones) {
                //si el idMateria de la inscripcion coincide con el de la materia seleccionada se obtiene su nota
                if (inscripcion.getMateria().getId() == idMateria) {
                    nota = (int) inscripcion.getNota() + "";
                    if (nota.equals("0")) {
                        nota = "No asignada";
                    }
                }
            }
            //se añade una fila a la tabla con los datos del alumno inscripto a la materia
            modeloTabla.addRow(new Object[]{alumno.getId(), alumno.getNombre(), alumno.getApellido(), alumno.getDni(), nota});
        }
    }

    private void llenarComboMaterias() {
        comboBoxMaterias.addItem("<Seleccione una materia>");
        for (Materia materia : matData.listarMaterias()) {
            comboBoxMaterias.addItem(materia);
        }
    }

    private void mostrarDatosMateria() {
        if (materia != null) {
            textId.setText(materia.getId() + "");
            textId.setForeground(Color.BLACK);
            textNombre.setText(materia.getNombre());
            textNombre.setForeground(Color.BLACK);
            textAnio.setText(materia.getAnio() + "");
            textAnio.setForeground(Color.BLACK);
            comboBoxMaterias.setSelectedItem((Materia) materia);
        } else {
            limpiarTodo();
        }
    }

    private void limpiarTodo() {
        comboBoxMaterias.setEnabled(true);
        botonBuscar.setEnabled(false);
        botonPdf.setEnabled(false);
        comboBoxOrdenar.setEnabled(false);
        textId.setText("");
        textoPredeterminadoId();
        textNombre.setText("Nombre");
        textNombre.setForeground(Color.GRAY);
        textAnio.setText("Año correspondiente");
        textAnio.setForeground(Color.GRAY);
        botonMostrarAlumnos.setEnabled(false);
        botonPdf.setEnabled(false);
        botonLimpiar.setEnabled(false);
        this.requestFocus();

        limpiarTabla();
    }

    private void limpiarTabla() {
        int filas = modeloTabla.getRowCount();
        for (int i = 0; i < filas; i++) {
            modeloTabla.removeRow(0);
        }
        for (int i = 0; i < 5; i++) {
            modeloTabla.addRow(new Object[4]);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonMostrarAlumnos;
    private javax.swing.JButton botonPdf;
    private javax.swing.JComboBox<Object> comboBoxMaterias;
    private javax.swing.JComboBox<String> comboBoxOrdenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAnio;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTextField textAnio;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables

}
