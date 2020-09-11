/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 8/09/2020
					
Clase que trabaja con el perfil del trabajador formal
Samaj-20
*****************/
import java.util.Array;

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
  private int Codigo;
  
// Metodos

// Constructor
  public TrabajadorFormal(String nom, String ape, int eda, int tel, String cor, int niv, int idi, boolean exp, boolean tra, boolean hom, int cod){
    Nombre = nom;
    Apellido = ape;
    Edad = eda;
    Telefono = tel;
    Correo = cor;
    NivelEduacion = niv;
    Idiomas = idi;
    Experiencia = exp;
    Transporte = tra;
    HomeOffice = hom;
    codigo = cod;
  }

// Método para mostrar la información de un trabajador informal
  public String InfoFormal ( TrabajadorFormal a ) {

    mensaje = " Información de trabajador formal: \n";
    mensaje += "\n- Nombre y apellido: " + a.getNombre (); + " " + a.getApellido ();
    mensaje += "\n- Edad: " + a.getEdad ();
    mensaje += "\n- Telefono: " + a.getTelefono ();
    mensaje += "\n- Correo: " + a.getCorreo ();
    
    //Se utiliza la informacion relevante al nivel de educacion
    int NivelEducacion = a.getNivelEducacion ();
    switch ( NivelEducacion ) {
      case 1:
        mensaje += "\n- Nivel de educacion: Primaria";
      case 2:
        mensaje += "\n- Nivel de educacion: Secundaria";
      case 3:
        mensaje += "\n- Nivel de educacion: Universitaria";
      case 4:
        mensaje += "\n- Nivel de educacion: Postgrado";
    }
    //Se utiliza la informacion relevante al idioma de conocimiento
    int Idiomas = a.getIdiomas ();
    switch ( Idiomas ) {
      case 1:
        mensaje += "\n- Idioma de conocimiento: Español";
      case 2:
        mensaje += "\n- Idiomas de conocimiento: Ingles";
      case 3:
        mensaje += "\n- Idiomas de conocimiento: Aleman";
      case 4:
        mensaje += "\n- Idiomas de conocimiento: Frances";
      case 5:
        mensaje += "\n- Idiomas de conocimiento: Mandarin";
      case 6:
        mensaje += "\n- Idiomas de conocimiento: Portugués";
      case 7:
        mensaje += "\n- Idiomas de conocimiento: Otros";
    }

    Boolean Experiencia = a.getExperiencia();
    if ( Experiencia == true ) {
      mensaje += "\n- Experiencia: Sí";
    }
    else {
      mensaje += "\n- Experiencia: No";
    }

    Boolean Transporte = a.getTransporte();
    if ( Transporte == true ) {
      mensaje += "\n- Transporte: Sí";
    }
    else {
      mensaje += "\n- Transporte: No";
    }

    Boolean HomeOffice = a.getHomeOffice();
    if ( HomeOffice == true ) {
      mensaje += "\n- Cuenta con herramientas para home office:: Sí";
    }
    else {
      mensaje += "\n- Cuenta con herramientas para home office: No";
    }

    mensaje += "\n- Codigo: " + a.getCodigo ();

    return mensaje;
  }

  //Getters
  public String getNombre () {
    return Nombre;
    }
    
  public String getApellido () {
    return Apellido;
    }

  public String getEdad() {
    return Edad;
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
  public void setNombre(String Nombre){
      this.Nombre = Nombre;
     
    }

  public void setApellido(String Apellido){
      this.Apellido = Apellido;
     
    }

  public void setTelefono(int Telefono){
      this.Telefono = Telefono;
     
    }

  public void setCorreo(String Correo){
      this.Correo = Correo;
     
    }

  public void setNivelEducacion(int NivelEducacion){
      this.NivelEducacion = NivelEducacion;
      
    }

  public void setIdiomas(int Idiomas){
      this.Idiomas = Idiomas;
  
    }

  public void setExperiencia(boolean Experiencia){
      this.Experiencia = Experiencia;
   
    }

  public void setTransporte(boolean Transporte){
      this.Transporte = Transporte;
   
    }
    
  public boolean setHomeOffice(boolean HomeOffice){
      this.HomeOffice = HomeOffice;
      
    }

// METODO COPIADO DE STACKOVERFLOW
public static Integer edit ( String [] list, Integer listSize ) {
    System.out.print ( "Ingrese la informacion que desea : " );

        Integer row = userInput.nextInt();
        System.out.print("Ingrese el dato a modificar: ");
        String name = userInput.nextLine();
        list[row] = name + ", " + number; 
    
    return listSize ;
}

public void SubirPerfil ( TrabajadorFormal TF ) {
  //Tipo Función
  Documentos.obtenerPerfil(TF);
  //Se podría probar también ----> Documentos.obtenerPerfil(this.TrabajadorFormal); para obviar el argumento TrabajadorFormal TF.
}

public void ModificarPerfil(int seleccion, int cambioN){
  
}

public void ModificarPerfil(int seleccion, String cambioS){

}


}