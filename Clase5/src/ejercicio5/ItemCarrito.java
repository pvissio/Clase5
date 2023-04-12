package ejercicio5;

public class ItemCarrito {

	public int codigoItemCarrito;
	public double totalItem;
	public double cantidad;
	
	public int getCodigoItemCarrito() {
		return codigoItemCarrito;
	}
	
	public void setCodigoItemCarrito(int codigoItemCarrito) {
		this.codigoItemCarrito = codigoItemCarrito;
	}
	
	public double getTotalItem() {
		return totalItem;
	}
	
	public void setTotalItem(double totalItem) {
		totalItem = totalItem;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double cantidad) {
		cantidad = cantidad;
	}

	
	public void Mostrar() {};
	
	public void Mostrar (Producto obj, double cant) {
		this.codigoItemCarrito = obj.getCodigo();
		this.cantidad = cant;
		this.totalItem = obj.getPrecio() * cant;
	}

	
}