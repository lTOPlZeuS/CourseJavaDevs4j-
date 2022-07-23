import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base");
        float base = scanner.nextFloat();
        System.out.println("Ingrese la altura");
        float altura = scanner.nextFloat();
        float resultado = base * altura / 2;
        System.out.println("El resultado es: " + resultado);
    }
}
