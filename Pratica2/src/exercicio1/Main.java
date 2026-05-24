/*Crie uma classe para representar uma pessoa, com os atributos privados de
nome, data de nascimento e altura. Crie os métodos públicos necessários para sets e gets
e também um método para imprimir todos dados de uma pessoa. Crie um método para
calcular a idade da pessoa*/

package exercicio1;

public class Main {
    public static void main(String[] args) {
        Data hoje = new Data(23, 5, 2026);
        Data nascimento = new Data(10, 8, 2005);
        Pessoa[] p = new Pessoa[2];
        int idade;
        
        p[0] = new Pessoa("Luisa", nascimento, 1.62);
        p[0].imprimir();
        System.out.println("Idade: " + p[0].calcularIdade(hoje) + " anos");
       
    }
}
