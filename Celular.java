//Jocimar Borges Júnior, RA: 2565897

public class Celular extends Eletronico implements EstoqueLocalizavel, Responsavel{
    private String operadora; //Vivo, Tim, Claro, Oi
    private int bateriamAh; //5000mAh, 3000mAh, etc
    private int cameraMP;  //16MP, 32MP, etc
    private long IMEI; // de 15 à 17 digitos.
    private String gerente;
    private String vendedor;
    private int qtdEstoque; //1, 2, 3, 4, etc
    private String localizacao; //Sede de São Paulo, Curitiba, etc

//  --------- Método Construtor ---------
    public Celular()
    {
        operadora = "";
        bateriamAh = 0;
        cameraMP = 0;

        qtdEstoque = 0;
        localizacao = "";
        vendedor="";
        gerente="";
    }
//  -------------------------------------
    
// ------------Sobrecarregado-------------
    public Celular(String operadora, int bateriamAh, int cameraMP, int qtdEstoque, String localizacao)
    {
        this.operadora = operadora;
        this.bateriamAh = bateriamAh;
        this.cameraMP = cameraMP;

        this.qtdEstoque = qtdEstoque;
        this.localizacao = localizacao;
    }
    
//  --------- Métodos da Interface ---------
    //Também podem ser chamados de Polimorfismo por sobrescrita, estes que contém a mesma assinatura, mas seus conteúdos se diferenciam em outros métodos de outras classes.
    public int verQtdEstoque()
    {
        return this.qtdEstoque;
    }
    
    public void setQtdEstoque(int qtdEstoque)
    {
        this.qtdEstoque = qtdEstoque;
    }
    
    public int verificarQuantidade()
    {
        if(qtdEstoque>0)
        {
            return qtdEstoque;
        }
        else
        {
            return 0;
        }

    }
    public void registrarLocalizacao(String localizacao)
    {
        this.localizacao = localizacao;
    }
    public String verificarLocalizacao()
    {
        if(qtdEstoque>0)
            return localizacao;
        else
            return "Não há itens no estoque para serem localizados";
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

//  --------- Métodos Getters ---------
    public String getOperadora()
    {
        return operadora;
    }
    public int getBateriamAh()
    {
        return bateriamAh;
    }
    public int getCameraMP()
    {
        return cameraMP;
    }
    public long getIMEI()
    {
        return IMEI;
    }
    
//  --------------------------------------

//  --------- Métodos Setters ---------
    public void setOperadora(String operadora)
    {
        this.operadora = operadora;
    }
    public void setBateriamAh(int bateriamAh)
    {
        this.bateriamAh = bateriamAh;
    }
    public void setCameraMP(int cameraMP)
    {
        this.cameraMP = cameraMP;
    }
    public void setIMEI(long IMEI)
    {
        this.IMEI = IMEI;
    }
//  -------------------------------------
}
