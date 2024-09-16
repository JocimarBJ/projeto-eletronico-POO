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

public class BDSmart {
    private SmartWatch smart;
    private List<SmartWatch> bdSmart;
    private static BDSmart bdSmartUnic;
    private static boolean opCancel;
    
    private BDSmart()
    {
        bdSmart = new ArrayList<SmartWatch>();
        opCancel=true;
    }
    
    //Singleton
    public static BDSmart geraBDSmart(){
        if(bdSmartUnic == null){
            bdSmartUnic = new BDSmart();
        }
        return bdSmartUnic;
    }
    
    public List<SmartWatch> getBDSmart()
    {
        return bdSmart;
    }
    
    public SmartWatch consSmartIMEI(SmartWatch s){
	for(int i = 0; i < bdSmart.size(); i++){
		if(s.getIMEI() == bdSmart.get(i).getIMEI()){
			return bdSmart.get(i);
		}
	}
	return null;
}//fim consSmartIMEI
    
    public SmartWatch insSmart(SmartWatch s){
	if(consSmartIMEI(s)== null){
		bdSmart.add(s);
		return s;
	}
	else{
		return null;
            }
	}//fim insSmart    
    
    public SmartWatch delSmart(SmartWatch s)
    {
        SmartWatch s1 = consSmartIMEI(s);
            	if(s1 != null){
                    bdSmart.remove(s1);
                    return null;
		}
		else{
                    return s;
		}
    }

public SmartWatch atualizaDadosSmart(SmartWatch s) throws PrecoException {
    for (int i = 0; i < bdSmart.size(); i++) {
        if (s.getIMEI() == bdSmart.get(i).getIMEI()) {
            s = bdSmart.get(i);

            String modelo = JOptionPane.showInputDialog(
                null,
                "Informe o novo Modelo",
                "Atualizar MODELO",
                JOptionPane.QUESTION_MESSAGE
            );
            if (modelo == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.getComp().setModelo(modelo);
            
            String precoStr = JOptionPane.showInputDialog(
                null,
                "Informe o novo Preço",
                "Atualizar PREÇO",
                JOptionPane.QUESTION_MESSAGE
            );
            if (precoStr == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.setPreco(Float.parseFloat(precoStr));
            
            String telaPolegadasStr = JOptionPane.showInputDialog(
                null,
                "Informe as Polegadas da Tela",
                "Atualizar POLEGADAS DA TELA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (telaPolegadasStr == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.setTelaPolegadas(Integer.parseInt(telaPolegadasStr));
            
            String armazenamentoStr = JOptionPane.showInputDialog(
                null,
                "Informe quantos GB de Memória",
                "Atualizar MEMÓRIA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (armazenamentoStr == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.setArmazenamentoGB(Integer.parseInt(armazenamentoStr));
            
            String tipoDisplay = JOptionPane.showInputDialog(
                null,
                "Informe o novo Tipo de Display",
                "Atualizar o TIPO DE DISPLAY",
                JOptionPane.QUESTION_MESSAGE
            );
            if (tipoDisplay == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.setTipoDisplay(tipoDisplay);
            
            String localizacao = JOptionPane.showInputDialog(
                null,
                "Informe o novo Local do Estoque",
                "Atualizar LOCAL DO ESTOQUE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (localizacao == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.registrarLocalizacao(localizacao);
            
            String sistemaOperacional = JOptionPane.showInputDialog(
                null,
                "Informe o novo Sistema Operacional",
                "Atualizar SISTEMA OPERACIONAL",
                JOptionPane.QUESTION_MESSAGE
            );
            if (sistemaOperacional == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.setSistemaOperacional(sistemaOperacional);

            String fabricante = JOptionPane.showInputDialog(
                null,
                "Informe o novo Fabricante",
                "Atualizar FABRICANTE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (fabricante == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.getComp().setFabricante(fabricante);
            
            String resistenciaAgua = JOptionPane.showInputDialog(
                null,
                "Informe se tem Entrada de Fone (TRUE/FALSE)",
                "Atualizar ENTRADA DE FONE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (resistenciaAgua == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.setResistenciaAgua(Boolean.parseBoolean(resistenciaAgua));
            
            String corPulseira = JOptionPane.showInputDialog(
                null,
                "Informe a Cor da Pulseira",
                "Atualizar COR DA PULSEIRA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (corPulseira == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.setCorPulseira(corPulseira);
            
            String compatibilidade = JOptionPane.showInputDialog(
                null,
                "Informe a nova Compatibilidade",
                "Atualizar COMPATIBILIDADE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (compatibilidade == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.setCompatibilidade(compatibilidade);

            String quantidadeEstoque = JOptionPane.showInputDialog(
                null,
                "Informe a nova quantidade no Estoque",
                "Atualizar QUANTIDADE DO ESTOQUE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (quantidadeEstoque == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.setQtdEstoque(Integer.parseInt(quantidadeEstoque));
            
            String gerente = JOptionPane.showInputDialog(
                null,
                "Informe o novo Gerente",
                "Atualizar GERENTE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (gerente == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.definirGerente(gerente);
            
            String vendedor = JOptionPane.showInputDialog(
                null,
                "Informe o novo Vendedor",
                "Atualizar VENDEDOR",
                JOptionPane.QUESTION_MESSAGE
            );
            if (vendedor == null) {
                BDSmart.setOpCancel(false);
                return s;
            }
            s.definirVendedor(vendedor);

            bdSmart.set(i, s);
            return bdSmart.get(i);
        }
    }
    return null;
} // fim do método
    public static boolean getOpCancel() {
        return opCancel;
    }

    public static void setOpCancel(boolean opCancel) {
        BDSmart.opCancel = opCancel;
    }
}
