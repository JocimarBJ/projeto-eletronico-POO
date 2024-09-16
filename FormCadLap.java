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

public class FormCadLap extends javax.swing.JFrame {

    private Laptop l1 = new Laptop();
    private static BDLap bl = BDLap.geraBDLap();
    private static FormCadLap cadLapUnic;
    private FormDadosUnicLap formDadosUnicLap;
    private FormRelatGerLap formRelatGerLap;
    private static long TextoPesquisaIMEI;
    
    
    public FormCadLap() {
        initComponents();
        formDadosUnicLap = FormDadosUnicLap.geraDadosSmart();
        
        formRelatGerLap = FormRelatGerLap.tbDadosLap();
        setLocationRelativeTo(null);
        TextoPesquisaIMEI = 0;
    }

    //Sigleton Method
    public static FormCadLap geraCadLap(){
        if(cadLapUnic == null){
            cadLapUnic = new FormCadLap();
        }
        return cadLapUnic;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxQtdEntradas = new javax.swing.JTextField();
        rotSedeLap = new javax.swing.JLabel();
        cxPesquisaIMEILap = new javax.swing.JTextField();
        rotSistemaOpLap = new javax.swing.JLabel();
        rotInsiraOIMEILap = new javax.swing.JLabel();
        cxSistemaOpLap = new javax.swing.JTextField();
        rotFabricanteLap = new javax.swing.JLabel();
        cxFabricanteLap = new javax.swing.JTextField();
        rotOperadoraLap = new javax.swing.JLabel();
        cxFoneLap = new javax.swing.JTextField();
        rotQtdEntradas = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        rotModeloLap = new javax.swing.JLabel();
        cxModeloLap = new javax.swing.JTextField();
        cxQuantidadeLap = new javax.swing.JTextField();
        rotPrecoLap = new javax.swing.JLabel();
        cxPrecoLap = new javax.swing.JTextField();
        rotEstoqueLocalLap = new javax.swing.JLabel();
        cxEstoqueLocalLap = new javax.swing.JTextField();
        rotTela = new javax.swing.JLabel();
        cxTelaLap = new javax.swing.JTextField();
        rotQuantidadeLap = new javax.swing.JLabel();
        rotIMEILap = new javax.swing.JLabel();
        cxIMEILap = new javax.swing.JTextField();
        rotPolegadasLap = new javax.swing.JLabel();
        rotMemoriaLap = new javax.swing.JLabel();
        cxMemoriaLap = new javax.swing.JTextField();
        rotLaptopsCadastrados = new javax.swing.JLabel();
        rotGBLap = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLap = new javax.swing.JTable();
        rotMemoriaRAMLap = new javax.swing.JLabel();
        cxMemoriaRAMLap = new javax.swing.JTextField();
        rotProcessadorLap = new javax.swing.JLabel();
        cxProcessadorLap = new javax.swing.JTextField();
        cxVendedorLap = new javax.swing.JTextField();
        rotVendedorLap = new javax.swing.JLabel();
        cxGerenteLap = new javax.swing.JTextField();
        rotGerenteLap = new javax.swing.JLabel();
        btOqInserir = new javax.swing.JButton();
        rotGBLap1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cxQtdEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxQtdEntradasActionPerformed(evt);
            }
        });

        rotSedeLap.setText("(Sede)");

        cxPesquisaIMEILap.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cxPesquisaIMEILap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPesquisaIMEILapActionPerformed(evt);
            }
        });

        rotSistemaOpLap.setText("Sistema Operacional:");

        rotInsiraOIMEILap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotInsiraOIMEILap.setText("<-- INSIRA O IMEI E ESCOLHA UMA DAS OPÇÕES");

        cxSistemaOpLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSistemaOpLapActionPerformed(evt);
            }
        });

        rotFabricanteLap.setText("Fabricante:");

        cxFabricanteLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFabricanteLapActionPerformed(evt);
            }
        });

        rotOperadoraLap.setText("Fone de Ouvido?:");

        cxFoneLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFoneLapActionPerformed(evt);
            }
        });

        rotQtdEntradas.setText("N° de Entradas:");

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

        rotModeloLap.setText("Modelo:");

        cxModeloLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxModeloLapActionPerformed(evt);
            }
        });

        cxQuantidadeLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxQuantidadeLapActionPerformed(evt);
            }
        });

        rotPrecoLap.setText("Preço:");

        cxPrecoLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPrecoLapActionPerformed(evt);
            }
        });

        rotEstoqueLocalLap.setText("Estoque:");

        cxEstoqueLocalLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEstoqueLocalLapActionPerformed(evt);
            }
        });

        rotTela.setText("Tela:");

        cxTelaLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelaLapActionPerformed(evt);
            }
        });

        rotQuantidadeLap.setText("Quantidade:");

        rotIMEILap.setText("IMEI:");

        cxIMEILap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIMEILapActionPerformed(evt);
            }
        });

        rotPolegadasLap.setText("''");

        rotMemoriaLap.setText("Memória:");

        cxMemoriaLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMemoriaLapActionPerformed(evt);
            }
        });

        rotLaptopsCadastrados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotLaptopsCadastrados.setText("LAPTOPS CADASTRADOS");

        rotGBLap.setText("GB");

        tbLap.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbLap);

        rotMemoriaRAMLap.setText("Memória RAM:");

        cxMemoriaRAMLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMemoriaRAMLapActionPerformed(evt);
            }
        });

        rotProcessadorLap.setText("Processador:");

        cxProcessadorLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxProcessadorLapActionPerformed(evt);
            }
        });

        cxVendedorLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxVendedorLapActionPerformed(evt);
            }
        });

        rotVendedorLap.setText("Vendedor");

        cxGerenteLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxGerenteLapActionPerformed(evt);
            }
        });

        rotGerenteLap.setText("Gerente:");

        btOqInserir.setText("O QUE INSERIR EM CADA UM");
        btOqInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOqInserirActionPerformed(evt);
            }
        });

        rotGBLap1.setText("GB");

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
                                .addComponent(rotMemoriaLap)
                                .addComponent(rotTela)
                                .addComponent(rotPrecoLap)
                                .addComponent(rotModeloLap)
                                .addComponent(rotProcessadorLap))
                            .addComponent(rotEstoqueLocalLap, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(rotQuantidadeLap))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cxEstoqueLocalLap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rotMemoriaRAMLap)))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxPrecoLap, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(cxTelaLap))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotPolegadasLap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rotOperadoraLap))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxModeloLap, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(rotSistemaOpLap))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxMemoriaLap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxProcessadorLap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(rotSedeLap)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rotIMEILap))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(rotGBLap)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rotQtdEntradas, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(rotFabricanteLap, javax.swing.GroupLayout.Alignment.TRAILING))))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDeletar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotInsiraOIMEILap)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cxPesquisaIMEILap))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxSistemaOpLap, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140)
                                        .addComponent(rotLaptopsCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(96, 96, 96))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cxFoneLap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addComponent(cxFabricanteLap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addComponent(cxIMEILap)
                                            .addComponent(cxQtdEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addComponent(cxMemoriaRAMLap)
                                            .addComponent(cxQuantidadeLap))
                                        .addGap(3, 3, 3)
                                        .addComponent(rotGBLap1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxGerenteLap, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(cxVendedorLap, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(rotGerenteLap)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rotVendedorLap)
                                        .addGap(19, 19, 19)))
                                .addGap(46, 46, 46)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btOqInserir)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotModeloLap)
                    .addComponent(cxModeloLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotSistemaOpLap)
                    .addComponent(cxSistemaOpLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotLaptopsCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxPrecoLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotPrecoLap)
                            .addComponent(rotFabricanteLap)
                            .addComponent(cxFabricanteLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxTelaLap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rotOperadoraLap)
                                .addComponent(cxFoneLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rotTela)
                                .addComponent(rotPolegadasLap)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxMemoriaLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotMemoriaLap)
                            .addComponent(rotGBLap)
                            .addComponent(rotQtdEntradas)
                            .addComponent(cxQtdEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotIMEILap)
                            .addComponent(cxIMEILap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxProcessadorLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotSedeLap)
                            .addComponent(rotProcessadorLap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxMemoriaRAMLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotMemoriaRAMLap)
                            .addComponent(cxEstoqueLocalLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotEstoqueLocalLap)
                            .addComponent(rotGBLap1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxQuantidadeLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotQuantidadeLap))
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
                                    .addComponent(cxPesquisaIMEILap))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(32, 32, 32)
                                .addComponent(btSair)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotInsiraOIMEILap)
                            .addComponent(btOqInserir))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotGerenteLap)
                            .addComponent(rotVendedorLap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxVendedorLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxGerenteLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxQtdEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxQtdEntradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxQtdEntradasActionPerformed

    private void cxPesquisaIMEILapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPesquisaIMEILapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPesquisaIMEILapActionPerformed

    private void cxSistemaOpLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSistemaOpLapActionPerformed

    }//GEN-LAST:event_cxSistemaOpLapActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        insLap();
        populaTabela();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cxFabricanteLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFabricanteLapActionPerformed

    }//GEN-LAST:event_cxFabricanteLapActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consLapIMEI();
        if(TextoPesquisaIMEI !=0){
            abraDadosLaptop();
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void cxFoneLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFoneLapActionPerformed

    }//GEN-LAST:event_cxFoneLapActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        delLap();
        populaTabela();
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cxModeloLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxModeloLapActionPerformed

    }//GEN-LAST:event_cxModeloLapActionPerformed

    private void cxQuantidadeLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxQuantidadeLapActionPerformed

    }//GEN-LAST:event_cxQuantidadeLapActionPerformed

    private void cxPrecoLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoLapActionPerformed

    }//GEN-LAST:event_cxPrecoLapActionPerformed

    private void cxEstoqueLocalLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEstoqueLocalLapActionPerformed

    }//GEN-LAST:event_cxEstoqueLocalLapActionPerformed

    private void cxTelaLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelaLapActionPerformed

    }//GEN-LAST:event_cxTelaLapActionPerformed

    private void cxIMEILapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIMEILapActionPerformed

    }//GEN-LAST:event_cxIMEILapActionPerformed

    private void cxMemoriaLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMemoriaLapActionPerformed

    }//GEN-LAST:event_cxMemoriaLapActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altDadosLap();
        populaTabela();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void cxMemoriaRAMLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMemoriaRAMLapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMemoriaRAMLapActionPerformed

    private void cxProcessadorLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxProcessadorLapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxProcessadorLapActionPerformed

    private void cxVendedorLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxVendedorLapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxVendedorLapActionPerformed

    private void cxGerenteLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxGerenteLapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxGerenteLapActionPerformed

    private void btOqInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOqInserirActionPerformed
        consOqInserir();
    }//GEN-LAST:event_btOqInserirActionPerformed
 
    public void abraDadosLaptop()
    {
        FormDadosUnicLap.geraDadosSmart().setVisible(true);
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
    
    public void consLapIMEI(){
        l1 = new Laptop();
        if (cxPesquisaIMEILap.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        l1.setIMEI(Long.parseLong(cxPesquisaIMEILap.getText()));
        if (cxPesquisaIMEILap.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        
        l1 = bl.consLapIMEI(l1);
        
        if(l1 != null){
            cxPesquisaIMEILap.setText(Long.toString(l1.getIMEI()));
            JOptionPane.showMessageDialog(
                    null,
                    "IMEI encontrado com sucesso!\n Verique os Dados",
                    "Consulta de Aparelho",
                    JOptionPane.INFORMATION_MESSAGE
            );          
            TextoPesquisaIMEI = (Long.parseLong(cxPesquisaIMEILap.getText()));
            formDadosUnicLap.populaTabela();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "IMEI inexistente!",
                    "Consulta de Aparelho",
                    JOptionPane.ERROR_MESSAGE
            );       
            TextoPesquisaIMEI = 0;
            formDadosUnicLap.limparTabela();
        }
        limpar();
    }
    
public void insLap(){
        l1 = new Laptop();
        boolean inserirLap = true;
        
        try {
            l1.getComp().setModelo(cxModeloLap.getText());
            l1.setPreco(Float.parseFloat(cxPrecoLap.getText()));
            l1.setTelaPolegadas(Integer.parseInt(cxTelaLap.getText()));
            l1.setArmazenamentoGB(Integer.parseInt(cxMemoriaLap.getText()));
            l1.setProcessador(cxProcessadorLap.getText());
            l1.registrarLocalizacao(cxEstoqueLocalLap.getText());
            l1.setSistemaOperacional(cxSistemaOpLap.getText());
            l1.getComp().setFabricante(cxFabricanteLap.getText());
            l1.setEntradaFone(Boolean.parseBoolean(cxFoneLap.getText()));
            l1.setQtdEntrada(Integer.parseInt(cxQtdEntradas.getText()));
            l1.setIMEI(Long.parseLong(cxIMEILap.getText()));
            l1.setMemoriaRam(Integer.parseInt(cxMemoriaRAMLap.getText()));
            l1.setQtdEstoque(Integer.parseInt(cxQuantidadeLap.getText()));
            l1.definirGerente(cxGerenteLap.getText());
            l1.definirVendedor(cxVendedorLap.getText());

            
            if(l1.getPreco()<=0 || l1.getTelaPOlegadas() <=0 || l1.getArmazenamentoGB()<=0 || l1.getMemoriaRAM() <=0 || l1.verQtdEstoque()<=0)
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Valores igual/abaixo de zero!",
                    "Cadastro de Valores",
                    JOptionPane.ERROR_MESSAGE
                );
                inserirLap = false;
            }
            if(l1.getComp().getModelo().equals(""))
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Caixa de Texto Modelo Vazia!",
                    "Cadastro de Modelo",
                    JOptionPane.ERROR_MESSAGE
                );
                inserirLap = false;
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Dados faltando ou IMEI contém letras!",
                    "Cadastro de Laptop",
                    JOptionPane.ERROR_MESSAGE
            );
            inserirLap = false;
        } catch(PrecoException pe){
            JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Valor incorreto para preço!",
                    "Cadastro de Preço",
                    JOptionPane.ERROR_MESSAGE
                );
            pe.impErro();
            inserirLap = false;
        } catch (QtdEntradaException qee)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Quantidade de entradas incorretas!",
                    "Erro de Inserção de Quantidade de Entradas",
                    JOptionPane.ERROR_MESSAGE
                );
            if(Integer.parseInt(cxQtdEntradas.getText()) <=1)
                qee.impErroPeq();
            else
                qee.impErroGrd();
            inserirLap = false;
        }
    
        
    if(inserirLap == true){
        l1 = bl.insLap(l1);
    
        if(l1 != null){
                JOptionPane.showMessageDialog(
                    null,
                    "Laptop cadastrado com sucesso!",
                    "Cadastro de Laptop",
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
                    "Laptop NÃO Cadastrado!",
                    "Cadastro de Laptop",
                    JOptionPane.ERROR_MESSAGE
                );
            
        }
}//fim do insLap

    public void populaTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbLap.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Laptop l : bl.getBDLap()){
            modelo.insertRow(posLin,new Object[]{l.getIMEI(),l.getComp().getModelo()});
            posLin++;
        }
    }//fim do PopulaTabela
    
    public void delLap(){
        l1 = new Laptop();
        if (cxPesquisaIMEILap.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(
                null,
                "Campo IMEI vazio.",
                "Operação Cancelada",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }
        l1.setIMEI(Long.parseLong(cxPesquisaIMEILap.getText()));

        l1 = bl.delLap(l1);
        
        if(l1 == null){
            JOptionPane.showMessageDialog(
                    null,
                    "Laptop EXCLUIDO com sucesso!",
                    "Deleção de Laptop",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe Laptop com este IMEI!",
                    "Deleção de Laptop",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public void altDadosLap() {
        l1 = new Laptop();
        
        String imeiInput = cxPesquisaIMEILap.getText().isEmpty() ? cxIMEILap.getText() : cxPesquisaIMEILap.getText();
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
            l1.setIMEI(Long.parseLong(imeiInput));

            l1 = bl.atualizaDadosLap(l1);

            if(BDLap.getOpCancel()== false)
                {
                   JOptionPane.showMessageDialog(
                        null,
                        "Operação Cancelada!",
                        "Alteração de Dados Cancelada.",
                        JOptionPane.WARNING_MESSAGE
                ); 
            }
            
            if (l1 != null) {
                cxModeloLap.setText(l1.getComp().getModelo());
                cxPrecoLap.setText(Float.toString(l1.getPreco()));
                cxTelaLap.setText(Integer.toString(l1.getTelaPOlegadas()));
                cxEstoqueLocalLap.setText(l1.verificarLocalizacao());
                cxMemoriaLap.setText(Integer.toString(l1.getArmazenamentoGB()));
                cxProcessadorLap.setText(l1.getProcessador());
                cxSistemaOpLap.setText(l1.getSistemaOperacional());
                cxFabricanteLap.setText(l1.getComp().getFabricante());
                cxFoneLap.setText(Boolean.toString(l1.getEntradaFone()));
                cxQtdEntradas.setText(Integer.toString(l1.getQtdEntrada()));
                cxIMEILap.setText(Long.toString(l1.getIMEI()));
                cxMemoriaRAMLap.setText(Integer.toString(l1.getMemoriaRAM()));
                cxQuantidadeLap.setText(Integer.toString(l1.verQtdEstoque()));
                
                cxPesquisaIMEILap.setText(Long.toString(l1.getIMEI()));
                cxGerenteLap.setText(l1.getGerente());
                cxVendedorLap.setText(l1.getVendedor());
                
                if(BDLap.getOpCancel()== true){
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
                        "Laptop não encontrado - Não existe o IMEI",
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
        } catch (QtdEntradaException qee)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Dados incorreto!\n Quantidade de Entradas incorretas!",
                    "Erro de Alterar Quantidade de Entradas",
                    JOptionPane.ERROR_MESSAGE
                );
            if(Integer.parseInt(cxQtdEntradas.getText()) <=1)
                qee.impErroPeq();
            else
                qee.impErroGrd();
        }
    }
    
    //Botão Limpar
    public void limpar(){
        cxModeloLap.setText("");
        cxPrecoLap.setText("");
        cxTelaLap.setText("");
        cxEstoqueLocalLap.setText("");
        cxMemoriaLap.setText("");
        cxProcessadorLap.setText("");
        cxSistemaOpLap.setText("");
        cxFabricanteLap.setText("");
        cxFoneLap.setText("");
        cxQtdEntradas.setText("");
        cxIMEILap.setText("");
        cxMemoriaRAMLap.setText("");
        cxQuantidadeLap.setText("");
                
        cxPesquisaIMEILap.setText("");
        cxGerenteLap.setText("");
        cxVendedorLap.setText("");
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
    private javax.swing.JTextField cxEstoqueLocalLap;
    private javax.swing.JTextField cxFabricanteLap;
    private javax.swing.JTextField cxFoneLap;
    private javax.swing.JTextField cxGerenteLap;
    private javax.swing.JTextField cxIMEILap;
    private javax.swing.JTextField cxMemoriaLap;
    private javax.swing.JTextField cxMemoriaRAMLap;
    private javax.swing.JTextField cxModeloLap;
    private javax.swing.JTextField cxPesquisaIMEILap;
    private javax.swing.JTextField cxPrecoLap;
    private javax.swing.JTextField cxProcessadorLap;
    private javax.swing.JTextField cxQtdEntradas;
    private javax.swing.JTextField cxQuantidadeLap;
    private javax.swing.JTextField cxSistemaOpLap;
    private javax.swing.JTextField cxTelaLap;
    private javax.swing.JTextField cxVendedorLap;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotEstoqueLocalLap;
    private javax.swing.JLabel rotFabricanteLap;
    private javax.swing.JLabel rotGBLap;
    private javax.swing.JLabel rotGBLap1;
    private javax.swing.JLabel rotGerenteLap;
    private javax.swing.JLabel rotIMEILap;
    private javax.swing.JLabel rotInsiraOIMEILap;
    private javax.swing.JLabel rotLaptopsCadastrados;
    private javax.swing.JLabel rotMemoriaLap;
    private javax.swing.JLabel rotMemoriaRAMLap;
    private javax.swing.JLabel rotModeloLap;
    private javax.swing.JLabel rotOperadoraLap;
    private javax.swing.JLabel rotPolegadasLap;
    private javax.swing.JLabel rotPrecoLap;
    private javax.swing.JLabel rotProcessadorLap;
    private javax.swing.JLabel rotQtdEntradas;
    private javax.swing.JLabel rotQuantidadeLap;
    private javax.swing.JLabel rotSedeLap;
    private javax.swing.JLabel rotSistemaOpLap;
    private javax.swing.JLabel rotTela;
    private javax.swing.JLabel rotVendedorLap;
    private javax.swing.JTable tbLap;
    // End of variables declaration//GEN-END:variables
}
