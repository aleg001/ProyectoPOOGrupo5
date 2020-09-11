class Documentos {
	//Propiedades de clase
	static public ArrayList<TrabajadorFormal> BaseTF;
	static public ArrayList<TrabajadorTemporal> BaseTT;
	static public ArrayList<EmpleadorFormal> BaseEF;
	static public ArrayList<EmpleadorTemporal> BaseET;
	
	//Métodos
	public int BuscarTrabajadorFormal(int codigo){ //Método para buscar un trabajador Formal en ArrayList.
		for (int i = 0; i< BaseTF.size(); i++){//Se recorre el listado y se busca el código igual.
			TrabajadorFormal entacuchado = BaseTF.get(i);
			if (codigo == entacuchado.getCodigo()){
				return 1;//Devuelve 1 como signo de que encontro el objeto
			}else{
				return 0;//No encontró el objeto. Devuelve 0
			}
		}
	}

	public int BuscarTrabajadorTemporal(int codigo){ //Método para buscar un trabajador Temporal en ArrayList
		for (int i = 0; i< BaseTT.size(); i++){//Se recorre el listado y se busca el código igual.
			TrabajadorTemporal don = BaseTT.get(i);
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
		for (int i = 0; i< BaseET.size(); i++){ //Se recorre el listado y se busca el código igual. 
			Empleador Senito = BaseET.get(i);
			if (codigo == Senito.getCodigo()){
				return 1; //Devuelve 1 como signo de que encontro el objeto
			}else{
				return 0;//No encontró el objeto. Devuelve 0
			}
		}
	}
	
	public TabajadorFormal ObtenerTF(int codigo){ //Método para devolver el objeto que tenga el mismo código.
		for (int i = 0; i< BaseTF.size(); i++){
			TrabajadorFormal entacuchado = BaseTF.get(i);
			if (codigo == entacuchado.getCodigo()){
				return entacuchado; //Devuelve el objeto si lo encontró
			}
		}
	}

	public TrabajadorInformal ObtenerTT(int codigo){//Método para devolver el objeto que tenga el mismo código.
		for (int i = 0; i< BaseTT.size(); i++){
			TrabajadorInformal don = BaseTT.get(i);
			if (codigo == don.getCodigo()){
				return don;//Devuelve el objeto si lo encontró
			}
		}
	}

	public Empleador ObtenerEF(int codigo){//Método para devolver el objeto que tenga el mismo código.
		for (int i = 0; i< BaseEF.size(); i++){
			Empleador Jefe = BaseEF.get(i);
			if (codigo == Jefe.getCodigo()){
				return Jefe;//Devuelve el objeto si lo encontró
			}
		}
	}

	public Empleador ObtenerTF(int codigo){//Método para devolver el objeto que tenga el mismo código.
		for (int i = 0; i< BaseET.size(); i++){
			Empleador Senito = BaseET.get(i);
			if (codigo == Senito.getCodigo()){
				return Senito;//Devuelve el objeto si lo encontró
			}
		}
	}
  
  public static void obtenerPerfil(TrabajadorFormal TF){
    BaseTF.add(TF);
  }

	
}