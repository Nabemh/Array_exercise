/**
 * rotLeft
 */
public class Array_rot {

    public static int[] rotLeft(int[] a, int d){
        int n_elements = a.length;
        int[] rot = new int[n_elements];
        int i;

        for (i = 0; i < n_elements; i++){
            int index = (i + (n_elements - d)) % n_elements;
            rot[index] = a[i];
        }
        return rot;
    }
}