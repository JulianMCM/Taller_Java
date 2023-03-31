/**
 * punto1
 */
public class punto1 {
    private static String figura = "";

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            figura = "*".concat(figura);
            System.out.println(figura);
        }
    }
}