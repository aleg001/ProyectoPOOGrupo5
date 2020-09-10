/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 8/09/2020
					
Clase que trabaja con el perfil del trabajador formal
Samaj-20
*****************/

public class TrabajadorFormal {

  //Atributos
  private String Nombre;
  private String Apellido;
  private int Edad;
  private int Telefono;
  private String Correo;
  private int NivelEducacion;
  private int Idiomas;
  private boolean Experiencia;
  private boolean Transporte;
  private boolean HomeOffice;
  
  //Metodos
String arrayofNombre [] = new String[numofnombres];
  for (int i= 0; i < arrayofNombre.lenght; i++){
    arrayofNombre[i]= scan.nextLine();}
    
String arrayofApellido [] = new String[numofapellido];
for (int a= 0; a< arrayofApellido.lenght; a++){
  arrrayofApellido[a]= scan.nextLine;} 
  
int arrayofedad [] = new int[numofedad];
for (int b= 0; b< arrayofedad.lenght; b++){
  arrayofedad[b]= scan.nextLine;} 

int arrayoftelefono [] = new int[numofedad];
for (int d= 0; d< arrayoftelefono.lenght; d++){
  arrayoftelefono[d]= scan.nextLine;} 

String arrayofcorreo [] = new String[numofedad];
for (int e= 0; e< arrayofApellido.lenght; e++){
  arrrayofApellido[e]= scan.nextLine;} 

int arrayofnivelE [] = new int[numofnivelE];
for (int f= 0; f< arrayofnivelE.lenght; f++){
  arrayofnivelE[f]= scan.nextLine;} 

int arrayofidiomas [] = new int[numofidiomas];
for (int g= 0; g< arrayofidiomas.lenght; g++){
  arrayofidiomas[g]= scan.nextLine;} 

boolean arrayofEL [] = new boolean[numofEL];
for (int h= 0; h< arrayofEL.lenght; h++){
  arrayofEL[h]= scan.nextLine;} 

boolean arrayofTrans [] = new boolean[numofTrans];
for (int j= 0; j< arrayofTrans.lenght; j++){
  arrayofTrans[j]= scan.nextLine;} 

boolean arrayofHE [] = new boolean[numofHE];
for (int z= 0; z< arrayofHE.lenght; z++){
  arrayofHE[z]= scan.nextLine;} 

  //Getters

  public String getNombre(){
    return Nombre;
    }
  public String getApellido(){
    return Apellido;
    }
  public int getTelefono(){
    return Telefono;
    }
  public String getCorreo(){
    return Correo;
    }
  public int getNivelEducacion(){
    return NivelEducacion;
    }
  public int getIdiomas(){
    return Idiomas;
    }
  public boolean getTransporte(){
    return Transporte;
    }
  public boolean getHomeOffice(){
    return HomeOffice;
    }

  //Setters
  public String setNombre(String Nombre){
      this.Nombre = Nombre;
      return Nombre;
    }
  public String setApellido(String Apellido){
      this.Apellido = Apellido;
      return Apellido;
    }
  public int setTelefono(int Telefono){
      this.Telefono = Telefono;
      return Telefono;
    }
  public String setCorreo(String Correo){
      this.Correo = Correo;
      return Correo;
    }
  public int setNivelEducacion(int NivelEducacion){
      this.NivelEducacion = NivelEducacion;
      return NivelEducacion;
    }
  public int setIdiomas(int Idiomas){
      this.Idiomas = Idiomas;
      return Idiomas;
    }
  public boolean setExperiencia(boolean Experiencia){
      this.Experiencia = Experiencia;
      return Experiencia;
    }
  public boolean setTransporte(boolean Transporte){
      this.Transporte = Transporte;
      return Transporte;
    }
  public boolean setHomeOffice(boolean HomeOffice){
      this.HomeOffice = HomeOffice;
      return HomeOffice;
    }

//METODO COPIADO DE STACKOVERFLOW
public static Integer edit(String [] list, Integer listSize){
    Scanner userInput = new Scanner(System.in);
    System.out.print("Ingrese la informacion que desea : ");

        Integer row = userInput.nextInt();
        System.out.print("Ingrese el dato a modificar: ");
        String name = userInput.nextLine();
        list[row] = name + ", " + number; 
    
    return listSize ;
}

}