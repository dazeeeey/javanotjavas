public class Variable {
    public static void main(String[] args) {
        //นิยาตัวเเปรไม่ระบุค่าเริ่มต้น
        int number1 ;
        boolean status;
        char alphabet;
        float number2;
        double number3;

        //นิยามระบุค่าเริ่มต้น
        int number10 = 10 ;
        float number20 = 20 ;
        char alphabet1 ='A';
        boolean status1 =true;

        //หลายบรระทัดในครั้งเดียว
        int a = 0,b = 1,c= 2;

        //ปริ้นค่าออกมา 
        final int num=10;
        int num2=20;
        /// final value can't be change num awalys be 10 :: num = 50;
        System.out.println("Value of1 ="+num);
        System.out.println(num2);

    }
}
