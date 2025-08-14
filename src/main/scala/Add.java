import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int a,b, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        a =sc.nextInt();
        b =sc.nextInt();
        result = a+b;
        System.out.println("addition " +result);
    }
}
