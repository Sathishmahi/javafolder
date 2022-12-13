import java.util.*;

class HelloWorld {
    public static void main(String[] args) {

        // for (int i=0;i<a;i++){
        // System.out.println(i);

        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
   
        int a = 10;
        int b = 90;
        String j = sc.nextLine();
        switch (j) {

            case "add": {
                System.out.println("addtion " + (a + b));
                break;
            }
            case "sub": {
                System.out.println("addtion " + (a - b));
                break;
            }
            case "mul": {
                System.out.println("addtion " + (a * b));
                break;
            }
            case "div":{
                System.out.println("addtion "+(a+b));
                break;
                            }
            default:{
                System.out.println("Inavlid enter");
            }
        }

        // (10==10)?System.out.println("a is less zero"):System.out.println(" a is
        // geater then zero ");

    }
}

// ternary operator
