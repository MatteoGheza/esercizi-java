/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author utente 2023-24
 */
public class jfQuadrato extends javax.swing.JFrame {

    /**
     * Creates new form jfRettangolo
     */
    public jfQuadrato() {
        initComponents();
    }
    
    Quadrato q = new Quadrato();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLato = new javax.swing.JLabel();
        tfLato = new javax.swing.JTextField();
        btnArea = new javax.swing.JButton();
        lbArea = new javax.swing.JLabel();
        lbPerimetro = new javax.swing.JLabel();
        btnPerimetro = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbLato.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbLato.setText("Lato:");

        tfLato.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfLato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLatoActionPerformed(evt);
            }
        });

        btnArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnArea.setText("Trova area");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        lbArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPerimetro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPerimetro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPerimetro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPerimetro.setText("Trova perimetro");
        btnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReset.setText("Cancella dati inseriti");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPerimetro)
                        .addGap(18, 18, 18)
                        .addComponent(lbPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArea)
                        .addGap(18, 18, 18)
                        .addComponent(lbArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLato, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLato))
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfLatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLatoActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        q.setLato(Float.parseFloat(tfLato.getText()));
        lbPerimetro.setText(""+q.trovaPerimetro());
    }//GEN-LAST:event_btnPerimetroActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        tfLato.setText("");
        lbPerimetro.setText("");
        lbArea.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        q.setLato(Float.parseFloat(tfLato.getText()));
        lbArea.setText(""+q.trovaArea());
    }//GEN-LAST:event_btnAreaActionPerformed

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
            java.util.logging.Logger.getLogger(jfRettangolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfRettangolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfRettangolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfRettangolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfRettangolo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbLato;
    private javax.swing.JLabel lbPerimetro;
    private javax.swing.JTextField tfLato;
    // End of variables declaration//GEN-END:variables
}