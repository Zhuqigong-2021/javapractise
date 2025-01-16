package innerClass;

/**
 * 内部类的基本样子
 */
public class InnerClass01 {
    public static void main(String[] args) {

    }
}
    class Outer{     //外部类
        private int n1 =100;//attributes

        public Outer(int n1) {  //constructor
            this.n1 = n1;
        }

        public void m1(){ //method
            System.out.println("m1()");
        }
        {
            System.out.println("code block");
        }
        class Inner{    //内部类 在outer类的内部 

        }
    }

