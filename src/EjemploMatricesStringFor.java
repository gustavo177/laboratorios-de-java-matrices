public class EjemploMatricesStringFor {
    public static void main(String[] args) {
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Luis";
        nombres[0][1] = "Pedro";
        nombres[1][0] = "Juan";
        nombres[1][1] = "Lucia";
        nombres[2][0] = "Gustavo";
        nombres[2][1] = "Adolfo";

        System.out.println("Iterando con for: ");
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[0].length; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Iterando con forEach: ");
        for (String[] fila : nombres) {
            for (String columna : fila) {
                System.out.print(columna + "\t");
            }
            System.out.println();
        }

    }
}
