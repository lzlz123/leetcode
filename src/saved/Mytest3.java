public class Mytest3 {
    public static void main(String[] args) {


        son1 son = new son1();
        System.out.println("===============");
        son1 son2 = new son1();
    }
}

class father1 {

    /*
    编译后的结果
        public father() {
            System.out.println(3);
            this.a = this.test();
            System.out.println("5");
                }
*/


    static {
        System.out.println(2);
    }

    private int a = test();
    private static int b = method();

    public int test() {
        System.out.println(222);
        return 1;
    }


    //这一句话，在编译过程中会自动放到 father（）
    {
        System.out.println(3);
    }


    public static int method() {
        System.out.println("4");
        return 0;
    }

    public father1() {
        System.out.println("5");
    }
}

class son1 extends father1 {
    private int a = test();
    private static int b = method();




    static {
        System.out.println(7);
    }

    {
        System.out.println(8);
    }


    public static int method() {
        System.out.println(9);
        return 0;
    }

    public son1() {
        System.out.println(10);
    }
}
