public class Arbol {
    private String especieArbol;
    private int alto;
    private int ancho;
    private String color;
    private static int contador;

    public Arbol(String especieArbol, int alto, int ancho, String color){
        this.especieArbol = especieArbol;
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        ++contador;
        System.out.println("Existencias: " + contador);
    }

    public String getEspecieArbol() {
        return especieArbol;
    }

    public void setEspecieArbol(String especieArbol) {
        this.especieArbol = especieArbol;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Arbol.contador = contador;
    }
}

