import java.util.ArrayList;
import java.util.List;

public class MainArrayListNombre {
    public static void main(String[] args) {
        // Creación de una lista
        List<String> lista = new ArrayList<>();

        lista.add("Jose");
        lista.add("Pablo");
        lista.add("Franchesco");
        lista.add("Pipi");
        lista.add("Ceroba");
        lista.add("Mamood");
        lista.add("Ghost");

        lista.remove("Franchesco");

        System.out.println("Lista de nombres: ");
        for (String nombre: lista) {
            System.out.println(nombre);
        }
    }
}