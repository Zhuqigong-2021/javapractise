package innerClass;

import java.util.IllformedLocaleException;

public class AnonymousInnerClassExercise01 {
    public static void main(String[] args) {

        //当做实参直接传递，简洁，高效
         f1(new IL(){
             @Override
             public void show() {
                 System.out.println("这是一副明画");
             }
         });
    }
    //静态方法,形参是接口类型
    public static void  f1(IL il){
        il.show();
    }
}

//接口
interface IL {
    void show();
}
