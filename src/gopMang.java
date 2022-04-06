

public class gopMang {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {1, 3, 5, 7};
        int[] arr3 = new int[8];
        System.arraycopy(arr1,0,arr3,0,4);


        System.arraycopy(arr2,0,arr3,4,4);
        inMang(arr3);
    }
    static void inMang(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }
    }
}
