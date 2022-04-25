package Menu;

import java.lang.invoke.SwitchPoint;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Xem danh sách");
            System.out.println("2.Thêm");
            System.out.println("3.Sửa");
            System.out.println("4.Xóa");
            System.out.println("5 Thoát");
            System.out.println("Nhập vào lựa chọn");
            try {
                choice = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Chỉ được nhập số!");
                scanner.nextLine();
            }
            switch (choice) {
                case 1:
                    System.out.println("Danh sách là");
                    break;
                case 2:
                    System.out.println("Thêm");
                    break;
                case 3:
                    System.out.println("Sửa");
                    break;
                case 4:
                    System.out.println("Xóa");
                    break;
                case 5:
                    System.out.println("Tạm biệt");
                    break;
            }

        }
    }
}