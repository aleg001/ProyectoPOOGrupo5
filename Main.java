
  /*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 9/09/2020
					
Driver program que desarrolla el simulador de 
Samaj-20
*****************/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

//Main driver program menu principa;
public class Main {
  public static void main(String[] args) {
    
    //Instancias
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    //Atributos
    int opcion = 0; 
    int subop = 0; 
    int o_user;
    int menu;
    int submenu1;
    boolean salir = false;
    
    //Desplegar opciones del menu
    System.out.println( "Bienvenido a Samaj-20 " );
    System.out.println( "1. Crear/editar perfil" );
    System.out.println( "2. Buscar trabajo" );
    System.out.println( "3. Publicar trabajo" );
    System.out.println( "4. Consejos" );
    System.out.println( "5. Salir" );
    System.out.println( "Ingrese el número de opcion: " );
    menu = scan.nextInt();
    
        
        
    //inicializar ciclo para menú
    while ( salir == false ) {
      if ( menu == 1 ) {
        System.out.println( "CREACION/ EDICIÓN DE PERFIL");
        System.out.println( "1. Crear perfil para trabajo bajo contrato" );
        System.out.println( "2. Crear perfil para un trabajo temporal" );
        System.out.println("3. Modificar perfil de trabajador bajo contrato");
        System.out.println("4. Modificar perfil de trabajador temporal");
        System.out.println("5. Salir a menú principal");
        
        //Sub menú crear perfil
        boolean salirSub1 = false;
        submenu1 = scan.nextInt();
        while(salir == false){
          if (submenu1 == 1){//Crear perfil TrabajadorFormal
            System.out.println( "----------Trabajo bajo contrato----------" );
            //Pedirle los datos para la creación de su perfil al usuario.
            System.out.println("Ingrese su nombre");
            String TrabajadorFN = scan.nextLine();
            
            System.out.println("Ingrese su apellido");
            String TrabajadorFA = scan.nextLine();
              
            System.out.println("Ingrese su edad");
            int TrabajadorFI = scan.nextInt();

            System.out.println("Ingrese su correo");
            String CorreoFC = scan.nextLine();
              
            System.out.println("Ingrese su nivel de educacion");
            System.out.println("1. Primaria \n 2. Secundaria \n 3. Universitaria \n 4. 4. Posgrado");
            int TrabajadorFE = scan.nextInt();
              
            System.out.println("Experiencia laboral (SI/NO)");
            String ingreso = scan.nextLine();
            ingreso = ingreso.toLowerCase();
            boolean TrabajadorFL;
            if (ingreso == "si"){ //Verifica el ingreso para asignarle un valor a la variable TrabajadorFL.
              TrabajadorFL = true;
            } 
            else if (ingreso == "no"){
              TrabajadorFL = false;
            }
              
            System.out.println("Ingrese el idioma de su dominio que desea mostrar en su perfil.");
            System.out.println("1. Español \n 2.Ingles \n 3.Aleman \n 4.Frances \n 5. Mandarín\n 6. Portugues\n 7. Otros")
            int idiom = scan.nextInt();
              
            System.out.println("Transporte (SI/NO)");
            String ingresoT = scan.nextLine();
            ingresoT = ingresoT.toLowerCase();
            boolean TrabajadorFT;
            if (ingresoT == "si"){ //Verifica el ingreso para asignarle un valor a la variable TrabajadorFT.
            TrabajadorFT = true;
            } 
            else if (ingresoT == "no"){
            TrabajadorFT = false;
            }

            System.out.println("Cuenta con herramientas de Homeoffice? (SI/NO)");
            String ingresoHO = scan.nextLine();
            ingresoHO = ingresoHO.toLowerCase();
            boolean TrabajadorHO;
            if (ingresoHO == "si"){ //Verifica el ingreso para asignarle un valor a la variable TrabajadorHO.
            TrabajadorHO = true;
            } 
            else if (ingresoHO == "no"){
            TrabajadorHO = false;
              
            //Construir TrabajadorF y subir su perfil a la base de datos.
            TrabajadorFormal entacuchado = new TrabajadorFormal(TrabajadorFN, TrabajadorFA, TrabajadorFI, inttel, CorreoFC, TrabajadorFE, idiom, TrabajadorFL, TrabajadorFT, TrabajadorHO, int cod);
            }
            entacuchado.SubirPerfil (entacuchado);// Subiendo perfil...

          }
          else if (submenu1 == 2){//Crear perfil TrabajadorInformal
            //Se despliega la informacion a solicitar al usuario:
            System.out.println( "Trabajo temporal" );
            System.out.println("Ingrese nombre:");
            String TrabajadorIN = scan.nextLine();
            System.out.println("Ingrese nombre apellido:");
            String TrabajadorIA = scan.nextLine();
            System.out.println("Area de conocimiento: ");
            String TrabajadorIC = scan.nextLine();
            System.out.println("Numero de telefono: ");
            int TrabajadorIN = scan.nextInt();
              
          }
          else if (submenu1 == 3){}
          else if (submenu1 == 4){}
          else if (submenu1 == 5){//Salir al menú principal.

          }
          else {
            System.out.println("Opción invalida, por favor intente de nuevo.");
          }
        }
      }                     
      else if ( menu == 2 ) {
       System.out.println( "BUSCAR TRABAJO");
  
      }
      else if (menu == 3){
        
      }

    
      else if ( menu == 5 ) {
       System.out.println( "Usted ha salido del programa." );
       System.out.println( "Creditos: Alejandro Gomez (Alecraft), Alejandra Guzman (Ale), Paola de León Molina (Pao de 30 milimetros), Marco Jurado El Buki,Andres Osorialias 'avatar'. ");
       salir = true;
        }
      }
    }
  }
}