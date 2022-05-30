package test;

import ProductosYServicios.Almacenamiento;
import ProductosYServicios.Auriculares;
import ProductosYServicios.Cooler;
import ProductosYServicios.CoolerCpu;
import ProductosYServicios.Producto;

public class Main {
    public static void main(String[] args){
        System.out.println("probando");
        System.out.println("Probando Brian");
        
        Producto almacenamiento1 = new Almacenamiento("10001","Seagate","STEB6000403",5,30000,950,"Estados Unidos",false,"negro","disco almacenamiento1","coleccion1","SSD",6000);
        Producto almacenamiento2= new Almacenamiento("10002","Seagate","ST2000DM005",6,8700,415,"Estados Unidos",false,"gris","disco almacenamiento2","coleccion2","HDD",2000);
        Producto almacenamiento3 = new Almacenamiento("10003","Kingston","SA400S37/960G",10,17106,410,"Estados Unidos",false,"negro","disco almacenamiento3","coleccion3","SSD",960);
       
        Producto Auriculares1= new Auriculares("10004","HyperX","CloudX Stinger",7,6945,150,"Estados Unidos",false, "negro y verde","Auriculares 1",false,true,1);
        Producto Auriculares2= new Auriculares("10005","Logitech","Series G332",3,7810,200,"Suiza",false,"negro y rojo","Auriculares 2",false,true,2 );
        Producto Auriculares3= new Auriculares("10006","Logitech","G435",2,10700,250,"Suiza",false,"negro","Auriculares2",true,true,0);
        
        Producto cooler1 = new Cooler("10007","Sate","RGB-73K",4,6100,300,"Taiwan",true,"negro y rgb multicolor","cooler PC","cooler para Gabinete",6);
        Producto cooler2 = new Cooler("10008","Asus","Strix XF120",7,6400,100,"Taiwan",false,"negro","cooler PC","cooler para Gabinete",3);
        Producto coolerCpu = new CoolerCpu("10009","Xigmatek","WP964 RGB",8,4700,100,"China",true,"negro","cooler para CPU","Cooler para CPU",3,140,"Ventilador","Intel: LGA 2066/2011-v3 / 2011/1366/115 × / 1200 AMD: AM4 / AM3 + / AM3 / AM2 + / AM2 / FM2 + / FM2 / FM1");
        
    }
}
