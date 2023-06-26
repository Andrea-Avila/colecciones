package PrecioConDescuento;

public class consumidor extends PrecioConDescuento {
	//1. Atributos
	String nombreConsumidor;
	int numeroUsuario;
	

	public consumidor(String nombreProducto, float precio, float descuento, String nombreConsumidor, int numeroUsuario) {
		super(nombreProducto, precio, descuento);
		this.nombreConsumidor = nombreConsumidor;
		this.numeroUsuario = numeroUsuario;
	}
	
	
	
	public static void main(String[] args) {
		
		consumidor consumidor1 = new consumidor("Ganzito", 18.5f, 15.0f, "Amlo", 666 );
		consumidor1.mostrarInfo();
		System.out.println(consumidor1.operacionDescuento());
	}

}