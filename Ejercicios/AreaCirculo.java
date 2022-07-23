import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        float radio = scanner.nextFloat();
        double resultado = Math.PI * (radio * radio);
        System.out.println("El resultado es: " + resultado);
    }
}
