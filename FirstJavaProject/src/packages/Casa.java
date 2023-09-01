package packages;

public class Casa {
    private String endereco;
    private String cor;
    private String tamanho;
    
    public Casa(String endereco, String cor, String tamanho) {
        this.endereco = endereco;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public String getCor() {
        return cor;
    }
    
    public String getTamanho() {
        return tamanho;
    }
}
