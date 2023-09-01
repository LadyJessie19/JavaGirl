import packages.Carro;
import packages.Casa;
import packages.Documento;
import packages.Pessoa;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Documento documento = new Documento("123456789");
        LocalDate nascimento = LocalDate.of(1990, 5, 15);
        Pessoa pessoa = new Pessoa("João", documento, nascimento, "Engenheiro");
        
        Carro carro = new Carro("Toyota", "Preto", 2022);
        
        Casa casa = new Casa("Rua das Flores, 123", "Azul", "Grande");
        
        System.out.println("Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Documento: " + pessoa.getDocumento().getNumeroDocumento());
        System.out.println("Data de Nascimento: " + pessoa.getNascimento());
        System.out.println("Profissão: " + pessoa.getProfissao());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        
        System.out.println("\nCarro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Ano: " + carro.getAno());
        
        System.out.println("\nCasa:");
        System.out.println("Endereço: " + casa.getEndereco());
        System.out.println("Cor: " + casa.getCor());
        System.out.println("Tamanho: " + casa.getTamanho());
    }
}
