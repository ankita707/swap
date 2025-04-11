import java.util.Scanner;
public class swap1 {
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter First Number");
    int num1=scanner.nextInt();
    System.out.println("Enter Second Number");
    int num2=scanner.nextInt();
    System.out.println("Before swapping:num1=" +num1 +"num2=" +num2);
    int temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("After swapping :num1=" +num1 +"num2=" +num2);
    scanner.close();
    }
}
