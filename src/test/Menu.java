package test;

import ProductosYServicios.Computadora;
import ProductosYServicios.Servicio;
import clases.Cliente;
import jsonHerramientas.StreamJSON;

import java.util.Scanner;

public class Menu {

	
	private String nombre;

	public Menu(String nombre) {
		this.nombre=nombre;
	}
	TiendaInformatica miTienda= new TiendaInformatica<>(nombre);


	public void opciones(){
		int opcion,opcionCatalogo;
		Scanner teclado = new Scanner(System.in);
		miTienda.getCatalogo();
		StreamJSON nuevoJSON = new StreamJSON();
		do {
			System.out.println("\nMenu Principal.\nDiginte la opcion deseada o 9 para salir\n");
			System.out.println("\n1.Catalogo.");
			System.out.println("\n2.Ventas.");
			System.out.println("\n3.Taller.");
			System.out.println("\n4.Clientes.");
			System.out.println("\n5.Administrador.");
			System.out.println("\n\n6.SALIR");
			int cont = 1;
			opcion = teclado.nextInt();

				switch (opcion) {
					case 1:
						do{
							System.out.println("\nMenu Productos \nDigite la opcion:");
							System.out.println("\n1.agregar producto");
							System.out.println("\n2.quitar producto:");
							System.out.println("\n3.Listar Productos");
							System.out.println("\n4.Consultar Producto");
							opcion = teclado.nextInt();
							switch (opcion) {
								case 1:
									
									System.out.println("\nCategoria:");
									System.out.println("\n1.Almacenamiento");
									System.out.println("\n2.Auriculares.");
									System.out.println("\n3.Computadora:");
									System.out.println("\n4.Cooler:");
									System.out.println("\n5.CoolerCPU:");
									System.out.println("\n6.Fuente:");
									System.out.println("\n7.Gabinete:");
									System.out.println("\n8.MemoriaRAM:");
									System.out.println("\n9.Microfono:");
									System.out.println("\n10.Monitor:");
									System.out.println("\n11.MotherBoard:");
									System.out.println("\n12.Mouse:");
									System.out.println("\n13.Parlante:");
									System.out.println("\n14.Placa de video:");
									System.out.println("\n15.Procesador:");
									System.out.println("\n16.Teclado:");
									System.out.println("\n17.Webcam:");
									System.out.println("\n0 para salir.");
									opcionCatalogo= teclado.nextInt();
									if(opcionCatalogo!=0) {
										System.out.println("Ingrese codigo: ");
										teclado.nextLine();
										String codigo2 = teclado.nextLine();


										System.out.println("Ingrese marca: ");

										String marca = teclado.nextLine();

										System.out.println("Ingrese modelo: ");

										String modelo = teclado.nextLine();

										System.out.println("Ingrese stock: ");
										int stock = teclado.nextInt();

										System.out.println("Ingrese precio: ");
										double precio = teclado.nextDouble();

										System.out.println("Ingrese peso: ");
										double peso = teclado.nextDouble();

										System.out.println("Ingrese paisOrigen: ");
										teclado.nextLine();

										String paisOrigen = teclado.nextLine();

										System.out.println("Ingrese 1 si es RGB: ");
										int rgb = teclado.nextInt();
										boolean isRgb = false;
										if (rgb == 1) {
											isRgb = true;
										}

										System.out.println("Ingrese color: ");
										teclado.nextLine();
										String color = teclado.nextLine();

										System.out.println("Ingrese descripcion: ");

										String descripcion = teclado.nextLine();


									switch(opcionCatalogo) {
									 
									case 1:
										System.out.println("\nALMACENAMIENTO\n");
										System.out.println("Ingrese tipo de disco: ");
										String tipoDeDisco= teclado.nextLine();
										
										System.out.println("Ingrese capacidad del disco: ");
										int capacidad=teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, capacidad, tipoDeDisco);
										
										break;
										
									case 2: 
										System.out.println("\nAURICULARES\n");
										System.out.println("Ingrese 1 si es inalambrico: ");
										int inalambrico= teclado.nextInt();
										boolean isInalambrico=false;
										
										if(inalambrico==1) {
											isInalambrico=true;
										}
										
										System.out.println("Ingrese 1 si tiene mircrofono: ");
										int tieneMiCrofono= teclado.nextInt();
										boolean isMicrofono=false;
										
										if(tieneMiCrofono==1) {
											isMicrofono=true;
										}
										
										System.out.println("Ingrese el largo del cable: ");
										int largoDelCable= teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,isInalambrico,isMicrofono,largoDelCable);
										break;
									
									case 3: 
										//revisar
										break;
									case 4: 
										System.out.println("\nCOOLER DE GABINETE\n");
										String tipo="Gabinete";
										
										System.out.println("Ingrese el consumo: ");
										int consumo=teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,tipo,consumo);							
										break;
									
									case 5: 
										System.out.println("\nCOOLER DE CPU\n");
										String tipoCPU="CPU";
										
										System.out.println("Ingrese el consumo: ");
										int consumoCPU=teclado.nextInt();
										
										System.out.println("Ingrese el TDP: ");
										int tdp=teclado.nextInt();
										
										System.out.println("Ingrese el tipo de disipacion: ");
										teclado.nextLine();
										String tDisipacion= teclado.nextLine();
										
										System.out.println("Ingrese socket compatible: ");
										String socketC=teclado.nextLine();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, tipoCPU, consumoCPU,tdp,tDisipacion,socketC);
										break;
									
									case 6: 
										System.out.println("\nFUENTE\n");
										System.out.println("Ingrese los watts de consumo: ");
										int watts=teclado.nextInt();
										
										System.out.println("Ingrese el formato: ");
										teclado.nextLine();
										String formato=teclado.nextLine();
										
										System.out.println("Ingrese la certificacion: ");
										String certificacion=teclado.nextLine();
										
										System.out.println("Ingrese 1 si es modular: ");
										int modular= teclado.nextInt();
										boolean isModular=false;
										
										if(modular==1) {
											isModular=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,watts,formato,certificacion,isModular);
										break;
									
									case 7: 
										System.out.println("\nGABINETE\n");
										System.out.println("Ingrese el factor mother: ");
										String factorM=teclado.nextLine();
										
										System.out.println("Ingrese 1 si tiene ventana: ");
										int ventana= teclado.nextInt();
										boolean isVentana=false;
										
										if(ventana==1) {
											isVentana=true;
										}
										
										System.out.println("Ingrese la cantidad de slots para cooler: ");
										int slotsCooler= teclado.nextInt();
										
										System.out.println("Ingrese la cantidad de USB frontales: ");
										int usbFrontal= teclado.nextInt();
										
										System.out.println("Ingrese el alto:");
										int alto= teclado.nextInt();
										
										System.out.println("Ingrese el ancho:");
										int ancho= teclado.nextInt();
										
										System.out.println("Ingrese el profundo:");
										int profundo= teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,factorM,isVentana,slotsCooler,usbFrontal,alto,ancho,profundo);
								
										break;
									
									case 8: 
										System.out.println("\nMEMORIA RAM\n");
										System.out.println("Ingrese la capacidad: ");
										int capacidadRam= teclado.nextInt();
										
										System.out.println("Ingrese la frecuencia: ");
										int frecuencia= teclado.nextInt();
										
										System.out.println("Ingrese el tipo: ");
										String tipoRam=teclado.nextLine();
										
										System.out.println("Ingrese la cantidad: ");
										int cantidadRam= teclado.nextInt();
										
										System.out.println("Ingrese la latencia: ");
										String latencia=teclado.nextLine();
										
										System.out.println("Ingrese el voltaje: ");
										float voltaje= teclado.nextFloat();
										
										System.out.println("Ingrese 1 si tiene disipador: ");
										int disipador= teclado.nextInt();
										
										boolean isDisipador=false;
										
										if(disipador==1) {
											isDisipador=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, capacidadRam,frecuencia,tipoRam,cantidadRam,latencia,voltaje,isDisipador);
										break;
									
									case 9: 
										System.out.println("\nMICROFONO\n");
										
										System.out.println("Ingrese el tipo de pie:");
										String tipoDePie=teclado.nextLine();
										
										System.out.println("Ingrese la conexion: ");
										String conexion=teclado.nextLine();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, tipoDePie, conexion);
										break;
									
									case 10: 
										System.out.println("\nMONITOR\n");
										System.out.println("Ingrese el tipo de panel");
										String tipoDePanel=teclado.nextLine();
										
										System.out.println("Ingrese 1 si es curvo: ");
										int curvo= teclado.nextInt();
										boolean isCurvo=false;
										
										if(curvo==1) {
											isCurvo=true;
										}
										
										System.out.println("Ingrese conexion: ");
										teclado.nextLine();
										String conexionMonitor=teclado.nextLine();
										
										System.out.println("Ingrese tipo de fuente: ");
										String tipoDeFuente=teclado.nextLine();
										
										System.out.println("Ingrese las pulgadas: ");
										int pulgadas=teclado.nextInt();
										
										System.out.println("ingrese resolucion: ");
										teclado.nextLine();
										String resolucion=teclado.nextLine();
										
										System.out.println("ingrese frecuencia: ");
										String frecuenciaMonitor=teclado.nextLine();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, tipoDePanel, isCurvo,conexionMonitor,tipoDeFuente,pulgadas,resolucion,frecuenciaMonitor);
										break;
									
