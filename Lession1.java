/*
   Viết một chương trình máy tính cơ bản bao gồm các phép tính nhân, chia, cộng, trừ 2 số.
   Hai số đó được nhập từ người dùng thông qua console và phải in kết quả ra console
 */
package lession1;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Lession1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy chọn chức năng:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        
        int choice = scanner.nextInt();
        Calculator cal = new Calculator();
        
        System.out.println("Nhập vào số thứ nhất: ");
        double num1 = scanner.nextDouble();
        System.out.println("Nhập vào số thứ hai: ");
        double num2 = scanner.nextDouble();
        
        
        switch(choice){
            case 1:
                cal.addNumbers(num1,num2);
                break;
            case 2:
                cal.subNumbers(num1,num2);
                break;
            case 3:
                cal.multiplyNumbers(num1,num2);
                break;
            case 4:
                cal.divideNumbers(num1,num2);
                break;
        }
        3
}
}
class Calculator {
    public void addNumbers(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Kết quả của " + num1 + " + " + num2 + " = " + result);
    }

    public void subNumbers(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Kết quả của " + num1 + " - " + num2 + " = " + result);
    }

    public void multiplyNumbers(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Kết quả của " + num1 + " x " + num2 + " = " + result);
    }

    public void divideNumbers(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Kết quả của " + num1 + " : " + num2 + " = " + result);
        } else {
            System.out.println("Lỗi: Không thể chia cho 0.");
        }
    }
};
