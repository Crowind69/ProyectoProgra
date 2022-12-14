package ProyectoFinal.ui;

import ProyectoFinal.Contenedoras.CArrayList;
import ProyectoFinal.Contenedoras.CLinkedList;
import ProyectoFinal.Contenedoras.CStack;
import ProyectoFinal.cl.General;
import ProyectoFinal.cl.Graderia;
import ProyectoFinal.cl.PersonasReservas;
import ProyectoFinal.cl.Preferencial;

import java.util.Scanner;

public class menus {

    static CArrayList listaUsuarios = new CArrayList();
    static CLinkedList listaGeneral = new CLinkedList();
    static CStack listaGraderia = new CStack();

    static Scanner entrada = new Scanner(System.in);

    static Preferencial Preferencial = new Preferencial();
    static Graderia Graderia = new Graderia();
    static General General = new General();

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

    public static int seleccionarOpcion() {
        int opcion;
        System.out.print("Ingrese su opcion: ");
        opcion = entrada.nextInt();
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
    public static boolean reservarPreferencial() {
       //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        Preferencial preferencial;
        String nombre;
        Preferencial.reservarPreferencial();
        if (listaUsuarios.getMyList().size() >= 10){
            System.out.println("Bienvenido. \n Lo sentimos, actualmente se han reservado todos los asientos, su" +
                    "solicitud sera ingresada a la cola de espera.\nPor favor indicar el nombre completo" +
                    "para agregarlo a la cola: ");
        } else {
            System.out.println("Bienvenido. \nIngrese su nombre completo: ");
        }
        nombre = entrada.next();
        preferencial = new Preferencial(nombre);

        listaUsuarios.getMyLista().add(preferencial);

        System.out.println("************************************");
        System.out.println("Su reserva a sido creada con exito");
        System.out.println("************************************");
        return true;

    }

    public static boolean reservarGraderia() {
        //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        Graderia graderia;
        String nombre;
        Graderia.reservarGraderia();
        if (listaGraderia.getStack().size() >= 10) {
            System.out.println("Bienvenido. \n Lo sentimos, actualmente se han reservado todos los asientos, su" +
                    "solicitud sera ingresada a la cola de espera.\nPor favor indicar el nombre completo" +
                    "para agregarlo a la cola: ");
        } else {
            System.out.println("Bienvenido. \nIngrese su nombre completo: ");
        }
        nombre = entrada.next();
        graderia = new Graderia(nombre);
        listaGraderia.getGraderiaReservas().push(graderia);

        System.out.println("************************************");
        System.out.println("Su reserva a sido creada con exito");
        System.out.println("************************************");
        return true;

    }

    public static boolean reservarGeneral() {
        //Ejecutamos el constructor de preferencial que automaticamente incrementa en 1 la reserva, y si ya hay 10, incrementa la cola

        General general;
        String nombre;
        General.reservarGeneral();

        if (listaGeneral.getGeneralLinkedList().size() >= 10) {
            System.out.println("Bienvenido. \n Lo sentimos, actualmente se han reservado todos los asientos, su" +
                    "solicitud sera ingresada a la cola de espera.\nPor favor indicar el nombre completo" +
                    "para agregarlo a la cola: ");
        } else {
            System.out.println("Bienvenido. \nIngrese su nombre completo: ");
        }
        nombre = entrada.next();
        general = new General(nombre);
        listaGeneral.getGeneralReservas().add(general);

        System.out.println("************************************");
        System.out.println("Su reserva a sido creada con exito");
        System.out.println("************************************");
        return true;

    }

    public static boolean reservar(int opcion) {

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
                Preferencial.mostrarReservas();
                salir = true;
                break;

            case 2:
                //Mostrar Reserva Graderia

                Graderia.mostrarReservas();
                salir = true;
                break;

            case 3:
                //Mostrar Reserva general

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
                Preferencial.mostrarColaDeReservas();
                salir = true;
                break;


            case 2:
                //Mostrar Reserva Graderia

                Graderia.mostrarColaDeReservas();
                salir = true;
                break;

            case 3:
                //Mostrar Reserva general

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

    public static boolean ejecutarOpcion(int opcion) {

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


                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        scenario[i][j] = "X6";
                        System.out.print(scenario[i][j]);

                    }
                    System.out.println();
                }

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
