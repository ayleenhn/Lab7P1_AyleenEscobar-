package lab7p1_ayleenescobar;
import java.util.Scanner;
import java.util.Random;

public class Lab7P1_AyleenEscobar {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran=new Random();
        
        boolean respuesta = true;
        while (respuesta){
            System.out.println("Menu");
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.SALIR");
            System.out.println("Ingrese su opcion: "); 
        
        int opcion = 0;
        opcion = sc.nextInt();
        
        switch (opcion){
            case 1: {
                
                
            }
            case 2:{
                System.out.println("Elija que quiere usar: ");
                System.out.println("1.Tijeras");
                System.out.println("2.Roca");
                System.out.println("3.Spock");
                System.out.println("4.Lizard");
                System.out.println("5.Paper");
                int resp= sc.nextInt();
               int resp2= ran.nextInt(6-1)+1;
               switch (resp2){
                    case 1: {
                       System.out.println("La maquina eligio Tijeras.");
                    }
                    break;
                    case 2: {
                       System.out.println("La maquina eligio Roca.");
                    }
                    break;
                    case 3: {
                       System.out.println("La maquina eligio Spock.");
                    }
                    break;
                    case 4: {
                       System.out.println("La maquina eligio Lizard.");
                    }
                    break;
                    case 5: {
                       System.out.println("La maquina eligio Paper.");
                    }
                    break;
                }
                int[][] matriz =  {{0,3,3,1,1},
                                  {1,0,3,1,3},
                                  {1,1,0,3,3},
                                  {3,3,2,0,1},
                                  {3,1,1,3,0}};
                int ganar=matriz[resp-1][resp2-1];
                if (ganar==1){
                    System.out.println("Jugador gana!"); 
                }else{
                    if (ganar==3){
                    System.out.println("Maquina gana!"); 
                }else{
                     if (ganar==0){
                    System.out.println("EMPATE!"); 
                } 
            }
                }}
            
            case 3:{
                respuesta = false;
            } break;
        
        }
    }
    }
}
    
