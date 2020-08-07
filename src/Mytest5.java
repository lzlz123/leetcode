public class Mytest5 {
    public void test(Grandpa grandpa) {
        System.out.println("grandpa");
    }

    public void test(Father father) {
        System.out.println("father");
    }

    public void test(Son son) {
        System.out.println("son");
    }

    public static void main(String[] args) {
        Grandpa g1 = new Father();
        Grandpa g2 = new Son();

        Mytest5 mytest5 = new Mytest5();
        mytest5.test(g1);
        mytest5.test(g2);
    }
}

class Grandpa {
}

class Father extends Grandpa {
}

class Son extends Father {
}

