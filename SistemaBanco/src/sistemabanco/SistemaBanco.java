package sistemabanco;

public class SistemaBanco {
    public static void main(String[] args) {
        Conta minhaConta[] = new Conta[2]; //inicialização do vetor
        
        minhaConta[0] = new Conta(1234, "Maria", 0, 1000);
        minhaConta[1] = new Conta(5678, "Joao", 2000, 800);
        
        minhaConta[0].imprimeDados();
        minhaConta[1].imprimeDados();
        
        minhaConta[0].deposita(1200);
        minhaConta[0].imprimeSaldo();
        
        minhaConta[0].saca(100);
        minhaConta[0].imprimeSaldo();
        
        
        minhaConta[0].imprimeDados();
        minhaConta[1].imprimeDados();
        minhaConta[0].transfere(minhaConta[1], 66);
        minhaConta[0].imprimeDados();
        minhaConta[1].imprimeDados();
    }
}
