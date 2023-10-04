import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();


        AreaOne area = new AreaOne();
        area.Length = length;
        area.Breadth = breadth;
        System.out.println("The area of the rectangle is:" + area.getArea());

    }
}



