package ProyectoFinal.Modelo;

public class PersonasReservas {
    protected String nombreCliente;

    public PersonasReservas(String nombreCliente) {

        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {

        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {

        this.nombreCliente = nombreCliente;
    }
}
