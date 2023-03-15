package task2;

public class DOCHandler extends AbstractHandler {
    public void open() {
        System.out.println("DOC document is opened");
    }
    public void create(){
        System.out.println("DOC document is created");
    }
    public void change(){
        System.out.println("DOC document is changed");
    }
    public void save(){
        System.out.println("DOC document is saved");
    }
}
