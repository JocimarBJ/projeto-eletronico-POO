/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jocim
 */
//Jocimar Borges Júnior, RA: 2565897
//Jocimar Borges Júnior, RA: 2565897
//Jocimar Borges Júnior, RA: 2565897

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDCel {
    private Celular cel;
    private List<Celular> bdCel;
    private static BDCel bdCelUnic;
    private static boolean opCancel;
    
    private BDCel()
    {
        bdCel = new ArrayList<Celular>();
        opCancel=true;
    }
    
    //Singleton
    public static BDCel geraBDCel(){
        if(bdCelUnic == null){
            bdCelUnic = new BDCel();
        }
        return bdCelUnic;
    }
    
    public List<Celular> getBDCel()
    {
        return bdCel;
    }
    
    public Celular consCelIMEI(Celular c){
	for(int i = 0; i < bdCel.size(); i++){
		if(c.getIMEI() == bdCel.get(i).getIMEI()){
			return bdCel.get(i);
		}
	}
	return null;
}//fim consCelIMEI
    
    public Celular insCel(Celular c){
	if(consCelIMEI(c)== null){
		bdCel.add(c);
		return c;
	}
	else{
		return null;
            }
	}//fim insCel    
    
    public Celular delCel(Celular c)
    {
        Celular c1 = consCelIMEI(c);
            	if(c1 != null){
                    bdCel.remove(c1);
                    return null;
		}
		else{
                    return c;
		}
    }

public Celular atualizaDadosCel(Celular c) throws PrecoException {
    for (int i = 0; i < bdCel.size(); i++) {
        if (c.getIMEI() == bdCel.get(i).getIMEI()) {
            c = bdCel.get(i);

            String modelo = JOptionPane.showInputDialog(
                null,
                "Informe o novo Modelo",
                "Atualizar MODELO",
                JOptionPane.QUESTION_MESSAGE
            );
            if (modelo == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.getComp().setModelo(modelo);
            
            String gerente = JOptionPane.showInputDialog(
                null,
                "Informe o novo Gerente",
                "Atualizar GERENTE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (gerente == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.definirGerente(gerente);
            String vendedor = JOptionPane.showInputDialog(
                null,
                "Informe o novo Vendedor",
                "Atualizar VENDEDOR",
                JOptionPane.QUESTION_MESSAGE
            );
            if (vendedor == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.definirVendedor(vendedor);
            
            String fabricante = JOptionPane.showInputDialog(
                null,
                "Informe o novo Fabricante",
                "Atualizar FABRICANTE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (fabricante == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.getComp().setFabricante(fabricante);

            String armazenamentoStr = JOptionPane.showInputDialog(
                null,
                "Informe quantos GB de Memória",
                "Atualizar MEMÓRIA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (armazenamentoStr == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.setArmazenamentoGB(Integer.parseInt(armazenamentoStr));

            String bateriaStr = JOptionPane.showInputDialog(
                null,
                "Informe a capacidade de Bateria\n(mAh)",
                "Atualizar BATERIA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (bateriaStr == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.setBateriamAh(Integer.parseInt(bateriaStr));

            String cameraStr = JOptionPane.showInputDialog(
                null,
                "Informe quantos MP de Câmera",
                "Atualizar CÂMERA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (cameraStr == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.setCameraMP(Integer.parseInt(cameraStr));

            String operadora = JOptionPane.showInputDialog(
                null,
                "Informe a nova Operadora",
                "Atualizar OPERADORA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (operadora == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.setOperadora(operadora);

            String precoStr = JOptionPane.showInputDialog(
                null,
                "Informe o novo Preço",
                "Atualizar PREÇO",
                JOptionPane.QUESTION_MESSAGE
            );
            if (precoStr == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.setPreco(Float.parseFloat(precoStr));

            String quantidadeEstoque = JOptionPane.showInputDialog(
                null,
                "Informe a nova quantidade no Estoque",
                "Atualizar QUANTIDADE DO ESTOQUE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (quantidadeEstoque == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.setQtdEstoque(Integer.parseInt(quantidadeEstoque));

            String sistemaOperacional = JOptionPane.showInputDialog(
                null,
                "Informe o novo Sistema Operacional",
                "Atualizar SISTEMA OPERACIONAL",
                JOptionPane.QUESTION_MESSAGE
            );
            if (sistemaOperacional == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.setSistemaOperacional(sistemaOperacional);

            String telaPolegadasStr = JOptionPane.showInputDialog(
                null,
                "Informe as Polegadas da Tela",
                "Atualizar POLEGADAS DA TELA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (telaPolegadasStr == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.setTelaPolegadas(Integer.parseInt(telaPolegadasStr));

            String localizacao = JOptionPane.showInputDialog(
                null,
                "Informe o novo Local do Estoque",
                "Atualizar LOCAL DO ESTOQUE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (localizacao == null) {
                BDCel.setOpCancel(false);
                return c;
            }
            c.registrarLocalizacao(localizacao);

            bdCel.set(i, c);
            return bdCel.get(i);
        }
    }
    return null;
} // fim do método
    public static boolean getOpCancel() {
        return opCancel;
    }

    public static void setOpCancel(boolean opCancel) {
        BDCel.opCancel = opCancel;
    }
}