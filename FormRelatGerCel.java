//Jocimar Borges Júnior, RA: 2565897
//Jocimar Borges Júnior, RA: 2565897

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jocim
 */
public class FormRelatGerCel extends javax.swing.JFrame {

    private BDCel tabelaBDGerCel = BDCel.geraBDCel();
    private static FormRelatGerCel dadosCelGer;
    
    public FormRelatGerCel() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    //Sigleton Method
    public static FormRelatGerCel tbDadosCel(){
        if(dadosCelGer == null){
            dadosCelGer = new FormRelatGerCel();
        }
        return dadosCelGer;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDadosGerCel = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbDadosGerCel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        tbDadosGerCel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Gerente", "Vendedor", "Estoque", "IMEI", "Modelo", "Fabricante", "Preço (R$)", "Tela (Polegadas)", "Bateria (mAh)", "Sistema Operacional", "Memória (GB)", "Câmera (MP)", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tbDadosGerCel);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose(); // Fecha a janela atual
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populaTabelaGerCel();
    }//GEN-LAST:event_formWindowActivated
    
public void populaTabelaGerCel() {
        DefaultTableModel modelo = (DefaultTableModel) tbDadosGerCel.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Celular c : tabelaBDGerCel.getBDCel()){
            modelo.insertRow(posLin, new Object[]{
                    c.getGerente(),
                    c.getVendedor(),
                    c.verificarLocalizacao(),
                    c.getIMEI(),
                    c.getComp().getModelo(),
                    c.getComp().getFabricante(),
                    c.getPreco(),
                    c.getTelaPOlegadas(),
                    c.getBateriamAh(),
                    c.getSistemaOperacional(),
                    c.getArmazenamentoGB(),
                    c.getCameraMP(),
                    c.verQtdEstoque()
                });
                posLin++;
        }
    }//fim do PopulaTabela
    
    public void sair(){
        int ret = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Saida",
                JOptionPane.YES_NO_OPTION
        );
        if(ret == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDadosGerCel;
    // End of variables declaration//GEN-END:variables
}
