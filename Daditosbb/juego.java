package Daditosbb;

public class juego {
    
    public int comprobar(dados daditos){
        
        int resultado;
        resultado = daditos.getDado1() + daditos.getDado2();
        if((resultado == 7)||(resultado == 11)){
           System.out.println("========== Has ganado :D ==============="); 
        }else if((resultado == 2)||(resultado == 3)||(resultado == 12)){
            System.out.println("===========Has perdido :( ==============");
        }else if((resultado == 4)||(resultado == 5)||(resultado == 6)||(resultado == 8)||(resultado == 9)||(resultado == 10)){
            System.out.println("Puntos acumulados, deseas intentarlo de nuevo?"); 
        }  
        return resultado;  
    }
      
}
