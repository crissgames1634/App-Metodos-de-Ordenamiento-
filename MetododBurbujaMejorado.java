public class MetododBurbujaMejorado {
    public int[] ordenarAscendente(int[] arreglo) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {
                contComparaciones++;

                if (arreglo[j] > arreglo[j + 1]) {
                    contCambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        int[] resultados = { contComparaciones, contCambios };
        return resultados;
    }

    public void printArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
