/**
 * En este programa vamos hacer una matriz de tamañao N y M los dos metidospor teclado de unos valores tambiuen metidos y diremos con un contador cuantos hay menor que 0, mayor e iguales
 * @author Guillermo Troya Albarrán
 */
public class ej3_bidimen {
    public static void main(String[] args) {

        int menor=0;
        int mayor=0;
        int igual=0;

        System.out.println("Por favor, introduce un número que sera el valor N de la matriz");      //Aqui le pediremos el valor de N
        int valor_N = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduce un número que sera el valor M de la matriz");      //Aqui le pediremos el valor de M
        int valor_M = Integer.parseInt(System.console().readLine());

        int num[][] = new int[valor_N][valor_M];
        for (int i = 0; i < valor_N; i++) {                         //Aquí haremos el array
            for (int j = 0; j < valor_M; j++) {                         
                num[i][j] = Integer.parseInt(System.console().readLine("Por favor, introduce datos \n"));
            }
        }


        for(int i=0; i<valor_N; i++){
            for (int j = 0; j < valor_M; j++) {             //Aquí imprimiremos el array en forma de matriz con los valores y datos anteriormente metidos
                System.out.print(num[i][j] + "\t");
                if(num[i][j]==0){
                    igual++;
                }
                else if(num[i][j]<0){
                    menor++;
                }
                else{
                    mayor++;
                }
             }
            System.out.println(); 
        }
        
        System.out.println("Hay una cantidad de " + igual + " iguales a 0");
        System.out.println("Hay una cantidad de " + menor + " menores a 0");
        System.out.println("Hay un total de " + mayor + " mayores que 0");
    }
}
