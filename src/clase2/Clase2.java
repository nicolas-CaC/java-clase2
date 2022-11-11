package clase2;

import otroPaquete.ClasePrivada;

public class Clase2 {

    public static void main(String[] args) {

        Elementos variables = new Elementos();

//        System.out.println(variables.);
        variables.mostrarPalabra();
        
        String palabra = variables.getPalabra();
        System.out.println(palabra);
        
        variables.setPalabra("Tatumakisemputiaku");
        variables.mostrarPalabra();
        
        Elementos otrasVariables = new Elementos();
        System.out.println("Datos de Otras Variables");
        otrasVariables.mostrarPalabra();
        
        otrasVariables.setPalabra("Mapache");
        System.out.println(otrasVariables.getPalabra());
        System.out.println(variables.getPalabra());
        
        // PRIVADAS
        
        Privadas nuevasVariables = new Privadas();
        System.out.println(nuevasVariables.getNumeroPrivado());
        
        // ESTATICAS
        
        System.out.println(Estaticas.gloria);
        System.out.println(Estaticas.getNombrecito());
        
        // OTRO PAQUETE
        ClasePrivada otraClase = new ClasePrivada();
        System.out.println(otraClase.palabraPublica);
        System.out.println(otraClase.getValores()[0] + " " + otraClase.getValores()[1]);
        
    }

}
