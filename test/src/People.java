public class People {
    private int blood;

    public static void main(String[] args){
        People pp = new People();
        pp.blood=20;
        People.Heart ph = pp.new Heart();
        ph.test();

    }

    public class Heart {
        public void test() {
            System.out.println(blood);
        }
    }

    public class Brain {
        public void test() {
            System.out.println(blood);
        }
    }
}