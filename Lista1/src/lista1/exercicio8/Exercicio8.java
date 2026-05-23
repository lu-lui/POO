package lista1.exercicio8;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];
        int resultado;
        Operacoes op = new Operacoes(); //instancia o objeto
        
       for (int i=0; i<5; i++){
           System.out.print("Valor " + i + ": ");
            valores[i] = scanner.nextInt();
       }
       
       op.Soma(valores);
       op.Media(valores);
       op.Maximo(valores);
       op.Minimo(valores);
    }
}
