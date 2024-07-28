/*import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

}*/

//ODD EVEN

/*import java.util.*;

public class ifelse2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN NUMBER");
        } else if (num % 2 != 0) {
            System.out.println("ODD NUMBER");
        } else {
            System.out.println("not valid");
        }

    }
}*/

// check condition 
import java.util.*;

public class ifelse {
    public static void main(String argr[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("A is greater");
        } else {
            System.out.println("B is greater");
        }
    }
}
