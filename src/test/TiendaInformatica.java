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
import excepciones.ContraseniaIncorrectaExcepcion;
import excepciones.DNIIncorrectoExcepcion;
import manejoArchivo.ArchivoHerramientas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class TiendaInformatica<K> {
	private String nombre;
	private Catalogo catalogo;
	private Taller taller;
	private ArrayList<Servicio>services;
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
		this.services=new ArrayList<>();
		this.facturas = new ContenedoraDeFacturas<>();
		this.listaDeClientes = new Contenedora<>();
		this.listaDeVendedores = new Contenedora<>();
		this.carroDeCompras = new Carrito();
	}
	
	
	public ContenedoraDeFacturas<K, Factura> getFacturas() {
		return facturas;
	}


	public void setFacturas(ContenedoraDeFacturas<K, Factura> facturas) {
		this.facturas = facturas;
	}


	public Contenedora<K, Cliente> getListaDeClientes() {
		return listaDeClientes;
	}


	public void setListaDeClientes(Contenedora<K, Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}


	public Contenedora<K, Vendedor> getListaDeVendedores() {
		return listaDeVendedores;
	}


	public void setListaDeVendedores(Contenedora<K, Vendedor> listaDeVendedores) {
		this.listaDeVendedores = listaDeVendedores;
	}


	//temporario no se invoca desde el main
	public void cargarCatalogoAlaTienda(Catalogo catalogo) {
		
		this.catalogo=catalogo;
		
	}
	
	public void agregarService(Servicio nuevo){
		this.services.add(nuevo);
	}
	public String listarServices(){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<services.size();i++){
			sb.append(services.get(i).toString());
		}return sb.toString();
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
			String paisOrigen, boolean rgb, String color, String descripcion, String conectividad, int consumo,
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

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void borrarProducto(String aBorrar){
		catalogo.eliminar(aBorrar);
	}
	public String buscarProducto(String codigo){
		return catalogo.buscar(codigo);
	}
	public Producto productoAcarrito(String codigo){
		Producto nuevo=null;
		if(catalogo.getMapaCatalogo().containsKey(codigo)){
			nuevo=catalogo.retornarProducto(codigo);
		}return nuevo;
	}
	public boolean checkProducto(String codigo){
		return catalogo.getMapaCatalogo().containsKey(codigo);
	}
	public String mostrarAlmacenamiento(){
		return catalogo.listarAlmacenamiento();
	}
	public String mostrarAuriculares(){
		return catalogo.listarAuriculares();
	}
	
	public String mostrarComputadora() 
	{
		return catalogo.listarComputadoras();
	}
	public String mostrarCooler(){
		return catalogo.listarCoolers();
	}
	public String mostrarFuentes(){
		return catalogo.listarFuentes();
	}
	public String mostrarGabinetes(){
		return catalogo.listarGabinetes();
	}
	public String mostrarMemorias(){
		return catalogo.listarMemorias();
	}
	public String mostrarMicrofonos() {
		return catalogo.listarMicrofonos();
	}
	public String mostrarMonitores(){
		return catalogo.listarMonitores();
	}
	public String mostrarMothers(){
		return catalogo.listarMotherboards();
	}
	public String mostrarMouses(){
		return catalogo.listarMouses();
	}
	public String mostrarParlantes(){
		return catalogo.listarParlantes();
	}
	public String mostrarPlacas(){
		return catalogo.listarPlacas();
	}
	public String mostrarProcesadores(){
		return catalogo.listarProcesadores();
	}
	public String mostrarTeclados(){
		return catalogo.listarTeclados();
	}
	public String mostrarWebcams(){
		return catalogo.listarWebcams();
	}
	public String mostrarTodo(){
		return catalogo.listar();
	}
	public void agregarAlCarrito(Producto nuevo, int cant){
		ItemPedido nuevoItem=new ItemPedido(nuevo, cant);
		this.carroDeCompras.agregar(nuevoItem);
	}

	public void agregarServiceAlCarrito(int opcion){
		if(opcion>0 && opcion<=services.size()){
			this.carroDeCompras.agregar(services.get(opcion-1));
		}

	}
	public String listarCarrito(){
		return this.carroDeCompras.mostrarCarrito();
	}
	public int tamanioDeCarro()
	{
		return carroDeCompras.tamanioCarrito();
	}
	public Factura ticket(Cliente comprador,Carrito aFacturar,Vendedor vendedor){
		
		Factura nueva= new Factura(comprador,aFacturar,vendedor.getApellido()+vendedor.getNombre());
		vendedor.sumarVenta(carroDeCompras.calcularPrecioTotal());
		comprador.agregarFacturaCliente(nueva);
		generarServicio(comprador);
		agregarFactura(nueva);
		
		return nueva;
	}

	public void generarServicio(Cliente comprador) 
	{
		for(int i=0;i<carroDeCompras.getMisServicios().size();i++) {
			ServicioTaller nuevo = new ServicioTaller(carroDeCompras.getMisServicios().get(i).getDescripcion(),comprador);
			taller.agregar(nuevo);
		}
	}
	
	
	public void agregarFactura(Factura nueva) 
	{
		Integer aux=nueva.getId();
		facturas.agregarObjetoColeccion((K)aux, nueva);
	}
	
	public Carrito getCarroDeCompras() {
		return carroDeCompras;
	}
	
	public void pasarTiendaAArchivo() 
	{
		ArchivoHerramientas archivo= new ArchivoHerramientas<>();
		archivo.guardarClienteEnArchivo(listaDeClientes);
		archivo.guardarVendedorEnArchivo(listaDeVendedores);
		archivo.guardarFacturasEnArchivo(facturas);
	}
	
	public void archivoATiendaInformatica() 
	{
		ArchivoHerramientas archivo= new ArchivoHerramientas<>();
		listaDeClientes=archivo.cargarClientesDesdeArchivo();
		listaDeVendedores=archivo.cargarVendedoresDesdeArchivo();
		facturas=archivo.cargarFacturasDesdeArchivo();
	}
	public void agregarCliente(String nombre,String apellido,String dni,String telefono,String direccion,String correo){
		Cliente nuevo= new Cliente(nombre, apellido,dni,telefono,direccion,correo);
		if(!listaDeClientes.existe((K)dni)) {
			listaDeClientes.agregarObjetoColeccion((K) dni, nuevo);
		}
	}
	
	public String listarClientes(){
		return listaDeClientes.listar();
	}
	public String buscarCliente(String id){
		return listaDeClientes.mostrarElementoDeLaColeccion((K)id);
	}
	
	public Cliente retornarCliente(String id){

		return listaDeClientes.devolverPersona((K)id);
	}
	
	public void editarCliente(String id,String dato,int opcion){
		if(opcion>0 && opcion<4){
			listaDeClientes.devolverPersona((K)id).editarPersona(dato, opcion);
		}
			
	}
	
	public boolean existeCliente(K clave) 
	{
		return listaDeClientes.existe(clave);
	}
	
	public void agregarVendedor(String nombre,String apellido,String dni,String telefono,String direccion,String correo,String contraseña) 
	{
		Vendedor nuevo= new Vendedor(nombre, apellido,dni,telefono,direccion,correo,contraseña);
		if(!listaDeVendedores.existe((K)dni)) {
			listaDeVendedores.agregarObjetoColeccion((K) dni, nuevo);
		}
	}
	
	public String listarVendedores() 
	{
		return listaDeVendedores.listar();
	}
	
	public String buscarVendedor(String id){
		return listaDeVendedores.mostrarElementoDeLaColeccion((K)id);
	}
	
	public Vendedor retornarVendedor(String id) 
	{
		return listaDeVendedores.devolverPersona((K) id);
	}

	public void editarVendedor(String id,String dato,int opcion){
		if(opcion>0 && opcion<4){
			listaDeVendedores.devolverPersona((K)id).editarPersona(dato, opcion);
		}
			
	}
	
	public void removerVendedor(String id) 
	{
		listaDeVendedores.eliminarObjDeLaColeccion((K) id);
	}
	
	public boolean comprobarLoginVendedor(String dni, String contrasenia) throws ContraseniaIncorrectaExcepcion, DNIIncorrectoExcepcion 
	{
		boolean correcto=false;
		if(listaDeVendedores.existe((K)dni)) {
			Vendedor aux= listaDeVendedores.devolverPersona((K) dni);
			if(((aux.comprobarDNI(dni))==true && aux.comprobarContrasenia(contrasenia))==true) 
			{
				correcto=true;
			}
		}
		else 
		{
			throw new DNIIncorrectoExcepcion("NO EXISTE ESTE DNI");
		}
		
		return correcto;
	}
	
	public String listarTaller() 
	{
		return taller.mostrar();
	}
	
	public void conformarServicio() 
	{
		taller.remover();
	}
	
	public String listarFacturas() 
	{
		return facturas.listar();
	}
	

}
