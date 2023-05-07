public class nameofvalue {
    public static void main(String[] args) {
        //Global variable
        int a=100 ;
        int b=200;

        System.out.println(a);
        {
            //Local variable 
            int c = 300 ;
            System.out.println(c);
            System.out.println("A ="+a); 
            // out side this "c" can't be run

        }
        System.out.println(b);
    }
}
