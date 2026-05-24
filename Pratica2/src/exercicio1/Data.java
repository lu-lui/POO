package exercicio1;

public class Data {
    private final int dia; //variaveis public final são acessadas em qualquer lugar do programa e depois de instanciadas, não podem ser ateradas
    public final int mes;
    public final int ano;
    
    public Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    public Data(){
        /*
        dia = 1;
        mes = 1;
        ano = 2000;
        */
        this(1, 1, 2000);
    }
    
    public String getData(){
        String data = new String (dia + "/" + mes + "/" + ano);
        return data;
    }
    
    //Diferença em anos
    public int calcularDiferenca(Data atual){
        int diferenca = atual.ano - this.ano;
        if(atual.mes < this.mes)
            diferenca--;
        else if(atual.mes == this.mes && atual.dia < this.dia)
            diferenca--;
        return diferenca;
    }
}