//Jocimar Borges Júnior, RA: 2565897

public class Laptop extends Eletronico implements EstoqueLocalizavel, Responsavel{

    private int memoriaRAM; //16GB RAM, 32GB RAM, 64GB RAM, etc
    private String processador; //Intel Core I5-11000, AMD RYZEN 5 e etc
    private int qtdEntrada; // 5 entradas, 6 entradas, e etc
    private boolean entradaFone; //Entrada pra conectar o fone
    private String gerente;
    private String vendedor;
    private int qtdEstoque; //1, 2, 3, 4, etc
    private String localizacao; //Sede de São Paulo, Curitiba, etc
    private long IMEI; // de 15 à 17 digitos.


//  ----- Método Construtor -----
    public Laptop()
    {
        memoriaRAM = 0;
        processador = "";
        qtdEntrada = 0;
        entradaFone = false;
        IMEI=0;

        qtdEstoque = 0;
        localizacao = "";
        vendedor="";
        gerente="";
    }
//---------------------------------

//  ----- Métodos da Interface -----
    //Também podem ser chamados de Polimorfismo por sobrescrita, estes que contém a mesma assinatura, mas seus conteúdos se diferenciam em outros métodos de outras classes.
    public int verQtdEstoque()
    {
        return this.qtdEstoque;
    }
    
    public void setQtdEstoque(int qtdEstoque)
    {
        this.qtdEstoque = qtdEstoque;
    }
    
    public void registrarLocalizacao(String localizacao)
    {
        this.localizacao = localizacao;
        System.out.println("Localização registrada com sucesso: " + localizacao);
    }
    public String verificarLocalizacao()
    {
        return localizacao;
    }

    public void definirVendedor(String vendedor)
    {
        this.vendedor = vendedor;
    }
    public String getVendedor()
    {
        return vendedor;
    }
    public void definirGerente(String gerente)
    {
        this.gerente = gerente;
    }
    public String getGerente()
    {
        return gerente;
    }
//  --------------------------------------

//  ----- Métodos Getters -----
    public int getMemoriaRAM()
    {
        return memoriaRAM;
    }
    public String getProcessador()
    {
        return processador;
    }
    public int getQtdEntrada()
    {
        return qtdEntrada;
    }
    public boolean getEntradaFone()
    {
        return entradaFone;
    }
    
    public long getIMEI()
    {
        return IMEI;
    }
//-----------------------------------

//  ----- Métodos Setters -----
    public void setMemoriaRam(int memoriaRAM)
    {
        this.memoriaRAM = memoriaRAM;
    }
    public void setProcessador(String processador)
    {
        this.processador = processador;
    }
    public void setQtdEntrada(int qtdEntrada) throws QtdEntradaException
    {
        if(qtdEntrada>1&& qtdEntrada<=15)
            this.qtdEntrada = qtdEntrada;
        else
            throw new QtdEntradaException();
    }
    public void setEntradaFone(boolean entradaFone)
    {
        this.entradaFone = entradaFone;
    }
    public void setIMEI(long IMEI)
    {
        this.IMEI = IMEI;
    }

}
