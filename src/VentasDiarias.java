public class VentasDiarias {
    public static void main(String[] args) {
        int [][] matriz = {
            {100000, 500000},
            {0, 700000},
        };

        contarVentasAltas(matriz);
        promedioVentasBajas(matriz);
        imprimirVentasSinActividad(matriz);
        posicionMayorVenta(matriz);
        sumaFila(matriz);
    }

    public static void contarVentasAltas(int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 500000) {
                    contador++;
                }
            }
        }
        System.out.println("la cantidad de veces que se vendia mas de 500.000 es: " + contador);
    }

    public static void promedioVentasBajas(int[][] matriz) {
        long suma = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 100000 && matriz[i][j] > 0) {
                    suma += matriz[i][j];
                    contador++;
                }
            }
        }
        if (contador > 0) {
            System.out.println("el promedio de las ventas menores a 100.000 es: " + (double) suma / contador);
        } else {
            System.out.println("No se encontraron ventas menores a 100.000 para calcular promedio.");
        }
    }

    public static void imprimirVentasSinActividad(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    System.out.println("en la posicion [" + i + "][" + j + "] hubo venta igual a 0");
                }
            }
        }
    }

    public static void posicionMayorVenta(int[][] matriz) {
        if (matriz.length == 0 || (matriz.length > 0 && matriz[0].length == 0)) {
            System.out.println("La matriz está vacía, no se puede determinar la mayor venta.");
            return;
        }

        int mayorVenta = matriz[0][0];
        int filaMayor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayorVenta) {
                    mayorVenta = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
            }
        }
        System.out.println("en la posicion [" + filaMayor + "][" + columnaMayor + "] se encuentra el valor mas alto en la matriz");
    }

    public static void sumaFila(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            long sumaFilaActual = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilaActual += matriz[i][j];
            }
            System.out.println("la suma de la fila " + i + " es: " + sumaFilaActual);
        }
    }
}