/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimogenetico;

import java.util.Random;

/**
 *
 * @author muril
 */
public class PainelPrincipal extends javax.swing.JFrame {

     
     int[] coordenadasX;
     int[] coordenadasY;
     Random r1 = new Random();
     int numeroDeGeracoes;
     int fatorMutacao;
     int numeroDeIndividuos;
     
     
     
     
    //Construtores
    public PainelPrincipal(){
    }
    public PainelPrincipal(int[] CoordenadasX, int[] CoordenadasY) {
       
        coordenadasX = new int[CoordenadasX.length];
        coordenadasY = new int[CoordenadasX.length];
        
        this.coordenadasX = CoordenadasX;
        this.coordenadasY = CoordenadasY;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jtFatorMutacao = new javax.swing.JTextField();
        jtNumerodeInd = new javax.swing.JTextField();
        jtGeracoes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtFinal = new javax.swing.JTextField();
        jbCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtImprimirMatrizes = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jcbValoresRecom = new javax.swing.JCheckBox();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jProgressBar.setStringPainted(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular a menor distância");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Calcular a menor distancia entre os pontos selecionados  ");

        jtFatorMutacao.setText("4");
        jtFatorMutacao.setEnabled(false);

        jtNumerodeInd.setText("50");
        jtNumerodeInd.setEnabled(false);

        jtGeracoes.setText("10000");
        jtGeracoes.setEnabled(false);

        jLabel2.setText("Número de Gerações");

        jLabel3.setText("Número de indivíduos");

        jLabel4.setText("Fator Mutação");

        jtFinal.setEditable(false);

        jbCalcular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Menor Distância possível obtida");

        jtImprimirMatrizes.setEditable(false);
        jtImprimirMatrizes.setColumns(20);
        jtImprimirMatrizes.setRows(5);
        jScrollPane2.setViewportView(jtImprimirMatrizes);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Menor caminho percorrido");

        jcbValoresRecom.setSelected(true);
        jcbValoresRecom.setText("Utilizar valores recomendados");
        jcbValoresRecom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbValoresRecomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtFatorMutacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(241, 241, 241)
                                    .addComponent(jtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(278, 278, 278)
                                    .addComponent(jLabel5))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jtNumerodeInd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jtGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbValoresRecom))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(90, 90, 90))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jtFatorMutacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtNumerodeInd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbValoresRecom)
                        .addGap(18, 18, 18)
                        .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed

       
        
        jtImprimirMatrizes.setText("");
        
        fatorMutacao = Integer.parseInt(jtFatorMutacao.getText()); 
        numeroDeGeracoes = Integer.parseInt(jtGeracoes.getText()); 
        numeroDeIndividuos = Integer.parseInt(jtNumerodeInd.getText()); 
        double progressBarValue = 0;
        double smallestPortion = 100/numeroDeGeracoes;
        
        
        Individuo[] individuo;
         individuo = new Individuo[numeroDeIndividuos];
 
        for (int i = 0; i < numeroDeIndividuos; i++) {
            individuo[i] = new Individuo();
        }
        for(int i = 0; i < numeroDeIndividuos; i++){
            individuo[i].ordemIndividuos = new int[coordenadasX.length][2];
        }
        for (int i = 0; i < individuo.length; i++) {
            individuo[i].assimilarPontos(coordenadasX, coordenadasY);
        }
        for (int i = 0; i < individuo.length; i++) {
            individuo[i].embaralharVetor(coordenadasX);
        }
        calcularDistanciaPercorrida(individuo, coordenadasX);
        bubbleSort(individuo);
         for (int z = 0; z < numeroDeGeracoes; z++) {

            for (int k = 1; k < individuo.length; k++) {
                individuo[k].eliminarPiores(individuo);
            }

            for (int k = 1; k < individuo.length; k++) {
                individuo[k].morphIntoChildren(individuo, coordenadasX, r1, fatorMutacao);
            }

            calcularDistanciaPercorrida(individuo, coordenadasX);

            bubbleSort(individuo);
            
            progressBarValue = progressBarValue + smallestPortion;
            
            jProgressBar.setValue(z);
        }
         
         jtFinal.setText(Double.toString(individuo[0].getDistanciaPercorrida()));
         
         for(int k = 0; k < coordenadasX.length; k++)
         jtImprimirMatrizes.append("(" + individuo[0].ordemIndividuos[k][0] + "," + individuo[0].ordemIndividuos[k][1] + ")\n");
        
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void jcbValoresRecomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbValoresRecomActionPerformed
        if(jcbValoresRecom.isSelected()){
            jtFatorMutacao.setText("4");
            jtGeracoes.setText("10000");
            jtNumerodeInd.setText("50");
            
            jtFatorMutacao.setEnabled(false);
            jtGeracoes.setEnabled(false);
            jtNumerodeInd.setEnabled(false);
        }
        else{
            jtFatorMutacao.setText("");
            jtGeracoes.setText("");
            jtNumerodeInd.setText("");
            jtFatorMutacao.setEnabled(true);
            jtGeracoes.setEnabled(true);
            jtNumerodeInd.setEnabled(true);
        }
    }//GEN-LAST:event_jcbValoresRecomActionPerformed

    
    
    public static void calcularDistanciaPercorrida(Individuo[] individuo, int[] coordenadasX) {

        double soma = 0;

        for (int k = 0; k < individuo.length; k++) {
            soma = 0;
            for (int i = 0; i < coordenadasX.length - 1; i++) {

                int x1 = individuo[k].ordemIndividuos[i][0];
                int x2 = individuo[k].ordemIndividuos[i + 1][0];

                int y1 = individuo[k].ordemIndividuos[i][1];
                int y2 = individuo[k].ordemIndividuos[i + 1][1];

                soma = soma + Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

            }
            individuo[k].setDistanciaPercorrida(soma);
        }
    }
    
    
    public static void bubbleSort(Individuo[] individuo) {
        for (int i = 0; i < individuo.length; i++) {
            for (int j = 0; j < individuo.length - 1 - i; j++) {
                if (individuo[j].getDistanciaPercorrida() > individuo[j + 1].getDistanciaPercorrida()) {
                    Individuo temp = individuo[j];
                    individuo[j] = individuo[j + 1];
                    individuo[j + 1] = temp;
                }
            }

        }
    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    
    
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JCheckBox jcbValoresRecom;
    public javax.swing.JTextField jtFatorMutacao;
    public javax.swing.JTextField jtFinal;
    public javax.swing.JTextField jtGeracoes;
    public javax.swing.JTextArea jtImprimirMatrizes;
    public javax.swing.JTextField jtNumerodeInd;
    // End of variables declaration//GEN-END:variables
}
