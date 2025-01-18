package innerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        //6.外部其他类--访问--->成员内部类
        //外部其他类，使用成员内部类的二种方式
        //解读：outer08.new Inner08()；相当于把 New Inner08()当作是outer08成员
        //方式1 通过外部类的实例去实例化一个成员内部类
        Outer08.Inner08 inner08 = outer08.new Inner08();

        //方式2 在外部类中编写一个返回内部类实例的方法，可以返回Inner08对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();



    }
}

class Outer08{//外部类
    public int n1 =10;
    public String name ="张三";
    private void hi(){
        System.out.println("hi()方法....");
    }
    //注意：成员内部类，是定义在外部类的成员位置上
    //2.可以添加任何访问修饰符（public,protected,默认，private）,因为它的地方就是一个成员
    //3.作用域：整个成员内部类的作用域就是它所在外部类体，与其他成员一样
    class Inner08{//成员内部类
        public double w =2.0;
        private  int n1 =20;
        public void say(){
            //1.可以直接访问外部类的所有成员，包含私有的
            //7.如果成员内部类的成员与外部类的成员重名了，会遵守就近原则，如果就是想访问外部类的同名属性，可以通过外部类.this.属性 来访问
            System.out.println("n1="+ n1 + "  name="+name + " 外部类的n1="+Outer08.this.n1);
            //4.成员内部类--访问--->外部类成员（比如：属性，方法）[访问方式：直接访问]
            hi();
        }
    }

    public Inner08 getInner08Instance(){
        return new Inner08();
    }

    public void t1(){
        //使用成员内部类
        //5.外部类--访问----->成员内部类 访问方式：创建对象，再访问
        Inner08 inner08 = new Inner08();
        inner08.say();
    }

}