/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Clase que se encarga de tener todo lo relacionado
con los metodos para documentos
*****************/

import java.util.ArrayList;
import java.util.Random;

public class Documentos {
	//Propiedades de clase
	public static ArrayList<TrabajadorFormal> BaseTF;
	public static ArrayList<TrabajadorInformal> BaseTT;
	public static ArrayList<Empleador> BaseEF;
	public static ArrayList<Empleador> BaseET;
	
	//Métodos
  public Documentos(){
    ArrayList<TrabajadorFormal> BaseTF = new ArrayList<TrabajadorFormal>();
    ArrayList<TrabajadorInformal> BaseTT = new ArrayList<TrabajadorInformal>();
    ArrayList<Empleador> BaseEF = new ArrayList<Empleador>();
    ArrayList<Empleador> BaseET = new ArrayList<Empleador>();
  }

  // Getters
  public static void obtenerPerfil(TrabajadorFormal TF){
    BaseTF.add(TF);
  }
  public static ArrayList<Empleador> getET(){
		return BaseET;
	}
  public static ArrayList<Empleador> getEF(){
    return BaseEF;
  }
  public static ArrayList<TrabajadorInformal> getTT(){
    return BaseTT;
  }
  public static ArrayList<TrabajadorFormal> getTF(){
    return BaseTF;
  }

	/*public int BuscarTrabajadorFormal(int codigo){ 
    int Cod = 0;
    //Método para buscar un trabajador Formal en ArrayList.
		for (int i = 0; i< BaseTF.size(); i++){//Se recorre el listado y se busca el código igual.
			TrabajadorFormal entacuchado = BaseTF.get(i);
			if (codigo == entacuchado.getCodigo()) {
				Cod = 1;//Devuelve 1 como signo de que encontro el objeto
			} else {
				//No encontró el objeto. Devuelve 0
			}
		}
    return Cod;
	}

	public int BuscarTrabajadorTemporal(int codigo){ //Método para buscar un trabajador Temporal en ArrayList
		for (int i = 0; i< BaseTT.size(); i++){//Se recorre el listado y se busca el código igual.
			TrabajadorInformal don = BaseTT.get(i);
			if (codigo == don.getCodigo()){
				return 1;//Devuelve 1 como signo de que encontro el objeto
			}else{
				return 0;//No encontró el objeto. Devuelve 0
			}
		}
	}

	public int BuscarEmpleadorFormal(int codigo){//Método para buscar un Empleador Formal en ArrayList
		for (int i = 0; i< BaseEF.size(); i++){//Se recorre el listado y se busca el código igual. 
			Empleador Jefe = BaseEF.get(i);
			if (codigo == Jefe.getCodigo()){
				return 1;//Devuelve 1 como signo de que encontro el objeto
			}else{
				return 0;//No encontró el objeto. Devuelve 0
			}
		}
	}
	public int BuscarEmpleadorTemporal(int codigo){//Método para buscar un Empleador Temporal en ArrayList
    int Cod = 0;
		for (int i = 0; i< BaseET.size(); i++){ //Se recorre el listado y se busca el código igual. 
			Empleador Senito = BaseET.get(i);
			if (codigo == Senito.getCodigo()){
				Cod = 1; //Devuelve 1 como signo de que encontro el objeto
			} else {//No encontró el objeto. Devuelve 0
			}
		}
    return Cod;
	}*/
	
  //Método para devolver el objeto que tenga el mismo código.
	public TrabajadorFormal ObtenerTF(int codigo){
    TrabajadorFormal worker = null;
		for (int i = 0; i< BaseTF.size(); i++){
			TrabajadorFormal entacuchado = BaseTF.get(i);
			if (codigo == entacuchado.getCodigo()){
				worker = entacuchado; //Devuelve el objeto si lo encontró
			}
		}

    return worker;
	}
  
  // Método para obtener un trabajador informal
  // Se debe validar el codigo para usar este método
	public TrabajadorInformal ObtenerTT( int codigo ){//Método para devolver el objeto que tenga el mismo código.
    TrabajadorInformal worker = null; 
		for (int i = 0; i< BaseTT.size(); i++){
			TrabajadorInformal don = BaseTT.get(i);
			if ( codigo == don.getCodigoID() ) {
				worker = don;//Devuelve el objeto si lo encontró
			}
		}
    
    return worker;
	}

