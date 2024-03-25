import java.util.Scanner;

public class EjercicioContruirUnaImgSillaEnLaMatriz {
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaños de n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tamanio = n - 1;
        int mitad = (int) Math.floor((double) n / 2);

        if (n == 0) {
            System.err.println("ERROR");
        } else {
            int[][] matriz = new int[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {

                    if (i == mitad) {
                        matriz[i][j] = 1;
                    }

                    if ((i > mitad) && (j == tamanio)) {
                        matriz[i][j] = 1;
                    }

                }
                if (i < matriz.length) {
                    matriz[i][0] = 1;
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
