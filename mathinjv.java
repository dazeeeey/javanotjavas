import java.util.Scanner;
public class mathinjv {
    public static void main(String[] args) {
        /*
            + => บวก
            - => ลบ
            / => หาร
            % => หารเอาเศษ
         */
        Scanner sc= new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B =");
        int b = sc.nextInt();

       
        System.out.println("A+B = "+(a+b));
        System.out.println("A-b = "+(a-b));
        System.out.println("A/b = "+(a/b));
        System.out.println("A%b = "+(a%b));
    }
}
