public class punto4 {

    static int[][] llenarMostrar(int[][] matriz){
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = n;
                n++;
            }
        }

        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
              if (y != matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
        return matriz;
    }

    static int[][] ordenarMatriz(int[][] matriz){
        int t=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int x = j + 1; x < matriz[i].length; x++) {
                    if (i == 1 | i == 3) {
                        if (matriz[i][j] < matriz [i][x]) {
                            t = matriz[i][j];
                            matriz[i][j] = matriz[i][x];
                            matriz[i][x] = t;
                        }
                    }
                }
            }
        }
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
              if (y != matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
        return matriz;
    }

    static int [] vector = new int [20];
    static int matriz[][] = new int [4][5];
    static int n = 1;

    public static void main(String[] args) {
        
        llenarMostrar(matriz);
        ordenarMatriz(matriz);

    }
}
