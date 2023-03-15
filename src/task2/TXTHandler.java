package task2;

public class TXTHandler extends AbstractHandler {
    public void open() {
        System.out.println("TXT document is opened");
    }
    public void create(){
        System.out.println("TXT document is created");
    }
    public void change(){
        System.out.println("TXT document is changed");
    }
    public void save(){
        System.out.println("TXT document is saved");
    }
}
