package test;

import ProductosYServicios.Computadora;
import ProductosYServicios.Producto;
import clases.Cliente;
import excepciones.NoHayStockExcepcion;
import jsonHerramientas.JsonUtiles;
import jsonHerramientas.StreamJSON;

import java.util.Scanner;

public class Menu {

	
	private String nombre;

	public Menu(String nombre) {
		this.nombre=nombre;
	}
	TiendaInformatica miTienda= new TiendaInformatica<>(nombre);
    
    
	public void opciones(){
		String fuente= JsonUtiles.leer();
		if(fuente.isEmpty()){
			System.out.println("Este archivo no contiene nada\n\n");
		}
		StreamJSON aux= new StreamJSON();
		miTienda.setCatalogo(aux.JsonAJava(fuente));
		//Almacenamiento
		miTienda.agregarProducto("10001","Seagate","STEB6000403",5,30000,950,"Estados Unidos",false,"Negro","disco almacenamiento1",6000,"SSD");
		miTienda.agregarProducto("10002","Seagate","ST2000DM005",6,8700,415,"Estados Unidos",false,"Gris","disco almacenamiento2",2000,"HDD");
		miTienda.agregarProducto("10003","Kingston","SA400S37/960G",10,17106,410,"Estados Unidos",false,"Negro","disco almacenamiento3",960,"SSD");
		miTienda.agregarProducto("5427","Western Digital","WD 240GB Green",80,4399,500,"Malasia",false,"Negro","bajo consumo 545 mb/s",240,"SSD SATA");
		miTienda.agregarProducto("7917","Western Digital","WD 480GB Green",40,7999,500,"Malasia",false,"Negro","bajo consumo, 545 mb/s",480,"SSD SATA");
		miTienda.agregarProducto("8277","Kingston","M.2 240GB A400",20,4699,500,"Malasia",false,"Negro","SSD M.2 500mbs/s",240,"SSD M.2");
		miTienda.agregarProducto("10487","ADATA","FALCON",20,16999,460,"China",false,"Negro","3100MB/s NVMe PCI-E x4 ",960,"SSD M.2 NVME gen 4");
		miTienda.agregarProducto("13612","ADATA","XPG SX6000 Pro",10,5500,400,"China",false,"Negro","2100MB/s NVMe PCI-E x4",256,"SSD M.2 NVMe PCI-E x4");
		miTienda.agregarProducto("13335","Patriot","P310",30,7000,500,"China",false,"Negro","1700MB/s Gen3 x4",480,"SSD M.2 NVMe PCI-E x4");
		miTienda.agregarProducto("8679","ADATA ","Spectrix S40G RGB",25,11000,500,"China",false,"Negro","3500MB/s NVMe PCI-E X4",512,"SSD M.2 NVMe PCI-E x4");

		//auriculares
		miTienda.agregarProducto("10004","HyperX","CloudX Stinger",7,6945,150,"Estados Unidos",false, "negro y verde","Auriculares 1",false,true,1);
		miTienda.agregarProducto("10005","Logitech","Series G332",3,7810,200,"Suiza",false,"negro y rojo","Auriculares 2",false,true,2);
		miTienda.agregarProducto("11340","Nisuta","Ovansu OS-AUG580",18,2800,1000,"China",false,"negro,verde","PC/PS4",false,true,3);
		miTienda.agregarProducto("10683","Marvo","Skylab G1 HG8960",15,2750,700,"China",false,"negro,rojo","PRO PS4 Xbox PC",false,true,2);
		miTienda.agregarProducto("11320","Nisuta","Ovansu OS-AUG580C ",12,3000,900,"China",false,"camuflado","PC/PS4",true,true,3);
		miTienda.agregarProducto("10924","Redragon","Zeus",10,8700,1000,"China",false,"blanco, rosa","Audio virtual,Surround 7.1",false,true,2);
		miTienda.agregarProducto("12958","MSI","Immerse",2,8000,850,"China",false,"negro","Usb",true,true,2);
		miTienda.agregarProducto("11762","Cougar","Immersa Ti",7,9000,750,"China",false,"negro,naranja","audio 2.0",true,true,2);
		miTienda.agregarProducto("","","",2,10700,250,"",false,"negro","",true,true,0);
		miTienda.agregarProducto("","","",2,10700,250,"",false,"negro","",true,true,0);
		miTienda.agregarProducto("","","",2,10700,250,"",false,"negro","",true,true,0);
		miTienda.agregarProducto("","","",2,10700,250,"",false,"negro","",true,true,0);
		miTienda.agregarProducto("","","",2,10700,250,"",false,"negro","",true,true,0);


		//CoolerGabinete
		miTienda.agregarProducto("10007","Sate","RGB-73K",4,6100,300,"Taiwan",true,"negro y rgb multicolor","cooler Gabinete","cooler para Gabinete",6);
		miTienda.agregarProducto("10008","Asus","Strix XF120",7,6400,100,"Taiwan",false,"negro","cooler Gabinete","cooler para Gabinete",3);

		//cooler cpu
		miTienda.agregarProducto("10009","Xigmatek","WP964 RGB",8,4700,350,"China",true,"negro","cooler de aire","Cooler CPU",3,140,"Ventilador","Intel: LGA 2066/2011-v3 / 2011/1366/115 � / 1200 AMD: AM4 / AM3 + / AM3 / AM2 + / AM2 / FM2 + / FM2 / FM1");
		miTienda.agregarProducto("10023","ID-Cooling","SE-902-SD",20,2199,400,"China",false,"negro","cooler de aire","Cooler CPU",5,100,"Ventilador","1151,1150,1151 Kaby Lake,1151 Coffe Lake,1155,1156,AM2,AM2+,1200 Comet Lake,AM3,AM3+,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,FM1,FM2,FM2+,AM4 APU 5");
		miTienda.agregarProducto("00021","Cooler Master","Hyper T20",15,2699,400,"China",false,"negro","cooler de aire","Cooler CPU",5,110,"Ventilador","1200 Comet Lake,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,115X,1200,1200 Rocket Lake-S,AM2,AM2+,AM3,AM3+,AM4,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen,FM1,FM2,F");
		miTienda.agregarProducto("10023","ID-Cooling","SE-903-XT",30,3230,600,"China",true,"negro","cooler de aire","Cooler CPU",5,130,"Ventilador","1200 Comet Lake,1150,1151 Coffe Lake,1151 Kaby Lake,1155,1156,1200 Rocket Lake-S,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen,1700 Alder Lake-S,1700");
		miTienda.agregarProducto("202021","DeepCool","Gammaxx 400 V2 RED",14,3899,450,"Taiwan",true,"Negro","cooler de aire","Cooler CPU", 5,130,"Ventilador","1200 Comet Lake,1150,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,AM2,AM2+,AM3,AM3+,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,FM1,FM2,FM2+,AM4 APU 5000");
		miTienda.agregarProducto("202021","DeepCool","Gammaxx 400 V2 RED",14,3899,450,"Taiwan",true,"Negro","cooler de aire","Cooler CPU", 5,130,"Ventilador","1200 Comet Lake,1150,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,AM2,AM2+,AM3,AM3+,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,FM1,FM2,FM2+,AM4 APU 5000");
		miTienda.agregarProducto("131238","Be Quiet!","Pure Rock 2 Black",10,7130,750,"China",false,"Negro","cooler de aire","Cooler cpu",2,150,"Ventilador","1200 Comet Lake,1150,1151 Coffe Lake,1151 Kaby Lake,1155,1156,2011_v3,2066,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen");
		miTienda.agregarProducto("118426","ID-Cooling","FROSTFLOW X 240",25,9979,1200,"Taiwan", true,"Negro", "water cooling","Cooler cpu",10,250,"Radiador","775,1150,1151,1151 Coffe Lake,1155,1155_3,1156,1366,2011,2011_v3,2066,AM2,AM2+,AM3,AM3+,AM4,AM4 A-Series,FM1,FM2,FM2+,AM4 3ra Gen,1151 Kaby Lake,AM4 Ryzen 3th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 1th Gen,AM4 APU 2th Gen,AM4 APU 1th Gen,AM4 Ryzen 2th Gen,AM4 AP");
		miTienda.agregarProducto("23451","Tecware","Mirage 240",9,14099,1250,"Taiwan",true,"Negro","Water cooling","cooler cpu",5,200,"Radiador","1200 Comet Lake,1150,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,1200 Rocket Lake-S,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen");
		miTienda.agregarProducto("111787","Azza","Blizzard LCAZZ 240r",5,19640,1500,"China", true,"Negro","Water Cooling","cooler cpu", 10,150,"cooler cpu","1200 Comet Lake,1150,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,1200 Rocket Lake-S,1366,2011,2011_v3,2066,AM2,AM2+,AM3,AM3+,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 APU 5000");
		miTienda.agregarProducto("890289","DeepCool","Castle v2 240 arg",20,19999,2000,"Vietnam",true,"Negro","Water Cooling ARGB", "cooler cpu","1200 Comet Lake,1150,1151,1155,1156,1200 Rocket Lake-S,2011_v3,2066,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen");
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();
		miTienda.agregarProducto();









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
									System.out.println("\n8.Memoria RAM:");
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

										System.out.println("Ingrese peso(Grs): ");
										double peso = teclado.nextDouble();

										System.out.println("Ingrese pais de origen: ");
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
										
										System.out.println("Ingrese capacidad del disco(GBs): ");
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
										//aca hay que agregar logica para cuando no hay stock
										System.out.println("\nMotherboards");
										System.out.println(miTienda.mostrarMothers());
										System.out.println("\nIngrese el codigo de la motherboard");
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
										codigoCooler=miTienda.buscarProducto(codigoCooler);
										System.out.println("\nElija GPU");
										System.out.println(miTienda.mostrarPlacas());
										System.out.println("\nIngrese el codigo de GPU");
										String codigoGPU = teclado.nextLine();

										Computadora nueva = new Computadora("Escritorio, custom",almacenamientoAcargar,memoriaAcargar,procesadorAcargar,motherAcargar,fuenteAcargar,gabineteAcargar,codigoGPU,codigoCooler );
										//aca hay que agregar la computadora a la tienda
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
										
										System.out.println("Ingrese el alto(cms):");
										int alto= teclado.nextInt();
										
										System.out.println("Ingrese el ancho(cms):");
										int ancho= teclado.nextInt();
										
										System.out.println("Ingrese el profundo(cms):");
										int profundo= teclado.nextInt();
										
										miTienda.agregarProducto(codigo2, marca, modelo, stock, precio, peso, paisOrigen, isRgb, color, descripcion,factorM,isVentana,slotsCooler,usbFrontal,alto,ancho,profundo);
								
										break;
									
									case 8: 
										System.out.println("\nMEMORIA RAM\n");
										System.out.println("Ingrese GBs de capacidad: ");
										int capacidadRam= teclado.nextInt();
										
										System.out.println("Ingrese la frecuencia(MHZ): ");
										int frecuencia= teclado.nextInt();
										
										System.out.println("Ingrese Gen(DDR): ");
										teclado.nextLine();
										String tipoRam=teclado.nextLine();
										
										System.out.println("Ingrese cantidad de tarjetas: ");
										int cantidadRam= teclado.nextInt();
										
										System.out.println("Ingrese la latencia: ");
										teclado.nextLine();
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
										
										System.out.println("Ingrese cantidad de slots para memoria Ram: ");
										int canSlotsM=teclado.nextInt();
										
										System.out.println("Ingrese cantidad de puertos sata: ");
										int puertosSata=teclado.nextInt();
										
										System.out.println("Ingrese salidas de video: ");
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
										
										System.out.println("Ingrese consumo(Wts): ");
										int consumoVideo=teclado.nextInt();
										
										System.out.println("Ingrese tipo de memoria(Gen): ");
										teclado.nextLine();
										String tipoDeMemoria=teclado.nextLine();
										
										System.out.println("Ingrese cantidad de memoria VRAM(GBs): ");
										int capMemoria= teclado.nextInt();
										
										System.out.println("Ingrese 1 si posee backPlate: ");
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
										
										System.out.println("Ingrese la frecuencia turbo(MHZ): ");
										int frecuenciaTurbo= teclado.nextInt();
										
										System.out.println("Ingrese proceso de fabricacion(numero nm): ");
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
									teclado.nextLine();
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
						int ventas=1;
						do{
							int opcionVentas=0;
							switch (opcionVentas){
								case 1:
									//cargar productos
									break;
								case 2:
									//cargar servicios
									break;
								case 3:
									//mostrar Carrito
									break;
								case 4:
									//check out
									break;

							}

							System.out.println("\nCargar productos en el carrito.");
							int opcionCargar;
							//mostrar catalogo y agregarlos al carrito

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
							System.out.println("\nDigite la opcion deseada:");
							opcionCargar= teclado.nextInt();
							switch(opcionCargar) {
								case 1:
									System.out.println("\nAlmacenamientos:");
									System.out.println(miTienda.mostrarAlmacenamiento());
									break;
								case 2:
									System.out.println("\nAuriculares:\n");
									System.out.println(miTienda.mostrarAuriculares());
									break;
								case 3:
									//revisar
									break;
								case 4:
									System.out.println("\nAlmacenamientos:");
									System.out.println(miTienda.mostrarCooler());
									break;
								case 5:
									System.out.println("\nFuente:\n");
									System.out.println(miTienda.mostrarFuentes());
									break;
								case 6:
									System.out.println("\nGabinetes:\n");
									System.out.println(miTienda.mostrarGabinetes());
									break;
								case 7:
									System.out.println("\nMemorias Ram:\n");
									System.out.println(miTienda.mostrarMemorias());
									break;
								case 8:
									System.out.println("\nMicrofonos:\n");
									System.out.println(miTienda.mostrarMicrofonos());
									break;
								case 9:
									System.out.println("\nMonitores:\n");
									System.out.println(miTienda.mostrarMonitores());
									break;
								case 10:
									System.out.println("\nMotherboards:\n");
									System.out.println(miTienda.mostrarMothers());
									break;
								case 11:
									System.out.println("\nMouses:\n");
									System.out.println(miTienda.mostrarMouses());
									break;
								case 12:
									System.out.println("\nAudio:\n");
									System.out.println(miTienda.mostrarParlantes());
									break;
								case 13:
									System.out.println("\nPlacas de video:\n");
									System.out.println(miTienda.mostrarPlacas());
									break;
								case 14:
									System.out.println("\nProcesadores:\n");
									System.out.println(miTienda.mostrarProcesadores());
									break;
								case 15:
									System.out.println("\nTeclados:\n");
									System.out.println(miTienda.mostrarTeclados());
									break;
								case 16:
									System.out.println("\nWebcams\n:");
									System.out.println(miTienda.mostrarWebcams());
									break;
								case 17:
									System.out.println("\nCatalogo completo:");
									System.out.println(miTienda.mostrarTodo());
									break;

							}
							if(opcionCargar!=0) {
							System.out.println("ingrese el codigo del disco a agregar\n");
							teclado.nextLine();
							String codigo= teclado.nextLine();
							System.out.println("Ingrese Cantidad\n");
							int cant=teclado.nextInt();
							if(miTienda.checkProducto(codigo)){
								Producto nuevo=miTienda.productoAcarrito(codigo);

								try{
									nuevo.reducirStock(cant);
									miTienda.agregarAlCarrito(nuevo,cant);
								} catch (NoHayStockExcepcion e) {
									e.printStackTrace();
								}
							}
							else
							{
								System.out.println("codigo equivocado");
							}
							System.out.println("Desea continuar? digite 1, otro valor para salir");
							ventas=teclado.nextInt();
							}else
							{
								ventas=0;
							}
						}while(ventas==1);

						if(miTienda.tamanioDeCarro()>0) {
						System.out.println("Carrito de compras:\n");
						System.out.println(miTienda.listarCarrito());
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
								//Cargar un cliente
								String nombre;
								String apellido;
								String dni;
								String correo;
								String telefono;
								String direccion;
								Cliente nuevo= new Cliente();
								break;
							case 2:
								//Editar cliente(se carga y reemplaza el cliente

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
		//aux.javaAJSON(miTienda.getCatalogo());
		}

}
