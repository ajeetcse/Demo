import java.util.Scanner;

public class TriangleOfArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b,h,area;
        System.out.println("Enter breath ");
        b=sc.nextFloat();
        System.out.println("Enter hight ");
        h=sc.nextFloat();
        area =b*h/2;
        System.out.println("Area of circle = "+area);
    }
}
