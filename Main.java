public class Main {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        int d = 4;

        System.out.print("Original array: ");
        for (int n = 0; n < a.length; n++) {
            System.out.print(a[n]+ " ");
        }

        int[] rot = Array_rot.rotLeft(a, d);

        System.out.printf("\nArray after %d rotation(s): ", d);

        for (int i = 0; i < rot.length; i++) {
            System.out.print(rot[i] + " ");
        }
    }
    
}
