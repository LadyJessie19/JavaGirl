package packages;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private Documento documento;
    private LocalDate nascimento;
    private String profissao;
    
    public Pessoa(String nome, Documento documento, LocalDate nascimento, String profissao) {
        this.nome = nome;
        this.documento = documento;
        this.nascimento = nascimento;
        this.profissao = profissao;
    }
    
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - nascimento.getYear();
        
        if (nascimento.getMonthValue() > dataAtual.getMonthValue() ||
            (nascimento.getMonthValue() == dataAtual.getMonthValue() &&
            nascimento.getDayOfMonth() > dataAtual.getDayOfMonth())) {
            idade--;
        }
        
        return idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public Documento getDocumento() {
        return documento;
    }
    
    public LocalDate getNascimento() {
        return nascimento;
    }
    
    public String getProfissao() {
        return profissao;
    }
}
