package ProyectoFinal.ui;

import ProyectoFinal.Contenedoras.CArrayList;
import ProyectoFinal.Contenedoras.CLinkedList;
import ProyectoFinal.Contenedoras.CQueue;
import ProyectoFinal.Contenedoras.CStack;
import ProyectoFinal.Teatro.Teatro2;
import ProyectoFinal.cl.General;
import ProyectoFinal.cl.Graderia;
import ProyectoFinal.cl.PersonasReservas;
import ProyectoFinal.cl.Preferencial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;
import java.util.Scanner;

public class menus {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
	static PrintStream out = System.out;

    static CArrayList listaUsuariosPreferencial = new CArrayList();
    static CLinkedList listaGeneral = new CLinkedList();
    static CStack listaGraderia = new CStack();
    static CQueue colaPreferencial = new CQueue();
    static CQueue colaGraderia = new CQueue();
    static CQueue colaGeneral = new CQueue();
    static Scanner entrada = new Scanner(System.in);

    static Preferencial Preferencial = new Preferencial(null);
    static Graderia Graderia = new Graderia(null);
    static General General = new General(null);

    static String scenario[][] = new String[3][3];

    /* *****************************************
           INICIO DE OPCIONES PARA MENUS
       **************************************** */
    public static void presentarMenu() {
        System.out.println(" ***************************************** ");
        System.out.println("1. Realizar reservacion; ");
        System.out.println("2. Mostrar reservas por ubicacion: ");
        System.out.println("3. Mostrar colas de espera por ubicacion: ");
        System.out.println("4. Mostrar ganancias totales ");
        System.out.println("5. Mostrar ganancias por ubicaciones ");
        System.out.println("6. Mostrar el teatro");
        System.out.println("7. Salir");
        System.out.println(" ***************************************** ");
    }

    public static int seleccionarOpcion() throws IOException {
        int opcion;
        System.out.print("Ingrese su opcion: ");
        opcion = Integer.parseInt(in.readLine());
        return opcion;
    }

    public static void ubicacionReserva() {

        System.out.println(" ***************************************** ");
        System.out.println("1. Preferencial");
        System.out.println("2. Graderia Preferencial");
        System.out.println("3. Graderia General");
        System.out.println("4. Salir");
        System.out.println(" ***************************************** ");

    }

    /* *****************************************
          FIN DE OPCIONES PARA MENUS
      **************************************** */


    /* *****************************************
        INICIO DE RESERVAS POR UBICACION
    **************************************** */
    public static boolean reservarPreferencial() throws IOException {
       //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        Preferencial preferencial = new Preferencial(null);
        String nombre;
        //Preferencial.reservarPreferencial();
        if (listaUsuariosPreferencial.getMyList().size() >= 3){
            System.out.println("Bienvenido.\nLo sentimos, actualmente se han reservado todos los asientos, su" +
                    "solicitud sera ingresada a la cola de espera.\nPor favor indicar el nombre completo" +
                    "para agregarlo a la cola: ");
            nombre = in.readLine();
            preferencial.setNombreCliente(nombre);
            colaPreferencial.getQueue().add(preferencial);

        } else {
            System.out.println("Bienvenido. \nIngrese su nombre completo: ");
            nombre = in.readLine();
            preferencial.setNombreCliente(nombre);
            listaUsuariosPreferencial.getMyList().add(preferencial);
        }

        System.out.println("************************************");
        System.out.println("Su reserva a sido creada con exito");
        System.out.println("************************************");
        return true;

    }

    public static boolean reservarGraderia() throws IOException{
        //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        Graderia graderia = new Graderia(null);
        String nombre;
        if (listaGraderia.getStack().size() >= 3) {
        	System.out.println("Bienvenido.\nLo sentimos, actualmente se han reservado todos los asientos, su" +
                    "solicitud sera ingresada a la cola de espera.\nPor favor indicar el nombre completo" +
                    "para agregarlo a la cola: ");
            nombre = in.readLine();
            graderia.setNombreCliente(nombre);	
            colaGraderia.getGraderiaQueue().add(graderia);
            
		} else {
            System.out.println("Bienvenido. \nIngrese su nombre completo: ");
            nombre = in.readLine();
            graderia.setNombreCliente(nombre);
            listaGraderia.getStack().push(graderia);
		}
        
        System.out.println("************************************");
        System.out.println("Su reserva a sido creada con exito");
        System.out.println("************************************");
        return true;

    }

