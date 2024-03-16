public class EjemploMatricesStringForV2 {
    public static void main(String[] args) {
        String[][] nombres = {{"Luis","Pedro"},{"Juan","Lucia"},{"Gustavo","Adolfo"}};

        System.out.println("Iterando con forEach: ");
        for (String[] fila : nombres) {
            for (String columna : fila) {
                System.out.print(columna + "\t");
            }
            System.out.println();
        }

    }
}
