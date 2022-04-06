public class themPtMang {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};
        int[] b = new int[6];
        for (int i = 0; i < b.length; i++) {
            if (i < 3) {
                b[i] = a[i];
            }
            b[3] = 20;
            if (i > 3) {
                b[i] = a[i -1];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}


