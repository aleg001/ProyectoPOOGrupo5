/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 8/09/2020
					
Clase que trabaja con el trabajador informal
Samaj-20
*****************/

class TrabajadorInformal {
public class Informal{
  //Variables de instancia
  private int CodigoID;
  private String Nombre;
  private String Apellido;
  private String AreaConocimiento;
  private int Telefono;

  //Constructor
  public TrabajadorInformal(int initCodigoID, string initNombre, string initApellido, string initAreaConocimiento, int initTelefono ){

    codigoID= initCodigoId;
    Nombre = initNombre;
    Apellido = initApelllido;
    AreaConocimiento = initAreaconocimiento;
    Telefono = initTelefono;


  }

  //toString metodo que regresara la informacion de la cuenta
  public String toString(){
    String result = "";
    resultado = "\n Codigo ID:" + codigoID + "\n Nombre: " + Nombre + "\n Apellido: " + Apellido + "\n Areadeconocimiento" + AreaConocimiento + "\n Telefono:" + Telefono;
    return resultado;
    
  }

}

  //Metodos
  
}