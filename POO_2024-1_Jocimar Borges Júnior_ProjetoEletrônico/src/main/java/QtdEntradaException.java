import javax.swing.JOptionPane;

public class QtdEntradaException extends Exception {

    public void impErroGrd() {
        JOptionPane.showMessageDialog(
            null,
            "<<Quantidade de entradas externas acima de 15, é impossível um laptop ter mais do que isso>>",
            "Erro de Quantidade de Entradas",
            JOptionPane.ERROR_MESSAGE
        );
    }

    public void impErroPeq() {
        JOptionPane.showMessageDialog(
            null,
            "<<Quantidade de entradas externas abaixo ou igual a 1, é impossível um laptop ter menos do que isso>>",
            "Erro de Quantidade de Entradas",
            JOptionPane.ERROR_MESSAGE
        );
    }

    public Laptop corrigeQtdEntrada(Laptop l1) throws QtdEntradaException {
        int qtd = 0;
        try {
            qtd = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Digite a quantidade de entradas que o laptop tem:",
                "Correção de Quantidade de Entradas",
                JOptionPane.QUESTION_MESSAGE
            ));
            l1.setQtdEntrada(qtd);

            if (qtd > 15) {
                impErroGrd();
                l1 = corrigeQtdEntrada(l1);  // Chamada recursiva se a quantidade for inválida
            } else if (qtd <= 0) {
                impErroPeq();
                l1 = corrigeQtdEntrada(l1);  // Chamada recursiva se a quantidade for inválida
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Erro: Por favor, digite um número válido.",
                "Erro de Entrada de Dados",
                JOptionPane.ERROR_MESSAGE
            );
            l1 = corrigeQtdEntrada(l1);  // Chamada recursiva se a entrada não for um número
        }
        return l1;
    }
}
