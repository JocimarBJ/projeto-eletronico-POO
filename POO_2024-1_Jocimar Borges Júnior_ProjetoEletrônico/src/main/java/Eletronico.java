//Jocimar Borges Júnior, RA: 2565897

public abstract class Eletronico{

    private String sistemaOperacional; //Motorola, 
    private float preco;
    private int telaPolegadas, armazenamentoGB;
    private Componente comp;

//  --------- Metodo construtor ---------
    public Eletronico()
    {
        sistemaOperacional = "";
        preco = 0;
        telaPolegadas = 0;
        armazenamentoGB = 0;
        comp = new Componente();
    }

//  ----- Polimorfismo por Sobrecarga -----
    public Eletronico(String sistemaOperacional, float preco, int telaPolegadas, int armazenamentoGB, Componente comp){
	System.out.println("\n Construtor. Sobrecarga-1");
	this.sistemaOperacional = sistemaOperacional;
	this.preco = preco;
        this.telaPolegadas = telaPolegadas;
        this.armazenamentoGB = armazenamentoGB;
        this.comp = comp;
    }
//-------------------------------------------------

//  --------- Métodos Getters ---------
    public String getSistemaOperacional()
    {
        return sistemaOperacional;
    }
    public float getPreco()
    {
        return preco;
    }
    public int getTelaPOlegadas()
    {
        return telaPolegadas;
    }
    public int getArmazenamentoGB()
    {
        return armazenamentoGB;
    }
    public Componente getComp()
    {
        return comp;
    }
//  --------------------------------------

//  --------- Métodos Setters ---------
    public void setSistemaOperacional(String sistemaOperacional)
    {
        this.sistemaOperacional = sistemaOperacional;
    }
    public void setPreco(float preco) throws PrecoException
    {
        if(preco>=0)
            this.preco = preco;
        else
            throw new PrecoException();
    }
    public void setTelaPolegadas(int telaPolegadas)
    {
        this.telaPolegadas = telaPolegadas;
    }
    public void setArmazenamentoGB(int armazenamentoGB)
    {
        this.armazenamentoGB = armazenamentoGB;
    }
//  --------------------------------------
}
