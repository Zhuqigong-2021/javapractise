package innerClass;

public class AnonymousInnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell(){
            @Override
            public void ring() {
                System.out.println("匿名内部类的ring（）");
            }
        });

    }
}

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
