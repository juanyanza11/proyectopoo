/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.SwingUtilities;

/**
 *
 * @author juanyanza11
 */
public class EjecutaProducto {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz1().setVisible(true);

            }
        });
    }
}
