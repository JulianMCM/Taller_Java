
public class punto2 {

    private static boolean control = true;
    private static String figura = "        ";
    private static int incremento, i;

    public static void main(String[] args) {
        
        while (control == true) {
            figura = figura.concat("*");
            System.out.println(figura);
            incremento = incremento + 1;
            i = 9;

            if (incremento >= 1) {
                figura = figura.substring(1, i);
                i--;
            }
            if (incremento == 9) {
                control = false;
            }
        }
    }
}
