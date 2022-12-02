package Sistema;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author joset
 */
public class INICIO extends javax.swing.JFrame {

    Fondo fondo = new Fondo();
    InterfazE ie = new InterfazE();
    InterfazU iu = new InterfazU();
    Boolean t = true;
    String r = "";

    //logo lg=new logo();
    public INICIO() {
        this.setContentPane(fondo);
        initComponents();

    }

    void enabledbutton() {
        jButton1.setEnabled(true);
        InterfazU.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        InterfazU = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jPanel2 = new logo();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(709, 471));
        setResizable(false);
        setSize(new java.awt.Dimension(709, 471));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 59));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setLabel("Interfaz Experto");
        jButton1.setMaximumSize(new java.awt.Dimension(113, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(113, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(113, 23));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        InterfazU.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        InterfazU.setForeground(new java.awt.Color(102, 102, 102));
        InterfazU.setText("Interfaz Usuario");
        InterfazU.setContentAreaFilled(false);
        InterfazU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InterfazUMouseEntered(evt);
            }
        });
        InterfazU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterfazUActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(102, 102, 102));
        Salir.setText("Salir");
        Salir.setBorder(null);
        Salir.setContentAreaFilled(false);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(InterfazU, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InterfazU, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(706, 449));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        Bienvenida bv = new Bienvenida();
        bv.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void InterfazUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterfazUActionPerformed
        // TODO add your handling code here:
        iu.setSize(709, 449);
        iu.setLocation(0, 0);
        content.removeAll();
        content.add(iu, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        enabledbutton();
    }//GEN-LAST:event_InterfazUActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*
         */
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Ingresa la contraseña:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK", "Cancelar"};
        int option = JOptionPane.showOptionDialog(null, panel, "Contraseña",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if (option == 0) // pressing OK button
        {
            char[] password = pass.getPassword();
            if (new String(password).equals("1")) {
                ie.setSize(709, 449);
                ie.setLocation(0, 0);
                content.removeAll();
                content.add(ie, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
                jButton1.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Error de contrasenia", "Error", 0);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void InterfazUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InterfazUMouseEntered
        // TODO add your handling code here:
        InterfazU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        InterfazU.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_InterfazUMouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        jButton1.setBorder(null);
        InterfazU.setBorder(null);
        Salir.setBorder(null);
        Salir.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        InterfazU.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        // TODO add your handling code here:
        Salir.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_SalirMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InterfazU;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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

    class logo extends JPanel {

        private Image im;

        public void paint(Graphics g) {
            im = new ImageIcon(getClass().getResource("/image/logo.png")).getImage();
            g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
