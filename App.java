import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static final int[] ORIGINAL_ARRAY = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            int[] array = Arrays.copyOf(ORIGINAL_ARRAY, ORIGINAL_ARRAY.length);
            
            System.out.println(" MENU DE ORDENAMIENTO ");
            System.out.println("Arreglo original: " + Arrays.toString(array));
            System.out.println("1. Método Burbuja");
            System.out.println("2. Método Selección");
            System.out.println("3. Método Inserción");
            System.out.println("4. Método Burbuja Mejorado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();

            if (option == 5) {
                running = false;
                System.out.println("Saliendo");
                continue;
            }

            System.out.print("¿Quieres ver los pasos? (true/false): ");
            boolean showSteps = scanner.nextBoolean();

            System.out.print("¿Cual es el orden que quiere? (A=Ascendente, D=Descendente): ");
            String order = scanner.next().toUpperCase();
            boolean ascending = order.equals("A");

            System.out.println("Arreglo inicial: " + Arrays.toString(array));

            switch (option) {
                case 1 -> bubbleSort(array, ascending, showSteps);
                case 2 -> selectionSort(array, ascending, showSteps);
                case 3 -> insertionSort(array, ascending, showSteps);
                case 4 -> optimizedBubbleSort(array, ascending, showSteps);
                default -> System.out.println("Opción no válida");
            }

            System.out.println(" RESULTADO FINAL ");
            System.out.println("Arreglo ordenado: " + Arrays.toString(array));
        }
        scanner.close();
    }

    private static void bubbleSort(int[] arr, boolean asc, boolean showSteps) {
        System.out.println("MÉTODO BURBUJA");
        for (int i = 0; i < arr.length - 1; i++) {
            if (showSteps) System.out.println(" --------- " + (i + 1));
            
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (showSteps) {
                    System.out.printf("Comparando [%d]=%d con [%d]=%d: ",
                            j, arr[j], j+1, arr[j+1]);
                }

                boolean shouldSwap = asc ? arr[j] > arr[j+1] : arr[j] < arr[j+1];
                
                if (shouldSwap) {
                    if (showSteps) System.out.println("Intercambiando");
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else if (showSteps) {
                    System.out.println("No se intercambia");
                }

                if (showSteps) System.out.println("Estado actual: " + Arrays.toString(arr));
            }
        }
    }

    private static void selectionSort(int[] arr, boolean asc, boolean showSteps) {
        System.out.println("MÉTODO SELECCIÓN");
        for (int i = 0; i < arr.length - 1; i++) {
            int extremeIndex = i;
            
            if (showSteps) System.out.println("Buscando elemento " + i);

            for (int j = i + 1; j < arr.length; j++) {
                if (showSteps) {
                    System.out.printf("Comparando [%d]=%d con [%d]=%d: ",
                            extremeIndex, arr[extremeIndex], j, arr[j]);
                }

                boolean isNewExtreme = asc ? arr[j] < arr[extremeIndex] : arr[j] > arr[extremeIndex];
                
                if (isNewExtreme) {
                    if (showSteps) System.out.println("Nuevo ");
                    extremeIndex = j;
                } else if (showSteps) {
                    System.out.println("Mantiene");
                }
            }

            if (extremeIndex != i) {
                if (showSteps) {
                    System.out.printf("Intercambiando [%d]=%d con [%d]=%d%n",
                            i, arr[i], extremeIndex, arr[extremeIndex]);
                }
                int temp = arr[i];
                arr[i] = arr[extremeIndex];
                arr[extremeIndex] = temp;
            }

            if (showSteps) System.out.println("Nuevo: " + Arrays.toString(arr));
        }
    }

    private static void insertionSort(int[] arr, boolean asc, boolean showSteps) {
        System.out.println("MÉTODO INSERCIÓN");
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            
            if (showSteps) {
                System.out.printf("Insertando %d en su posición correcta%n", current);
            }

            while (j >= 0 && (asc ? arr[j] > current : arr[j] < current)) {
                if (showSteps) {
                    System.out.printf("Desplazando [%d]=%d a la derecha%n", j, arr[j]);
                }
                arr[j + 1] = arr[j];
                j--;
            }

            if (j + 1 != i) {
                if (showSteps) {
                    System.out.printf("Insertando %d en posición [%d]%n", current, j + 1);
                }
                arr[j + 1] = current;
            }

            if (showSteps) System.out.println("Nuevo: " + Arrays.toString(arr));
        }
    }

    private static void optimizedBubbleSort(int[] arr, boolean asc, boolean showSteps) {
        System.out.println("MÉTODO BURBUJA MEJORADO");
        int comparisons = 0;
        int swaps = 0;
        boolean swapped;
        
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            if (showSteps) System.out.println("------" + (i + 1));
            
            for (int j = 0; j < arr.length - 1 - i; j++) {
                comparisons++;
                if (showSteps) {
                    System.out.printf("Comparando [%d]=%d con [%d]=%d: ",
                            j, arr[j], j+1, arr[j+1]);
                }

                boolean shouldSwap = asc ? arr[j] > arr[j+1] : arr[j] < arr[j+1];
                
                if (shouldSwap) {
                    swaps++;
                    swapped = true;
                    if (showSteps) System.out.println("Intercambiando");
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else if (showSteps) {
                    System.out.println("No se intercambia");
                }

                if (showSteps) System.out.println("Nuevo: " + Arrays.toString(arr));
            }
            
            if (!swapped) break;
        }
        
        System.out.println("Comparaciones realizadas: " + comparisons);
        System.out.println("Intercambios realizados: " + swaps);
    }
}