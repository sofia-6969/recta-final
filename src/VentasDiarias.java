public class VentasDiarias {
    public static void main(String[] args) {
        int matriz [][];

        contarVentasAltas(matriz);
        promedioVentasBajas(matriz);
        imprimirVentasSinActividad(matriz);
        posicionMayorVenta(matriz);
        sumaFila(matriz);
        
    }
    public static int contarVentasAltas(int[][] matriz){
        int contador = 0;
        for (int[] fila : matriz) {
            for (int[] valor : matriz) {
                if (valor[0] > 500000) {
                    contador++;
                }
            }
        }
        System.out.println("la cantidad de veces que se vendia mas de 500.000 es: " + contador);
    }
    public static double promedioVentasBajas(int[][] matriz){
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int[] valor : matriz) {
                if (valor[0] < 100000) {
                    suma += valor;
                    contador++;
                }
            }
        }
        System.out.println("el promedio de las ventas menores a 100.000 es: " + suma/contador);
    }
    public static void imprimirVentasSinActividad(int[][] matriz){
        for (int[] fila : matriz) {
            for (int[] valor : matriz) {
                if (valor[0] == 0) {
                    System.out.println("en la posicion " + fila + " " + valor + " hubo venta igual a 0");
                }
            }
        }
    }
    public static int[] posicionMayorVenta(int[][] matriz){
        for (int[] fila : matriz) {
            for (int[] valor : matriz) {
                if (valor[0] > valor[-1]) {
                    System.out.println("en la posicion " + fila + " " + valor + " se encuentra el valor mas alto en la matriz");
                }
            }
        }
    }
    public static void sumaFila(int[][] matriz){
        for (int[] fila : matriz) {
            int suma = 0;
            for (int[] valor : matriz) {
                suma += valor;
            }
            System.out.println("la suma de la fila es: " + suma);
        }
    }
}
