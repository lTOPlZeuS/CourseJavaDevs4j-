import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado");
        float lado = scanner.nextFloat();
        float resultado = lado * lado;
        System.out.println("El resultado es: " + resultado);
    }
}
