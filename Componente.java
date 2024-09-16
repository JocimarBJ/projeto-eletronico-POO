//Jocimar Borges Júnior, RA: 2565897

public class Componente {
    private String modelo; //
    private String fabricante; //Motorola, Samsung, Xiaomi, Apple e etc

//  ----- Método Construtor -----
    public Componente()
    {
        modelo = "";
        fabricante = "";
    }

//  ----- Métodos Getters -----
    public String getModelo()
    {
        return modelo;
    }
    public String getFabricante()
    {
        return fabricante;
    }

//  ----- Métodos Setters -----
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public void setFabricante(String fabricante)
    {
        this.fabricante = fabricante;
    }
}
