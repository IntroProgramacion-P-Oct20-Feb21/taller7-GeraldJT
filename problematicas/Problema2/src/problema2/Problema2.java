/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author USUARIO PC
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=1;
        int contador=4;
        int i=2;
        do{
            System.out.printf("%d ",i);
            i= i+contador;
            contador= contador+2;
            numero=numero+1;
        }while(numero<=10);
    }
    
}
