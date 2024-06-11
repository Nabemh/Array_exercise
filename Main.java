public class Main {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        int d = 4;
        int[] rot = Array_rot.rotLeft(a, d);
        for (int i = 0; i < rot.length; i++) {
            System.out.print(rot[i] + " ");
        }
    }
    
}