    public static boolean reservarGeneral() throws IOException{
        //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        General general = new General(null);
        String nombre;

        if (listaGeneral.getGeneralLinkedList().size() >= 3) {
            System.out.println("Bienvenido. \n Lo sentimos, actualmente se han reservado todos los asientos, su" +
                    "solicitud sera ingresada a la cola de espera.\nPor favor indicar el nombre completo" +
                    "para agregarlo a la cola: ");
            nombre = in.readLine();
            general.setNombreCliente(nombre);
            colaGeneral.getGeneralQueue().add(general);
        } else {
            System.out.println("Bienvenido. \nIngrese su nombre completo: ");
            nombre = in.readLine();
            general.setNombreCliente(nombre);
            listaGeneral.getGeneralLinkedList().add(general);

        }
        

        System.out.println("************************************");
        System.out.println("Su reserva a sido creada con exito");
        System.out.println("************************************");
        return true;

    }

    public static boolean reservar(int opcion) throws IOException{

        boolean salir = false;
        switch (opcion){

            case 1:
                //Reservamos Preferencial
                 salir = reservarPreferencial();
                break;

            case 2:
                //Reservar en graderia
                salir = reservarGraderia();
                break;

            case 3:
                //Reservar general
                salir = reservarGeneral();
                break;

            default:
                System.out.println("Opcion invalida");
        }
        return salir;
    }

    /* *****************************************
        FIN DE RESERVAS POR UBICACION
    **************************************** */

    /* *****************************************
       INICIO DE METODOS PARA MOSTRAR RESULTADOS
   **************************************** */
    public static boolean moostrarReservas(int opcion) {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Mostrar Reserva Preferencial
               // Preferencial reservasDePreferencial = new Preferencial();
            	if (listaUsuariosPreferencial.getMyList().size() == 0) {
            		System.out.println("No hay reservas");
            	} else if (listaUsuariosPreferencial.getMyList().size() == 4) {
                   //moostrarColaDeReservas(opcion);
                } else {
                    for (int i = 0; i < listaUsuariosPreferencial.getMyList().size(); i++) {
                        System.out.println(listaUsuariosPreferencial.getMyList().get(i).toString());
                    }
                }

                //Preferencial.mostrarReservas();
                salir = true;
                break;

            case 2:
                //Mostrar Reserva Graderia
            	
            	if (listaGraderia.getStack().size() == 0) {
            		System.out.println("No hay reservas");
            	} else if (listaGraderia.getStack().size() == 4) {
                   //moostrarColaDeReservas(opcion);
                } else {
                    for (int i = 0; i < listaGraderia.getStack().size(); i++) {
                        System.out.println(listaGraderia.getStack().get(i).toString());
                    }
                }

                Graderia.mostrarReservas();
                salir = true;
                break;

            case 3:
                //Mostrar Reserva general
            	
            	if (listaGeneral.getGeneralLinkedList().size() == 0) {
            		System.out.println("No hay reservas");
            	} else if (listaGeneral.getGeneralLinkedList().size() == 4) {
                   //moostrarColaDeReservas(opcion);
                } else {
                    for (int i = 0; i < listaGeneral.getGeneralLinkedList().size(); i++) {
                        System.out.println(listaGeneral.getGeneralLinkedList().get(i).toString());
                    }
                }

                General.mostrarReservas();
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida");

        }

