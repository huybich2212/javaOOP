import java.util.Scanner;

public class timGtTrongMang {
    public static void main(String[] args) {
        String[] students = {"linh","sơn","tuấn","tài"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for(int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("vị trí" + input_name + "is:" +i);
                isExist = true;
                break;
            }
        }
        if (!isExist)  {
            System.out.println("không tìm thấy" + input_name + "trong danh sách");
        }
    }
}
