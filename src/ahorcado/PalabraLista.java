/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ahorcado;

import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class PalabraLista extends javax.swing.JFrame {

    /**
     * Creates new form PalabraLista
     */
    public PalabraLista() {
        initComponents();
        
        actualizarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PalabrasMostrar = new javax.swing.JTextArea();
        PalabraField = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JLabel();
        BotonRegresar3 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        PalabrasMostrar.setEditable(false);
        PalabrasMostrar.setBackground(new java.awt.Color(255, 248, 240));
        PalabrasMostrar.setColumns(20);
        PalabrasMostrar.setFont(new java.awt.Font("Avenir Next Condensed", 1, 24)); // NOI18N
        PalabrasMostrar.setForeground(new java.awt.Color(0, 0, 0));
        PalabrasMostrar.setRows(5);
        jScrollPane1.setViewportView(PalabrasMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 520, 320));

        PalabraField.setBackground(new java.awt.Color(255, 248, 240));
        PalabraField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 24)); // NOI18N
        PalabraField.setForeground(new java.awt.Color(0, 0, 0));
        PalabraField.setBorder(null);
        jPanel1.add(PalabraField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 563, 300, 50));

        BotonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 240, 60));

        BotonRegresar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresar3MouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 50, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/PalabrasLista.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarMouseClicked
        String palabra = PalabraField.getText();
        
        if (palabra.isBlank() || palabra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una palabra válida.", "Palabra Inválida", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        boolean mensaje = Main.adminPalabrasSecretas.agregarPalabra(palabra);
        
        if (mensaje) {
            actualizarLista();
            PalabraField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "La palabra '" + palabra.toUpperCase() + "' ya existe en la lista.", "Palabra No Agregada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonAgregarMouseClicked

    private void actualizarLista() {
        PalabrasMostrar.setText(Main.adminPalabrasSecretas.imprimirLista());
    }
    
    private void BotonRegresar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresar3MouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresar3MouseClicked

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
            java.util.logging.Logger.getLogger(PalabraLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PalabraLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PalabraLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PalabraLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PalabraLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAgregar;
    private javax.swing.JLabel BotonRegresar3;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField PalabraField;
    private javax.swing.JTextArea PalabrasMostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
