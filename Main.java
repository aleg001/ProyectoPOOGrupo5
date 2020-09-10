
  /*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 8/09/2020
					
Driver program que desarrolla el simulador de 
Samaj-20
*****************/

import java.util.Scanner;
import java.util.Arrays;

//Main driver program menu principa;
public class Main {
  public static void main(String[] args) {
    
    //Instancias
    Scanner scan = new Scanner(System.in);

    //Atributos
    int opcion = 0; 
    int subop = 0; 
    int o_user;
    int menu;
    int submenu;
    
    //Desplegar opciones del menu
    System.out.println( "Bienvenido a Samaj-20 " );
    System.out.println( "1. Crear perfil" );
    System.out.println( "2. Buscar trabajo" );
    System.out.println( "3. Publicar trabajo" );
    System.out.println( "4. Consejos" );
    System.out.println( "5. Salir" );
    System.out.println( "Ingrese el número de opcion: " );
    menu = scan.nextInt();
        
        
    //inicializar ciclo para menú
    while ( menu != 5 ) {
      if ( menu == 1 ) {
        System.out.println( "CREACION DE PERFIL");
        System.out.println( "1. Crear perfil para trabajo bajo contrato" );
        System.out.println( "2. Crear perfil para un trabajo temporal" );
        submenu = scan.nextInt();
      if ( submenu ==1 ) {
        System.out.println( "Trabajo bajo contrato" );
        System.out.println("Ingrese su nombre");
        System.out.println("Ingrese su apellido");
        System.out.println("Ingrese su edad");
        System.out.println("Ingrese su correo");
        System.out.println("Ingrese su nivel de educacion");
        System.out.println("Primaria/Secundaria/Universitaria/Posgrado");
        System.out.println("Experiencia laboral (SI/NO)");
        System.out.println("Idiomas");
        System.out.println("Transporte (SI/NO)");
        
      }
      if ( submenu ==2 ) {
        System.out.println( "Trabajo temporal" );
        System.out.println("Ingrese nombre:");
        System.out.println("Ingrese nombre apellido:");
        System.out.println("Area de conocimiento: ");
        System.out.println("Numero de telefono: ");
        
        

      }                     
      if ( opcion == 2 ) {
       System.out.println( "BUSCAR TRABAJO");
       
       
      
      }

    
      else if ( menu == 5 ) {
       System.out.println( "Usted ha salido del programa." );
       System.out.println( "Creditos: Alejandro Gomez (Alecraft), Alejandra Guzman (Ale), Paola de León Molina (Pao de 30 milimetros), Marco Jurado El Buki,Andres Osorialias 'avatar'. "); }
      }
    }
  }
}