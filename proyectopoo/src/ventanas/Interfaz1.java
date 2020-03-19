/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author juanyanza11
 */
public class Interfaz1 extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz1
     */
    public Interfaz1() {
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

        salir = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        opcion2 = new javax.swing.JLabel();
        opcion1 = new javax.swing.JLabel();
        op = new javax.swing.JTextField();
        opcion3 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(22, 12, 104));
        salir.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x26-salir.png"))); // NOI18N
        salir.setText("SALIR");
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusable(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 70, 30));

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
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 100, -1));

        opcion2.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        opcion2.setForeground(new java.awt.Color(255, 255, 255));
        opcion2.setText("2. Realizar venta de productos");
        getContentPane().add(opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        opcion1.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        opcion1.setForeground(new java.awt.Color(255, 255, 255));
        opcion1.setText("1. Registrar stock de productos");
        getContentPane().add(opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        op.setBackground(new java.awt.Color(2, 12, 104));
        op.setForeground(new java.awt.Color(255, 255, 255));
        op.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        op.setCaretColor(new java.awt.Color(255, 255, 255));
        op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opActionPerformed(evt);
            }
        });
        op.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                opKeyTyped(evt);
            }
        });
        getContentPane().add(op, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 160, -1));

        opcion3.setBackground(new java.awt.Color(60, 62, 64));
        opcion3.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        opcion3.setForeground(new java.awt.Color(255, 173, 51));
        opcion3.setText("D I G I T E  U N A  O P C I O N  C O R R E C T A");
        getContentPane().add(opcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img2.jpg"))); // NOI18N
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        opcion = Integer.parseInt(op.getText());
        switch (opcion) {
            case 1:
                JFrame frame = new Interfaz2();
                frame.setVisible(true);
                this.setVisible(false);
                break;
            case 2:
                JFrame frame2 = new Interfaz4();
                frame2.setVisible(true);
                this.setVisible(false);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                break;
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opActionPerformed

    private void opKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opKeyTyped
        // TODO add your handling code here:
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            aceptar.doClick();
        }

        char tecla2 = evt.getKeyChar();
        if (tecla2 == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_opKeyTyped

    /**
     * @param args the command line arguments
     */
    private int opcion;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel fondo1;
    private javax.swing.JTextField op;
    private javax.swing.JLabel opcion1;
    private javax.swing.JLabel opcion2;
    private javax.swing.JLabel opcion3;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
