import java.util.Scanner;

public class tinhTienLai {
    public static void main(String[] args) {
        double money = 1.0; //
        int month = 1;    // khai báo biến tháng
        double interestRate = 1.0; // khai báo lãi suất
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền :");
        money = input.nextDouble();
        System.out.println("nhập số tháng :");
        month =input.nextInt();
        System.out.println("lãi suất theo tỷ lệ :");
        interestRate = input.nextDouble();
        double totalInterest = 0; //tổng số tiền lãi
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 *month;
            System.out.println("tổng số tiền lãi :" + totalInterest);
        }

    }
}
