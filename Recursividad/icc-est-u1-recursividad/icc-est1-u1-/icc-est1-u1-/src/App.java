public class App {
    //public static void main(String[] args) throws Exception {
        //int n = 5;
        //int resultadoFinal = factorial(n);
        //System.out.println("Resultado: " + n);
        
    //}
   // public static int factorial(int n){
        //if(n==0){
            //System.out.println("Alcance el caso base");
            //return 1;
        //}
        //int resultado = n  *  factorial(n - 1);
        //System.out.println("Calculando factorial de:" + n + "* factorial("+ (n-1)+"-1)");
        //return resultado;
        

            // Función recursiva para calcular potencia
            /*public static int getPotencial(int base, int exponente) {
                if (exponente == 0) {
                    return 1;
                } else {
                    return base * getPotencial(base, exponente - 1);
                }
            }
        
            public static void main(String[] args) {
                int base = 2;         
                int exponente = 3;    
        
                int resultado = getPotencial(base, exponente);
        
                System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
            }*/
            /*public class SumaDigitos {
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
                }*/
            //}
            

            

                public static void contarAtras(int n) {
                    if (n < 1) return;
                    System.out.print(n + " ");
                    contarAtras(n - 1);
                }
            
                public static void main(String[] args) {
                    contarAtras(10); 
                }
            
            
            
            
        
        
}

    

