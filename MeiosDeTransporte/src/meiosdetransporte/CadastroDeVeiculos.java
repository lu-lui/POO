package meiosdetransporte;

public class CadastroDeVeiculos {
    private Veiculo[] lista;
    int qtdVeiculos;
    
    public CadastroDeVeiculos(int tamanho){
        lista = new Veiculo[tamanho];
        qtdVeiculos = 0;
    }
    
    public CadastroDeVeiculos(){
        this(10); //vetor de tamanho 10
    }
    
    public void inserir(Veiculo v){
        if(qtdVeiculos == lista.length){
            Veiculo[] novaLista = new Veiculo[lista.length * 2]; //duplica capacidade
            for (int i=0; i < lista.length; i++){
                novaLista[i] = lista[i];
            }
            lista = novaLista;
        }
        lista[qtdVeiculos++] = v; //recebe e depois incrementa
    }
    
    public Veiculo retornaItem(int p){
        if(p >= 0 && p < qtdVeiculos){
            return lista[p];
        }
        return null;
    }
    
    public int tamanho(){
        return qtdVeiculos;
    }
    
    public void imprimir(){
        System.out.println("-----Veiculos-----");
        for(int i = 0; i < qtdVeiculos; i++){
            lista[i].imprimirInformacoes();
        }
    }
}
