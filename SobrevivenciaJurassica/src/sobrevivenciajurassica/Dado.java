package sobrevivenciajurassica;

import java.util.Random;

public class Dado {
    private static Random random = new Random();
    
    public static int dado6(){
        return random.nextInt(6) + 1;
    }
    
    public static int dado3(){
        return random.nextInt(3) + 1;
    }
    
    public static int dado4(){
    return random.nextInt(4) + 1; 
    }
    
    public static int dado100(){
        return random.nextInt(100) + 1; //colocar parede
    }
    
    public static int dado20(){
        return random.nextInt(20); //gerar índices aleatórios p matriz
    }
}
