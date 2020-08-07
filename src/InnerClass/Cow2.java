package InnerClass;

public class Cow2 {
    private static double weight = 1;

    public Cow2(double weight) {
        this.weight = weight;
    }

    public Cow2() {

    }

    private static class CowLeg {
        private double weight = 2;
        private String color = "333";


        //内部类的方法
        public void info() {
            System.out.println("当前牛的颜色是" + color);
            System.out.println("当内部牛的重量是" + weight);
            System.out.println("当内部牛的外部重量是" + Cow2.weight);
        }


    }

    //外部方法
    public void test() {
        CowLeg cowLeg = new CowLeg();
        cowLeg.info();
    }

    public static void main(String[] args) {
        Cow2 cow = new Cow2();
        cow.test();
    }
}
