public class articulo{
	public String[] nombre=new String[100];
	public String[] descripcion=new String[100];
	public String[] cantidad=new String[100];
	public String[] unidad=new String[100];
	public String[] ingreso=new String[100];
	public String[] salida=new String[100];
	public String[] codigo=new String[100];

	public articulo(){
		for(int x=0;x<100;x++){
			nombre[x]="";
			descripcion[x]="";
			cantidad[x]="";
			unidad[x]="";
			ingreso[x]="";
			salida[x]="";
			codigo[x]="";
		}
	}

	public String getnombre(int v){
		return nombre[v];
	}
	public String getdescripcion(int v){
		return descripcion[v];
	}
	public String getcantidad(int v){
		return cantidad[v];
	}
	public String getunidad(int v){
		return unidad[v];
	}
	public String getingreso(int v){
		return ingreso[v];
	}
	public String getsalida(int v){
		return salida[v];
	}
	public String getcodigo(int v){
		return codigo[v];
	}

	public void setnombre(String nuevonombre,int v){
		nombre[v]=nuevonombre;
	}
	public void setdescripcion(String nuevadescripcion,int v){
		descripcion[v]=nuevadescripcion;
	}
	public void setcantidad(String nuevacantidad,int v){
		cantidad[v]=nuevacantidad;
	}
	public void setunidad(String nuevaunidad,int v){
		unidad[v]=nuevaunidad;
	}
	public void setingreso(String nuevoingreso,int v){
		ingreso[v]=nuevoingreso;
	}
	public void setsalida(String nuevasalida,int v){
		salida[v]=nuevasalida;
	}
	public void setcodigo(String nuevocodigo,int v){
		codigo[v]=nuevocodigo;
	}

	public static void main(String[] args){
		/*articulo articulos=new articulo();
		articulos.setcantidad("10",2);
		System.out.println(articulos.getcantidad(2));*/
	}
}