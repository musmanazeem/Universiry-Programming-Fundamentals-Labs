public class LabTask3 {
    public static int [] copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[a.length-1-i] = a [i];
        }
        return b;
    }
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[a.length];
        copy(a,b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
