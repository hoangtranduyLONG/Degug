package exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < 0 && b < 0 && c < 0) ;
        try  {
            throw new IllegalTriangleException();
        } catch (IllegalTriangleException e){
            System.out.println(e);
}
        }
    }
class IllegalTriangleException extends Exception{
    @Override
    public String toString() {
        return "Tam giác chưa hợp lệ ";
    }
}
