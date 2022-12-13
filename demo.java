// Your First Program
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter a second number");
        int b=sc.nextInt();
        if (a>b)
        {
        System.out.println("a is greater");
}
else{
    System.out.println("b is greater");
}
        System.out.println("answer is "+(a+b)); 
    }
}