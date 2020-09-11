public class Asientos {
   private int idAsiento;
    private Vuelo vuelo;
    private Categoria categoria;
    private int numeroAsientos;
    private double tarifa;

    public Asientos(int idAsiento, Vuelo vuelo, Categoria categoria, int numeroAsientos, double tarifa) {
        this.idAsiento = idAsiento;
        this.vuelo = vuelo;
        this.categoria = categoria;
        this.numeroAsientos = numeroAsientos;
        this.tarifa = tarifa;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
