package saved;


public class Test {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.method1();
    }



}

class Test1 {
    private String s = "1";

    public void method1() {
        System.out.println(s);
    }

    class Test2 {
        private String s = "2";

        public void method1() {
            System.out.println(s);
        }
    }
}




