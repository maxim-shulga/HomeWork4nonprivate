package task2;

public class XMLHandler extends AbstractHandler {
    public void open() {
        System.out.println("XML document is opened");
    }
    public void create(){
        System.out.println("XML document is created");
    }
    public void change(){
        System.out.println("XML document is changed");
    }
    public void save(){
        System.out.println("XML document is saved");
    }
}
