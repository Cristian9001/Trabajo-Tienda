/**
 * 
 */
package data;

import java.util.ArrayList;

import logic.Producto;

/**
 * @author Pedro
 *
 */
public class GestionProducto {

	// Atributos
	private Producto productos[] = null;
	public double caja;

	// Constructores
	public GestionProducto() {

	}

	public GestionProducto(Producto[] productos) {
		this.productos = productos;
	}

	// Methods
	/**
	 * 
	 * @return
	 */
	public Producto[] cargarProductos() {

		return productos;
	}

	/**
	 * 
	 * @param productos
	 */
	public void mostrarProductos(ArrayList<Producto> productos) {
		for(Producto producto : productos) {
			System.out.print("Nombre: "+ producto.getNombre()+ "\n"+ "Disponible: " + producto.getCantStock()+ "\n" + "Precio Unitario: " + producto.getPrecioUnit()+ " euros. " + "\n");
		}
		}
	
	
	public void lista(ArrayList<Producto> muestra) {
		for(int i=0; i<muestra.size();i++) {
			System.out.println("Nombre: "+ muestra.get(i).getNombre()+ " | Precio: " + muestra.get(i).getPrecioUnit() + " | Stock: " + muestra.get(i).getCantStock());
		}
	}
	}
