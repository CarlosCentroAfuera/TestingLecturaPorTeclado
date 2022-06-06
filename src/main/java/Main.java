import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            if (adivinaNumero(5, 0, 100)){
                System.out.println("Has ganado!");

            } else {
                System.out.println("No has conseguido el objetivo en los intentos disponibles");
            }
        } catch (NumeroFueraDeRango e) {
            System.out.println("Fuera de rango");
        } catch (NumeroDeIntentosInvalido e) {
            System.out.println("El número de intentos debe ser positivo.");
        }
        System.out.println("Fin del juego");
    }

    public static boolean adivinaNumero(int numeroIntentosPermitidos, int rangoInferior, int rangoSuperior) throws NumeroFueraDeRango, NumeroDeIntentosInvalido {
        // TODO lanza un NumeroDeIntentosInvalido si el número buscado es 0 o negativo.
        // TODO lanza un NumeroFueraDeRango si el número buscado no se encuentra en el rango permitido.
        // TODO si el usuario acierta con el número, return true.
        // TODO si el usuario pone un número superior al buscado, entonces debe decir. El número buscado es más pequeño.
        // TODO si el usuario pone un número inferior al buscado, entonces debe decir. El número buscado es más grande.
        // TODO cada vez que introduce un número el usuario, pierde un intento. Si no le quedan intentos, entonces devuelve false.
        return false;
    }

    private static Integer leerNumeroPorTeclado(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // TODO completar
        return null;
    }


}
