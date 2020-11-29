/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author USUARIO PC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int contador=1;
        int contador2;
        String cadenaF="";
        for(contador2=1;contador2<=7;contador2++){
            if(contador%2==0){
                contador = contador + 1;
            cadenaF= String.format("%s+1/%d ", cadenaF,contador);
        }else{
                contador = contador + 2;
            cadenaF= String.format("%s-1/%d ", cadenaF,contador);
                
            }
            contador2=contador2+1;
            contador=contador+1;
        }
        System.out.printf("1 %s",cadenaF);
    }
    
}

    
    

