import java.util.Date;
import java.util.List;

public class Boleto {
    private int idBoleto;
    private Date fechaEmicion;
    private double precioTotal;
    private Cliente cliente;
    private Ciudad origen;
    private Ciudad destino;
    private Categoria categoria;
    private List<Vuelo> vuelos;

    public Boleto(int idBoleto, Date fechaEmicion, double precioTotal, Cliente cliente, Ciudad origen, Ciudad destino, Categoria categoria, List<Vuelo> vuelos) {
        this.idBoleto = idBoleto;
        this.fechaEmicion = fechaEmicion;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
        this.origen = origen;
        this.destino = destino;
        this.categoria = categoria;
        this.vuelos = vuelos;
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public Date getFechaEmicion() {
        return fechaEmicion;
    }

    public void setFechaEmicion(Date fechaEmicion) {
        this.fechaEmicion = fechaEmicion;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
