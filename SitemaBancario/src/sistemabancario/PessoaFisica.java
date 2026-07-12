/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;

public class PessoaFisica extends Correntista{
    private int cpf;
    
    public PessoaFisica(String nome, int cpf, double saldo, double limite) {
        super(nome, saldo, limite);
        this.cpf = cpf;
    }


    @Override
    public String toString(){
        return "Nome: " + super.getNome() + " CPF: " + cpf + " Saldo: " + saldo + " Limite: " + super.getLimite();
    }
    
}
