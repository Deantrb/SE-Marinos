/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Sistema;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.ResultSet;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joset
 */
public class CuadroM extends javax.swing.JPanel {

    DefaultTableModel model;

    /**
     * Creates new form CuadroM
     */
    public CuadroM() {
        initComponents();
        rellenarCombo(cbC, "Caracteristica", "SELECT * FROM AnimalesCara");
        rellenarCombo(cbO, "Nombre", "SELECT * FROM AnimalesMarinos");
        String[] titulos = {"ID", "Caracteristicas", "Peso"};
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
        tblC.setModel(model);
        tblC.setEditingRow(0);
        tblC.setEditingRow(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Fondo();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbC = new javax.swing.JComboBox<>();
        cbO = new javax.swing.JComboBox<>();
        txtPeso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblC = new javax.swing.JTable();
        agragarC = new javax.swing.JButton();
        eliminarC = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(706, 449));
        setMinimumSize(new java.awt.Dimension(706, 449));
        setPreferredSize(new java.awt.Dimension(706, 449));

        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(706, 449));
        jPanel1.setMinimumSize(new java.awt.Dimension(706, 449));
        jPanel1.setRequestFocusEnabled(false);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,50));

        cbC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCMouseClicked(evt);
            }
        });
        cbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCActionPerformed(evt);
            }
        });

        cbO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbOMouseClicked(evt);
            }
        });
        cbO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOActionPerformed(evt);
            }
        });

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PESO");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ASIGNACION DE CARACATERISTICAS");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbO, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(cbC, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(312, 312, 312))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        tblC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblC);

        agragarC.setText("Agregar");
        agragarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agragarCActionPerformed(evt);
            }
        });

        eliminarC.setText("Eliminar");
        eliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agragarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(agragarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(guardar)))
                .addGap(18, 18, 18)
                .addComponent(jButton1))
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

    private void cbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCActionPerformed

    private void cbCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCMouseClicked

    private void agragarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agragarCActionPerformed
        // TODO add your handling code here:
        if (txtPeso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Peso no puede estar vacio", "Error", 0);
        } else if (!redundance()) {
            String[] parts = cbC.getSelectedItem().toString().split("-");
            Object[] user = {parts[0], parts[1], txtPeso.getText()};
            model.addRow(user);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Caracteristia repetida");
        }

    }//GEN-LAST:event_agragarCActionPerformed

    private void eliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCActionPerformed
        // TODO add your handling code here:
        if (tblC.getSelectedRow() >= 0)
            model.removeRow(tblC.getSelectedRow());
        else
            JOptionPane.showMessageDialog(null, "Row no seleccionada", "Error", 0);
    }//GEN-LAST:event_eliminarCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiartabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        conexion con = new conexion();
        String[] marinos = cbO.getSelectedItem().toString().split("-");
        int t = 0;
        String sql = "";
        sql = String.format("DELETE FROM MarinosCar WHERE ID_M='%s'", marinos[0]);
        con.ejecutarSentenciaSQL(sql);
        for (int i = 0; i < tblC.getRowCount(); i++) {
            t = t + Integer.parseInt((String) tblC.getValueAt(i, 2));
            sql = String.format("INSERT INTO MarinosCar (ID_M,ID_C,Caracteristica,PORC)"
                    + "VALUES('%s','%s','%s','%s')", marinos[0], tblC.getValueAt(i, 0), tblC.getValueAt(i, 1), (String) tblC.getValueAt(i, 2));
            con.ejecutarSentenciaSQL(sql);
        }
        sql = String.format("INSERT INTO MarinosCar (ID_M,ID_C,Caracteristica,PORC)"
                + "VALUES('%s',null,'TOTAL','%s')", marinos[0], String.valueOf(t));
        con.ejecutarSentenciaSQL(sql);
        limpiartabla();
        JOptionPane.showMessageDialog(null, "Agregado correctamente", "Insersion", 1);

    }//GEN-LAST:event_guardarActionPerformed

    private void cbOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbOMouseClicked
        // TODO add your handling code here:
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        conexion con = new conexion();
        try {
            String[] marinos = cbO.getSelectedItem().toString().split("-");
            String sql = String.format("SELECT * FROM MarinosCar WHERE ID_M='%s'", marinos[0]);
            ResultSet res = con.consultaReg(sql);
            while (res.next()) {
                Object[] user = {res.getString("ID_C"), res.getString("Caracteristica"), res.getString("PORC")};
                if (Objects.nonNull(res.getString("ID_C"))) {
                    model.addRow(user);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cbOMouseClicked

    private void cbOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOActionPerformed
    public void rellenarCombo(JComboBox cb, String n, String tabla) {
        conexion con = new conexion();
        String c = "";
        try {
            cb.removeAllItems();
            ResultSet res = con.consultaReg(tabla);
            while (res.next()) {
                c = res.getString("ID");
                c = c + "-" + res.getString(n);
                cb.addItem(c);
                c = "";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void limpiar() {
        txtPeso.setText("");
    }

    public void limpiartabla() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        limpiar();
    }

    public boolean redundance() {
        String[] parts = cbC.getSelectedItem().toString().split("-");
        for (int i = 0; i < tblC.getRowCount(); i++) {
            if (parts[1].equals(tblC.getValueAt(i, 1))) {
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agragarC;
    private javax.swing.JComboBox<String> cbC;
    private javax.swing.JComboBox<String> cbO;
    private javax.swing.JButton eliminarC;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblC;
    private javax.swing.JTextField txtPeso;
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
