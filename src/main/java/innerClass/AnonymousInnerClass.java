package innerClass;

/**
 * 匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();


    }
}

class Outer04{//外部类
    private int n1=10;//属性
    public void method(){//方法
        //基于接口的匿名内部类
        //1.需求  使用接口IA，并创建对象
        //2.传统方法，是写一个类，实现接口，并创建对象
        //3.Tigger 类只用一次 ，之后再不使用了
//        IA tigger = new Tigger();
//        tigger.cry();

        //4. 可以使用匿名内部类去简化开发
        //5. tigger的编译类型？ IA
        //6.tigger的运行类型？ 就是匿名内部类 XXXX = Outer04$1
        /*
           我们看底层,会分配一个类名 Outer04$1
           class XXXX implements IA {
               @Override
            public void cry() {
                System.out.println("老虎叫....");
            }
           }
         */
        //7.jdk底层在创建匿名内部类 Outer04$1，立即马上就创建了Outer04$1实例，并且马上把地址返回给tiger
        //8.匿名内部类使用一次，就不能再使用
        IA tiger =new IA() {

            @Override
            public void cry() {
                System.out.println("老虎叫....");
            }
        };
        System.out.println("tigger的运行类型="+tiger.getClass());
       tiger.cry();

       //基于类的匿名内部类演示
        //分析
        //1.father编译类型是Father
        //2.father运行类型 Outer04$2
        //3.底层会创建匿名内部类
        /*
           class Outer04$2 extends Father{
              @Override
               public void test() {
                 System.out.println("匿名内部类重写了Test 方法");
               }
            }
         */
        //4.同时也直接返回了匿名内部类 Outer04$2的对象
        //5.注意（"jack") 参数列表会传递给构造器
       Father father = new Father("jack"){
           @Override
           public void test() {
               System.out.println("匿名内部类重写了Test 方法");
           }
       };
        System.out.println("father对象的运行类型："+father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){

            @Override
            void eat() {
                System.out.println("抽象类的匿名方法 吃");
            }
        };
        animal.eat();
    }
}

interface IA{//接口
    public void cry();
}

//class Tigger implements IA{
//
//    @Override
//    public void cry() {
//        System.out.println("老虎叫.....");
//    }
//}

class Father{
    public Father(String name){
        System.out.println("father的构造器的name = "+name);
    }
    public void test(){

    }
}

abstract class Animal{//抽象类
   abstract void eat();
}