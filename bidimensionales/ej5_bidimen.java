/**
 * En este programa vamos a pedir los sueldos y haremos una matriz, dependiendo de el número de personas que pidamos
 * @author Guillermo Troya Albarrán 
 */
public class ej5_bidimen {
    public static void main(String[] args) {
        System.out.print("Dime el número de personas ");
        int n = Integer.parseInt(System.console().readLine());
        int nHombres = 0, nMujeres = 0, sumaHombres = 0, sumaMujeres = 0;

        float sueldos[][] = new float[n][2];

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                if (j == 0) {
                    System.out.print("Dime el género (0 para hombre y 1 para mujer) de la persona " + (i + 1) + ": ");
                    sueldos[i][j] = Integer.parseInt(System.console().readLine());
                }
                if (j == 1) {
                    System.out.print("Dime el sueldo: ");
                    sueldos[i][j] = Integer.parseInt(System.console().readLine());
                }
            }
        }

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                System.out.print(sueldos[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0] == 0.0) {
                nHombres++;
                sumaHombres += sueldos[i][1];
            }
            if (sueldos[i][0] == 1.0) {
                nMujeres++;
                sumaMujeres += sueldos[i][1];
            }
        }
        System.out.println("El sueldo medio de los hombres es: " + (sumaHombres / nHombres));
        System.out.println("El sueldo medio de las mujeres es: " + (sumaMujeres / nMujeres));
    }

}
