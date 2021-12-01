/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.ut01;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class NumeroSuerte {

    /**
     * @param args the command line arguments
     */
    
    public static int calculaNumSuerte(String fecha){
        int numSuerte = 0;
        
        int dia = Integer.parseInt(fecha.substring(0, fecha.indexOf("/")));
        int mes = Integer.parseInt(fecha.substring(fecha.indexOf("/")+1,fecha.lastIndexOf("/")));
        int anio = Integer.parseInt(fecha.substring(fecha.lastIndexOf("/")+1));
        
        //sumaTemporal tendrá el valor 1996 para la fecha 13/03/1980
        int sumaTemporal = dia+mes+anio;
        //Suma última cifra
        //Para el ejemplo 1996, numSuerte tendrá 6
        numSuerte = sumaTemporal%10;
        
        sumaTemporal /= 10; //sumaTemporal tendrá el valor 199
        
        numSuerte += sumaTemporal%10; //numSuerte tendrá 6+9
        sumaTemporal /= 10; //sumaTemporal tendrá el valor 19
        
        numSuerte+= sumaTemporal%10; //numSuerte tendrá 6+9+9
        sumaTemporal /=10; //sumaTemporal tendrá el valor 1
        
        numSuerte += sumaTemporal%10; //numSuerte tendrá el valor 6+9+9+1
        
        return numSuerte;                
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la fecha de nacimiento: ");
        String fecha = teclado.nextLine();
        
        int numSuerte = calculaNumSuerte(fecha);
        System.out.println("El número de la suerte es " + numSuerte);                
    }
    
}
