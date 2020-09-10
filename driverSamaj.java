 /*****************
Proyecto Semenstral
Autor: Alejandro Gómez 20347, Marco Jurado, Paola De Leon, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 8/09/2020
					
Driver program que desarrolla el simulador de 
Samaj-20
*****************/

import java.util.Scanner;
import java.util.Arrays;


//Main driver program menu principa;
public class driverSamaj {
    public static void main(String[] args){
        //Instancias
        Scanner scan = new Scanner(System.in);
        //Atributos
        int opcion = 0; 
        int subop = 0; 
        int o_user;
        int menu;
        int submenu;
        
        //Desplegar opciones del menu
        System.out.println("Bienvenido a Samaj-20 ");
        System.out.println("1. Crear perfil");
        System.out.println("2. Buscar trabajo");
        System.out.println("3. Publicar trabajo");
        System.out.println("4. Consejos");
        System.out.println("5. Salir");
        System.out.println("Ingrese el número de opcion: ");
        menu = scan.nextInt();
        
        
        //inicializar ciclo para menú
        while (menu != 5){
            if (menu == 1){
              System.out.println("CREACION DE PERFIL");
              System.out.println("Crear perfil para trabajo bajo contrato");
              System.out.println("Crear perfil para un trabajo temporal");
              submenu = scan.nextInt();
              if (submenu ==1){
                System.out.println("Trabajo bajo contrato");
              }
              if (submenu ==2){
                System.out.println("Trabajo temporal");
              }
              
               
                                
            if (opcion == 2){
                System.out.println("BUSCAR TRABAJO");
                    }
                else if (menu == 5){
                    System.out.println("Usted ha salido del programa.");
                    System.out.println("Creditos: Alejandro Gomez (Ale), Alejandra Guzman (Ale), Paola de León Molina (Pao), Marco Jurado El Buki, Andres Osorio alias 'avatar'. ");
                    
}}}}}