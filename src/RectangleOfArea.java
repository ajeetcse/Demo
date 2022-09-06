import java.util.Scanner;

public class RectangleOfArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int a= sc.nextInt();
        System.out.println("Enter the weidth");
        int b= sc.nextInt();
        int area;
        area=2*(a+b);
        System.out.println("Rectangle of area = "+area);
    }
}