        return salir;

    }

    public static boolean moostrarColaDeReservas(int opcion) {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Mostrar Reserva Preferencial
                // Preferencial reservasDePreferencial = new Preferencial();
                if (colaPreferencial.getQueue().size() == 0) {
                    System.out.println("No hay cola de reservas");
                } else {
                    for (int i = 0; i < colaPreferencial.getQueue().size(); i++) {
                        System.out.println(colaPreferencial.getQueue().toString());
                    }
                }
               // Preferencial.mostrarColaDeReservas();
                salir = true;
                break;


            case 2:
                //Mostrar Reserva Graderia

                Graderia.mostrarColaDeReservas();
                salir = true;
                break;

            case 3:
                //Mostrar Reserva general
            	if (colaGeneral.getGeneralQueue().size() == 0) {
                    System.out.println("No hay cola de reservas");
                } else {
                    for (int i = 0; i < colaGeneral.getGeneralQueue().size(); i++) {
                        System.out.println(colaGeneral.getGeneralQueue().toString());
                    }
                }

                General.mostrarColaDeReservas();
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida");

        }

        return salir;

    }

      /* *****************************************
       FIN DE METODOS PARA MOSTRAR RESULTADOS
   **************************************** */

        /* *****************************************
       INICIO DE METODOS PARA MOSTRAR GANANCIAS
   **************************************** */

    public static boolean moostrarGanacias(int opcion) {

        boolean salir = false;
        switch (opcion){

            case 1:
                //Mostrar Reserva Preferencial
                // Preferencial reservasDePreferencial = new Preferencial();
                int totalPreferencial = Preferencial.mostrarReservas();
                totalPreferencial = 7000 * totalPreferencial;
                System.out.println("************************************");
                System.out.println("La cantidad de Ganacias generadas por Preferencial es de: "+totalPreferencial+" colones");
                System.out.println("************************************");
                salir = true;
                break;

            case 2:
                //Mostrar Reserva Graderia

                int totalGraderia = Graderia.mostrarReservas();
                totalGraderia = 5500 * totalGraderia;
                System.out.println("************************************");
                System.out.println("La cantidad de Ganacias generadas por Graderia es de: "+totalGraderia+" colones");
                System.out.println("************************************");
                salir = true;
                break;

            case 3:
                //Mostrar Reserva General

                int totalGeneral = General.mostrarReservas();
                totalGeneral = 4000 * totalGeneral;
                System.out.println("************************************");
                System.out.println("La cantidad de Ganacias generadas por General es de: "+totalGeneral+" colones");
                System.out.println("************************************");
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida");

        }

        return salir;

    }

        /* *****************************************
       FIN DE METODOS PARA MOSTRAR GANANCIAS
   **************************************** */

        /* *****************************************
       MENU PRINCIPAL QUE INICIA TODAS LAS OPCIONES
    **************************************** */

    public static boolean ejecutarOpcion(int opcion) throws IOException {

        boolean salir = false;
        switch (opcion) {
            case 1:
                //Escoger la ubicacion en donde queremos reservar
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    // realizamos la reservacion donde se escogio
                    salir = reservar(opcion);

                    if (opcion == 4){
                        salir = true;
                    }
                } while (!salir);
                salir = false;
                break;

            case 2:
                //mostrando reservas por ubicacion
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    // mostramos la reserva de la ubicacion seleccionada
                    salir = moostrarReservas(opcion);
                } while (!salir);


                // volvemos al menu
                if (opcion == 4){
                    salir = true;
                }
                salir = false;
                break;

                // mostramos las reservas de esta ubicacion junto con la disponibilidad

            case 3:

                //mostrando cola reservas por ubicacion
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    // mostramos la cola de reserva de la ubicacion seleccionada
                    salir = moostrarColaDeReservas(opcion);
                } while (!salir);


                // volvemos al menu
                if (opcion == 4){
                    salir = true;
                }
                salir = false;
                break;

            // mostramos las colas de reservas de esta ubicacion junto con la disponibilidad


            case 4: //Mostrar ganancias totales

                //vamos a traer total de reservas de los campos
                int totalPreferencial = Preferencial.mostrarReservas();
                int totalGraderia = Graderia.mostrarReservas();
                int totalGeneral = General.mostrarReservas();

                // vamos a multiplicar cada valor por lo que vale su tiquete
                totalPreferencial = 7000 * totalPreferencial;
                totalGraderia = 5500 * totalGraderia;
                totalGeneral = 4000 * totalGeneral;

                // sumamos todos los valores
                int totalGanacias = totalPreferencial + totalGraderia + totalGeneral;

                // mostrarmos el output
                System.out.println("************************************");
                System.out.println("Hay un total de: "+totalGanacias+ " de ganancias generadas");
                System.out.println("************************************");
                break;

            case 5: // Mostrar ganancias por ubicaciones
                //mostrando cola reservas por ubicacion
                do {
                    ubicacionReserva();
                    opcion = seleccionarOpcion();
                    // mostramos la cola de reserva de la ubicacion seleccionada
                    salir = moostrarGanacias(opcion);
                } while (!salir);


                // volvemos al menu
                if (opcion == 4){
                    salir = true;
                }
                salir = false;
                break;

            case 6: // Mostrar el teatro
                System.out.println("************************************");


               /* for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        scenario[i][j] = "X6";
                        System.out.print(scenario[i][j]);

                    }
                    System.out.println();
                }*/
                Teatro2 teatro = new Teatro2();
                teatro.setVisible(true);

                System.out.println("************************************");



                break;

            case 7:
                salir = true;
                break;

            default:
                System.out.println("Opcion invalida");
        }
        return salir;
    }
}
