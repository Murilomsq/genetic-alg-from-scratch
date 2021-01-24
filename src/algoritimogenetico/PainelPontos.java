/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimogenetico;

import java.util.Arrays;

/**
 *
 * @author muril
 */
public class PainelPontos extends javax.swing.JFrame {

    public int numeroDePontos;
    int[] CoordenadasX;
    int[] CoordenadasY;
    int l = 0;

    public PainelPontos() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jbProximaTela = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaPontos = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbNumeroDePontos = new javax.swing.JButton();
        jtNumeroDePontos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtCoordX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtCoordY = new javax.swing.JTextField();
        jbEnviarPonto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jProgressBar2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jProgressBar2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(686, 750));

        jbProximaTela.setText("Calcular");
        jbProximaTela.setEnabled(false);
        jbProximaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProximaTelaActionPerformed(evt);
            }
        });

        jtaPontos.setColumns(20);
        jtaPontos.setRows(5);
        jtaPontos.setEnabled(false);
        jScrollPane1.setViewportView(jtaPontos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Pontos escolhidos");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabel1.setText("Escolhendo os pontos para serem percorridos");

        jbNumeroDePontos.setText("Enviar");
        jbNumeroDePontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNumeroDePontosActionPerformed(evt);
            }
        });

        jLabel2.setText("Escolher o número de pontos:");

        jLabel3.setText("Coordenada X");

        jtCoordX.setEnabled(false);

        jLabel4.setText("Coordenada Y");

        jtCoordY.setEnabled(false);

        jbEnviarPonto.setText("Enviar Ponto");
        jbEnviarPonto.setEnabled(false);
        jbEnviarPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarPontoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Escolhendo os pontos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNumeroDePontos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNumeroDePontos)
                .addGap(352, 352, 352))
            .addGroup(layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jbEnviarPonto))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(jbProximaTela)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNumeroDePontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNumeroDePontos))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbEnviarPonto)))
                .addGap(11, 11, 11)
                .addComponent(jbProximaTela)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNumeroDePontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNumeroDePontosActionPerformed

        numeroDePontos = Integer.parseInt(jtNumeroDePontos.getText());
        jtCoordX.setEnabled(true);
        jtCoordY.setEnabled(true);
        jbEnviarPonto.setEnabled(true);

        CoordenadasX = new int[numeroDePontos];
        CoordenadasY = new int[numeroDePontos];
        jbNumeroDePontos.setEnabled(false);
        jtNumeroDePontos.setEnabled(false);
    }//GEN-LAST:event_jbNumeroDePontosActionPerformed

    private void jbEnviarPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarPontoActionPerformed

        if (l == numeroDePontos - 1) {

            CoordenadasY[l] = Integer.parseInt(jtCoordY.getText());
            CoordenadasX[l] = Integer.parseInt(jtCoordX.getText());

            jtCoordX.setText("");
            jtCoordY.setText("");

            jtaPontos.append("(" + CoordenadasX[l] + "," + CoordenadasY[l] + ")\n");

            jtaPontos.append("Pontos preenchidos");
            jbProximaTela.setEnabled(true);
            jtCoordX.setEnabled(false);
            jtCoordY.setEnabled(false);
            jbEnviarPonto.setEnabled(false);
        } else {
            CoordenadasY[l] = Integer.parseInt(jtCoordY.getText());
            CoordenadasX[l] = Integer.parseInt(jtCoordX.getText());

            jtCoordX.setText("");
            jtCoordY.setText("");

            jtaPontos.append("(" + CoordenadasX[l] + "," + CoordenadasY[l] + ")\n");
            l = l + 1;
        }
    }//GEN-LAST:event_jbEnviarPontoActionPerformed

    private void jbProximaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProximaTelaActionPerformed
        PainelPrincipal novopainel = new PainelPrincipal(CoordenadasX, CoordenadasY);
        novopainel.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jbProximaTelaActionPerformed


    private void jProgressBar2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jProgressBar2AncestorAdded

    }//GEN-LAST:event_jProgressBar2AncestorAdded

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
            java.util.logging.Logger.getLogger(PainelPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPontos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEnviarPonto;
    private javax.swing.JButton jbNumeroDePontos;
    private javax.swing.JButton jbProximaTela;
    private javax.swing.JTextField jtCoordX;
    private javax.swing.JTextField jtCoordY;
    private javax.swing.JTextField jtNumeroDePontos;
    private javax.swing.JTextArea jtaPontos;
    // End of variables declaration//GEN-END:variables






}
