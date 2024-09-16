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
public class FormRelatGerLap extends javax.swing.JFrame {

    private BDLap tabelaBDGerLap = BDLap.geraBDLap();
    private static FormRelatGerLap dadosLapGer;
    
    public FormRelatGerLap() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    //Sigleton Method
    public static FormRelatGerLap tbDadosLap(){
        if(dadosLapGer == null){
            dadosLapGer = new FormRelatGerLap();
        }
        return dadosLapGer;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDadosGerLap = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbDadosGerLap.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        tbDadosGerLap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Gerente", "Vendedor", "Estoque", "IMEI", "Modelo", "Fabricante", "Preço (R$)", "Tela (Polegadas)", "Memoria RAM", "Sistema Operacional", "Memória (GB)", "Processador", "Quantidade Estoque", "Quantidade Entradas", "Entrada de Fone"
            }
        ));
        jScrollPane1.setViewportView(tbDadosGerLap);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1792, Short.MAX_VALUE)
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
        populaTabelaGerLap();
    }//GEN-LAST:event_formWindowActivated
    
public void populaTabelaGerLap() {
        DefaultTableModel modelo = (DefaultTableModel) tbDadosGerLap.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Laptop l : tabelaBDGerLap.getBDLap()){
            modelo.insertRow(posLin, new Object[]{
                    l.getGerente(),
                    l.getVendedor(),
                    l.verificarLocalizacao(),
                    l.getIMEI(),
                    l.getComp().getModelo(),
                    l.getComp().getFabricante(),
                    l.getPreco(),
                    l.getTelaPOlegadas(),
                    l.getMemoriaRAM(),
                    l.getSistemaOperacional(),
                    l.getArmazenamentoGB(),
                    l.getProcessador(),
                    l.verQtdEstoque(),
                    l.getQtdEntrada(),
                    l.getEntradaFone()
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
    private javax.swing.JTable tbDadosGerLap;
    // End of variables declaration//GEN-END:variables
}
