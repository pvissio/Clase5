package ejercicio5;

public class Carrito {

	public int codigoCarrito;
	public String fechaCompra;
	public double total;
	
	public int getCodigoCarrito() {
		return codigoCarrito;
	}
	
	public void setCodigoCarrito(int codigoCarrito) {
		this.codigoCarrito = codigoCarrito;
	}
	
	public String getFechaCompra() {
		return fechaCompra;
	}
	
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}

	
	public double precio (ItemCarrito obj) {
		return this.total += obj.totalItem;
	}
	
}