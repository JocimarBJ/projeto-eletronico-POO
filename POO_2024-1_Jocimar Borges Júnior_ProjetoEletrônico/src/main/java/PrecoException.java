import javax.swing.JOptionPane;

public class PrecoException extends Exception {

    public void impErro() {
        JOptionPane.showMessageDialog(
            null,
            "<<Preço abaixo do valor possível>>\n Insira o valor corretamente!",
            "Erro de Preço",
            JOptionPane.ERROR_MESSAGE
        );
    }
}
