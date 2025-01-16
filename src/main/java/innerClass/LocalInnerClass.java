package innerClass;

/**
 * 局部内部类
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02 在 LocalInnerClass中的hashcode"+outer02);
    }
}

class Outer02{
    private int n1=100;
    private void m2(){
        System.out.println("Outer02 m2()");
    }
    public void m1(){
        //1.局部内部类是定义在外部类的局部位置，通常是方法
        //3.不能添加访问修饰符，但是可以使用final 修饰（若不想被继承可以使用final）。
        //4.作用域：仅仅在定义它的方法或者代码块中
        class Inner02{
            //2.可以直接方法外部类的所有成员，包括私有的
            private int n1 = 800;
            public void f1(){
                //5.局部内部类可以直接访问外部类的成员，比如外部类的n1
                //7.如果外部类和局部内部类的成员重名时，默认遵守就近原则，如果想访问外部类的成员，使用外部类名.this.成员去访问
                //Outer02.this 本质上就是外部类的对象，即哪个类调用了m1，Outer02.this就是哪个对象
                System.out.println("n1="+n1+"外部类的n1="+Outer02.this.n1);
                System.out.println("Outer02.this hashcode="+Outer02.this);
                m2();
            }
        }
        //6.外部类在方法中，可以创建Inner02对象，然后调用方法
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
    /**
     * 1）局部内部类定义在方法中/代码块
     * 2）作用域在方法体或者代码块中
     * 3）本质仍然是一个类
     */

}