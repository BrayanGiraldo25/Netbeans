package calculadoramvc;

/**
 * @author Yo Merengues
 */
public class Vista extends javax.swing.JFrame {

    // Crear  un objeto del tipo de la clase Controlador
    Controlador objControlador;
    
    public Vista() {
        initComponents();
        // Crear un objeto del modelo para instanciar el controlador
        Modelo modelo = new Modelo();
        // Instanciar objControlador con los 2 parametros
        objControlador = new Controlador(modelo, this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfValue1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lResult = new javax.swing.JLabel();
        jbPlus = new javax.swing.JButton();
        jbRest = new javax.swing.JButton();
        tfValue2 = new javax.swing.JTextField();
        jbPlus1 = new javax.swing.JButton();
        jbPlus2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calculadora con MVC");

        jLabel2.setText("Value 1");

        jLabel3.setText("Value 2");

        tfValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValue1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Result");

        jbPlus.setText("Add");
        jbPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlusActionPerformed(evt);
            }
        });

        jbRest.setText("Rest");
        jbRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRestActionPerformed(evt);
            }
        });

        tfValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValue2ActionPerformed(evt);
            }
        });

        jbPlus1.setText("Multiply");
        jbPlus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlus1ActionPerformed(evt);
            }
        });

        jbPlus2.setText("Divide");
        jbPlus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlus2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tfValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbPlus1)
                            .addComponent(jbPlus))
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lResult, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbPlus2)
                            .addComponent(jbRest))))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPlus)
                    .addComponent(jbRest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPlus1)
                    .addComponent(jbPlus2))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValue1ActionPerformed

    private void jbPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlusActionPerformed
        // Boton de Sumar
        objControlador.doAdd();
    }//GEN-LAST:event_jbPlusActionPerformed

    private void tfValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValue2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValue2ActionPerformed

    private void jbPlus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlus1ActionPerformed
        // Boton de Multiplicar
        objControlador.doMultiply();
    }//GEN-LAST:event_jbPlus1ActionPerformed

    private void jbRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRestActionPerformed
        // Boton de Restar
        objControlador.doRest();
    }//GEN-LAST:event_jbRestActionPerformed

    private void jbPlus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlus2ActionPerformed
       objControlador.doDivide();
    }//GEN-LAST:event_jbPlus2ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
        
       
    }
    
     // Definir metodos para retornar (controlador) los valores 1 y 2
    
    public int getValue1(){
        return Integer.parseInt(tfValue1.getText());
    }
    public int getValue2(){
        return Integer.parseInt(tfValue2.getText());
    }
    
    public void setResult(int Result){
        lResult.setText(String.valueOf(Result));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbPlus;
    private javax.swing.JButton jbPlus1;
    private javax.swing.JButton jbPlus2;
    private javax.swing.JButton jbRest;
    private javax.swing.JLabel lResult;
    private javax.swing.JTextField tfValue1;
    private javax.swing.JTextField tfValue2;
    // End of variables declaration//GEN-END:variables

 
}
