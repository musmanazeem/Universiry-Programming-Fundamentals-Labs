public class LabTask2{
    public static int[] modify(int[] x){
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i]*3;
        }
        return x;
    }

    public static void main(String...args){

        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Array Earlier = ");
        for (int i = 0; i < nums.length; i++) {
             System.out.print(nums[i]+" ");
        }
        System.err.println("");
        modify(nums);
        
        System.out.print("Array Now = ");
        for (int i = 0; i < nums.length; i++) {
             System.out.print(nums[i]+" ");
        }
    }
}