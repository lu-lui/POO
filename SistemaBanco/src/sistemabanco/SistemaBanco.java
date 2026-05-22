package sistemabanco;

public class SistemaBanco {
    public static void main(String[] args) {
        Conta minhaConta[] = new Conta[2]; //inicialização do vetor
        Funcionario funcionarios;
        double ganho;
        Banco bradesco = new Banco("Bradesco");
        Banco banrisul = new Banco("Banrisul");
        
        System.out.println(bradesco.pegaCodB());
        System.out.println(banrisul.pegaCodB());
        System.out.println(bradesco.pegaNomeB());
        
        minhaConta[0] = new Conta(1234, "Maria", 0, 1000, "Bradesco");
        minhaConta[1] = new Conta(5678, "Joao", 2000, 800, "Banrisul");
        
        minhaConta[0].imprimeDados();
        minhaConta[1].imprimeDados();
        
        minhaConta[0].deposita(1200);
        minhaConta[0].imprimeSaldo();
        
        minhaConta[0].saca(100);
        minhaConta[0].imprimeSaldo();
        
        minhaConta[0].transfere(minhaConta[1], 50);
        minhaConta[0].imprimeDados();
        minhaConta[1].imprimeDados();
        
        
        funcionarios = new Funcionario("Luisa", "Funcionario Fantasma", 50000, "10/10/2010", "99887765");
        funcionarios.imprime();
        ganho = funcionarios.calculaGanhoAnual();
        System.out.println("Ganho anual: R$" + ganho);
        
        funcionarios.recebeAumento(2000);
    }
}
