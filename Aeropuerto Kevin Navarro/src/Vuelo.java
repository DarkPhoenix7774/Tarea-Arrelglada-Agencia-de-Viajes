import java.util.Date;
import java.util.List;

public class Vuelo {
    private String codigoVuelo;
    private Date salida;
    private List<Boleto> boletos;
    private Aeropuerto origen;
    private Aeropuerto destino;

    public Vuelo(String codigoVuelo, Date salida, List<Boleto> boletos, Aeropuerto origen, Aeropuerto destino) {
        this.codigoVuelo = codigoVuelo;
        this.salida = salida;
        this.boletos = boletos;
        this.origen = origen;
        this.destino = destino;
    }

    public Vuelo(String codigoVuelo, Date salida, Aeropuerto origen, Aeropuerto destino) {
        this.codigoVuelo = codigoVuelo;
        this.salida = salida;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }
}

