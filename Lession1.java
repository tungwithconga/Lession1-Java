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
        if(choice >= 5){
            System.out.println("Lựa chọn không hợp lệ");
        }else{
            System.out.println("Nhập số thứ nhất: ");
            double num1 = scanner.nextDouble();
            System.out.println("Nhập số thứ hai:");
            double num2 = scanner.nextDouble();
                    double result;
        switch(choice){
            case 1:
                result = num1 + num2;
                System.out.println("Kết quả của" + num1 + "+" + num2 + "=" + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Kết quả của" + num1 +"-" + num2 + "=" + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Kết quả của" + num1 + "x" + num2 + "=" + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("Kết quả của" + num1 + ":" + num2 + "=" + result);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ ");
        }
        }
}
}