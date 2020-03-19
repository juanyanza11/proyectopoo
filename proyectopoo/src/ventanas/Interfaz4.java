/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import ventanas.IngresarProd;
import javax.swing.*;

/**
 *
 * @author juanyanza11
 */
public class Interfaz4 extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz4
     */
    public Interfaz4() {
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

        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        muestraNombre = new javax.swing.JLabel();
        muestraStock = new javax.swing.JLabel();
        muestraPrecio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        factura = new javax.swing.JTextArea();
        atras = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        texto1.setForeground(new java.awt.Color(255, 173, 53));
        texto1.setText("INGRESE UN PRODUCTO A COMPRAR");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        texto2.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        texto2.setForeground(new java.awt.Color(255, 255, 255));
        texto2.setText("Nombre Producto:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        texto3.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        texto3.setForeground(new java.awt.Color(255, 255, 255));
        texto3.setText("Cantidad:");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        txtBusqueda.setBackground(new java.awt.Color(22, 12, 104));
        txtBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txtBusqueda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBusqueda.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, -1));

        txtCant.setBackground(new java.awt.Color(22, 12, 104));
        txtCant.setForeground(new java.awt.Color(255, 255, 255));
        txtCant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCant.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 110, -1));

        buscar.setBackground(new java.awt.Color(22, 12, 104));
        buscar.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x26-buscar.png"))); // NOI18N
        buscar.setText("BUSCAR");
        buscar.setBorder(null);
        buscar.setBorderPainted(false);
        buscar.setContentAreaFilled(false);
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.setFocusable(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 90, 30));

        muestraNombre.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        muestraNombre.setForeground(new java.awt.Color(255, 255, 255));
        muestraNombre.setText("---------");
        getContentPane().add(muestraNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, -1));

        muestraStock.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        muestraStock.setForeground(new java.awt.Color(255, 255, 255));
        muestraStock.setText("---------");
        getContentPane().add(muestraStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, -1));

        muestraPrecio.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        muestraPrecio.setForeground(new java.awt.Color(255, 255, 255));
        muestraPrecio.setText("---------");
        getContentPane().add(muestraPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 90, -1));

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("$");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        comprar.setBackground(new java.awt.Color(22, 12, 104));
        comprar.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        comprar.setForeground(new java.awt.Color(255, 255, 255));
        comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x26-carrito.png"))); // NOI18N
        comprar.setText("COMPRAR");
        comprar.setBorder(null);
        comprar.setBorderPainted(false);
        comprar.setContentAreaFilled(false);
        comprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprar.setFocusable(false);
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 90, 30));

        factura.setBackground(new java.awt.Color(22, 12, 112));
        factura.setColumns(20);
        factura.setForeground(new java.awt.Color(255, 255, 255));
        factura.setRows(5);
        factura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(factura);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

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
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

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
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        String textoBusqueda = txtBusqueda.getText();
        boolean band = false;
        // Verifica si el nombre esta contenido en el nombre ingresado
        for (Comestible comes : IngresarProd.listaC) {
            if (comes.getProdn().contains(textoBusqueda)
                    || comes.getProdn().toUpperCase().contains(textoBusqueda.toUpperCase())
                    || comes.getProdn().toLowerCase().contains(textoBusqueda.toLowerCase())) {

                band = true;
                muestraNombre.setText(comes.getProdn());
                muestraPrecio.setText(String.valueOf(comes.getValor()));
                muestraStock.setText(String.valueOf(comes.getCanti()));
            }

        }
        if (band == false) {
            JOptionPane.showMessageDialog(null, "No existe el producto en la seccion de comestibles");
        }

        for (Oficina ofi : IngresarProd.listaO) {
            if (ofi.getProdn().contains(textoBusqueda)
                    || ofi.getProdn().toUpperCase().contains(textoBusqueda.toUpperCase())
                    || ofi.getProdn().toLowerCase().contains(textoBusqueda.toLowerCase())) {

                band = true;
                muestraNombre.setText(ofi.getProdn());
                muestraPrecio.setText(String.valueOf(ofi.getValor()));
                muestraStock.setText(String.valueOf(ofi.getCanti()));
            }

        }
        if (band == false) {
            JOptionPane.showMessageDialog(null, "No Existe el producto en la seccion oficina");
        }

        for (Industrial in : IngresarProd.listaI) {
            if (in.getProdn().contains(textoBusqueda)
                    || in.getProdn().toUpperCase().contains(textoBusqueda.toUpperCase())
                    || in.getProdn().toLowerCase().contains(textoBusqueda.toLowerCase())) {

                band = true;
                muestraNombre.setText(in.getProdn());
                muestraPrecio.setText(String.valueOf(in.getValor()));
                muestraStock.setText(String.valueOf(in.getCanti()));
            }

        }
        if (band == false) {
            JOptionPane.showMessageDialog(null, "No Existe el producto en la seccion de utensilios");
        }

        for (Utencilio ut : IngresarProd.listaU) {
            if (ut.getProdn().contains(textoBusqueda)
                    || ut.getProdn().toUpperCase().contains(textoBusqueda.toUpperCase())
                    || ut.getProdn().toLowerCase().contains(textoBusqueda.toLowerCase())) {

                band = true;
                muestraNombre.setText(ut.getProdn());
                muestraPrecio.setText(String.valueOf(ut.getValor()));
                muestraStock.setText(String.valueOf(ut.getCanti()));
            }

        }
        if (band == false) {
            JOptionPane.showMessageDialog(null, "No Existe el producto en la seccion industrial");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        // TODO add your handling code here:
        String textoBusqueda = txtBusqueda.getText();
        int cantidadProductos = Integer.parseInt(txtCant.getText());
        double valorSinIva = 0;
        double valorIva = 0;
        boolean band = false;
        double total = 0;
        // Realiza las operaciones para realizar una compra
        // Setea la nueva cantidad de producto
        for (Comestible comes : IngresarProd.listaC) {

            if (comes.getCanti() >= cantidadProductos && comes.getProdn().contains(textoBusqueda)
                    || comes.getProdn().toUpperCase().contains(textoBusqueda.toUpperCase())
                    || comes.getProdn().toLowerCase().contains(textoBusqueda.toLowerCase())) {
                band = true;
                valorSinIva = cantidadProductos * comes.getValor();
                total = valorSinIva;
                factura.setText("Producto: " + comes.getProdn() + "\nSubTotal: "
                        + "$" + String.valueOf(valorSinIva) + "\nValor +IVA: $"
                        + String.valueOf(valorIva) + "\nTotal a pagar: $"
                        + String.valueOf(total));
                comes.setCanti(comes.getCanti() - cantidadProductos);
                muestraStock.setText(String.valueOf(comes.getCanti()));
            }
        }

        if (band == false) {
            JOptionPane.showMessageDialog(null, "No existe el producto en stock de comestibles");
        }
        // Realiza las operaciones para realizar una compra
        // Setea la nueva cantidad de producto
        for (Oficina ofi : IngresarProd.listaO) {
            if (ofi.getCanti() >= cantidadProductos && ofi.getProdn().contains(textoBusqueda)
                    || ofi.getProdn().toUpperCase().contains(textoBusqueda.toUpperCase())
                    || ofi.getProdn().toLowerCase().contains(textoBusqueda.toLowerCase())) {
                band = true;
                valorSinIva = cantidadProductos * ofi.getValor();
                valorIva = valorSinIva * 0.12;
                total = valorIva + valorSinIva;

                factura.setText("Producto: " + ofi.getProdn() + "\nSubTotal: "
                        + "$" + String.valueOf(valorSinIva) + "\nValor +IVA: $"
                        + String.valueOf(valorIva) + "\nTotal a pagar: $"
                        + String.valueOf(total));
                ofi.setCanti(ofi.getCanti() - cantidadProductos);
                muestraStock.setText(String.valueOf(ofi.getCanti()));

            }

        }

        if (band == false) {
            JOptionPane.showMessageDialog(null, "No existe el producto en stock de oficina");
        }
        // Realiza las operaciones para realizar una compra
        // Setea la nueva cantidad de producto
        for (Utencilio ut : IngresarProd.listaU) {
            if (ut.getCanti() >= cantidadProductos && ut.getProdn().contains(textoBusqueda)
                    || ut.getProdn().toUpperCase().contains(textoBusqueda.toUpperCase())
                    || ut.getProdn().toLowerCase().contains(textoBusqueda.toLowerCase())) {
                band = true;
                valorSinIva = cantidadProductos * ut.getValor();
                ut.setCanti(ut.getCanti() - cantidadProductos);
                valorIva = valorSinIva * 0.12;
                total = valorIva + valorSinIva;

                factura.setText("Producto: " + ut.getProdn() + "\nSubTotal: "
                        + "$" + String.valueOf(valorSinIva) + "\nValor +IVA: $"
                        + String.valueOf(valorIva) + "\nTotal a pagar: $"
                        + String.valueOf(total));
                ut.setCanti(ut.getCanti() - cantidadProductos);
                muestraStock.setText(String.valueOf(ut.getCanti()));

            }

        }

        if (band == false) {
            JOptionPane.showMessageDialog(null, "No existe el producto en stock de utensilios");
        }
        // Realiza las operaciones para realizar una compra
        // Setea la nueva cantidad de producto
        for (Industrial in : IngresarProd.listaI) {
            if (in.getCanti() >= cantidadProductos && in.getProdn().contains(textoBusqueda)
                    || in.getProdn().toUpperCase().contains(textoBusqueda.toUpperCase())
                    || in.getProdn().toLowerCase().contains(textoBusqueda.toLowerCase())) {
                band = true;
                valorSinIva = cantidadProductos * in.getValor();
                valorIva = valorSinIva * 0.12;
                total = valorIva + valorSinIva;

                factura.setText("Producto: " + in.getProdn() + "\nSubTotal: "
                        + "$" + String.valueOf(valorSinIva) + "\nValor +IVA: $"
                        + String.valueOf(valorIva) + "\nTotal a pagar: $"
                        + String.valueOf(total));
                in.setCanti(in.getCanti() - cantidadProductos);
                muestraStock.setText(String.valueOf(in.getCanti()));

            }

        }

        if (band == false) {
            JOptionPane.showMessageDialog(null, "No existe el producto en stock de industiales");
        }

    }//GEN-LAST:event_comprarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        Interfaz1 b = new Interfaz1();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton comprar;
    private javax.swing.JTextArea factura;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel muestraNombre;
    private javax.swing.JLabel muestraPrecio;
    private javax.swing.JLabel muestraStock;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCant;
    // End of variables declaration//GEN-END:variables
}
