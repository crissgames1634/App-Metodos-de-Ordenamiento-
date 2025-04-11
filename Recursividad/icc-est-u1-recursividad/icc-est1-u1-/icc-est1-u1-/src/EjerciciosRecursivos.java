public class EjerciciosRecursivos {
    public int fibonacci(int n){
        if(n <=1){
            return n;
        }

        return fibonacci(n-1)+ fibonacci(n-2);
    }
    public int sumaConsecutivos(int n){
        if(n == 1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = n + resultadoParcial;
        return resultado;
        //return n + sumaConsecutivos( n-1);

    }
    /*public int getPotencial(int base, int exponente){
        if(exponente == 0)
            return 1;
            return exponente * getPotencial(base, exponente);
        
    }
    public class SumaDigitos {
        public static int sumaDigitos(int n) {
            if (n < 10) {
                return n; 
            } else {
                int ultimoDigito = n % 10;
                int resto = n / 10;
                return sumaDigitos(resto) + ultimoDigito;
            }
        }
    
        public static void main(String[] args) {
            int n = 1234; 
    
            int suma = sumaDigitos(n);
    
            System.out.println("La suma de los dígitos:" + n + " es: " + suma);
        }
    }*/
    public class Contador {
        public static void contarAtras(int n) {
            if (n < 1) return;
            System.out.println(n);
            contarAtras(n - 1);
        }
    
        public static void main(String[] args) {
            contarAtras(5); 
        }
    }
    

        public static int reverso(int n) {
            return reversoRecursivo(n, 0);
        }
    
        private static int reversoRecursivo(int n, int invertido) {
            if (n == 0) return invertido;
            return reversoRecursivo(n / 10, invertido * 10 + n % 10);
        }
    
        public static void main(String[] args) {
            int numero = 1234;
            int invertido = reverso(numero);
            System.out.println("Reverso: " + invertido);
        }
    
    

    

}
