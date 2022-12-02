/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Sistema;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joset
 */
public class AgregarE extends javax.swing.JPanel {

    DefaultTableModel model;
    Fondo fd = new Fondo();
    String ruta = "";

    /**
     * Creates new form AgregarE
     */
    public AgregarE() {
        initComponents();
        String[] titulos = {"ID", "Nombre", "Descripcion", "Imagen"};
        model = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 1) {
                    return true;
                } else {
                    return false;
                }
            }

        };
        tblAnimales.setModel(model);
        tblAnimales.setEditingRow(0);
        tblAnimales.setEditingRow(1);
        tblAnimales.setEditingRow(2);
        tblAnimales.setEditingRow(3);
        
        mostrarDatos();
        limpiar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondo();
        jButton1 = new javax.swing.JButton();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        imglabel = new javax.swing.JLabel();
        txtimg = new javax.swing.JTextField();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimales = new javax.swing.JTable();
        bBorrar = new javax.swing.JButton();
        bAgregar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(709, 449));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255,80));
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseEntered(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("ID :");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 43, -1, -1));

        txtID.setEditable(false);
        txtID.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtID.setOpaque(true);
        kGradientPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 42, 36, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Descripcion:");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 96, 68, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INGRESAR REGISTROS");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 560, -1));

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        txtDesc.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(txtDesc);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 96, -1, -1));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nombre :");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 67, -1, -1));

        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtNombre.setOpaque(true);
        kGradientPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 66, 161, -1));

        jButton2.setText("Seleccion Imagen");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.setContentAreaFilled(false);
        jButton2.setDoubleBuffered(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 154, -1));
        kGradientPanel1.add(imglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 36, 140, 140));

        txtimg.setEditable(false);
        txtimg.setBackground(new java.awt.Color(255, 255, 255));
        txtimg.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtimg.setOpaque(true);
        kGradientPanel1.add(txtimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 200, -1));

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255,80));
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 255, 255));

        tblAnimales.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        tblAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAnimales.setOpaque(false);
        tblAnimales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnimalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAnimales);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bBorrar.setForeground(new java.awt.Color(102, 102, 102));
        bBorrar.setText("Borrar");
        bBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bBorrar.setContentAreaFilled(false);
        bBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bBorrarMouseEntered(evt);
            }
        });
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        bAgregar.setForeground(new java.awt.Color(90, 90, 90));
        bAgregar.setText("Agregar");
        bAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bAgregar.setContentAreaFilled(false);
        bAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bAgregarMouseEntered(evt);
            }
        });
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bCancelar.setForeground(new java.awt.Color(102, 102, 102));
        bCancelar.setText("Cancelar");
        bCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bCancelar.setContentAreaFilled(false);
        bCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCancelarMouseEntered(evt);
            }
        });
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bEditar.setForeground(new java.awt.Color(102, 102, 102));
        bEditar.setText("Editar");
        bEditar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bEditar.setContentAreaFilled(false);
        bEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEditarMouseEntered(evt);
            }
        });
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bAgregar)
                        .addGap(29, 29, 29)
                        .addComponent(bEditar)
                        .addGap(27, 27, 27)
                        .addComponent(bBorrar)
                        .addGap(30, 30, 30)
                        .addComponent(bCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InterfazE ie = new InterfazE();
        ie.setSize(709, 449);
        ie.setLocation(0, 0);
        jPanel1.removeAll();
        jPanel1.add(ie, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        // TODO add your handling code here:

        if (txtNombre.getText().isEmpty() || txtDesc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Valores vacios", "Error", 0);
        } else {
            if (ruta.equals("")) {
                txtimg.setText("C:/Users/joset/OneDrive/Documentos/NetBeansProjects/Sistema E/src/image/nodis.jpg");
            }
            conexion con = new conexion();
            AMarinos am = recuperarDatosGUI();
            String sql = String.format("INSERT INTO AnimalesMarinos (ID,Nombre,Descripcion,Imagen)"
                    + "VALUES(null,'%s','%s','%s')", am.getNombre(), am.getDescripcion(), am.getImg());
            con.ejecutarSentenciaSQL(sql);
            JOptionPane.showMessageDialog(null, "Agregado correctamente", "Insersion", 1);
            mostrarDatos();
            limpiar();
        }


    }//GEN-LAST:event_bAgregarActionPerformed

    private void tblAnimalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnimalesMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            txtID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtDesc.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtimg.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            Image foto = getToolkit().getImage(txtimg.getText());
            foto = foto.getScaledInstance(imglabel.getWidth(), imglabel.getHeight(), 1);
            imglabel.setIcon(new ImageIcon(foto));
            bAgregar.setEnabled(false);
            bEditar.setEnabled(true);
            bBorrar.setEnabled(true);
        }
    }//GEN-LAST:event_tblAnimalesMouseClicked

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        // TODO add your handling code here:
        conexion con = new conexion();
        AMarinos am = recuperarDatosGUI();
        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Registro no seleccionado", "Error", 0);
        } else {
            String sql = String.format("DELETE FROM AnimalesCara WHERE ID=%d", am.getID());
            con.ejecutarSentenciaSQL(sql);
            JOptionPane.showMessageDialog(null, "Borrado correctamente", "Borrado", 1);
            limpiar();
            mostrarDatos();
        }


    }//GEN-LAST:event_bBorrarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        // TODO add your handling code here:
        if (txtNombre.getText().isEmpty() || txtDesc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Valores vacios", "Error", 0);
        } else {
            conexion con = new conexion();
            AMarinos am = recuperarDatosGUI();
            String sql = String.format("UPDATE AnimalesMarinos SET Nombre='%s',Descripcion='%s',Imagen='%s' WHERE ID=%d", am.getNombre(), am.getDescripcion(), am.getImg(), am.getID());
            con.ejecutarSentenciaSQL(sql);
            JOptionPane.showMessageDialog(null, "Editado correctamente", "Edicion", 1);
            mostrarDatos();
            limpiar();
        }

    }//GEN-LAST:event_bEditarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        foto();

    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAgregarMouseEntered
        // TODO add your handling code here:
        bAgregar.setForeground(new java.awt.Color(254, 254, 254));
        bAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_bAgregarMouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        bAgregar.setForeground(new java.awt.Color(90, 90, 90));
        bAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bEditar.setForeground(new java.awt.Color(90, 90, 90));
        bEditar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bBorrar.setForeground(new java.awt.Color(90, 90, 90));
        bBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bCancelar.setForeground(new java.awt.Color(90, 90, 90));
        bCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

    }//GEN-LAST:event_jPanel1MouseEntered

    private void kGradientPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseEntered
        // TODO add your handling code here
        bAgregar.setForeground(new java.awt.Color(90, 90, 90));
        bAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bEditar.setForeground(new java.awt.Color(90, 90, 90));
        bEditar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bBorrar.setForeground(new java.awt.Color(90, 90, 90));
        bBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        bCancelar.setForeground(new java.awt.Color(90, 90, 90));
        bCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));


    }//GEN-LAST:event_kGradientPanel1MouseEntered

    private void bEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarMouseEntered
        // TODO add your handling code here:
        bEditar.setForeground(new java.awt.Color(254, 254, 254));
        bEditar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));

    }//GEN-LAST:event_bEditarMouseEntered

    private void bBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBorrarMouseEntered
        // TODO add your handling code here:
        bBorrar.setForeground(new java.awt.Color(254, 254, 254));
        bBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));

    }//GEN-LAST:event_bBorrarMouseEntered

    private void bCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelarMouseEntered
        // TODO add your handling code here:
        bCancelar.setForeground(new java.awt.Color(254, 254, 254));
        bCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));

    }//GEN-LAST:event_bCancelarMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter ef = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        File r = new File("C:/Users/joset/Downloads/");
        jf.setCurrentDirectory(r);
        jf.setFileFilter(ef);
        jf.setDialogTitle("Abrir Archivo");
        if (jf.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            ruta = jf.getSelectedFile().getAbsolutePath();
            File file = jf.getSelectedFile();
            txtimg.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txtimg.getText());
            foto = foto.getScaledInstance(imglabel.getWidth(), imglabel.getHeight(), Image.SCALE_DEFAULT);
            imglabel.setIcon(new ImageIcon(foto));
            //Image img = new ImageIcon(ruta).getImage();
            //ImageIcon micon = new ImageIcon(img.getScaledInstance(imglabel.getWidth(), imglabel.getHeight(), 0));
            //imglabel.setIcon(micon);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void limpiar() {
        txtID.setText("");
        txtNombre.setText("");
        txtDesc.setText("");
        txtimg.setText("");
        imglabel.setIcon(null);

        bAgregar.setEnabled(true);
        bEditar.setEnabled(false);
        bBorrar.setEnabled(false);
        foto();
    }

    public void mostrarDatos() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        conexion con = new conexion();
        try {
            ResultSet res = con.consultaReg("SELECT * FROM AnimalesMarinos");
            Object[] user = new Object[5];
            while (res.next()) {
                user[0] = res.getString("ID");
                user[1] = res.getString("Nombre");
                user[2] = res.getString("Descripcion");
                user[3] = res.getString("Imagen");

                model.addRow(user);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public AMarinos recuperarDatosGUI() {
        AMarinos am = new AMarinos();
        int ID = (txtID.getText().isEmpty() ? 0 : Integer.parseInt(txtID.getText()));
        am.setID(ID);
        am.setNombre(txtNombre.getText());
        am.setDescripcion(txtDesc.getText());
        am.setImg(txtimg.getText());

        return am;
    }

    public byte[] getImagen(String ruta) {
        File img = new File(ruta);
        try {
            byte[] icon = new byte[(int) img.length()];
            InputStream input = new FileInputStream(img);
            input.read(icon);
            return icon;
        } catch (Exception e) {
            return null;
        }
    }

    public void foto() {
        Image foto = getToolkit().getImage("C:/Users/joset/OneDrive/Documentos/NetBeansProjects/Sistema E/src/image/nodis.jpg");
        foto = foto.getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        imglabel.setIcon(new ImageIcon(foto));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEditar;
    private javax.swing.JLabel imglabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTable tblAnimales;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtimg;
    // End of variables declaration//GEN-END:variables
    class Fondo extends JPanel {

        private Image im;

        public void paint(Graphics g) {
            im = new ImageIcon(getClass().getResource("/image/fondo.jpg")).getImage();
            g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
