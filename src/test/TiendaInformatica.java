package test;

import Facturacion.Carrito;
import Facturacion.Factura;
import ProductosYServicios.Producto;
import clases.Cliente;
import clases.Taller;
import clases.Vendedor;
import colecciones.Catalogo;
import colecciones.Contenedora;
import colecciones.ContenedoraDeFacturas;

public class TiendaInformatica<K> {
	private String nombre;
	private Catalogo catalogo;
	private Taller taller;
	private ContenedoraDeFacturas<K, Factura> facturas;
	private Contenedora<K,Cliente> listaDeClientes;
	private Contenedora<K,Vendedor> listaDeVendedores;
	private Carrito carroDeCompras;
	
	//harcodeo unica vez carga
	Catalogo C= new Catalogo();
	
	
	public TiendaInformatica(String nombre) {
		this.nombre=nombre;
		this.catalogo = new Catalogo();
		this.taller = new Taller();
		this.facturas = new ContenedoraDeFacturas<>();
		this.listaDeClientes = new Contenedora<>();
		this.listaDeVendedores = new Contenedora<>();
		this.carroDeCompras = new Carrito();
	}
	
	//temporario no se invoca desde el main
	public void cargarCatalogoAlaTienda(Catalogo catalogo) {
		
		this.catalogo=catalogo;
		
	}
	
	public void agregarProducto(Producto p) 
	{
		catalogo.agregar(p);
	}
	
}
