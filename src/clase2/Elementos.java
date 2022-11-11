package clase2;

public class Elementos {

    private String palabra;
    int numero;
    final boolean booleano;
    final byte numeroCortito = 12;
    
    public Elementos(){
        this.palabra = "Hadouken";
        numero = 100;
        booleano = true;
    }
    
    String getPalabra(){
        return palabra;
    }
    
    void setPalabra(String valor){
        this.palabra = valor;
    }
    
    void mostrarPalabra(){
        System.out.println("La palabra a mostrar es: " + getPalabra());
    }
    
}
