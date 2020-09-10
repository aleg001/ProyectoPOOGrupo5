/*****************
Proyecto Semenstral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio 20821, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 1/09/2020
					
Clase que simulará un empleado en el proyecto semestral:
Samaj-20
*****************/

import java.util.ArrayList;

public class Empleador {

  //Propiedades
  private ArrayList<TrabajoTemp> TrabajoInformal; // Lista que almacenará los trabajos informales creados por el empleador.
  private String Nombre; // Nombre del empleador formal o informal
  private int Contacto; // Número al que se puede contactar al empleador
  private int Codigo; // Código único del empleador
  private boolean Formal = false; // Si el empleador es Empleador de un trabajo formal eel boolean es trues true.
  
  //Constructor para crear un EmpleadorFormal
  public Empleador( String Nombre, int Contacto, int Codigo, boolean FI ) {
    this.Nombre = Nombre;
    this.Codigo = Codigo;
    this.Contacto = Contacto;
    this.Formal = true;
  }

  //Constrcutor para crear un EmpleadorInformal
  public Empleador ( String Nombre, int Contacto, int Codigo ) {
    TrabajoInformal = new ArrayList<TrabajoTemp>();
    this.Nombre = Nombre;
    this.Codigo = Codigo;
    this.Contacto = Contacto;
  }

  //Getters
  public String getNombre () { return Nombre; }
  public int getContacto () { return Contacto; }
  public int getCodigo () { return Codigo; }
  public ArrayList<TrabajoTemp> getTrabajoInformal () { return TrabajoInformal; 
  }

  //Setters
  public String setNombre ( String a ) { Nombre = a; return Nombre; }
  public int setContacto ( int a ) { Contacto = a; return Contacto; }
  public int setCodigo ( int a ) { Codigo = a; return Codigo; }
  public ArrayList<TrabajoTemp> setTrabajoInformal ( ArrayList<TrabajoTemp> a ) { TrabajoInformal = a; return TrabajoInformal; }

/* 
NOTAS PARA ELABORACIÓN DE CODIGO FUENTE 
//Main
int VARIABLE = Documentos.buscar();
if (VARIBALE == 0) {
  print("Usuario no encontrado")
}
if (VARIBALE == 1) {
  Obtener(codigo); 
  }
}

//Eliminar objeto de arraylist del main
int num = documentos.buscar(codigo)
Objeto objeto = null;
if(num == 1){
  objeto = documentos.obtener(int)

  documentos.eliminar(objeto)
}
else if(num == 0){
  print("Error en encontrar objeto")
}



//Documentos 

Buscar(int codigo) {
  int i;
  for (i = 0; i< sizeARRAYLIST; i++){
      if (codigo == ArrayList[i].getCodigo()){
        return 1
      }
      else{
        return 0
      }
  }

} 

//Docuementos
Objeto Obtener (int codigo) {
  Objeto objeto = null;
  for (i = 0; i< sizeARRAYLIST; i++){
    if (codigo == Arraylist[i].getCodigo()) {
     objeto = ArrayList[i];
    }
  return objeto;
}



void eliminar(Objeto objeto){
  for (i = 0; i< sizeARRAYLIST; i++){
    if (objeto == Arraylist[i]){
      Arraylist[i].ELIMINAR
    }
  }
}
*/
}
