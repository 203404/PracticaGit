package Daditosbb;

import java.util.Scanner;

public class testDaditos {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        juego daditos = new juego();
        dados dadoJ = new dados();
        System.out.println("================JUEGO DE DADOS================");
        System.out.println("------------------------------");
        do{
            System.out.println("ingresa el dado 1:");
        
            dadoJ.setDado1(entrada.nextInt()); 
        }while(dadoJ.getDado1()<0 || dadoJ.getDado1()>7);
        
        System.out.println("---------------------------");
        do{
        System.out.println("ingresa el dado 2: ");
        System.out.println("---------------------------");
        dadoJ.setDado2(entrada.nextInt());
        }while(dadoJ.getDado2()<0 || dadoJ.getDado2()>7);  
        
        System.out.println(daditos.comprobar(dadoJ));
    }
}
