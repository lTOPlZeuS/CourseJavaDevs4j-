import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base");
        float base = scanner.nextFloat();
        System.out.println("Ingrese la altura");
        float altura = scanner.nextFloat();
        float resultado = base * altura;
        System.out.println("El resultado de la operacion es: " + resultado);
    }
}
