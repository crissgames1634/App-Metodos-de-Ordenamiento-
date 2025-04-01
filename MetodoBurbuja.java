public class MetodoBurbuja {

    // Método para ordenar el arreglo
    public void ordenar(int[] array, boolean conditional) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Ordenar de menor a mayor si 'conditional' es true, de mayor a menor si es false
                if (conditional) {
                    if (array[j] > array[j + 1]) {
                        int aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                    }
                } else {
                    if (array[j] < array[j + 1]) {
                        int aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                    }
                }
            }
        }
    }

    // Método para imprimir el arreglo
    public void imprimirArreglo(int[] array, boolean conditional) {
        // Mostrar el mensaje adecuado según el tipo de orden
        if (conditional) {
            System.out.println("Arreglo ordenado de menor a mayor: ");
        } else {
            System.out.println("Arreglo ordenado de mayor a menor: ");
        }

        // Imprimir el arreglo
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}