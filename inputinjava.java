import java.util.Scanner;

public class inputinjava {
    public static void main(String[] args) {
        //รับค่าข้อมูล
        //ข้อมูลเเบบไหน int , float , long , double , string  
        //ข้อความทำอะไร
        //ข้อความตัวเลข => คำนวนได้ | คำนวนไม่ได้

        //ประกาศใช้งานclass scanner 
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in your name :");
        String name = sc.nextLine();//nextline รับค่าจากkeybord => name 
        System.out.print("Yor age :");
        Integer year = sc.nextInt();//รับค่า int 
        int age = 2563 - year; //คำนวนอายุ


        System.out.println("your born year is : "+year);
        System.out.println("Your name is :"+name);
        System.out.println("born year :"+age);

        


    }
}

