/**
 * En este programa vamos hacer una matriz 10x10 en la cual salgan de resul6tado las tablas de multiplicar
 * @author Guillermo Troya Albarrán
 */
public class ej2_bidimen {
    public static void main(String[] args) {
        int num[][] = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = (i + 1) * (j + 1);
            }
        }

        //Aquí vamos a mostrar la matriz por pantalla
        System.out.println("Matriz de 10x10 con las tablas de multiplicar:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println(); //Aquí vamos a hacer la linea para separar
        }
    }
}
