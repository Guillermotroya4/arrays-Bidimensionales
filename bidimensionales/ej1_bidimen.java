/**
 * En este programa vamos hacer una matriz 5x5 con los números del 1 al 25
 * @author Guillermo Troya Albarrán
 */
public class ej1_bidimen {
    public static void main(String[] args) {

        int num[][] = new int[5][5];
        int contador = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = contador;
                contador++;
            }
        }

        // Mostrar la matriz por pantalla
        System.out.println("Matriz de 5x5 con números del 1 al 25:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println(); // Nueva línea para separar filas
        }
    }
}