package app.count;

class Person {
    static int a=2;
    public static void main (String[] args){
        a++;
        System.out.println("00");
        if(a <= 3){
            String[] str = new String[0];
            main(str);
        }
        a++;

    }

    public static void prt(String s) {
        System.out.println(s);
    }

    public Person() {
        prt("1父类·无参数构造方法： "+"A Person.");
    }//构造方法(1)

    public Person(String name) {
        prt("3父类·含一个参数的构造方法： "+"A person's name is " + name);
    }//构造方法(2)


}