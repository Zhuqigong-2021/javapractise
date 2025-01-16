package trycatch;
class OpenException2 extends Exception {

}
class CloseException2 extends OpenException2 {

}

class NewException extends Exception{}
public class InheritanceException {
    public InheritanceException() throws OpenException2{}
    public void f() throws OpenException2{};

    public static void main(String[] args) {

    }
}

class NewClass extends InheritanceException{
    public NewClass() throws OpenException2,NewException{
    }

    public void f() throws OpenException2{}

    public static void main(String[] args) {

        try {
            InheritanceException p = new NewClass();
            p.f();
        } catch (OpenException2 | NewException e) {
            e.printStackTrace();
        }
    }
}
