import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Cliente kevin = new Cliente( 1, "Kevin", "Ivan", "Mavarro", "Lozano", "9309583");
        Cliente ivan = new Cliente(2, "Ivan", "Claudio", "Navarro", "Valdiviezo", "45454545");
        Cliente allison = new Cliente(3, "Allison","Daysi", "Lozano", "Delgadillo","9585848");

        Ciudad madrid = new Ciudad(1, "Madrid");
        Ciudad berlin = new Ciudad( 2, "Berlin");
        Ciudad roma = new Ciudad(3,"Roma");

        Categoria turista = new Categoria( 1, "Turista");
        Categoria media = new Categoria(2,"Media");
        Categoria alta = new Categoria(3, "Alta");
        Categoria presidencial = new Categoria(4, "Presidencial");

        Aeropuerto BarcelonaReal = new Aeropuerto("BR", "BarcelonaReal", madrid);
        Aeropuerto NeoNazi = new Aeropuerto("NN", "Berlin", berlin);
        Aeropuerto RomaImperial = new Aeropuerto("RI","RomaImperial", roma);

        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo romaMadrid = new Vuelo("MB-415", Calendar.getInstance().getTime(), RomaImperial, BarcelonaReal);
        vuelos.add(romaMadrid);
        Vuelo berlinRoma = new Vuelo("BM-451", Calendar.getInstance().getTime(), BarcelonaReal,NeoNazi);
        vuelos.add(berlinRoma);
        Vuelo madridRoma = new Vuelo("MR-564", Calendar.getInstance().getTime(),BarcelonaReal,RomaImperial );
        vuelos.add(madridRoma);

        Boleto boleto = new Boleto(1, Calendar.getInstance().getTime(), 558.54, kevin, roma, madrid, alta, vuelos);

        System.out.println("Billete");
        System.out.println("===========");
        System.out.println("Id: " +boleto.getIdBoleto());
        System.out.println("Fecha: " + boleto.getFechaEmicion());
        System.out.println("Precio: " + boleto.getPrecioTotal());
        System.out.println("Cliente: " + boleto.getCliente().getNombre());
        System.out.println("Origen:" + boleto.getOrigen().getNombre());
        System.out.println("Destino: " + boleto.getDestino().getNombre());
        System.out.println("Categoria: "+ boleto.getCategoria().getNombre());
        System.out.println("Vuelos: ");
        for (Vuelo vuelo:boleto.getVuelos()){
            System.out.println("Codigo Vuelo" + vuelo.getSalida() +" | salida: " + vuelo.getSalida() + "| Origen: " + vuelo.getOrigen().getNombre() + "| Destino:" + vuelo.getDestino().getNombre());

        }
    }
}
