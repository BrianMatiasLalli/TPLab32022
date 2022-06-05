package test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Menu {

	
	private TiendaInformatica miTienda;

	public Menu() {
		this.miTienda = new TiendaInformatica("Tienda1");
	}

	public void opciones(){
		int opcion;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("\nMenu Principal.\nDiginte la opcion deseada o 9 para salir\n");
			System.out.println("\n1.Catalogo.");
			System.out.println("\n2.Ventas.");
			System.out.println("\n3.Taller.");
			System.out.println("\n4.Clientes.");
			System.out.println("\n5.Administrador.");
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
									//aca preguntas los datos exactos y llamas al agregar de tienda
									System.out.println("\n2.Auriculares.");
									System.out.println("\n3.Categoria:");
									System.out.println("\n4.Categoria:");
									System.out.println("\n5.Categoria:");
									System.out.println("\n6.Categoria:");



									//agregar producto
									break;
								case 2:
									//quitar producto
									break;
								case 3:
									//Listar Productos
									break;
								case 4:
									//Consultar Producto
									break;
							}
							System.out.println("\n1 para continuar, otro digito para salir\n");
							cont = teclado.nextInt();
						}while(cont == 1);
						break;
					case 2:
						System.out.println("\nVenta/Carrito:");

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

		}

}
