public class MetodoInsercion {

    public void ordenar(int[] array, boolean conditional) {
        if (conditional) {
            for (int i = 1; i < array.length; i++) {
                int aux = array[i];
                int j = i - 1;
    
                while (j >= 0 && aux < array[j]) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = aux; 
            }
        }

        else {
            int n = array.length;
            for (int i = 1; i < n; i++) {
                int aux = array[i];
                int j = i - 1;

                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
                while (j >= 0 && array[j] > aux) {
                    System.out.println("Compara aux: " + aux + " con array[" + j + "]: " + array[j]);
                    array[j + 1] = array[j];
                    System.out.println("Mueve array[" + j + "] a array[" + (j + 1) + "]");
                    j--;
                }
                array[j + 1] = aux;
                System.out.println("Inserta aux: " + aux + " en la posición " + (j + 1));
                imprimirArreglo(array);
            }
        }

        }

    public void imprimirArreglo(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + ", ");                      
        }
        System.out.println();
    }
}