									case 11: 
										System.out.println("\nMOTHERBOARD\n");
										System.out.println("Ingrese Plataforma: ");
										String plataforma=teclado.nextLine();
										
										System.out.println("Ingrese socket: ");
										String socket=teclado.nextLine();
										
										System.out.println("Ingrese factor: ");
										String factor=teclado.nextLine();
										
										System.out.println("Ingrese cantidad de slots para memoria: ");
										int canSlotsM=teclado.nextInt();
										
										System.out.println("Ingrese cantidad de puertos sata: ");
										int puertosSata=teclado.nextInt();
										
										System.out.println("Ingrese salida de video: ");
										teclado.nextLine();
										String salidaDeVideo=teclado.nextLine();
										
										System.out.println("Ingrese cantidad de slots M2: ");
										int cantidadDeSlotsM2=teclado.nextInt();
										
										System.out.println("Ingrese cantidad de puertos USB: ");
										int puertosUSB=teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,plataforma,socket,factor,canSlotsM,puertosSata,salidaDeVideo,cantidadDeSlotsM2,puertosUSB);
										break;
									
									case 12: 
										System.out.println("\nMOUSE\n");
										System.out.println("Ingrese cantidad de botones: ");
										int cantidadDeBotones=teclado.nextInt(); 
										
										System.out.println("Ingrese el tipo de switch: ");
										teclado.nextLine();
										String switchM=teclado.nextLine();
										
										System.out.println("Ingrese el tipo de sensor: ");
										String sensor=teclado.nextLine();
										
										System.out.println("Ingrese 1 si es inalambrico: ");
										int inalambricoMouse= teclado.nextInt();
										boolean isInalambricoMouse=false;
										if(inalambricoMouse==1) {
											isInalambricoMouse=true;
										}
										
										System.out.println("Ingrese los dpi maximos: ");
										int dpiMaximos=teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, cantidadDeBotones, switchM,sensor,isInalambricoMouse,dpiMaximos);
										break;
									
									case 13: 
										System.out.println("\nPARLANTES\n");
										System.out.println("Ingrese la potencia: ");
										String potencia=teclado.nextLine();
										
										System.out.println("Ingrese los tipos de conectores: ");
										String conectores=teclado.nextLine();
										
										System.out.println("Ingrese el tipo de alimentacion: ");
										String alimentacion=teclado.nextLine();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, potencia, conectores,alimentacion);
										break;
									
									case 14: 
										System.out.println("\nPLACA DE VIDEO\n");
										System.out.println("Ingrese tipo de conectividad: ");
										String conectividad=teclado.nextLine();
										
										System.out.println("Ingrese tipo de consumo: ");
										String consumoVideo=teclado.nextLine();
										
										System.out.println("Ingrese tipo de memoria: ");
										String tipoDeMemoria=teclado.nextLine();
										
										System.out.println("Ingrese capacidad de memoria: ");
										int capMemoria= teclado.nextInt();
										
										System.out.println("Ingrese 1 si es backPlate: ");
										int backPlate= teclado.nextInt();
										boolean isBackPlate=false;
										if(backPlate==1) {
											isBackPlate=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, conectividad, consumoVideo,tipoDeMemoria,capMemoria,isBackPlate);
										break;
									
									case 15: 
										System.out.println("\nPROCESADOR\n");
										System.out.println("Ingrese el tipo de socket: ");
										String socketP=teclado.nextLine();
										
										System.out.println("Ingrese la cantidad de nucleos: ");
										int nucleos= teclado.nextInt();
										
										System.out.println("Ingrese la cantidad de hilos: ");
										int hilos= teclado.nextInt();
										
										System.out.println("Ingrese la frecuencia turbo: ");
										int frecuenciaTurbo= teclado.nextInt();
										
										System.out.println("Ingrese proceso de fabricacion(numero): ");
										int procesoDeFabricacion= teclado.nextInt();
										
										System.out.println("Ingrese TDP: ");
										int tdpProcesador= teclado.nextInt();
										
										System.out.println("Ingrese 1 si tiene cooler: ");
										int coolerP= teclado.nextInt();
										boolean isCooler=false;
										if(coolerP==1) {
											isCooler=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, socketP, nucleos,hilos,frecuenciaTurbo,procesoDeFabricacion,tdpProcesador,isCooler);
										break;
									
									case 16: 
										System.out.println("\nTECLADOS\n");
										System.out.println("Ingrese Tipo de teclado: ");
										String tecladoProducto=teclado.nextLine();
										
										System.out.println("Ingrese formFactor: ");
										String formfactor=teclado.nextLine();
										
										System.out.println("Ingrese tipo de switch: ");
										String switcH=teclado.nextLine();
										
										miTienda.agregarTeclado(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, tecladoProducto, formfactor,switcH);
										break;
									
									case 17: 
										System.out.println("\nWEBCAMS\n");
										System.out.println("Ingrese resolucion de video: ");
										String resolucionCam=teclado.nextLine();
										
										System.out.println("Ingrese tipo de lente: ");
										String tipoDeLente=teclado.nextLine();
										
										System.out.println("Ingrese tipo de resolucion: ");
										String tipoDeResolucion=teclado.nextLine();
										
										System.out.println("Ingrese 1 si tiene microfono: ");
										int microfono= teclado.nextInt();
										
										boolean isMicrofonoCam=false;
										if(microfono==1) {
											isMicrofonoCam=true;
										}
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion, resolucionCam, tipoDeLente,tipoDeResolucion,isMicrofonoCam);

										break;

									}
									}

									//agregar producto
									break;
								case 2:
									//quitar producto
									System.out.println("\nDigite el codigo de producto:\n");
									String aBorrar= teclado.nextLine();
									miTienda.borrarProducto(aBorrar);
									break;
								case 3:
									//Listar Productos
									System.out.println("\n1.Almacenamiento.");
									System.out.println("\n2.Auriculares.");
									System.out.println("\n3.Computadora:");
									System.out.println("\n4.Coolers:");
									System.out.println("\n5.Fuente:");
									System.out.println("\n6.Gabinete:");
									System.out.println("\n7.MemoriaRAM:");
									System.out.println("\n8.Microfono:");
									System.out.println("\n9.Monitor.");
									System.out.println("\n10.MotherBoard:");
									System.out.println("\n11.Mouse:");
									System.out.println("\n12.Parlante:");
									System.out.println("\n13.Placa de video:");
									System.out.println("\n14.Procesador:");
									System.out.println("\n15.Teclado:");
									System.out.println("\n16.Webcam:");
									System.out.println("\n17.Todos.");
									System.out.println("\n0 para salir.");

									int opcionListar;
									opcionListar=teclado.nextInt();

									switch(opcionListar) {

										case 1:
											System.out.println(miTienda.mostrarAlmacenamiento());
											break;
										case 2:
											System.out.println(miTienda.mostrarAuriculares());

											break;
										case 3:
											//revisar
											break;
										case 4:
											System.out.println(miTienda.mostrarCooler());
											break;
										case 5:
											System.out.println(miTienda.mostrarFuentes());
											break;
										case 6:
											System.out.println(miTienda.mostrarGabinetes());
											break;
										case 7:
											System.out.println(miTienda.mostrarMemorias());
											break;
										case 8:
											System.out.println(miTienda.mostrarMicrofonos());
											break;
										case 9:
											System.out.println(miTienda.mostrarMonitores());
											break;
										case 10:
											System.out.println(miTienda.mostrarMothers());
											break;
										case 11:
											System.out.println(miTienda.mostrarMouses());
											break;
										case 12:
											System.out.println(miTienda.mostrarParlantes());
											break;
										case 13:
											System.out.println(miTienda.mostrarPlacas());
											break;
										case 14:
											System.out.println(miTienda.mostrarProcesadores());
											break;
										case 15:
											System.out.println(miTienda.mostrarTeclados());
											break;
										case 16:
											System.out.println(miTienda.mostrarWebcams());
											break;
										case 17:
											System.out.println(miTienda.mostrarTodo());
											break;
									}
									break;
									case 4:
									//Consultar Producto
									System.out.println("\nDigite el codigo de producto:\n");
									teclado.nextLine();
									String aMostrar= teclado.nextLine();
									System.out.println(miTienda.buscarProducto(aMostrar));
									break;
							}
							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();
						}while(cont == 1);
						break;
					case 2:
						int opcionVentas;
						System.out.println("\nDigite la opcion o 0 para salir:");
						System.out.println("\n1.Cargar productos.");
						System.out.println("\n2.Armado de Pc.");
						opcionVentas=teclado.nextInt();
						switch (opcionVentas) {
							case 1:
								int opcionCargar;
								//mostrar catalogo y agregarlos al carrito
								System.out.println("\nDigite la opcion deseada:");
								System.out.println("\n1.Almacenamiento.");
								System.out.println("\n2.Auriculares.");
								System.out.println("\n3.Computadora:");
								System.out.println("\n4.Coolers:");
								System.out.println("\n5.Fuente:");
								System.out.println("\n6.Gabinete:");
								System.out.println("\n7.MemoriaRAM:");
								System.out.println("\n8.Microfono:");
								System.out.println("\n9.Monitor.");
								System.out.println("\n10.MotherBoard:");
								System.out.println("\n11.Mouse:");
								System.out.println("\n12.Parlante:");
								System.out.println("\n13.Placa de video:");
								System.out.println("\n14.Procesador:");
								System.out.println("\n15.Teclado:");
								System.out.println("\n16.Webcam:");
								System.out.println("\n17.Todos.");
								System.out.println("\n0 para salir.");
								opcionCargar= teclado.nextInt();
								switch(opcionCargar) {
									case 1:
										System.out.println("\nAlmacenamientos:");
										System.out.println(miTienda.mostrarAlmacenamiento());
										break;
									case 2:
										System.out.println(miTienda.mostrarAuriculares());

										break;
									case 3:
										//revisar
										break;
									case 4:
										System.out.println(miTienda.mostrarCooler());
										break;
									case 5:
										System.out.println(miTienda.mostrarFuentes());
										break;
									case 6:
										System.out.println(miTienda.mostrarGabinetes());
										break;
									case 7:
										System.out.println(miTienda.mostrarMemorias());
										break;
									case 8:
										System.out.println(miTienda.mostrarMicrofonos());
										break;
									case 9:
										System.out.println(miTienda.mostrarMonitores());
										break;
									case 10:
										System.out.println(miTienda.mostrarMothers());
										break;
									case 11:
										System.out.println(miTienda.mostrarMouses());
										break;
									case 12:
										System.out.println(miTienda.mostrarParlantes());
										break;
									case 13:
										System.out.println(miTienda.mostrarPlacas());
										break;
									case 14:
										System.out.println(miTienda.mostrarProcesadores());
										break;
									case 15:
										System.out.println(miTienda.mostrarTeclados());
										break;
									case 16:
										System.out.println(miTienda.mostrarWebcams());
										break;
									case 17:
										System.out.println(miTienda.mostrarTodo());
										break;
								}
								break;
							case 2:
								//aca hay que agregar logica para cuando no hay stock
								System.out.println("\nMotherboards");
								System.out.println(miTienda.mostrarMothers());
								System.out.println("\nIngrese el codigo del motherboard");
								String codigoMother = teclado.nextLine();
								String motherAcargar=miTienda.buscarProducto(codigoMother);
								System.out.println("\nElija Procesador");
								System.out.println(miTienda.mostrarProcesadores());
								System.out.println("\nIngrese el codigo del Procesador");
								String codigoProcesador = teclado.nextLine();
								String procesadorAcargar=miTienda.buscarProducto(codigoProcesador);
								System.out.println("\nElija Memoria");
								System.out.println(miTienda.mostrarMemorias());
								System.out.println("\nIngrese el codigo de la memoria");
								String codigoMemoria = teclado.nextLine();
								String memoriaAcargar=miTienda.buscarProducto(codigoMemoria);
								System.out.println("\nElija Fuente");
								System.out.println(miTienda.mostrarFuentes());
								System.out.println("\nIngrese el codigo de la Fuente");
								String codigoFuente = teclado.nextLine();
								String fuenteAcargar=miTienda.buscarProducto(codigoFuente);
								System.out.println("\nElija Gabinete");
								System.out.println(miTienda.mostrarGabinetes());
								System.out.println("\nIngrese el codigo del Gabinet");
								String codigoGabinete = teclado.nextLine();
								String gabineteAcargar=miTienda.buscarProducto(codigoGabinete);
								System.out.println("\nElija Almacenamiento");
								System.out.println(miTienda.mostrarAlmacenamiento());
								System.out.println("\nIngrese el codigo del Almacenamiento");
								String codigoAlmacenamiento = teclado.nextLine();
								String almacenamientoAcargar=miTienda.buscarProducto(codigoAlmacenamiento);
								System.out.println("\nElija Cooler");
								System.out.println(miTienda.mostrarCooler());
								System.out.println("\nIngrese el codigo del Cooler o 0 para dejar el de stock");
								String codigoCooler = teclado.nextLine();
								System.out.println("\nElija GPU");
								System.out.println(miTienda.mostrarPlacas());
								System.out.println("\nIngrese el codigo de GPU");
								String codigoGPU = teclado.nextLine();

								Computadora nueva = new Computadora("Escritorio, custom",almacenamientoAcargar,memoriaAcargar,procesadorAcargar,motherAcargar,fuenteAcargar,gabineteAcargar,codigoGPU,codigoCooler );
								//ACA HAY QPREGUNTAR LOS DATOS AL CLIENTE ANTES DE PASAR A LA FACTURA PARA CREAR EL SERVICIO
								Cliente aux= new Cliente();
								Servicio armado = new Servicio("armado",aux,0);

								//hay que enchufarle el servicio de armado

								//elegir 1 componente de cada categoria q conforma la pc y construirla + servicio de armado
								break;
						}

						break;
					case 3:
						do{
						System.out.println("Taller\nDiginte la opcion deseada:\n");
						System.out.println("\n1.Ver cola de servicios");
						System.out.println("\n2.Conformar Servicio");
						opcion = teclado.nextInt();
						switch (opcion) {
							case 1:
								//Ver cola de servicios
								break;
							case 2:
								//Conformar Servicio
								break;
						}

							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();
						}while(cont == 1);
						break;
					case 4:
						do{
						System.out.println("\nMenu Clientes\nDiginte la opcion deseada:\n");
						System.out.println("1.Cargar Clientes");
						System.out.println("2.Editar Clientes");
						System.out.println("3.Remover Clientes");
						opcion = teclado.nextInt();


						switch (opcion) {
							case 1:
								//Ver cola de servicios
								break;
							case 2:
								//Conformar Servicio
								break;
							case 3:
								//remover cliente
								break;
						}
							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();

						}while(cont == 1);
						break;
					case 5:
						do {
							System.out.println("\nAdministrador\nDiginte la opcion deseada:\n");
							System.out.println("\n1.Cargar Vendedor");
							System.out.println("\n2.Editar Vendedor");
							System.out.println("\n3.Remover Vendedor");
							System.out.println("\n4.Ver vendedor");
							opcion = teclado.nextInt();

							switch (opcion) {
								case 1:
									//Ver cola de servicios
									break;
								case 2:
									//Conformar Servicio
									break;
								case 3:
									//remover cliente
									break;
								case 4:
									//remover cliente
									break;
							}

							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();
						}while(cont==1);
						break;

				}
			} while (opcion < 6 && opcion > -1);

		System.out.println(nuevoJSON.javaAJSON(miTienda.getCatalogo()));
		}

}
