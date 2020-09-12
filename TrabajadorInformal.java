/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Clase que trabaja con el perfil del trabajador informal
Samaj-20
*****************/

public class TrabajadorInformal {

  //Variables de instancia
  private int CodigoID;
  private String Nombre;
  private String Apellido;
  private String AreaConocimiento;
  private int Telefono;
  
  //Constructor
  public TrabajadorInformal (int initCodigoID, String initNombre, String initApellido, String initAreaConocimiento, int initTelefono ){

    this.CodigoID = initCodigoID;
    this.Nombre = initNombre;
    this.Apellido = initApellido;
    this.AreaConocimiento = initAreaConocimiento;
    this.Telefono = initTelefono;
  }

  // Getters
  public int getCodigoID () { return CodigoID; }
  public String getNombre () { return Nombre; }
  public String getApellido () { return Apellido; }
  public String getAreaConocimiento () { return AreaConocimiento; }
  public int getTelefono () { return Telefono; }

  // Setters
  public int setCodigoID ( int a ) { CodigoID = a; return CodigoID; }
  public String setNombre ( String a ) { Nombre = a; return Nombre; }
  public String setApellido ( String a ) { Apellido = a; return Apellido; }
  public String setAreaConocimiento ( String a ) { AreaConocimiento =  a; return AreaConocimiento; }
  public int setTelefono ( int a ) { Telefono = a; return  Telefono; }

  //toString metodo que regresara la informacion de la cuenta
  public String toString( TrabajadorInformal a ) {
    String result = "";
    result = "\n Codigo ID:" + a.getCodigoID() + "\n Nombre: " + a.getNombre() + "\n Apellido: " + a.getApellido() + "\n Areadeconocimiento" + a.getAreaConocimiento() + "\n Telefono:" + a.getTelefono();
    
    return result;
  }
  public void SubirPerfil ( TrabajadorInformal TI ) {
  //Tipo Función
  Documentos.obtenerPerfil(TI);
  //Se podría probar también ----> Documentos.obtenerPerfil(this.TrabajadorFormal); para obviar el argumento TrabajadorFormal TF.
  } 


}