package sistemabanco;

public class SistemaBanco {
    public static void main(String[] args) {
        boolean consegui;
        boolean limite;
        Conta minhaConta;
        
        minhaConta = new Conta();
        minhaConta.dono = "Maria";
        minhaConta.numero = 1324;
        minhaConta.imprimeDados();
        minhaConta.deposita(1200);
        minhaConta.imprimeSaldo();
        
        consegui = minhaConta.saca(100);
        
        if(consegui == true)
            System.out.println("Saque realizado com sucesso!");
        
        minhaConta.imprimeSaldo();
    }
}
