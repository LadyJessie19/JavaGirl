package packages;

public class Carro {
    private String marca;
    private String cor;
    private int ano;
    
    public Carro(String marca, String cor, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getCor() {
        return cor;
    }
    
    public int getAno() {
        return ano;
    }
}