  // Método para obtener un empleador
  // El objeto debe existir para poder usar este método
	public Empleador ObtenerEF(int codigo){
    Empleador boss = null;
		for (int i = 0; i< BaseEF.size(); i++){
			Empleador Jefe = BaseEF.get(i);
			if (codigo == Jefe.getCodigo()){
				boss = Jefe;//Devuelve el objeto si lo encontró
			}
		}

    return boss;
	}

	public Empleador ObtenerET(int codigo){//Método para devolver el objeto que tenga el mismo código.
    Empleador Mister = null;
		for (int i = 0; i< BaseET.size(); i++){
			Empleador Senito = BaseET.get(i);
			if (codigo == Senito.getCodigo()){
				Mister = Senito;//Devuelve el objeto si lo encontró
			}
		}

    return Mister;
	}
  

  public static int generarCod (Documentos docs) {
    boolean codCorrecto = false; 
    int Codigo = 0;
    while(codCorrecto == false) { //Verifica si este ya existe en las bases de datos.
      Random rand = new Random();
      int cod = rand.nextInt(899) + 100;
      int contador = 0;
              
      /*ArrayList<TrabajadorFormal> BaseTF = docs.getTF();
      ArrayList<TrabajadorInformal> BaseTT = docs.getTT();
      ArrayList<Empleador> BaseET = docs.getET();
      ArrayList<Empleador> BaseEF = docs.getEF();*/

      //For que recorre la base de datos de trabajadores formales
      for (int i = 0; i < BaseTF.size(); i++ ) {
        TrabajadorFormal entacuchado = BaseTF.get(i);
        int numerito = entacuchado.getCodigo();
        if(cod == numerito) {
          contador += 1;
        }
      }
      //for para recorrer la base de datos de trabajadores temporales
      for (int j = 0; j < BaseTT.size(); j++ ){
        TrabajadorInformal don = BaseTT.get(j);
        int numerazo = don.getCodigoID();
        if(cod == numerazo){
          contador += 1;
        }
      }
      
      //For que recorre la base de datos de empleador
      for (int k = 0; k < BaseEF.size(); k++ ) {
        Empleador Jefe = BaseEF.get(k);
        int Num = Jefe.getCodigo();
        if (cod == Num) {
          contador += 1;
        }
      }
      
      //For que recorre base de datos de empleador de trabajadores formales
      for (int l = 0; l < BaseTF.size(); l++ ){
        TrabajadorFormal entacuchado = BaseTF.get(l);
        int numerito = entacuchado.getCodigo();
        if (cod == numerito) {
          contador += 1;
        }
      }
        if(contador == 0){
          Codigo = cod;
        }
    }
    
    return Codigo;
    
  }

  // Método que verifica si el código ingresado existe en las bases de datos.
  public static boolean verificarEx(int cod, Documentos docs) {
    boolean Existe = false;
    for (int i = 0; i < BaseTF.size(); i++ ){
      TrabajadorFormal entacuchado = BaseTF.get(i);
      int numerito = entacuchado.getCodigo();
      if (cod == numerito) {
      Existe = true; //Torna true si encuentra una similitud.
      }
    }
    for (int j = 0; j < BaseTT.size(); j++ ){
      TrabajadorInformal don = BaseTT.get(j);
      int numerazo = don.getCodigoID();
      if(cod == numerazo) {
        Existe = true;//Torna true si encuentra una similitud.
      }
    }
    for (int k = 0; k < BaseEF.size(); k++ ){
      Empleador Jefe = BaseEF.get(k);
      int Num = Jefe.getCodigo();
      if(cod == Num){
        Existe = true;//Torna true si encuentra una similitud.
      }
    }
    for (int l = 0; l < BaseEF.size(); l++ ){
      Empleador Senito = BaseEF.get(l);
      int numerito = Senito.getCodigo();
      if(cod == numerito) {
        Existe = true;//Torna true si encuentra una similitud.
      }
    }
    
    return Existe;
  }
  public static void obtenerPerfil(TrabajadorInformal TI){
    BaseTF.add(TI);
  }

}