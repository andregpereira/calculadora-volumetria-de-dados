public class Main {

    public static void main(String[] args) {
        // Podemos calcular o volume de uma carga de dados inicial da seguinte forma
//        int m = 6;
//        int[] T = {11, 49, 49, 139, 188, 32};
//        int[] Q0 = {200, 300, 150, 1000, 280, 20000};
//        int C = 0;
//        int soma = 0;
//        for (int j = 0; j < m; j++) {
//            soma += T[j] * Q0[j];
//            System.out.printf("T%d: %8d %n", j + 1, T[j] * Q0[j]);
//        }
//        C = soma;
//        System.out.printf("CO: %8d %n", C);
        // Podemos calcular o volume de uma carga de dados em um período 𝑖 da
        // seguinte forma (para i > 0 )
//        int m = 6, n = 10;
//        int[] T = {11, 49, 49, 139, 188, 32};
//        int[] Q = {0, 20, 30, 5, 1, 0, 300};
//        int[] C = new int[n];
//        int VT = 0;
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Periodo %d: %n", i + 1);
//            C[i] = 0;
//            for (int j = 0; j < m; j++) {
//                C[i] += T[j] * Q[j];
//                System.out.printf("T%d: %8d %n", j + 1, T[j] * Q[j]);
//            }
//            VT += C[i];
//            System.out.printf("VT%2d: %8d %n%n", i + 1, VT);
//        }


        // Nesta abordagem os valores médios aproximados podem variar em cada período i
        int m = 6, n = 10;
        int[] T = {11, 49, 49, 139, 188, 32};
        int[][] Q = {
                {0, 20, 30, 5, 1, 300},
                {0, 21, 30, 5, 1, 310},
                {0, 22, 30, 5, 0, 315},
                {1, 24, 30, 6, 1, 320},
                {0, 25, 30, 5, 1, 315},
                {0, 27, 30, 5, 0, 340},
                {2, 28, 30, 7, 0, 345},
                {0, 27, 30, 5, 1, 340},
                {0, 27, 30, 8, 1, 350},
                {0, 28, 30, 5, 1, 355},
        };
        int[] C = new int[n];
        int VT = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Periodo %d: %n", i + 1);
            C[i] = 0;
            for (int j = 0; j < m; j++) {
                C[i] += T[j] * Q[i][j];
                System.out.printf("T%d: %8d %n", j + 1, T[j] * Q[i][j]);
            }
            VT += C[i];
            System.out.printf("VT%2d: %8d %n%n", i + 1, VT);
        }
    }

}
