package estudosprova2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudosProva2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try { //tenta executar isso, se ocorrer exceeção, executa o catch
            String[] vect = sc.nextLine().split(" "); //vetor de strings recebe palavras separadas por espaços
            int position = sc.nextInt(); //pode gera excessão se ler um valor que não está no vetor, ou lr um char por eexemplo
            System.out.println(vect[position]); //sistema mostra a string na posição indicada
        }
        catch (ArrayIndexOutOfBoundsException e){ //erro de índice do vetor
            System.out.println("Invalid Position");
        }
        catch (InputMismatchException e) { //erro de valor digitado (char ao invés de int por exemplo)
            System.out.println("Input Error");
        }
        
        System.out.println("End of Program");
        
        sc.close();
    }
    
}
