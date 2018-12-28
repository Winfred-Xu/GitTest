public class Length {

    public String instance = "实例变量";
    public static String variable = "静态变量";    //静态变量的定义方式
    public static String CONST = "静态常量";    //静态常量的定义方式
    public static void main(String[] args) {
        String local = "局部变量";    //类似这个就是局部变量，不可用访问修饰符修饰，没有默认初始值
        System.out.println(local);    //局部变量就是在方法或语句块中的变量
        Global global = new Global();    //类似这个就是实例变量，也称全局变量
        System.out.println(global.instance);    //实例变量就必须先把类new一个出来才能使用,因为他是在类中,方法外的
        System.out.println(variable);    //来瞅瞅静态变量，也叫类变量，静态变量的访问方式1(在自己类的时候)
        System.out.println(Global.variable);    //静态变量的访问方法2(不在自己类的时候)
    }
}

class Global{
    public String instance = "实例变量";    //实例变量在一个类的里面,语句块的外面
    public static String variable = "静态变量";
    Global(){    //在类的内部使用自己的实例变量：要么老老实实new一个出来,就像上面那个
        //第二种方法就是在函数里面使用实例变量，注意，如果方法是静态方法参照方法1
        System.out.println(instance);
        System.out.println(variable);
    }
    public void Instance() {
        System.out.println(instance);    //静态变量访问方法1(在自己类的时候),静态常量和静态变量访问相同
        System.out.println(Length.CONST);
    }
}
