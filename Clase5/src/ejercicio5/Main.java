package ejercicio5;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Patricio\\Desktop\\Argentina Programa 4.0\\Desarrollador Java Inicial\\Clase 5\\Actividades\\cat.txt";
		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
		ScannerClass(ruta);
		
	}
		
		public static void ScannerClass(String ruta) { 
			
		int Id = 1;
		String DescProducto;
		Double Cantidad;
		Double Precio;
		File file = new File(ruta);
		Carrito Carrito= new Carrito();
		try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
			while (sc.hasNextLine()) {
				String[] VectorString= (sc.nextLine()).split(";");
				DescProducto=VectorString[2];
				Cantidad=Double.parseDouble(VectorString[0]);
				Precio=Double.parseDouble(VectorString[1]);
				Producto obj= new Producto();
				obj.nombreProducto=DescProducto;
				obj.codigo=Id;
				obj.precio=Precio;
				Id+=1;
				ItemCarrito obj2 = new ItemCarrito();
				obj2.Mostrar(obj, Cantidad);
				Carrito.precio(obj2);
				System.out.println(".... Leo objeto: Producto que se carga con una linea del Archivo ....");
				System.out.println(" Producto: "+ obj.nombreProducto +"\n Precio: "+ obj.precio + "\n Id: " + obj.codigo+ "\n ......");
				System.out.println("\n.... Leo primer objeto: Items que guarda los datos del objeto, cantidad y subtotal ....\n");
				System.out.println(" Items: "+ obj2.codigoItemCarrito + "\n Cant : " + obj2.cantidad + "\n Desc.: " + obj.nombreProducto +"\n SubTotal: "+ obj2.totalItem + "\n ......");
		
			}
			System.out.println(" total sin descuento: "+ Carrito.total);
			
			Descuento descuento = new Descuento();
			descuento.setPorcentajeDescuento(10);
			
			double totalConDescuento = descuento.aplicarDescuento(Carrito.getTotal());
			System.out.println("Total con descuento aplicado: " + totalConDescuento);
		}
		catch (IOException e) {
		e.printStackTrace();

		
		}
      
	}
}