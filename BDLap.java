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

public class BDLap {
    private Laptop lap;
    private List<Laptop> bdLap;
    private static BDLap bdLapUnic;
    private static boolean opCancel;
    
    private BDLap()
    {
        bdLap = new ArrayList<Laptop>();
        opCancel=true;
    }
    
    //Singleton
    public static BDLap geraBDLap(){
        if(bdLapUnic == null){
            bdLapUnic = new BDLap();
        }
        return bdLapUnic;
    }
    
    public List<Laptop> getBDLap()
    {
        return bdLap;
    }
    
    public Laptop consLapIMEI(Laptop l){
	for(int i = 0; i < bdLap.size(); i++){
		if(l.getIMEI() == bdLap.get(i).getIMEI()){
			return bdLap.get(i);
		}
	}
	return null;
}//fim consLapIMEI
    
    public Laptop insLap(Laptop l){
	if(consLapIMEI(l)== null){
		bdLap.add(l);
		return l;
	}
	else{
		return null;
            }
	}//fim insLap    
    
    public Laptop delLap(Laptop l)
    {
        Laptop l1 = consLapIMEI(l);
            	if(l1 != null){
                    bdLap.remove(l1);
                    return null;
		}
		else{
                    return l;
		}
    }

public Laptop atualizaDadosLap(Laptop l) throws PrecoException, QtdEntradaException {
    for (int i = 0; i < bdLap.size(); i++) {
        if (l.getIMEI() == bdLap.get(i).getIMEI()) {
            l = bdLap.get(i);

            String modelo = JOptionPane.showInputDialog(
                null,
                "Informe o novo Modelo",
                "Atualizar MODELO",
                JOptionPane.QUESTION_MESSAGE
            );
            if (modelo == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.getComp().setModelo(modelo);
            
            String precoStr = JOptionPane.showInputDialog(
                null,
                "Informe o novo Preço",
                "Atualizar PREÇO",
                JOptionPane.QUESTION_MESSAGE
            );
            if (precoStr == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.setPreco(Float.parseFloat(precoStr));
            
            String telaPolegadasStr = JOptionPane.showInputDialog(
                null,
                "Informe as Polegadas da Tela",
                "Atualizar POLEGADAS DA TELA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (telaPolegadasStr == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.setTelaPolegadas(Integer.parseInt(telaPolegadasStr));
            
            String armazenamentoStr = JOptionPane.showInputDialog(
                null,
                "Informe quantos GB de Memória",
                "Atualizar MEMÓRIA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (armazenamentoStr == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.setArmazenamentoGB(Integer.parseInt(armazenamentoStr));
            
            String processador = JOptionPane.showInputDialog(
                null,
                "Informe o novo Processador",
                "Atualizar o PROCESSADOR",
                JOptionPane.QUESTION_MESSAGE
            );
            if (processador == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.setProcessador(processador);
            
            String localizacao = JOptionPane.showInputDialog(
                null,
                "Informe o novo Local do Estoque",
                "Atualizar LOCAL DO ESTOQUE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (localizacao == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.registrarLocalizacao(localizacao);
            
            String sistemaOperacional = JOptionPane.showInputDialog(
                null,
                "Informe o novo Sistema Operacional",
                "Atualizar SISTEMA OPERACIONAL",
                JOptionPane.QUESTION_MESSAGE
            );
            if (sistemaOperacional == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.setSistemaOperacional(sistemaOperacional);

            String fabricante = JOptionPane.showInputDialog(
                null,
                "Informe o novo Fabricante",
                "Atualizar FABRICANTE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (fabricante == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.getComp().setFabricante(fabricante);
            
            String entradaFone = JOptionPane.showInputDialog(
                null,
                "Informe se tem Entrada de Fone (TRUE/FALSE)",
                "Atualizar ENTRADA DE FONE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (entradaFone == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.setEntradaFone(Boolean.parseBoolean(entradaFone));
            
            String numEntradas = JOptionPane.showInputDialog(
                null,
                "Informe a Quantidade de Entradas do Laptop",
                "Atualizar N° DE ENTRADAS",
                JOptionPane.QUESTION_MESSAGE
            );
            if (numEntradas == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.setQtdEntrada(Integer.parseInt(numEntradas));
            
            String memoriaRam = JOptionPane.showInputDialog(
                null,
                "Informe quantos MP de Câmera",
                "Atualizar CÂMERA",
                JOptionPane.QUESTION_MESSAGE
            );
            if (memoriaRam == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.setMemoriaRam(Integer.parseInt(memoriaRam));

            String quantidadeEstoque = JOptionPane.showInputDialog(
                null,
                "Informe a nova quantidade no Estoque",
                "Atualizar QUANTIDADE DO ESTOQUE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (quantidadeEstoque == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.setQtdEstoque(Integer.parseInt(quantidadeEstoque));
            
            String gerente = JOptionPane.showInputDialog(
                null,
                "Informe o novo Gerente",
                "Atualizar GERENTE",
                JOptionPane.QUESTION_MESSAGE
            );
            if (gerente == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.definirGerente(gerente);
            
            String vendedor = JOptionPane.showInputDialog(
                null,
                "Informe o novo Vendedor",
                "Atualizar VENDEDOR",
                JOptionPane.QUESTION_MESSAGE
            );
            if (vendedor == null) {
                BDLap.setOpCancel(false);
                return l;
            }
            l.definirVendedor(vendedor);

            bdLap.set(i, l);
            return bdLap.get(i);
        }
    }
    return null;
} // fim do método
    public static boolean getOpCancel() {
        return opCancel;
    }

    public static void setOpCancel(boolean opCancel) {
        BDLap.opCancel = opCancel;
    }
}
