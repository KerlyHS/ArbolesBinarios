import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        arbol.agregarNodo(50);
        arbol.agregarNodo(30);
        arbol.agregarNodo(20);
        arbol.agregarNodo(40);
        arbol.agregarNodo(70);
        arbol.agregarNodo(60);
        arbol.agregarNodo(80);

        int opcion;
        do {
            System.out.println("\u001B[31mRecorridos de Árbol Binario:");
            System.out.println("\u001B[36m1. Preorden");
            System.out.println("\u001B[36m2. Inorden");
            System.out.println("\u001B[36m3. Postorden");
            System.out.println("\u001B[36m4. Salir");
            System.out.print("\u001B[0mSeleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nRecorrido Preorden:");
                    arbol.preorden(arbol.raiz);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nRecorrido Inorden:");
                    arbol.inorden(arbol.raiz);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\nRecorrido Postorden:");
                    arbol.postorden(arbol.raiz);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\u001B[34mSaliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }
}
