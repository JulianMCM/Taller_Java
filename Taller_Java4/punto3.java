public class punto3 {

    public static void numerosPrimos(int n) {
        int vector[] = new int[n];
        int posicion = 0;
    
        int divisibles;
        for(int i=0; posicion<n; i++){
            divisibles = 0;
            for(int j=1;j<=i;j++){
                if(i % j == 0){
                    divisibles++;
                }
            }
            if(divisibles == 2){
                vector[posicion] = i;
                posicion++;
            }
        }
    
        for(int i=0; i<vector.length; i++) {
            System.out.println("" + vector[i]);
        }
    }
    public static void main(String[] args) {
        numerosPrimos(100);
    }
}
