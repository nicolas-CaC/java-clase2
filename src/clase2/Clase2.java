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
        
        // OTRO PAQUETE: Modificador de acceso public
        
        ClasePrivada otraClase = new ClasePrivada();
        System.out.println(otraClase.palabraPublica);
        System.out.println(otraClase.getValores()[0] + " " + otraClase.getValores()[1]);
        
        // USUARIOS
        
        Usuarios usuario1 = new Usuarios("Nicolas", "Orale", 32);
        System.out.println("Id usuario 1: " + usuario1.id);
        
        Usuarios usuario2 = new Usuarios("Nicolas", "Arale", 35);
        System.out.println("Id usuario 2: " + usuario2.id);
        
        System.out.println(usuario1.getUsersCount());
        System.out.println(usuario1.apellido);
        System.out.println(usuario2.getUsersCount());
        System.out.println(usuario2.apellido); 
    }
}
