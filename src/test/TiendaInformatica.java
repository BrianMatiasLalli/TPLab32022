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
								String paisOrigen, boolean rgb, String color, String descripcion, int capacidad
								,String tipoDeDisco) {
		Producto nuevo= new Almacenamiento(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,capacidad,tipoDeDisco);
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
		Producto nuevo= new CoolerCpu(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipo, consumo, tdp, disipador, socket);
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
		Producto nuevo= new Monitor(codigo,marca,modelo,stock,precio,peso, paisOrigen,rgb,color, descripcion,tipoPanel,curvo,coneccion,tipoFuente, pulgadas, resolucion, frecuencia);
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
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, int cantidadDeBotones, String switcH, String sensor,
			boolean isInalambrica, int dpiMax) {
		Producto nuevo = new Mouse (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,cantidadDeBotones,switcH,sensor,isInalambrica,dpiMax);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String potencia, String tipoDeConectores,
			String alimentacion) {
		Producto nuevo = new Parlante (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion, potencia,  tipoDeConectores, alimentacion);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String conectividad, String consumo,
			String tipoDeMemoria, int capacidadDeMemoria, boolean isbackPlate) {
		Producto nuevo = new PlacaDeVideo(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,conectividad,consumo, tipoDeMemoria,  capacidadDeMemoria,  isbackPlate);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso,
			String paisOrigen, boolean rgb, String color, String descripcion, String socket, int nucleos, int hilos,
			int frecuenciaTurbo, int procesoDeFabricacion, int tdp, boolean isCooler) {
		Producto nuevo = new Procesador (codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,socket,nucleos,hilos, frecuenciaTurbo, procesoDeFabricacion, tdp, isCooler);
		this.catalogo.agregar(nuevo);
	}

	public void agregarTeclado(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String tipo, String formfactor, String switcH) {
		Producto nuevo = new Teclado(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,tipo,formfactor,switcH);
		this.catalogo.agregar(nuevo);
	}
	
	public void agregarProducto(String codigo, String marca, String modelo, int stock, double precio, double peso, String paisOrigen,
			boolean rgb, String color, String descripcion, String resolucionMaximaDevideo, String tipoDeLente,
			String tipoDeResolucion, boolean isMicrofono) {
		Producto nuevo = new WebCam(codigo, marca, modelo, stock, precio, peso, paisOrigen, rgb, color, descripcion,resolucionMaximaDevideo,tipoDeLente,tipoDeResolucion,isMicrofono);
		this.catalogo.agregar(nuevo);
	}

	public Catalogo getCatalogo() {
		return catalogo;
	}

	
}
