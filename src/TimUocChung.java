import java.util.Scanner;

public class TimUocChung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a :");
        a = input.nextInt();
        System.out.println("Enter b :");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)  {
            System.out.println("ko có ước chung lớn nhất");
        }
        while (a != b)  {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("có ước chung lớn nhất");
    }
}//cách 2


//public class TimUocChung {
    //public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a : ");
        //int a = scanner.nextInt();
        //System.out.print("Enter b : ");
        //int b = scanner.nextInt();
        //a = Math.abs(a);
        //b = Math.abs(b);
        //int ucln = 1;
        //if(a == 0 || b == 0){
           // System.out.println("No greatest common factor");
        //} else {
            //for(int i = 1 ; i <= a && i <= b ; i++){
                //if(a % i == 0 && b % i == 0){
                    //ucln = i;

           // System.out.println("Greatest common factor: " + ucln);

