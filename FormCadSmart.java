//Jocimar Borges Júnior, RA: 2565897
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

public class FormCadSmart extends javax.swing.JFrame {

    private SmartWatch s1 = new SmartWatch();
    private static BDSmart bs = BDSmart.geraBDSmart();
    private static FormCadSmart cadSmartUnic;
    private FormDadosUnicSmart formDadosUnicSmart;
    private FormRelatGerSmart formRelatGerSmart;
    private static long TextoPesquisaIMEI;
    
    
    public FormCadSmart() {
        initComponents();
        formDadosUnicSmart = FormDadosUnicSmart.geraDadosSmart();
        
        formRelatGerSmart = FormRelatGerSmart.tbDadosSmart();
        setLocationRelativeTo(null);
        TextoPesquisaIMEI = 0;
    }

    //Sigleton Method
    public static FormCadSmart geraCadSmart(){
        if(cadSmartUnic == null){
            cadSmartUnic = new FormCadSmart();
        }
        return cadSmartUnic;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxCorPulseiraSmart = new javax.swing.JTextField();
        cxPesquisaIMEISmart = new javax.swing.JTextField();
        rotSistemaOpSmart = new javax.swing.JLabel();
        rotInsiraOIMEISmart = new javax.swing.JLabel();
        cxSistemaOpSmart = new javax.swing.JTextField();
        rotFabricanteSmart = new javax.swing.JLabel();
        cxFabricanteSmart = new javax.swing.JTextField();
        rotResistenciaAguaSmart = new javax.swing.JLabel();
        cxResistenciaAguaSmart = new javax.swing.JTextField();
        rotCorPulseiraSmart = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        rotModeloSmart = new javax.swing.JLabel();
        cxModeloSmart = new javax.swing.JTextField();
        cxQuantidadeSmart = new javax.swing.JTextField();
        rotPrecoSmart = new javax.swing.JLabel();
        cxPrecoSmart = new javax.swing.JTextField();
        rotEstoqueLocalSmart = new javax.swing.JLabel();
        cxEstoqueLocalSmart = new javax.swing.JTextField();
        rotTelaSmart = new javax.swing.JLabel();
        cxTelaSmart = new javax.swing.JTextField();
        rotQuantidadeSmart = new javax.swing.JLabel();
        rotIMEISmart = new javax.swing.JLabel();
        cxIMEISmart = new javax.swing.JTextField();
        rotPolegadasSmart = new javax.swing.JLabel();
        rotMemoriaSmart = new javax.swing.JLabel();
        cxMemoriaSmart = new javax.swing.JTextField();
        rotSmartCadastrados = new javax.swing.JLabel();
        rotGBSmart = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSmart = new javax.swing.JTable();
        rotCompatibilidadeSmart = new javax.swing.JLabel();
        cxCompatibilidadeSmart = new javax.swing.JTextField();
        rotTipoDisplaySmart = new javax.swing.JLabel();
        cxTipoDisplaySmart = new javax.swing.JTextField();
        cxVendedorSmart = new javax.swing.JTextField();
        rotVendedorSmart = new javax.swing.JLabel();
        cxGerenteSmart = new javax.swing.JTextField();
        rotGerenteSmart = new javax.swing.JLabel();
        btOqInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cxCorPulseiraSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCorPulseiraSmartActionPerformed(evt);
            }
        });

        cxPesquisaIMEISmart.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cxPesquisaIMEISmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPesquisaIMEISmartActionPerformed(evt);
            }
        });

        rotSistemaOpSmart.setText("Sistema Operacional:");

        rotInsiraOIMEISmart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotInsiraOIMEISmart.setText("<-- INSIRA O IMEI E ESCOLHA UMA DAS OPÇÕES");

        cxSistemaOpSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSistemaOpSmartActionPerformed(evt);
            }
        });

        rotFabricanteSmart.setText("Fabricante:");

        cxFabricanteSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFabricanteSmartActionPerformed(evt);
            }
        });

        rotResistenciaAguaSmart.setText("Resistência a Água?:");

        cxResistenciaAguaSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxResistenciaAguaSmartActionPerformed(evt);
            }
        });

        rotCorPulseiraSmart.setText("Cor da Pulseira:");

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
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

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rotModeloSmart.setText("Modelo:");

        cxModeloSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxModeloSmartActionPerformed(evt);
            }
        });

        cxQuantidadeSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxQuantidadeSmartActionPerformed(evt);
            }
        });

        rotPrecoSmart.setText("Preço:");

        cxPrecoSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoSmartActionPerformed(evt);
            }
        });

        rotEstoqueLocalSmart.setText("Estoque:");

        cxEstoqueLocalSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEstoqueLocalSmartActionPerformed(evt);
            }
        });

        rotTelaSmart.setText("Tela:");

        cxTelaSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelaSmartActionPerformed(evt);
            }
        });

        rotQuantidadeSmart.setText("Quantidade:");

        rotIMEISmart.setText("IMEI:");

        cxIMEISmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIMEISmartActionPerformed(evt);
            }
        });

        rotPolegadasSmart.setText("''");

        rotMemoriaSmart.setText("Memória:");

        cxMemoriaSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMemoriaSmartActionPerformed(evt);
            }
        });

        rotSmartCadastrados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotSmartCadastrados.setText("SMARTWATCHS CADASTRADOS");

        rotGBSmart.setText("GB");

        tbSmart.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbSmart);

        rotCompatibilidadeSmart.setText("Compatibilidade:");

        cxCompatibilidadeSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCompatibilidadeSmartActionPerformed(evt);
            }
        });

        rotTipoDisplaySmart.setText("Display");

        cxTipoDisplaySmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTipoDisplaySmartActionPerformed(evt);
            }
        });

        cxVendedorSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxVendedorSmartActionPerformed(evt);
            }
        });

        rotVendedorSmart.setText("Vendedor:");

        cxGerenteSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGerenteSmartActionPerformed(evt);
            }
        });

        rotGerenteSmart.setText("Gerente:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rotMemoriaSmart)
                                .addComponent(rotTelaSmart)
                                .addComponent(rotPrecoSmart)
                                .addComponent(rotModeloSmart)
                                .addComponent(rotTipoDisplaySmart))
                            .addComponent(rotEstoqueLocalSmart, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(rotQuantidadeSmart))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cxEstoqueLocalSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rotCompatibilidadeSmart)))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxModeloSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(rotSistemaOpSmart))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxMemoriaSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxTipoDisplaySmart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rotIMEISmart))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(rotGBSmart)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rotCorPulseiraSmart, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(rotFabricanteSmart, javax.swing.GroupLayout.Alignment.TRAILING))))))
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxPrecoSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxTelaSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotPolegadasSmart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rotResistenciaAguaSmart)
                                .addGap(7, 7, 7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDeletar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotInsiraOIMEISmart)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cxPesquisaIMEISmart))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxSistemaOpSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(128, 128, 128)
                                        .addComponent(rotSmartCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addGap(108, 108, 108))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cxResistenciaAguaSmart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addComponent(cxFabricanteSmart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addComponent(cxIMEISmart)
                                            .addComponent(cxCorPulseiraSmart, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addComponent(cxCompatibilidadeSmart)
                                            .addComponent(cxQuantidadeSmart))
                                        .addGap(30, 30, 30)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxGerenteSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(cxVendedorSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(rotGerenteSmart)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rotVendedorSmart)
                                        .addGap(113, 113, 113)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btOqInserir)
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotModeloSmart)
                    .addComponent(cxModeloSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotSistemaOpSmart)
                    .addComponent(cxSistemaOpSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotSmartCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxPrecoSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotPrecoSmart)
                            .addComponent(rotFabricanteSmart)
                            .addComponent(cxFabricanteSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxTelaSmart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rotResistenciaAguaSmart)
                                .addComponent(cxResistenciaAguaSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rotTelaSmart)
                                .addComponent(rotPolegadasSmart)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxMemoriaSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotMemoriaSmart)
                            .addComponent(rotGBSmart)
                            .addComponent(rotCorPulseiraSmart)
                            .addComponent(cxCorPulseiraSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotIMEISmart)
                            .addComponent(cxIMEISmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxTipoDisplaySmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotTipoDisplaySmart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxCompatibilidadeSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotCompatibilidadeSmart)
                            .addComponent(cxEstoqueLocalSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotEstoqueLocalSmart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxQuantidadeSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotQuantidadeSmart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btConsultar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAlterar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDeletar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btLimpar))
                                    .addComponent(cxPesquisaIMEISmart))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(32, 32, 32)
                                .addComponent(btSair)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotInsiraOIMEISmart)
                            .addComponent(btOqInserir))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotGerenteSmart)
                            .addComponent(rotVendedorSmart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxVendedorSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxGerenteSmart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCorPulseiraSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCorPulseiraSmartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCorPulseiraSmartActionPerformed

    private void cxPesquisaIMEISmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPesquisaIMEISmartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPesquisaIMEISmartActionPerformed

    private void cxSistemaOpSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSistemaOpSmartActionPerformed

    }//GEN-LAST:event_cxSistemaOpSmartActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        insSmart();
        populaTabela();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cxFabricanteSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFabricanteSmartActionPerformed

    }//GEN-LAST:event_cxFabricanteSmartActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consSmartIMEI();
        if(TextoPesquisaIMEI !=0){
            abraDadosSmartWatch();
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void cxResistenciaAguaSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxResistenciaAguaSmartActionPerformed

    }//GEN-LAST:event_cxResistenciaAguaSmartActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        delSmart();
        populaTabela();
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cxModeloSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxModeloSmartActionPerformed

    }//GEN-LAST:event_cxModeloSmartActionPerformed

    private void cxQuantidadeSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxQuantidadeSmartActionPerformed

    }//GEN-LAST:event_cxQuantidadeSmartActionPerformed

    private void cxPrecoSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoSmartActionPerformed

    }//GEN-LAST:event_cxPrecoSmartActionPerformed

    private void cxEstoqueLocalSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEstoqueLocalSmartActionPerformed

    }//GEN-LAST:event_cxEstoqueLocalSmartActionPerformed

    private void cxTelaSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelaSmartActionPerformed

    }//GEN-LAST:event_cxTelaSmartActionPerformed

    private void cxIMEISmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIMEISmartActionPerformed

    }//GEN-LAST:event_cxIMEISmartActionPerformed

    private void cxMemoriaSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMemoriaSmartActionPerformed

    }//GEN-LAST:event_cxMemoriaSmartActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altDadosSmart();
        populaTabela();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void cxCompatibilidadeSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCompatibilidadeSmartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCompatibilidadeSmartActionPerformed

    private void cxTipoDisplaySmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTipoDisplaySmartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTipoDisplaySmartActionPerformed

    private void cxVendedorSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxVendedorSmartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxVendedorSmartActionPerformed

    private void cxGerenteSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGerenteSmartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGerenteSmartActionPerformed

    private void btOqInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOqInserirActionPerformed
        consOqInserir();
    }//GEN-LAST:event_btOqInserirActionPerformed
 
    public void abraDadosSmartWatch()
    {
        FormDadosUnicSmart.geraDadosSmart().setVisible(true);
    }
    
    public static Long getTextoPesquisaIMEI() {
        return TextoPesquisaIMEI;
    }
    public void consOqInserir()
    {
        JOptionPane.showMessageDialog(
                null,
                "Modelo: Dell G15\nPreço: 5390.5\nTela: 23''(polegadas)\nMemória: 2000GB\nProcessador: Intel Core i5\nEstoque: Sede de São Paulo\nSistema Operacional: Windows 10\nFabricante: Dell\nFone de Ouvido: True/False (Sim/Não)\nN° de Entradas: 12\nIMEI:987654\nMemória RAM: 8GB\nQuantidade: 10\n\nGerente: Jeferson\nVendedor: Paulo.",
                "Exemplo de Informações",
                JOptionPane.QUESTION_MESSAGE
        );
    }
    
    public void consSmartIMEI(){
        s1 = new SmartWatch();
        if (cxPesquisaIMEISmart.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        s1.setIMEI(Long.parseLong(cxPesquisaIMEISmart.getText()));
        if (cxPesquisaIMEISmart.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        
        s1 = bs.consSmartIMEI(s1);
        
        if(s1 != null){
            cxPesquisaIMEISmart.setText(Long.toString(s1.getIMEI()));
            JOptionPane.showMessageDialog(
                    null,
                    "IMEI encontrado com sucesso!\n Verique os Dados",
                    "Consulta de Aparelho",
                    JOptionPane.INFORMATION_MESSAGE
            );          
            TextoPesquisaIMEI = (Long.parseLong(cxPesquisaIMEISmart.getText()));
            formDadosUnicSmart.populaTabela();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "IMEI inexistente!",
                    "Consulta de Aparelho",
                    JOptionPane.ERROR_MESSAGE
            );       
            TextoPesquisaIMEI = 0;
            formDadosUnicSmart.limparTabela();
        }
        limpar();
    }
    
public void insSmart(){
        s1 = new SmartWatch();
        boolean inserirSmart = true;
        
        try {
            s1.getComp().setModelo(cxModeloSmart.getText());
            s1.setPreco(Float.parseFloat(cxPrecoSmart.getText()));
            s1.setTelaPolegadas(Integer.parseInt(cxTelaSmart.getText()));
            s1.setArmazenamentoGB(Integer.parseInt(cxMemoriaSmart.getText()));
            s1.setTipoDisplay(cxTipoDisplaySmart.getText());
            s1.registrarLocalizacao(cxEstoqueLocalSmart.getText());
            s1.setSistemaOperacional(cxSistemaOpSmart.getText());
            s1.getComp().setFabricante(cxFabricanteSmart.getText());
            s1.setResistenciaAgua(Boolean.parseBoolean(cxResistenciaAguaSmart.getText()));
            s1.setCorPulseira(cxCorPulseiraSmart.getText());
            s1.setCompatibilidade(cxCompatibilidadeSmart.getText());
            s1.setIMEI(Long.parseLong(cxIMEISmart.getText()));
            s1.setQtdEstoque(Integer.parseInt(cxQuantidadeSmart.getText()));
            s1.definirGerente(cxGerenteSmart.getText());
            s1.definirVendedor(cxVendedorSmart.getText());

            
            if(s1.getPreco()<=0 || s1.getTelaPOlegadas() <=0 || s1.getArmazenamentoGB()<=0 || s1.verQtdEstoque()<=0)
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Valores igual/abaixo de zero!",
                    "Cadastro de Valores",
                    JOptionPane.ERROR_MESSAGE
                );
                inserirSmart = false;
            }
            if(s1.getComp().getModelo().equals(""))
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Caixa de Texto Modelo Vazia!",
                    "Cadastro de Modelo",
                    JOptionPane.ERROR_MESSAGE
                );
                inserirSmart = false;
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Dados faltando ou IMEI contém letras!",
                    "Cadastro de SmartWatch",
                    JOptionPane.ERROR_MESSAGE
            );
            inserirSmart = false;
        } catch(PrecoException pe){
            JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Valor incorreto para preço!",
                    "Cadastro de Preço",
                    JOptionPane.ERROR_MESSAGE
                );
            pe.impErro();
            inserirSmart = false;
        }
    
        
    if(inserirSmart == true){
        s1 = bs.insSmart(s1);
    
        if(s1 != null){
                JOptionPane.showMessageDialog(
                    null,
                    "SmartWatch cadastrado com sucesso!",
                    "Cadastro de SmartWatch",
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
                    "SmartWatch NÃO Cadastrado!",
                    "Cadastro de SmartWatch",
                    JOptionPane.ERROR_MESSAGE
                );
            
        }
}//fim do insSmart

    public void populaTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbSmart.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(SmartWatch s : bs.getBDSmart()){
            modelo.insertRow(posLin,new Object[]{s.getIMEI(),s.getComp().getModelo()});
            posLin++;
        }
    }//fim do PopulaTabela
    
    public void delSmart(){
        s1 = new SmartWatch();
        if (cxPesquisaIMEISmart.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        s1.setIMEI(Long.parseLong(cxPesquisaIMEISmart.getText()));

        s1 = bs.delSmart(s1);
        
        if(s1 == null){
            JOptionPane.showMessageDialog(
                    null,
                    "SmartWatch EXCLUIDO com sucesso!",
                    "Deleção de SmartWatch",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe SmartWatch com este IMEI!",
                    "Deleção de SmartWatch",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public void altDadosSmart() {
        s1 = new SmartWatch();
        
        String imeiInput = cxPesquisaIMEISmart.getText().isEmpty() ? cxIMEISmart.getText() : cxPesquisaIMEISmart.getText();
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
            s1.setIMEI(Long.parseLong(imeiInput));

            s1 = bs.atualizaDadosSmart(s1);

            if(BDSmart.getOpCancel()== false)
                {
                   JOptionPane.showMessageDialog(
                        null,
                        "Operação Cancelada!",
                        "Alteração de Dados Cancelada.",
                        JOptionPane.WARNING_MESSAGE
                ); 
            }
            
            if (s1 != null) {
                cxModeloSmart.setText(s1.getComp().getModelo());
                cxPrecoSmart.setText(Float.toString(s1.getPreco()));
                cxTelaSmart.setText(Integer.toString(s1.getTelaPOlegadas()));
                cxEstoqueLocalSmart.setText(s1.verificarLocalizacao());
                cxMemoriaSmart.setText(Integer.toString(s1.getArmazenamentoGB()));
                cxTipoDisplaySmart.setText(s1.getTipoDisplay());
                cxSistemaOpSmart.setText(s1.getSistemaOperacional());
                cxFabricanteSmart.setText(s1.getComp().getFabricante());
                cxResistenciaAguaSmart.setText(Boolean.toString(s1.getResistenciaAgua()));
                cxCorPulseiraSmart.setText(s1.getCorPulseira());
                cxCompatibilidadeSmart.setText(s1.getCompatibilidade());
                cxIMEISmart.setText(Long.toString(s1.getIMEI()));
                cxQuantidadeSmart.setText(Integer.toString(s1.verQtdEstoque()));
                
                cxPesquisaIMEISmart.setText(Long.toString(s1.getIMEI()));
                cxGerenteSmart.setText(s1.getGerente());
                cxVendedorSmart.setText(s1.getVendedor());
                
                if(BDSmart.getOpCancel()== true){
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
                        "SmartWatch não encontrado - Não existe o IMEI",
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
        cxModeloSmart.setText("");
        cxPrecoSmart.setText("");
        cxTelaSmart.setText("");
        cxEstoqueLocalSmart.setText("");
        cxMemoriaSmart.setText("");
        cxTipoDisplaySmart.setText("");
        cxSistemaOpSmart.setText("");
        cxFabricanteSmart.setText("");
        cxResistenciaAguaSmart.setText("");
        cxCorPulseiraSmart.setText("");
        cxIMEISmart.setText("");
        cxCompatibilidadeSmart.setText("");
        cxQuantidadeSmart.setText("");
                
        cxPesquisaIMEISmart.setText("");
        cxGerenteSmart.setText("");
        cxVendedorSmart.setText("");
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
    private javax.swing.JTextField cxCompatibilidadeSmart;
    private javax.swing.JTextField cxCorPulseiraSmart;
    private javax.swing.JTextField cxEstoqueLocalSmart;
    private javax.swing.JTextField cxFabricanteSmart;
    private javax.swing.JTextField cxGerenteSmart;
    private javax.swing.JTextField cxIMEISmart;
    private javax.swing.JTextField cxMemoriaSmart;
    private javax.swing.JTextField cxModeloSmart;
    private javax.swing.JTextField cxPesquisaIMEISmart;
    private javax.swing.JTextField cxPrecoSmart;
    private javax.swing.JTextField cxQuantidadeSmart;
    private javax.swing.JTextField cxResistenciaAguaSmart;
    private javax.swing.JTextField cxSistemaOpSmart;
    private javax.swing.JTextField cxTelaSmart;
    private javax.swing.JTextField cxTipoDisplaySmart;
    private javax.swing.JTextField cxVendedorSmart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCompatibilidadeSmart;
    private javax.swing.JLabel rotCorPulseiraSmart;
    private javax.swing.JLabel rotEstoqueLocalSmart;
    private javax.swing.JLabel rotFabricanteSmart;
    private javax.swing.JLabel rotGBSmart;
    private javax.swing.JLabel rotGerenteSmart;
    private javax.swing.JLabel rotIMEISmart;
    private javax.swing.JLabel rotInsiraOIMEISmart;
    private javax.swing.JLabel rotMemoriaSmart;
    private javax.swing.JLabel rotModeloSmart;
    private javax.swing.JLabel rotPolegadasSmart;
    private javax.swing.JLabel rotPrecoSmart;
    private javax.swing.JLabel rotQuantidadeSmart;
    private javax.swing.JLabel rotResistenciaAguaSmart;
    private javax.swing.JLabel rotSistemaOpSmart;
    private javax.swing.JLabel rotSmartCadastrados;
    private javax.swing.JLabel rotTelaSmart;
    private javax.swing.JLabel rotTipoDisplaySmart;
    private javax.swing.JLabel rotVendedorSmart;
    private javax.swing.JTable tbSmart;
    // End of variables declaration//GEN-END:variables
}
