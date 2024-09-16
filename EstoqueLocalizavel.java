//Jocimar Borges Júnior, RA: 2565897

public interface EstoqueLocalizavel {
        // Métodos para gerenciar o estoque
        void setQtdEstoque(int qtdEstoque);
        int verQtdEstoque();
        // Métodos para rastrear a localização dos itens no estoque
        void registrarLocalizacao(String localizacao);
        String verificarLocalizacao();
        //Os estoques serão considerados suas localizações nas Sedes das cidades, (Ex: Sede de Curitiba);
}
