/**
 * En este programa vamos hacer una matriz de 4 alumnos por 5 asignaturas que hay y pediremos unos valores. En la matriz diremos cual es la maxima nota del alumno, la minima y la media
 * @author Guillermo Troya Albarrán
 */
public class ej4_bidimension {
    public static void main(String[] args) {
        int minimo = 11;
        int maximo = -1;
        double media;
        int suma;

        int num[][] = new int[4][5];
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 5; j++) {
                num[i][j] = Integer.parseInt(System.console().readLine("Por favor, introduce notas:  \n"));     //Aquí introduciremos los valores
            }
        }

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {        
                System.out.print(num[i][j] + "\t");     //Esto servirá para mostrar la matriz
            }
            System.out.println();
        }

        
        for (int i = 0; i < 4; i++) {
            maximo = -1; 
            minimo = 11;                //Aquí lo que haremos será reiniciar los valores para cada alumno
            suma = 0;    
            
            for (int j = 0; j < 5; j++) {        
                if (num[i][j] > maximo) {
                    maximo = num[i][j];
                }
                if (num[i][j] < minimo) {
                    minimo = num[i][j];
                }
                suma += num[i][j];
            }
            media = suma / 5.0;         //Esta es la formula para hacer la media, que hemos puesto 5.0 para que nos salgan con decimales a media

            System.out.println("El maximo del alumno " + i + " es: " + maximo);
            System.out.println("El minimo del alumno " + i + " es: " + minimo);             //Aquí daremos las soluciones de cada alumno
            System.out.println("La media del alumno " + i + " es: " + media);
            System.out.println();
        }
    }
}
