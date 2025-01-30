public class Pattern10 {
    public static void main(String[] args) {
        int n = 3; 
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("  ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
