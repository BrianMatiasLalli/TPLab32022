package test;

import Facturacion.Carrito;
import Facturacion.Factura;
import ProductosYServicios.*;
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
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion, String tipoDeColeccion,
								String tipoDeDisco, int capacidad) {
		Producto nuevo= new Almacenamiento(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipoDeColeccion, tipoDeDisco,capacidad);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion, boolean inalambrico , boolean microfono, int cable) {
		Producto nuevo= new Auriculares(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,inalambrico,microfono,cable);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String tipo, int consumo) {
		Producto nuevo= new Cooler(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipo, consumo);
		this.catalogo.agregar(nuevo);
	}

	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String tipo, int consumo, int tdp, String disipador, String socket) {
		Producto nuevo= new CoolerCpu(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipo, consumo, tdp disipador, socket);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,int wts,String formato, String cerificacion, boolean modular) {
		Producto nuevo= new Fuente(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion, wts,formato,cerificacion, modular);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String factor, boolean ventana,int slotCooler,int usb,int alto, int ancho, int prof) {
		Producto nuevo= new Gabinete(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion, factor,ventana,slotCooler,usb, alto, ancho, prof );
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,int capac, int frecuencia, String tipo, int cantidad, String latencia, float voltaje, boolean disipador){
		Producto nuevo= new MemoriaRam(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion, capac, frecuencia,  tipo, cantidad,latencia, voltaje, disipador);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String tipoPie,String coneccion){
		Producto nuevo= new Microfono(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipoPie,coneccion);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String tipoPanel, boolean curvo, String coneccion,String tipoFuente, int pulgadas, String resolucion, String frecuencia){
		Producto nuevo= new Monitor(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,String tipoPanel,curvo,coneccion,tipoFuente, pulgadas, resolucion, frecuencia);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,String plataforma, String socket,
								String factor, int cantidadDeSlotsDeMemoria, int puertosSata, String salidasDeVideo, int cantidadDeSlotsM2,
								int puertosUSB) {
		Producto nuevo = new MotherBoard(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion, plataforma, socket,
				factor, cantidadDeSlotsDeMemoria,puertosSata, salidasDeVideo, cantidadDeSlotsM2, puertosUSB);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,) {
		Producto nuevo = new (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,) {
		Producto nuevo = new (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,) {
		Producto nuevo = new (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,) {
		Producto nuevo = new (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,);
		this.catalogo.agregar(nuevo);
	}

	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,) {
		Producto nuevo = new (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,);
		this.catalogo.agregar(nuevo);
	}
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
								String paisOrigen, boolean rgb, String color, String descripcion,) {
		Producto nuevo = new (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,);
		this.catalogo.agregar(nuevo);
	}





	
}
