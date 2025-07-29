import java.util.Scanner;
import java.util.Random;


public class Main {
    
    public static void main(String[] args) {

        Localidad l1 = new Localidad(20, 100, "Localidad 1");
        Localidad l2 = new Localidad(20, 500, "Localidad 5");
        Localidad l3 = new Localidad(20, 1000, "Localidad 10");

        Comprador c1 = new Comprador(null, null, 1, 1);
        
        int opcion;
        Scanner leer = new Scanner(System.in);

        do{
        do {
        System.out.println("1. Nuevo comprador:");
        System.out.println("2. Nueva solicitud de boletos:");
        System.out.println("3. Consultar disponibilidad total:");
        System.out.println("4. Consultar disponibilidad individual:");
        System.out.println("5. Reporte de caja:");
        System.out.println("6. Salir:");
        System.out.println("Ingrese alguna opción (Del 1 al 6): ");
        opcion = leer.nextInt();

        } while (opcion < 1 || opcion > 6);
        switch (opcion) {
            case 1:
                Scanner datos = new Scanner(System.in);
                System.out.println("Ingrese su nombre: ");
                c1.setNombre(datos.nextLine());
                System.out.println("Ingrese su email: ");
                c1.setEmail(datos.nextLine());
                System.out.println("Ingrese su presupuesto: ");
                c1.setPresupuesto(datos.nextInt());
                System.out.println("Ingrese la cantidad de voletos a comprar: ");
                c1.setCan_boletos(datos.nextInt());
                System.out.println("-------------------------------------------------------------");
                break;

            case 2:
                Random ticket = new Random();
                int x = ticket.nextInt(15000)+1;
                int a = ticket.nextInt(15000)+1;
                int b = ticket.nextInt(15000)+1;

                if (a<= x && x <= b || a>= x && x >= b) {
                    System.out.println("Ticket de compra aprobado");
                    int i = ticket.nextInt(3)+1;
                    switch (i) {
                        case 1:
                            if (l1.getEspacio() == 0) {
                                System.out.println("Ya no hay espacios disponibles, por favor genere otro ticket");
                            }
                            else{
                                if (l1.getEspacio()< c1.getCan_boletos()){
                                    int costo = l1.getCosto()*l1.getEspacio();
                                    if(costo > c1.getPresupuesto()){
                                        System.out.println("Fondos insuficientes para, "+ l1.getNombre() +  " por favor genere otro ticket");
                                    }
                                    else{
                                    System.out.println("No tenemos suficientes espacios para venderle, solo se le venderan " + l1.getEspacio() + " boletos");
                                    l1.setEspacio(l1.getEspacio() - l1.getEspacio());
                                }
                                }
                                else {
                                    int costo = l1.getCosto()*c1.getCan_boletos();
                                    if(costo > c1.getPresupuesto()){
                                        System.out.println("Fondos insuficientes para, "+ l1.getNombre() +  " por favor genere otro ticket");
                                    }
                                    else{
                                        l1.setEspacio(l1.getEspacio()-c1.getCan_boletos());
                                        System.out.println("Sus boletos han sido comprados para " + l1.getNombre());
                                    }
                                }
                            }
                            break;

                        case 2:
                                if (l2.getEspacio() == 0) {
                                System.out.println("Ya no hay espacios disponibles, por favor genere otro ticket");
                            }
                            else{
                                if (l2.getEspacio()< c1.getCan_boletos()){
                                    int costo = l2.getCosto()*l2.getEspacio();
                                    if(costo > c1.getPresupuesto()){
                                        System.out.println("Fondos insuficientes para, "+ l2.getNombre() +  " por favor genere otro ticket");
                                    }
                                    else{
                                    System.out.println("No tenemos suficientes espacios para venderle, solo se le venderan " + l2.getEspacio() + " boletos");
                                    l2.setEspacio(l2.getEspacio() - l2.getEspacio());
                                }
                                }
                                else {
                                    int costo = l2.getCosto()*c1.getCan_boletos();
                                    if(costo > c1.getPresupuesto()){
                                        System.out.println("Fondos insuficientes para, "+ l2.getNombre() +  " por favor genere otro ticket");
                                    }
                                    else{
                                        l2.setEspacio(l2.getEspacio()-c1.getCan_boletos());
                                        System.out.println("Sus boletos han sido comprados para " + l2.getNombre());
                                    }
                                }
                            }
                            break;

                        case 3:
                                if (l3.getEspacio() == 0) {
                                System.out.println("Ya no hay espacios disponibles, por favor genere otro ticket");
                            }
                            else{
                                if (l3.getEspacio()< c1.getCan_boletos()){
                                    int costo = l3.getCosto()*l3.getEspacio();
                                    if(costo > c1.getPresupuesto()){
                                        System.out.println("Fondos insuficientes para, "+ l3.getNombre() +  " por favor genere otro ticket");
                                    }
                                    else{
                                    System.out.println("No tenemos suficientes espacios para venderle, solo se le venderan " + l3.getEspacio() + " boletos");
                                    l3.setEspacio(l3.getEspacio() - l3.getEspacio());
                                }
                                }
                                else {
                                    int costo = l3.getCosto()*c1.getCan_boletos();
                                    if(costo > c1.getPresupuesto()){
                                        System.out.println("Fondos insuficientes para, "+ l3.getNombre() +  " por favor genere otro ticket");
                                    }
                                    else{
                                        l3.setEspacio(l3.getEspacio()-c1.getCan_boletos());
                                        System.out.println("Sus boletos han sido comprados para " + l3.getNombre());
                                    }
                                }
                            }
                            break;
                        }
                    }
                else{
                    System.out.println("Ticket denegado, intente nuevamente");
                }
                System.out.println("-------------------------------------------------------------");
                break;
            
            case 3:
                int Espacios = l1.getEspacio() + l2.getEspacio() + l3.getEspacio();
                Bvendidos bv1 = new Bvendidos(20, l1.getEspacio());
                Bvendidos bv2 = new Bvendidos(20, l2.getEspacio());
                Bvendidos bv3 = new Bvendidos(20, l3.getEspacio());
                System.out.println("En " + l1.getNombre() + " se han vendido " + bv1.getBrestantes());
                System.out.println("En" + l2.getNombre() + " se han vendido " + bv2.getBrestantes());
                System.out.println("En" + l3.getNombre() + " se han vendido " + bv3.getBrestantes());
                System.out.println("Aun quedan " + Espacios + " espacios sin vender ");
                System.out.println("-------------------------------------------------------------");
                break;
                
            case 4:
                Scanner localidadE = new Scanner(System.in);
                int Nlocalidad;

                System.out.println("1. Ver boletos disponibles en Localidad 1: ");
                System.out.println("2. Ver boletos disponibles en Localidad 5: ");
                System.out.println("3. Ver boletos disponibles en Localidad 10: ");
                System.out.println("Ingrese una localidad para ver (Del 1 al 3): ");
                Nlocalidad = localidadE.nextInt();

                switch (Nlocalidad) {
                    case 1:
                        System.out.println("En " + l1.getNombre() + " hay " + l1.getEspacio() + " espacios libres");
                        break;
                
                    case 2:
                        System.out.println("En " + l2.getNombre() + " hay " + l2.getEspacio() + " espacios libres");
                        break;

                    case 3:
                        System.out.println("En " + l3.getNombre() + " hay " + l3.getEspacio() + " espacios libres");
                        break;
                }
                System.out.println("-------------------------------------------------------------");
                break;

            case 5:
                Bvendidos bv4 = new Bvendidos(20, l1.getEspacio());
                Bvendidos bv5 = new Bvendidos(20, l2.getEspacio());
                Bvendidos bv6 = new Bvendidos(20, l3.getEspacio());
                int ganancias = ((bv4.getBrestantes()*l1.getCosto()) + (bv5.getBrestantes()*l2.getCosto()) +(bv6.getBrestantes()*l3.getCosto()));
                System.out.println("Se ha generado "+ ganancias + " dolares");
                System.out.println("-------------------------------------------------------------");
                break;
                
            case 6:
                System.exit(0);
                break;
                } 
        } while (opcion != 6);
    }
}