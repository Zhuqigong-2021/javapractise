package innerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
       //6.外部其他类 使用静态内部类
        //方式1 因为静态内部类，是可以通过类名直接访问（前提是满足访问权限）
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //方式2 编写一个方法，可以返回静态内部类的对象实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();
        //方式3 直接编写一个可以返回静态内部类实例的静态方法，可以通过外部类名+"."的方式直接访问静态方法
        Outer10.Inner10 innerStatic = Outer10.getInnerStatic();
        innerStatic.say();



    }
}

class Outer10{     //外部类
    private int n1 =10;//attributes
    private static String name ="Phil";
   //Inner10 就是一个静态内部类
    //1.放在外部类的成员位置 使用Static修饰
    //3.可以任意添加访问修饰符（public，protected，默认，private），因为他的地位就是一个成员
    //4.作用域：同其他成员一样 为整个类体
    static class Inner10{

        private static String name ="Olivier";
        public void say(){
            //2. 可以直接访问所有外部类的所有静态成员,但是不能访问非静态成员
            //7.内部类外部类同成员名时，依然采用就近原则，如果在内部类中需要访问外部类的同名属性，采用外部类名.成员的方式
            System.out.println("内部类里的name： "+ name+" 外部类的name： "+Outer10.name);
        }

    }

    //5.外部类--访问--->内部类 需要创建对象再访问
    public void m1(){
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
    public Inner10 getInner10(){
        return new Inner10();
    }

    public static Inner10 getInnerStatic(){
        return new Inner10();
    }


}