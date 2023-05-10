class cheacktypevalue {
    public static void main(String[] args) {
        //check data type
        Integer  a = 10;
        double b ;
        String c ="Hello world";
        boolean d ;
        char e ;
        float f;

        //เป้น(true) / ไม่เป้น(false)
        boolean result = a instanceof Integer ;//instanceof is use fro chech type of data "instanceof String for strig"
        //chechk of int     double String boolaen char      float
        //          Integer Double "----" Boolaen Character Float
        System.out.println(result);
    }
}
