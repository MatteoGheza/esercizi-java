/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author utente 2023-24
 */
public class JFrameRicambi extends javax.swing.JFrame {

    /**
     * Creates new form JFRicambiAuto
     */
    public JFrameRicambi() {
        initComponents();
    }
    
    RicambiAuto ra = new RicambiAuto();
    
    /**
     * Usata nell'evento del click del tasto reset
     * e in seguito all'inserimento di nuovi valori
     */
    private void resetInput() {
        tfTipo.setText("");
        tfPrezzo.setText("");
        tfNumero.setText("");
        tfDimensione.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitolo = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        tfPrezzo = new javax.swing.JTextField();
        lbPrezzo = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbDimensione = new javax.swing.JLabel();
        tfDimensione = new javax.swing.JTextField();
        btCalcola = new javax.swing.JButton();
        btCancella = new javax.swing.JButton();
        tfCosto = new javax.swing.JTextField();
        scrollPaneLogs = new javax.swing.JScrollPane();
        taLogs = new javax.swing.JTextArea();
        lbTitoloLogs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitolo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitolo.setText("Ricambi Auto");

        lbTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbTipo.setText("Tipo:");

        tfTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfPrezzo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbPrezzo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPrezzo.setText("Prezzo:");

        lbNumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNumero.setText("Numero:");

        tfNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbDimensione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbDimensione.setText("Dimensione:");

        tfDimensione.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btCalcola.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btCalcola.setText("Calcola e inserisci");
        btCalcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcolaActionPerformed(evt);
            }
        });

        btCancella.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btCancella.setText("Cancella");
        btCancella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancellaActionPerformed(evt);
            }
        });

        tfCosto.setEditable(false);
        tfCosto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfCosto.setBorder(null);

        taLogs.setEditable(false);
        taLogs.setColumns(20);
        taLogs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taLogs.setRows(5);
        taLogs.setFocusable(false);
        scrollPaneLogs.setViewportView(taLogs);

        lbTitoloLogs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTitoloLogs.setText("Ultimi ricambi registrati:");
        lbTitoloLogs.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCalcola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCosto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancella)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTipo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDimensione)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDimensione, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumero))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPrezzo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTitoloLogs)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTitoloLogs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrezzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(tfPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumero)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDimensione)
                            .addComponent(tfDimensione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPaneLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCalcola)
                    .addComponent(tfCosto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancella)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcolaActionPerformed
        ra.setTipo(tfTipo.getText());
        try {
            int numero = Integer.parseInt(tfNumero.getText());
            if (numero == 0) {
                JOptionPane.showMessageDialog(null, "Deve esserci una quantità", "Dati non corretti", JOptionPane.ERROR_MESSAGE);
                return;
            }
            ra.setNumero(numero);
            ra.setPrezzo(Float.parseFloat(tfPrezzo.getText()));
            ra.setDimensione(Float.parseFloat(tfDimensione.getText()));
        } catch (NumberFormatException nfe) {
            /**
             * Se i dati inseriti nei cambi numerici non sono validi,
             * mostra all'utente un messaggio di errore e annulla
             * l'inserimento.
             */
            JOptionPane.showMessageDialog(null, "Dati numerici non corretti", "Dati non corretti", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        tfCosto.setText("    Il costo totale dei ricambi \""+ra.getTipo()+"\" è di "+ra.calcolaPrezzo()+"€");
        
        //Reset input per permettere l'inserimento di altri ricambi
        resetInput();
        
        //Aggiungi una riga a logs
        taLogs.append(ra.toString()+"\n");
    }//GEN-LAST:event_btCalcolaActionPerformed

    private void btCancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancellaActionPerformed
        resetInput();
        
        //Quando viene premuto, svuota anche i logs e cancella riga costo
        taLogs.setText("");
        tfCosto.setText("");
    }//GEN-LAST:event_btCancellaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameRicambi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRicambi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRicambi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRicambi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRicambi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcola;
    private javax.swing.JButton btCancella;
    private javax.swing.JLabel lbDimensione;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbPrezzo;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTitolo;
    private javax.swing.JLabel lbTitoloLogs;
    private javax.swing.JScrollPane scrollPaneLogs;
    private javax.swing.JTextArea taLogs;
    private javax.swing.JTextField tfCosto;
    private javax.swing.JTextField tfDimensione;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPrezzo;
    private javax.swing.JTextField tfTipo;
    // End of variables declaration//GEN-END:variables
}
