import java.util.Scanner;

public class Cal1 {


        public void add(int  a ,int  b)
        {
            int c= a+b;
            System.out.println(c);
        }
        public void  sub(int a ,int b)
        {
            int c =a-b;
            System.out.println(c);
        }
        public void mul(int a ,int b)
        {
            int c =  a*b;
            System.out.println(c);
        }

        public void  div(int  a ,int b) {
            if (  b==0)
            {
                System.out.println("cannot divide by 0");
            }

        else
            {
                double c = (double)a/b;
                System.out.println(c);
            }
        }

        public static void main(String[] args) {
            Calci ci= new Calci();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter n1");
            int  n1 = sc.nextInt();
            System.out.println("enter n2");
            int  n2 = sc.nextInt();
            System.out.println("enter the operator +,-,*,/");
            char operator = sc.next().charAt(0);
            switch(operator)
            {
                case '+':
                    System.out.println("result:" +ci.add(n1,n2));
                    break;
                case '-':
                    System.out.println("result:" +ci.sub(n1,n2));
                    break;
                case '*':
                    System.out.println("result:" +ci.mul(n1,n2));
                    break;
                case '/':
                    System.out.println("result:" +ci.div(n1,n2));
                    break;
                default:
                    System.out.println("invalid operator");
                    break;
            }
        }
    }


