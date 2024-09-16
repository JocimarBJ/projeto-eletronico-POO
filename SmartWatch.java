public class SmartWatch extends Eletronico implements EstoqueLocalizavel, Responsavel{
//Jocimar Borges Júnior, RA: 2565897
    private String tipoDisplay; //AMOLED, LED
    private boolean resistenciaAgua; //Sim ou nao
    private String corPulseira; //Laranja, preta, branca e etc
    private String compatibilidade; //Compatibilidade com IOS, Android, Windows e etc
    private String gerente;
    private String vendedor;
    private int qtdEstoque; //1, 2, 3, 4, etc
    private String localizacao; //Sede de São Paulo, Curitiba, etc
    private long IMEI; // de 15 à 17 digitos.

//  --------- Método Construtor ---------
    public SmartWatch()
    {
        tipoDisplay = "";
        resistenciaAgua = false;
        corPulseira = "";
        compatibilidade = "";
        IMEI = 0;

        qtdEstoque = 0;
        localizacao = "";
        vendedor="";
        gerente="";
    }
//-----------------------------------------

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

//  --------- Métodos Getters ---------
    public String getTipoDisplay()
    {
        return tipoDisplay;
    }
    public String getCorPulseira()
    {
        return corPulseira;
    }
    public String getCompatibilidade()
    {
        return compatibilidade;
    }
    public boolean getResistenciaAgua()
    {
        return resistenciaAgua;
    }
    public long getIMEI()
    {
        return IMEI;
    }
//  --------- Métodos Setters --------
    public void setTipoDisplay(String tipoDisplay)
    {
        this.tipoDisplay = tipoDisplay;
    }
    public void setCorPulseira(String corPulseira)
    {
        this.corPulseira = corPulseira;
    }
    public void setCompatibilidade(String compatibilidade)
    {
        this.compatibilidade = compatibilidade;
    }
    public void setResistenciaAgua(boolean resistenciaAgua)
    {
        this.resistenciaAgua = resistenciaAgua;
    }
    public void setIMEI(long IMEI)
    {
        this.IMEI = IMEI;
    }
}
