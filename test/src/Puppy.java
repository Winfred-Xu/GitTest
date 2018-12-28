public class Puppy{
    int puppyAge;

    public static void main(String[] args){
        Puppy pp = new Puppy();
        pp.setAge(200);
        pp.getAge();
    }

    public void setAge( int age ){
        this.puppyAge = age;
    }

    public int getAge( ){
        System.out.println("小狗的年龄为 : " + this.puppyAge );
        return this.puppyAge;
    }


}

