import java.util.*;

public class Grafo {
    private Map<String, List<String>> adjacencia = new HashMap<>();

    public void agregarNodo(String nodo) {
        adjacencia.putIfAbsent(nodo, new ArrayList<>());
    }

    public void agregarArista(String origen, String destino) {
        adjacencia.putIfAbsent(origen, new ArrayList<>());
        adjacencia.putIfAbsent(destino, new ArrayList<>());
        adjacencia.get(origen).add(destino);
    }

    public void mostrarGrafo() {
        for (String nodo : adjacencia.keySet()) {
            System.out.println(nodo + " -> " + adjacencia.get(nodo));
        }
    }

    public static void main(String[] args) {
        Grafo g = new Grafo();
        g.agregarNodo("A");
        g.agregarNodo("B");
        g.agregarArista("A", "B");
        g.agregarArista("B", "C");

        System.out.println("Estructura del Grafo:");
        g.mostrarGrafo();
    }
}

