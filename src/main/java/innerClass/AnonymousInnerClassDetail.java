package innerClass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println("outer05.this"+outer05.hashCode());
    }
}

class Outer05 {
    private  int n1=99;
    public void f1(){
        //创建一个匿名内部类
        //不能添加访问修饰符，因为它的地位是一个局部变量
        Person p =new Person(){

            private int n1=200;
            @Override
            public void hi() {
                //匿名内部类---访问---->外部类 可以直接访问外部类的所有成员，包括私有的
                //作用域：仅仅在定义它的方法或代码块中
                //外部其他类不能访问匿名内部类
                //如果外部类和匿名内部类重名时，匿名内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问
                System.out.println("内部类的n1的方法"+n1+"外部类的n1="+Outer05.this.n1);
                //outer05.this
                System.out.println("outer05.this"+Outer05.this.hashCode());
            }
        };
        p.hi(); //动态绑定 ， 运行类型是Outer05$1

        //也可以直接调用
        //class 匿名内部类 extends Person{}
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法,哈哈....");
            }

            @Override
            public void OK(String str) {
                super.OK(str);
            }
        }.OK("jack");
    }
}
class Person{
    public void hi(){
        System.out.println("Person hi()");
    }
    public void OK(String str){
        System.out.println("Person OK()"+str);
    }
}