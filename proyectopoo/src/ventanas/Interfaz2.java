/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author juanyanza11
 */
public class Interfaz2 extends javax.swing.JFrame {
    //private int op3 = Integer.parseInt(getOp2().getText());

    /**
     * @param opcion the opcion to set
     */
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    /**
     * @return the opcion
     */
    public int getOpcion() {
        return opcion;
    }

    /**
     * @return the op2
     */
    public javax.swing.JTextField getOp2() {
        return op2;
    }

    /**
     * @param op2 the op2 to set
     */
    public void setOp2(javax.swing.JTextField op2) {
        this.op2 = op2;
    }

    /**
     * Creates new form Interfaz2
     */
    public Interfaz2() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        tit = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        op2 = new javax.swing.JTextField();
        cerrar = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setText("1. C O M E S T I B L E S ");
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 30));

        c2.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setText("2. U T E N S I L I O S");
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 30));

        c3.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        c3.setForeground(new java.awt.Color(255, 255, 255));
        c3.setText("3. O F I C I N A");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 30));

        c4.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        c4.setForeground(new java.awt.Color(255, 255, 255));
        c4.setText("4. I N D U S T R I A L E S");
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 30));

        tit.setBackground(new java.awt.Color(60, 62, 54));
        tit.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        tit.setForeground(new java.awt.Color(255, 173, 51));
        tit.setText("T I P O  D E  P R O D U C TO  A  R E G I S T R A R");
        getContentPane().add(tit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        aceptar.setBackground(new java.awt.Color(22, 12, 104));
        aceptar.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x26-aceptar2.png"))); // NOI18N
        aceptar.setText("ACEPTAR");
        aceptar.setBorder(null);
        aceptar.setBorderPainted(false);
        aceptar.setContentAreaFilled(false);
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 90, 30));

        op2.setBackground(new java.awt.Color(22, 12, 104));
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        op2.setCaretColor(new java.awt.Color(255, 255, 255));
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        op2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                op2KeyTyped(evt);
            }
        });
        getContentPane().add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 220, -1));

        cerrar.setBackground(new java.awt.Color(22, 12, 104));
        cerrar.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x26-salir.png"))); // NOI18N
        cerrar.setText("SALIR");
        cerrar.setBorder(null);
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 90, 30));

        atras.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x26-atras.png"))); // NOI18N
        atras.setText("VOLVER");
        atras.setBorder(null);
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        fondo2.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img2.jpg"))); // NOI18N
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:

        opcion = Integer.parseInt(getOp2().getText());
        JFrame frame = new IngresarProd();

        IngresarProd.getSw().setText(getOp2().getText());
                frame.setVisible(true);
                setOpcion(1);
                IngresarProd.setSw(op2);
                this.setVisible(false);
    }//GEN-LAST:event_aceptarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void op2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_op2KeyTyped
        // TODO add your handling code here:
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            aceptar.doClick();
        }
        char tecla2 = evt.getKeyChar();
        if (tecla2 == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_op2KeyTyped

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        Interfaz1 b = new Interfaz1();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private int opcion;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton atras;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel fondo2;
    public static javax.swing.JTextField op2;
    private javax.swing.JLabel tit;
    // End of variables declaration//GEN-END:variables
}
