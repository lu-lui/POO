package lista1.exercicio8;

public class Operacoes {
    double resultado = 0;
    
    public void Soma(int[] valores){
        for (int i=0; i<5; i++){
            this.resultado += valores[i]; 
        }
        System.out.println("Soma: " + this.resultado);
    }
    
    public void Media(int[] valores){
        int soma = 0;
        for (int i=0; i<5; i++){
            soma += valores[i]; 
        }
        this.resultado = (double) soma / 5;
        System.out.println("Media: " + this.resultado);
    }
    
    public void Maximo(int[] valores){
        this.resultado = valores[0];
        
        for (int i=1; i<5; i++){
            if (this.resultado < valores[i]){
                this.resultado = valores[i];
            } 
        }
        System.out.println("Maximo: " + this.resultado);
    }
    
    public void Minimo(int[] valores){
        this.resultado = valores[0];
        
        for (int i=1; i<5; i++){
            if (this.resultado > valores[i]){
                this.resultado = valores[i];
            } 
        }
        System.out.println("Minimo: " + this.resultado);
    }
    
}
