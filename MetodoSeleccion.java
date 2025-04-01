public class MetodoSeleccion {
    
    // Método para ordenar el arreglo en orden ascendente o descendente
    public void ordenar(int[] arreglo, boolean conditional) {
        if (conditional) {
            for (int i = 0; i < arreglo.length; i++) {
                int iMin = i; // Índice del elemento extremo (mayor o menor según el orden)
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[j] < arreglo[iMin]) {
                        iMin  = j;
                    }
                }
                if (i != iMin) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[iMin];
                    arreglo[iMin] = aux;
                }
            }
        }
        else {
            for (int i = 0; i < arreglo.length; i++) {
                int iMax = i; 
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[j] > arreglo[iMax]) {
                        iMax  = j;
                    }
                }
                if (i != iMax) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[iMax];
                    arreglo[iMax] = aux;
                }
            }
        }
        
    }

    // Método para imprimir el arreglo
    public void printArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // Salto de línea para mejor formato
    }
}
