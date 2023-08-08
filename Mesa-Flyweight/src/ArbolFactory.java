import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private static Map<String, Arbol> TipodeArbol = new HashMap();

    private ArbolFactory(){
    }

    public static Arbol obtenerArbol(String especieArbol, int alto, int ancho, String color){
        String Key = "Key" + especieArbol + " " + alto + " " + ancho + " " + color;
        System.out.println(Key);
        if (!TipodeArbol.containsKey(Key)) {
            Arbol arbol = new Arbol(especieArbol, alto, ancho, color);
            TipodeArbol.put(Key, arbol);

        }
    }


}
