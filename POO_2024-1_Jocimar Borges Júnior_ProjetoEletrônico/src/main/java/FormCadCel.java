/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * JOCIMAR BORGES JÚNIOR, RA: 2565897
 */
//Jocimar Borges Júnior, RA: 2565897
//Jocimar Borges Júnior, RA: 2565897
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadCel extends javax.swing.JFrame {
    private Celular cel1 = new Celular();
    private static BDCel bc = BDCel.geraBDCel();
    private static FormCadCel cadCelUnic;
    private FormDadosUnicCel formDadosUnicCel;
    private FormRelatGerCel formRelatGerCel;
    private static long TextoPesquisaIMEI;
    
    
    public FormCadCel() {
        initComponents();
        formDadosUnicCel = FormDadosUnicCel.geraDadosCel();
        
        formRelatGerCel = FormRelatGerCel.tbDadosCel();
        setLocationRelativeTo(null);
        TextoPesquisaIMEI = 0;
    }

    //Sigleton Method
    public static FormCadCel geraCadCel(){
        if(cadCelUnic == null){
            cadCelUnic = new FormCadCel();
        }
        return cadCelUnic;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        rotModelo = new javax.swing.JLabel();
        cxModelo = new javax.swing.JTextField();
        rotPreco = new javax.swing.JLabel();
        cxPreco = new javax.swing.JTextField();
        rotTela = new javax.swing.JLabel();
        cxTela = new javax.swing.JTextField();
        rotPolegadas = new javax.swing.JLabel();
        rotMemoria = new javax.swing.JLabel();
        cxMemoria = new javax.swing.JTextField();
        rotGB = new javax.swing.JLabel();
        rotBateria = new javax.swing.JLabel();
        cxBateria = new javax.swing.JTextField();
        rotMAH = new javax.swing.JLabel();
        rotSistemaOp = new javax.swing.JLabel();
        cxSistemaOp = new javax.swing.JTextField();
        rotFabricante = new javax.swing.JLabel();
        cxFabricante = new javax.swing.JTextField();
        rotOperadora = new javax.swing.JLabel();
        cxOperadora = new javax.swing.JTextField();
        rotCamera = new javax.swing.JLabel();
        rotMP = new javax.swing.JLabel();
        rotGerente = new javax.swing.JLabel();
        cxQuantidade = new javax.swing.JTextField();
        rotEstoqueLocal = new javax.swing.JLabel();
        cxEstoqueLocal = new javax.swing.JTextField();
        rotIMEI = new javax.swing.JLabel();
        cxIMEI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        cxCamera = new javax.swing.JTextField();
        rotSede = new javax.swing.JLabel();
        cxPesquisaIMEI = new javax.swing.JTextField();
        rotInsiraOIMEI = new javax.swing.JLabel();
        rotQuantidade1 = new javax.swing.JLabel();
        cxVendedor = new javax.swing.JTextField();
        rotVendedor = new javax.swing.JLabel();
        cxGerente = new javax.swing.JTextField();
        btOqInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rotModelo.setText("Modelo:");

        cxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxModeloActionPerformed(evt);
            }
        });

        rotPreco.setText("Preço:");

        cxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoActionPerformed(evt);
            }
        });

        rotTela.setText("Tela:");

        cxTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelaActionPerformed(evt);
            }
        });

        rotPolegadas.setText("''");

        rotMemoria.setText("Memória:");

        cxMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMemoriaActionPerformed(evt);
            }
        });

        rotGB.setText("GB");

        rotBateria.setText("Bateria:");

        cxBateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBateriaActionPerformed(evt);
            }
        });

        rotMAH.setText("mAh");

        rotSistemaOp.setText("Sistema Operacional:");

        cxSistemaOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSistemaOpActionPerformed(evt);
            }
        });

        rotFabricante.setText("Fabricante:");

        cxFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFabricanteActionPerformed(evt);
            }
        });

        rotOperadora.setText("Operadora:");

        cxOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxOperadoraActionPerformed(evt);
            }
        });

        rotCamera.setText("Camera:");

        rotMP.setText("MP");

        rotGerente.setText("Gerente:");

        cxQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxQuantidadeActionPerformed(evt);
            }
        });

        rotEstoqueLocal.setText("Estoque:");

        cxEstoqueLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEstoqueLocalActionPerformed(evt);
            }
        });

        rotIMEI.setText("IMEI:");

        cxIMEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIMEIActionPerformed(evt);
            }
        });

        tbCel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "IMEI", "Modelo"
            }
        ));
        jScrollPane1.setViewportView(tbCel);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("CELULARES CADASTRADOS");

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        cxCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCameraActionPerformed(evt);
            }
        });

        rotSede.setText("(Sede)");

        cxPesquisaIMEI.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cxPesquisaIMEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPesquisaIMEIActionPerformed(evt);
            }
        });

        rotInsiraOIMEI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotInsiraOIMEI.setText("<-- INSIRA O IMEI E ESCOLHA UMA DAS OPÇÕES");

        rotQuantidade1.setText("Quantidade:");

        cxVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxVendedorActionPerformed(evt);
            }
        });

        rotVendedor.setText("Vendedor");

        cxGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGerenteActionPerformed(evt);
            }
        });

        btOqInserir.setText("O QUE INSERIR EM CADA UM");
        btOqInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOqInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotMemoria)
                                        .addGap(112, 112, 112))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotTela)
                                        .addGap(113, 113, 113)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotPolegadas)
                                    .addComponent(rotGB)
                                    .addComponent(rotMAH)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rotModelo)
                                            .addComponent(rotPreco)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rotEstoqueLocal, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rotBateria, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cxEstoqueLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(rotSede)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rotQuantidade1))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(rotIMEI, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(rotCamera, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(rotOperadora, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(rotFabricante, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(101, 101, 101)
                                            .addComponent(rotSistemaOp)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cxTela, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDeletar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotInsiraOIMEI)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cxPesquisaIMEI))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cxSistemaOp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cxQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxIMEI, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxCamera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(23, 23, 23)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rotMP)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cxGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(cxVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(rotGerente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rotVendedor)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btOqInserir)
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotModelo)
                    .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotSistemaOp)
                    .addComponent(cxSistemaOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotPreco)
                            .addComponent(rotFabricante)
                            .addComponent(cxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotPolegadas)
                            .addComponent(rotOperadora)
                            .addComponent(cxOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotTela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotMemoria)
                            .addComponent(rotGB)
                            .addComponent(rotCamera)
                            .addComponent(rotMP)
                            .addComponent(cxCamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotBateria)
                            .addComponent(rotMAH)
                            .addComponent(rotIMEI)
                            .addComponent(cxIMEI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxEstoqueLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotSede)
                            .addComponent(rotEstoqueLocal)
                            .addComponent(rotQuantidade1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btCadastrar)
                                .addGap(32, 32, 32)
                                .addComponent(btSair)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btConsultar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAlterar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDeletar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btLimpar))
                                    .addComponent(cxPesquisaIMEI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rotInsiraOIMEI)
                                    .addComponent(btOqInserir))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotGerente)
                            .addComponent(rotVendedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoActionPerformed
    }//GEN-LAST:event_cxPrecoActionPerformed

    private void cxTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelaActionPerformed
    }//GEN-LAST:event_cxTelaActionPerformed

    private void cxMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMemoriaActionPerformed
    }//GEN-LAST:event_cxMemoriaActionPerformed

    private void cxSistemaOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSistemaOpActionPerformed
    }//GEN-LAST:event_cxSistemaOpActionPerformed

    private void cxFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFabricanteActionPerformed
    }//GEN-LAST:event_cxFabricanteActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        insCel();
        populaTabela();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cxBateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBateriaActionPerformed
    }//GEN-LAST:event_cxBateriaActionPerformed

    private void cxOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxOperadoraActionPerformed
    }//GEN-LAST:event_cxOperadoraActionPerformed

    private void cxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxModeloActionPerformed
    }//GEN-LAST:event_cxModeloActionPerformed

    private void cxQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxQuantidadeActionPerformed
    }//GEN-LAST:event_cxQuantidadeActionPerformed

    private void cxEstoqueLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEstoqueLocalActionPerformed
    }//GEN-LAST:event_cxEstoqueLocalActionPerformed

    private void cxIMEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIMEIActionPerformed
    }//GEN-LAST:event_cxIMEIActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consCelIMEI();
        if(TextoPesquisaIMEI !=0){
            abraDadosCelular();
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        delCel();
        populaTabela();
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altDadosCel();
        populaTabela();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cxCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCameraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCameraActionPerformed

    private void cxPesquisaIMEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPesquisaIMEIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPesquisaIMEIActionPerformed

    private void cxVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxVendedorActionPerformed

    private void cxGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGerenteActionPerformed

    private void btOqInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOqInserirActionPerformed
        consOqInserir();
    }//GEN-LAST:event_btOqInserirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    public void abraDadosCelular()
    {
        FormDadosUnicCel.geraDadosCel().setVisible(true);
    }
    
    public static Long getTextoPesquisaIMEI() {
        return TextoPesquisaIMEI;
    }
    
    public void consOqInserir()
    {
        JOptionPane.showMessageDialog(
                null,
                "Modelo: Moto G9+\nPreço: 1090.5\nTela: 19''(polegadas)\nMemória: 250GB\nBateria: 10000mAh\nEstoque: Sede de Curitiba\nSistema Operacional: Android 9.0\nFabricante: Motorola\nOperadora: Claro/Vivo\nCamera: 19MP\nIMEI:1234567\nQuantidade: 10\n\nGerente: Amanda\nVendedor: Marcos.",
                "Exemplo de Informações",
                JOptionPane.QUESTION_MESSAGE
        );
    }
    
    public void consCelIMEI(){
        cel1 = new Celular();
        if (cxPesquisaIMEI.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        cel1.setIMEI(Long.parseLong(cxPesquisaIMEI.getText()));
        if (cxPesquisaIMEI.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        
        cel1 = bc.consCelIMEI(cel1);
        
        if(cel1 != null){
            cxPesquisaIMEI.setText(Long.toString(cel1.getIMEI()));
            JOptionPane.showMessageDialog(
                    null,
                    "IMEI encontrado com sucesso!\n Verique os Dados",
                    "Consulta de Aparelho",
                    JOptionPane.INFORMATION_MESSAGE
            );          
            TextoPesquisaIMEI = (Long.parseLong(cxPesquisaIMEI.getText()));
            formDadosUnicCel.populaTabela();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "IMEI inexistente!",
                    "Consulta de Aparelho",
                    JOptionPane.ERROR_MESSAGE
            );       
            TextoPesquisaIMEI = 0;
            formDadosUnicCel.limparTabela();
        }
        limpar();
    }
    
public void insCel(){
        cel1 = new Celular();
        boolean inserirCel = true;
        
        try {
            cel1.setIMEI(Long.parseLong(cxIMEI.getText()));
            cel1.getComp().setModelo(cxModelo.getText());
            cel1.registrarLocalizacao(cxEstoqueLocal.getText());
            cel1.getComp().setFabricante(cxFabricante.getText());
            cel1.setTelaPolegadas(Integer.parseInt(cxTela.getText()));
            cel1.setBateriamAh(Integer.parseInt(cxBateria.getText()));
            cel1.setSistemaOperacional(cxSistemaOp.getText());
            cel1.setArmazenamentoGB(Integer.parseInt(cxMemoria.getText()));
            cel1.setCameraMP(Integer.parseInt(cxCamera.getText()));
            cel1.setQtdEstoque(Integer.parseInt(cxQuantidade.getText()));
            cel1.setPreco(Float.parseFloat(cxPreco.getText()));
            cel1.definirGerente(cxGerente.getText());
            cel1.definirVendedor(cxVendedor.getText());

            
            if(cel1.getPreco()<=0 || cel1.getTelaPOlegadas() <=0 || cel1.getBateriamAh()<=0 || cel1.getArmazenamentoGB()<=0 || cel1.getCameraMP()<=0 || cel1.verQtdEstoque()<=0)
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Valores igual/abaixo de zero!",
                    "Cadastro de Valores",
                    JOptionPane.ERROR_MESSAGE
                );
                inserirCel = false;
            }
            if(cel1.getComp().getModelo().equals(""))
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Caixa de Texto Modelo Vazia!",
                    "Cadastro de Modelo",
                    JOptionPane.ERROR_MESSAGE
                );
                inserirCel = false;
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Dados faltando ou IMEI contém letras!",
                    "Cadastro de Celular",
                    JOptionPane.ERROR_MESSAGE
            );
            inserirCel = false;
        } catch(PrecoException pe){
            JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Valor incorreto para preço!",
                    "Cadastro de Preço",
                    JOptionPane.ERROR_MESSAGE
                );
            pe.impErro();
            inserirCel = false;
        }
    
        
    if(inserirCel == true){
        cel1 = bc.insCel(cel1);
    
        if(cel1 != null){
                JOptionPane.showMessageDialog(
                    null,
                    "Celular cadastrado com sucesso!",
                    "Cadastro de Celular",
                    JOptionPane.INFORMATION_MESSAGE
                );

            }
            else{
                JOptionPane.showMessageDialog(
                    null,
                    "IMEI duplicado!",
                    "Cadastro de IMEI",
                    JOptionPane.ERROR_MESSAGE
                );        
            }
            limpar();
        }//fim do if
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Celular NÃO Cadastrado!",
                    "Cadastro de Celular",
                    JOptionPane.ERROR_MESSAGE
                );
            
        }
}//fim do insCel

    public void populaTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbCel.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Celular c : bc.getBDCel()){
            modelo.insertRow(posLin,new Object[]{c.getIMEI(),c.getComp().getModelo()});
            posLin++;
        }
    }//fim do PopulaTabela
    
    public void delCel(){
        cel1 = new Celular();
        if (cxPesquisaIMEI.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        cel1.setIMEI(Long.parseLong(cxPesquisaIMEI.getText()));

        cel1 = bc.delCel(cel1);
        
        if(cel1 == null){
            JOptionPane.showMessageDialog(
                    null,
                    "Celular EXCLUIDO com sucesso!",
                    "Deleção de Celular",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe Celular com este IMEI!",
                    "Deleção de Celular",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public void altDadosCel() {
        cel1 = new Celular();
        
        String imeiInput = cxPesquisaIMEI.getText().isEmpty() ? cxIMEI.getText() : cxPesquisaIMEI.getText();
        if (imeiInput.trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        try {
            cel1.setIMEI(Long.parseLong(imeiInput));

            cel1 = bc.atualizaDadosCel(cel1);

            if(BDCel.getOpCancel()== false)
                {
                   JOptionPane.showMessageDialog(
                        null,
                        "Operação Cancelada!",
                        "Alteração de Dados Cancelada.",
                        JOptionPane.WARNING_MESSAGE
                ); 
            }
            
            if (cel1 != null) {
                cxIMEI.setText(Long.toString(cel1.getIMEI()));
                cxModelo.setText(cel1.getComp().getModelo());
                cxBateria.setText(Integer.toString(cel1.getBateriamAh()));
                cxCamera.setText(Integer.toString(cel1.getCameraMP()));
                cxEstoqueLocal.setText(cel1.verificarLocalizacao());
                cxFabricante.setText(cel1.getComp().getFabricante());
                cxPesquisaIMEI.setText(Long.toString(cel1.getIMEI()));
                cxMemoria.setText(Integer.toString(cel1.getArmazenamentoGB()));
                cxOperadora.setText(cel1.getOperadora());
                cxPreco.setText(Float.toString(cel1.getPreco()));
                cxQuantidade.setText(Integer.toString(cel1.verQtdEstoque()));
                cxSistemaOp.setText(cel1.getSistemaOperacional());
                cxTela.setText(Integer.toString(cel1.getTelaPOlegadas()));
                cxGerente.setText(cel1.getGerente());
                cxVendedor.setText(cel1.getVendedor());
                
                if(BDCel.getOpCancel()== true){
                    JOptionPane.showMessageDialog(
                            null,
                            "Dados ALTERADOS com sucesso!\n Verique os Dados",
                            "Alteração de Dados",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Celular não encontrado - Não existe o IMEI",
                        "Erro de Encontrar Dados",
                        JOptionPane.ERROR_MESSAGE
                );          
            }
            populaTabela();
            
            
        } catch (PrecoException pe) {
            pe.impErro();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "Caracteres inválidos\nInsira valores númericos de acordo com o que o campo solicitar!!",
                    "Erro de Valor",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    //Botão Limpar
    public void limpar(){
        cxModelo.setText("");
        cxBateria.setText("");
        cxCamera.setText("");
        cxEstoqueLocal.setText("");
        cxFabricante.setText("");
        cxIMEI.setText("");
        cxPesquisaIMEI.setText("");
        cxMemoria.setText("");
        cxOperadora.setText("");
        cxPreco.setText("");
        cxQuantidade.setText("");
        cxSistemaOp.setText("");
        cxTela.setText("");
        
        cxGerente.setText("");
        cxVendedor.setText("");
    }
    
    //Botão Sair
    public void sair(){
        int ret = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Saida",
                JOptionPane.YES_NO_OPTION
        );
        if(ret == 0){
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btOqInserir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxBateria;
    private javax.swing.JTextField cxCamera;
    private javax.swing.JTextField cxEstoqueLocal;
    private javax.swing.JTextField cxFabricante;
    private javax.swing.JTextField cxGerente;
    private javax.swing.JTextField cxIMEI;
    private javax.swing.JTextField cxMemoria;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxOperadora;
    private javax.swing.JTextField cxPesquisaIMEI;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxQuantidade;
    private javax.swing.JTextField cxSistemaOp;
    private javax.swing.JTextField cxTela;
    private javax.swing.JTextField cxVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotBateria;
    private javax.swing.JLabel rotCamera;
    private javax.swing.JLabel rotEstoqueLocal;
    private javax.swing.JLabel rotFabricante;
    private javax.swing.JLabel rotGB;
    private javax.swing.JLabel rotGerente;
    private javax.swing.JLabel rotIMEI;
    private javax.swing.JLabel rotInsiraOIMEI;
    private javax.swing.JLabel rotMAH;
    private javax.swing.JLabel rotMP;
    private javax.swing.JLabel rotMemoria;
    private javax.swing.JLabel rotModelo;
    private javax.swing.JLabel rotOperadora;
    private javax.swing.JLabel rotPolegadas;
    private javax.swing.JLabel rotPreco;
    private javax.swing.JLabel rotQuantidade1;
    private javax.swing.JLabel rotSede;
    private javax.swing.JLabel rotSistemaOp;
    private javax.swing.JLabel rotTela;
    private javax.swing.JLabel rotVendedor;
    private javax.swing.JTable tbCel;
    // End of variables declaration//GEN-END:variables
}
