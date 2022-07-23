public class PreYPro {
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
            System.out.println("El incremento en n es:" + n);
        }
        System.out.println("======================================");
        for (int i = 0; i < 10; ++i) {
            System.out.println("El incremento en i es:" + i);
        }
        int valor = 17;
        
        System.out.println(valor++);
        System.out.println(valor);
        System.out.println(++valor);
    }
}