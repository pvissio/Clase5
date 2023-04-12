package ejercicio5;

public class Producto {
	
	public String nombreProducto;
	public double precio;
	public int codigo;
	
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	public void leer(int codigo, String nombreProducto, double precio) {
		this.codigo = codigo;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}
	
	
}