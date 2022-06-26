package test;

import Facturacion.Factura;
import ProductosYServicios.Computadora;
import ProductosYServicios.Producto;
import ProductosYServicios.ItemServicio;
import ProductosYServicios.ServicioTaller;
import clases.Cliente;
import clases.Vendedor;
import excepciones.ContraseniaIncorrectaExcepcion;
import excepciones.DNIIncorrectoExcepcion;
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
    //String nombre, String apellido, String dni, String telefono, String direccion, String correo
    //String nombre, String apellido, String dni, String telefono, String direccion, String correo, String contrasenia
   // Factura facturaAux= new Factura();
    
	public void opciones(){
		
		
		miTienda.archivoATiendaInformatica();
		int cantF=miTienda.getFacturas().tamanio();
		Factura auxF=new Factura();
		auxF.setCantF(cantF);
		
		
		miTienda.agregarCliente("Brian","Lalli","38165168","22683434554","direccion1","correo1");	
		//miTienda.getFacturas().agregarObjetoColeccion(facturaAux.getId(), facturaAux);
		miTienda.agregarVendedor("Gonzalo","Benoffi","3512355","223542587","direccion2","correo2","contrasenia");
		miTienda.agregarVendedor("Pablo","Cuyo","34654651","2235965","direccion3","correo3","contrasenia2");
		
		
		
		String fuente= JsonUtiles.leer();
		if(fuente.isEmpty()){
			System.out.println("Este archivo no contiene nada\n\n");
		}
		StreamJSON aux= new StreamJSON();
		miTienda.setCatalogo(aux.JsonAJava(fuente));
		
		/*
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
	
		//Computadora
		
		miTienda.agregarProducto("13547", "XPG", "Xenia 15.6", 5, 190000, 1650,"China", true, "plateado", "W10H Silver","notebook","1TB SSD nvme", "16GB (2x8GB)", "Core i7 1165G7", " ", " ", " ", "Intel Integrated Graphics"," ");
		miTienda.agregarProducto("13082", "ASUS ROG", "ZEPHYRUS G14 14", 10, 275000, 1700, "China", true, "gris oscuro", "Ryzen 7 5800HS ","notebook","512GB SSD ", "16GB (2x8GB)", "Ryzen 7", "", "", "", "RTX 3050","");
		
		//CoolerGabinete
		miTienda.agregarProducto("10007","Sate","RGB-73K",4,6100,300,"Taiwan",true,"negro y rgb multicolor","120mm","cooler para Gabinete",6);
		miTienda.agregarProducto("12372","ID-Cooling","NO-8025-SD",20,400,100,"Taiwan",false,"negro","120mm","cooler para Gabinete",3);
		miTienda.agregarProducto("8014","ID-Cooling","WF-12025-SD-W",7,6400,100,"Taiwan",false,"negro","80mm","cooler para Gabinete",3);
		miTienda.agregarProducto("13009","Be quiet!","PURE WINGS 2",9,1200,150,"China",false,"blanco","120mm high speed PWM","cooler para Gabinete",3);
		miTienda.agregarProducto("10008","Asus","Strix XF120",7,6400,100,"Taiwan",false,"negro","cooler Gabinete","cooler para Gabinete",3);
		miTienda.agregarProducto("10008","Asus","Strix XF120",7,6400,100,"Taiwan",false,"negro","cooler Gabinete","cooler para Gabinete",3);
		miTienda.agregarProducto("10008","Asus","Strix XF120",7,6400,100,"Taiwan",false,"negro","cooler Gabinete","cooler para Gabinete",3);
		miTienda.agregarProducto("10008","Asus","Strix XF120",7,6400,100,"Taiwan",false,"negro","cooler Gabinete","cooler para Gabinete",3);
		miTienda.agregarProducto("10008","Asus","Strix XF120",7,6400,100,"Taiwan",false,"negro","cooler Gabinete","cooler para Gabinete",3);
		miTienda.agregarProducto("10008","Asus","Strix XF120",7,6400,100,"Taiwan",false,"negro","cooler Gabinete","cooler para Gabinete",3);

		//cooler cpu
		miTienda.agregarProducto("10009","Xigmatek","WP964 RGB",8,4700,350,"China",true,"negro","cooler de aire","Cooler CPU",3,140,"Ventilador","Intel: LGA 2066/2011-v3 / 2011/1366/115 ï¿½ / 1200 AMD: AM4 / AM3 + / AM3 / AM2 + / AM2 / FM2 + / FM2 / FM1");
		miTienda.agregarProducto("10023","ID-Cooling","SE-902-SD",20,2199,400,"China",false,"negro","cooler de aire","Cooler CPU",5,100,"Ventilador","1151,1150,1151 Kaby Lake,1151 Coffe Lake,1155,1156,AM2,AM2+,1200 Comet Lake,AM3,AM3+,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,FM1,FM2,FM2+,AM4 APU 5");
		miTienda.agregarProducto("00021","Cooler Master","Hyper T20",15,2699,400,"China",false,"negro","cooler de aire","Cooler CPU",5,110,"Ventilador","1200 Comet Lake,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,115X,1200,1200 Rocket Lake-S,AM2,AM2+,AM3,AM3+,AM4,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen,FM1,FM2,F");
		miTienda.agregarProducto("10033","ID-Cooling","SE-903-XT",30,3230,600,"China",true,"negro","cooler de aire","Cooler CPU",5,130,"Ventilador","1200 Comet Lake,1150,1151 Coffe Lake,1151 Kaby Lake,1155,1156,1200 Rocket Lake-S,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen,1700 Alder Lake-S,1700");
		miTienda.agregarProducto("202071","DeepCool","Gammaxx 400 V2 RED",14,3899,450,"Taiwan",true,"Negro","cooler de aire","Cooler CPU", 5,130,"Ventilador","1200 Comet Lake,1150,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,AM2,AM2+,AM3,AM3+,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,FM1,FM2,FM2+,AM4 APU 5000");
		miTienda.agregarProducto("202021","DeepCool","Gammaxx 400 V2 RED",14,3899,450,"Taiwan",true,"Negro","cooler de aire","Cooler CPU", 5,130,"Ventilador","1200 Comet Lake,1150,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,AM2,AM2+,AM3,AM3+,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,FM1,FM2,FM2+,AM4 APU 5000");
		miTienda.agregarProducto("131238","Be Quiet!","Pure Rock 2 Black",10,7130,750,"China",false,"Negro","cooler de aire","Cooler cpu",2,150,"Ventilador","1200 Comet Lake,1150,1151 Coffe Lake,1151 Kaby Lake,1155,1156,2011_v3,2066,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen");
		miTienda.agregarProducto("118426","ID-Cooling","FROSTFLOW X 240",25,9979,1200,"Taiwan", true,"Negro", "water cooling","Cooler cpu",10,250,"Radiador","775,1150,1151,1151 Coffe Lake,1155,1155_3,1156,1366,2011,2011_v3,2066,AM2,AM2+,AM3,AM3+,AM4,AM4 A-Series,FM1,FM2,FM2+,AM4 3ra Gen,1151 Kaby Lake,AM4 Ryzen 3th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 1th Gen,AM4 APU 2th Gen,AM4 APU 1th Gen,AM4 Ryzen 2th Gen,AM4 AP");
		miTienda.agregarProducto("23451","Tecware","Mirage 240",9,14099,1250,"Taiwan",true,"Negro","Water cooling","cooler cpu",5,200,"Radiador","1200 Comet Lake,1150,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,1200 Rocket Lake-S,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen");
		miTienda.agregarProducto("111787","Azza","Blizzard LCAZZ 240r",5,19640,1500,"China", true,"Negro","Water Cooling","cooler cpu", 10,150,"cooler cpu","1200 Comet Lake,1150,1151,1151 Coffe Lake,1151 Kaby Lake,1155,1156,1200 Rocket Lake-S,1366,2011,2011_v3,2066,AM2,AM2+,AM3,AM3+,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 APU 5000");
		miTienda.agregarProducto("890289","DeepCool","Castle v2 240 arg",20,19999,2000,"Vietnam",true,"Negro","Water Cooling ARGB", "cooler cpu","1200 Comet Lake,1150,1151,1155,1156,1200 Rocket Lake-S,2011_v3,2066,AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 APU 3th Gen,AM4 APU 5000,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen");
		
		//fuentes
		miTienda.agregarProducto("212355","Sentey","High Beat Power",10,8899,500,"EE.UU",false,"negro y marron","fuente Sentey",650,"ATX","certificacion 80 plus bronce",true);
		miTienda.agregarProducto("212356","LNZ","ZX650-LS",12,5499,600,"Argentina",false,"negro y naranja","fuente LNZ	",650,"ATX","certificacion no",false);
		miTienda.agregarProducto("212357","ASUS","ROG STRIX 750G",7,26000,750,"Taiwan",false,"negro","fuente ASUS",650,"ATX","certificacion 80 plus gold",true);
		
		//gabinete
		miTienda.agregarProducto("220001","MAGNUMTECH","435R-FANLED",10,5050,1000,"EE.UU",true,"negro","Gabinete magnumtech","ITX,M-ATX,ATX",true,5,3,42,20,41);
		miTienda.agregarProducto("220002","Thermaltake","Ryzen Edition",12,5220,1200,"Espania",false,"negro","Gabinete Thermaltake","ITX,M-ATX,ATX",true,11,3,41,19,47);
		miTienda.agregarProducto("220003","Shensy","SH-F18",14,5380,1300,"EE.UU",true,"negro","Gabinete Shensy","ITX,M-ATX,ATX",true,7,3,45,20,36);
		
		//Memorias Ram
		miTienda.agregarProducto("230001","Kingston","Fury Beast CL16",15,4990,10,"EE.UU",false,"negro","memoria ram Kingston 8gb",8,3200,"DDR4",1,"16cl",1.35f,true);
		miTienda.agregarProducto("230002","GeiL","Super Luce",7,11340,15,"Taiwan",true,"negro","memoria ram GeiL 16gb",16,3000,"DDR4",1,"16cl",1.35f,true);
		miTienda.agregarProducto("230003","Corsair","Vengeance LP",20,6390,10,"Taiwan",false,"negro y verde","memoria ram Corsair 8gb",8,1600,"DDR3",1,"1cl",1f,true);
		
		//Microfonos
		miTienda.agregarProducto("240001","Logitech ","Blue Snowball Black",50,7540,200,"Suiza",false,"negro","microfono Logitech","Pie corto de mesa","USB");
		miTienda.agregarProducto("240002","HyperX ","QuadCast",20,23190,300,"EE.UU",true,"negro y rojo","microfono HyperX","Pie corto de mesa","USB");
		miTienda.agregarProducto("240003","HyperX ","QuadCast S",10,32707,150,"EE.UU",true,"negro","microfono HyperX","Pie corto de mesa","USB");
		
		//Monitor
		miTienda.agregarProducto("250001","LG","19M38A-B",7,24690,2000,"Corea del sur",false,"negro","Monitor LG","TN",false,"VGA","externa",19,"1366x768","60hz");
		miTienda.agregarProducto("250002","LG","20MK400H-B",6,27660,2100,"Corea del sur",false,"negro","Monitor LG","TN",false,"HDMI-VGA","externa",20,"1366x768","60hz");
		miTienda.agregarProducto("250003","Lenovo ","S22E",5,28430,2000,"China",false,"negro","Monitor Lenovo","VA",false,"HDMI-VGA","interna",22,"1920x1080","60hz");
		
		//MotherBoard
		miTienda.agregarProducto("260001","ASUS","PRIME H310M",10,7790,500,"Taiwan",false,"negro","Mother ASUS","Intel","1151 Coffe Lake","M-ATX",2,4,"HDMI,DVI,VGA",0,6);
		miTienda.agregarProducto("260002","Gigabyte","AB350M",12,8570,600,"Taiwan",false,"negro","Mother Gigabyte","AMD","AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen","M-ATX",4,4,"HDMI,DVI",2,8);
		miTienda.agregarProducto("260003","ASUS","PRIME A320M-K",9,8690,700,"Taiwan",false,"azul","Mother ASUS","AMD","AM4 A-Series,AM4 APU 1th Gen,AM4 APU 2th Gen,AM4 Ryzen 1th Gen,AM4 Ryzen 2th Gen,AM4 Ryzen 3th Gen,AM4 Ryzen 4th Gen,AM4 APU 5000","M-ATX",2,4,"HDMI,VGA",1,6);
		
		//mouse
		miTienda.agregarProducto("270003","Logitech","G903",10,11599,110,"Suiza",true,"negro","Mouse Logitech",11,"Hero","Optico",false,16000);
		miTienda.agregarProducto("270004","HyperX","Pulsefire Surge",20,4200,100,"EE.UU",true,"negro y rojo","Mouse HyperX",6,"Omron","Óptico",false,16000);
		miTienda.agregarProducto("270005","Corsair","Ironclaw",15,9.800,105,"Taiwan",true,"negro y blanco","Mouse Corsair",7,"Omron","Optico",false,18000);
		
		//Parlantes
		miTienda.agregarProducto("280001", "Logitech ", "Z607",15,19630, 2500, "Taiwan", true, "Negro", "5.1 Surround Bluetooth", "160W ", "USB", "220v");
		miTienda.agregarProducto("280002", "Logitech ", "UE BOOM 3 Sunset RED",40,19680, 500, "Taiwan", false, "Rojo", "Portatil y Bluetooth", "60W ", "micro USB","Bateria interna");
		
		
		//Placa de video
		miTienda.agregarProducto("290001", "Asus Rog","RTX 3050 ", 10, 85000, 2500, "china", true, "Negro y plateado", "8GB DDR6", "HDMI,DP", 160,"DDR6",8, true);
		miTienda.agregarProducto("290002", "Zotac ","GeForce GTX 1660 ", 20, 58000, 2000,"china", false, "Negro", "6GB DDR5", "HDMI,DP", 120,"DDR5",6, true);
	    miTienda.agregarProducto("290003", "GALAX  ","GeForce GTX 3080", 5, 158000, 2000,"china", true, "Plateado", "SG LHR (1-Click OC)", "HDMI,DP", 320,"DDR6",10, true);
	    
	    //Procesadores
	    miTienda.agregarProducto("30001", "AMD","Ryzen 3 4100", 30, 14000, 400, "Malasia",false,"gris", "No posee graficos integrados", "AM4", 4, 4, 3800, 7, 65, false);
	    miTienda.agregarProducto("30002", "AMD","Ryzen 5 4500", 10, 19000, 400,"Malasia",false,"gris", "Posee graficos integrados", "AM4", 6, 12,3600, 7, 65, true);
	    miTienda.agregarProducto("30003", "Intel","I7 11700F s1200", 14, 49000, 700,"China",true,"gris", "12th gen", "1200 Rocket Lake-S\n", 8, 16,4900, 14, 65, false);
		
	    //Teclado
	    miTienda.agregarTeclado("12038", "Marvo", "KG965G", 40, 7000, 1900, "China", true, "Negro", "Permite macros","Mecanico", "Completo","outemu Blue");
        miTienda.agregarTeclado("7420", "Redragon", "k550 YAMA White", 20, 9000, 1900, "China", true, "Blanco", "Macros, idioma español","Mecanico", "Completo","outemu Purple");
        miTienda.agregarTeclado("10461", "Glorious", "Compact", 10, 14000, 2100, "China",true, "Negro", "hotswap 3pines","Mecanico", "Completo","gateron brown");
	    //WebCam
	    miTienda.agregarProducto("320001","Redragon","GW600 FOBOS",20,3930,200,"Argentina",false,"negro y rojo","WebCam Redragon","720p","optico","720",true);
		miTienda.agregarProducto("320002","Logitech","C920e",25,10120,200,"Suiza",false,"negro y azul","WebCam Logitech","1920 x 1080","optico","full HD",true);
	
				
		
		miTienda.agregarService(new ItemServicio("Armado PC", 1000));
		miTienda.agregarService(new ItemServicio("Instalacion SO", 500));
		miTienda.agregarService(new ItemServicio("Limpieza PC", 1500));
		*/
		
		
		int opcion,opcionCatalogo;

		Scanner teclado = new Scanner(System.in);
		miTienda.getCatalogo();
		StreamJSON nuevoJSON = new StreamJSON();
		
		
		boolean accedido=false;
		System.out.println("\nIngrese su dni para ingresar: ");
		String dniLogin= teclado.nextLine();
		System.out.println("\nIngrese contraseña: \n");
		String contraseñaLogin=teclado.nextLine();
		try {
			if(miTienda.comprobarLoginVendedor(dniLogin, contraseñaLogin)==true) 
			{
				accedido=true;
				
				
			}
		} catch (ContraseniaIncorrectaExcepcion e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage()); 
		} catch (DNIIncorrectoExcepcion e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage()); 
		}
		
		
		
		if(accedido) {
			Vendedor vendedorActivo=miTienda.retornarVendedor(dniLogin);
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
							System.out.println("\n5.Actualizar producto");
							int menuCatalogo = teclado.nextInt();
							switch (menuCatalogo) {
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
										
										System.out.println("Ingrese capacidad del disco(MBs): ");
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
										System.out.println("Ingrese tipo de PC(Notebooke,AIO,Escritorio):");
										String tipoPc=teclado.nextLine();
										
										System.out.println("\nIngrese motherboard");
										String mother = teclado.nextLine();
								
										System.out.println("\nIngrese Procesador");
										String procesador = teclado.nextLine();
									
										
										System.out.println("\nIngrese memoria Ram");
										String memoriaR = teclado.nextLine();
										
										System.out.println("\nIngrese Fuente");
										String fuenteC = teclado.nextLine();
								
										System.out.println("\nIngrese Gabinete");
										String gabinete = teclado.nextLine();
										
										System.out.println("\nIngrese Almacenamiento");
										String almacenamiento = teclado.nextLine();
										
								
										System.out.println("\nIngrese Cooler");
										String cooler = teclado.nextLine();
	
										System.out.println("\nIngrese GPU");
										String GPU = teclado.nextLine();

									
										miTienda.agregarProducto(codigo2,marca,modelo,stock,precio,peso,paisOrigen,isRgb,color,descripcion,tipoPc,almacenamiento,memoriaR,procesador,mother,fuenteC,gabinete,GPU,cooler);
									
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
											System.out.println(miTienda.mostrarComputadora());
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
									
									case 5:
										System.out.println("\nIngrese el codigo del producto: ");
										teclado.nextLine();
										String codigoMP=teclado.nextLine();
										int stock=0;
										if(miTienda.checkProducto(codigoMP)) {
											
											System.out.println("1.Modificar precio. \n2.Aumentar stock de producto. \n3.Reducir stock. ");
											int opModificarProducto=teclado.nextInt();
											
											switch(opModificarProducto) 
											{
											case 1:
												System.out.println("\nIngrese nuevo precio: ");
												double nuevoPrecio=teclado.nextDouble();
												miTienda.actualizarPrecioProducto(codigoMP,nuevoPrecio);
												break;
											case 2:
												System.out.println("Ingrese cantidad a agregar: ");
												stock= teclado.nextInt();
												System.out.println("Se actualizo el stock a: "+miTienda.aumentarStockDeProducto(codigoMP,stock));
												break;
											case 3:
												System.out.println("Ingrese cantidad a reducir: ");
												stock=teclado.nextInt();
												try {
													System.out.println("Se actualizo el stock a: "+miTienda.reducirStockDeProducto(codigoMP,stock));
												} catch (NoHayStockExcepcion e) {
													// TODO Auto-generated catch block
													System.out.println(e.getMessage()); 
												}
												break;
											
											}
										}
										break;
							}
							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();
						}while(cont == 1);
						break;
					case 2:
						System.out.println("1.Agregar productos al carrito");
						System.out.println("2.Agregar Servicio al carrito");
						System.out.println("3.Ver carrito");
						System.out.println("4.Proceder a checkout");
						int opcionVentas= teclado.nextInt();
						int ventas=1;
						do{
					
							switch (opcionVentas){
								case 1:
									System.out.println("\nCargar productos en el carrito.");
									int opcionCargar;
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
											System.out.println("\nComputadoras:\n");
											System.out.println(miTienda.mostrarComputadora());
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
										System.out.println("ingrese el codigo a agregar\n");
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
												System.out.println(e.getMessage());
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


									break;
								case 2:
									System.out.println("1.Armado de PC.");
									System.out.println("2.Instalacion de SO.");
									System.out.println("3.Limpieza de pc.");
									System.out.println("\nDigite la opcion deseada...");
									int opcionService= teclado.nextInt();
									System.out.println(opcionService);
									miTienda.agregarServiceAlCarrito(opcionService);
									ventas=0;
									break;
								case 3:
									
									if(miTienda.tamanioDeCarro()>0) 
									{
										System.out.println("Carrito de compras:\n");
										System.out.println(miTienda.listarCarrito());
									}else 
									{
										System.out.println("EL CARRITO NO CONTIENE PRODUCTOS");
									}
									
									
									ventas=0;
									break;
								case 4:
									
									System.out.println("\n¿Desea generar una factura? 1 para continuar otro valor para salir\n");
									int rta= teclado.nextInt();
									if(miTienda.tamanioDeCarro()>0 && rta==1) {
									System.out.println("Ingrese DNI cliente:\n");
									teclado.nextLine();
									String DNICliente=teclado.nextLine();
									if(!miTienda.getListaDeClientes().existe(DNICliente)) 
									{
										System.out.println("\nIngrese nombre");
										teclado.nextLine();
										String nombre= teclado.nextLine();
										System.out.println("\nIngrese Apellido");
										String apellido= teclado.nextLine();
										
										String dni= DNICliente;
										System.out.println("\nIngrese correo");
										String correo= teclado.nextLine();
										System.out.println("\nIngrese telefono");
										String telefono= teclado.nextLine();
										System.out.println("\nIngrese direccion");
										String direccion= teclado.nextLine();

										miTienda.agregarCliente(nombre,apellido,dni, telefono, direccion,correo);

									}
									
									Cliente comprador=miTienda.retornarCliente(DNICliente);
									
									System.out.println(miTienda.ticket(comprador,miTienda.getCarroDeCompras(),vendedorActivo));
									miTienda.getCarroDeCompras().vaciarCarro();
								 }

									ventas=0;
									break;	
							}

							
						}while(ventas==1);
					
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
								System.out.println("TAREAS TALLER: \n");
								System.out.println(miTienda.listarTaller()); 
								break;
							case 2:
								//Conformar Servicio
								miTienda.conformarServicio();
								System.out.println("Lista servicios pendientes: ");
								System.out.println(miTienda.listarTaller());
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
						System.out.println("3.Buscar Cliente");
						System.out.println("4.Listar Clientes");
						System.out.println("5.Listar facturas de un cliente");
						opcion = teclado.nextInt();


						switch (opcion) {
							case 1:
								//Cargar un cliente
								System.out.println("\nIngrese nombre");
								teclado.nextLine();
								String nombre= teclado.nextLine();
								System.out.println("\nIngrese Apellido");
								String apellido= teclado.nextLine();
								System.out.println("\nIngrese dni");
								String dni= teclado.nextLine();
								System.out.println("\nIngrese correo");
								String correo= teclado.nextLine();
								System.out.println("\nIngrese telefono");
								String telefono= teclado.nextLine();
								System.out.println("\nIngrese direccion");
								String direccion= teclado.nextLine();

								miTienda.agregarCliente(nombre,apellido,dni, telefono, direccion,correo);

								break;
							case 2:
								System.out.println("\nIngrese DNI del cliente a buscar:\n");
								teclado.nextLine();
								String id= teclado.nextLine();
								System.out.println(miTienda.buscarCliente(id));
								System.out.println("\nCliente correcto?\n1.Ok\n2.Incorrecto\n");
								int correcto= teclado.nextInt();
								if(correcto==1) {
									System.out.println("\nQue desea cambiar?");
									System.out.println("\n1.Direccion.");
									System.out.println("\n2.Telefono.");
									System.out.println("\n3.Correo Electronico.");
									int opcionEdit= teclado.nextInt();
									System.out.println("\nIngrese el nuevo dato a reemplazar:\n");
									teclado.nextLine();
									String nuevoDato= teclado.nextLine();
									miTienda.editarCliente(id,nuevoDato,opcionEdit);
									System.out.println(miTienda.buscarCliente(id));
								}
								break;
							case 3:
								System.out.println("\nIngrese DNI del cliente:\n");
								teclado.nextLine();
								String idAbuscar= teclado.nextLine();
								if(miTienda.existeCliente(idAbuscar)) 
								{
									System.out.println(miTienda.buscarCliente(idAbuscar));
									System.out.println("Desea ver las facturas del cliente? \n1.Si \nOtro numero.No ");
									int opMostrarFacturas= teclado.nextInt();
									if(opMostrarFacturas==1) 
									{
										System.out.println(miTienda.mostrarFacturasDeCliente(idAbuscar)); 
									}
								}else 
								{
									System.out.println("No Existe cliente");
								}
								break;
							case 4:
								System.out.println("\nCLIENTES: \n"+miTienda.listarClientes());
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
							System.out.println("\n5.Listar vendedores");
							System.out.println("\n6.Listar facturas");
							System.out.println("\n7.Bucar factura por ID");
							int opcionADM = teclado.nextInt();

							switch (opcionADM) {
								case 1:
									////Cargar un vendedor
									System.out.println("\nIngrese nombre");
									teclado.nextLine();
									String nombre= teclado.nextLine();
									System.out.println("\nIngrese Apellido");
									String apellido= teclado.nextLine();
									System.out.println("\nIngrese dni");
									String dni= teclado.nextLine();
									System.out.println("\nIngrese correo");
									String correo= teclado.nextLine();
									System.out.println("\nIngrese telefono");
									String telefono= teclado.nextLine();
									System.out.println("\nIngrese direccion");
									String direccion= teclado.nextLine();
									
								
									System.out.println("\nIngrese contraseña: ");
									String contrasenia= teclado.nextLine();
									
									miTienda.agregarVendedor(nombre, apellido, dni, telefono, direccion, correo,contrasenia);

									break;
								case 2:
									System.out.println("\nIngrese DNI del vendedor a buscar:\n");
									teclado.nextLine();
									String idVendedor= teclado.nextLine();
									System.out.println(miTienda.buscarVendedor(idVendedor));
									System.out.println("\nVendedor correcto?\n1.Ok\n2.Incorrecto\n");
									int correcto= teclado.nextInt();
									if(correcto==1) {
										System.out.println("\nQue desea cambiar?");
										System.out.println("\n1.Direccion.");
										System.out.println("\n2.Telefono.");
										System.out.println("\n3.Correo Electronico.");
										int opcionEdit= teclado.nextInt();
										System.out.println("\nIngrese el nuevo dato a reemplazar:\n");
										teclado.nextLine();
										String nuevoDato= teclado.nextLine();
										miTienda.editarVendedor(idVendedor,nuevoDato,opcionEdit);
										System.out.println(miTienda.buscarVendedor(idVendedor));
									}
									break;
								case 3:
									//remover vendedor
									System.out.println("\nIngrese DNI del vendedor a remover:\n");
									teclado.nextLine();
									String idEliminar= teclado.nextLine();
									System.out.println(miTienda.buscarVendedor(idEliminar));
									System.out.println("\nVendedor a eliminar correcto?\n1.Ok\n2.Incorrecto\n");
									int correctoElminar= teclado.nextInt();
									if(correctoElminar==1) 
									{
										miTienda.removerVendedor(idEliminar);
									}
									break;
								case 4:
									//ver vendedor
									System.out.println("\nIngrese DNI del vendedor:\n");
									teclado.nextLine();
									String idAbuscar= teclado.nextLine();
									System.out.println(miTienda.buscarVendedor(idAbuscar));
									break;
								case 5:
									//listar vendedores
									System.out.println("\nVENDEDORES: \n"+miTienda.listarVendedores());
									break;
								
								case 6: 
									System.out.println("FACTURAS DE LA TIENDA: \n");
									System.out.println(miTienda.listarFacturas()); 
									break;
								
								case 7:
									System.out.println("Ingrese ID de factura: \n");
									int idFactura= teclado.nextInt();
									
									System.out.println(miTienda.buscarFactura(idFactura));
									break;
							}

							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();
						}while(cont==1);
						break;

				}
			} while (opcion < 6 && opcion > -1);

			miTienda.pasarTiendaAArchivo();
			}
		System.out.println(nuevoJSON.javaAJSON(miTienda.getCatalogo()));
		
		
		}

}
