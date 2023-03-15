package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractHandler handler;
        String userCommand;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter document format: 1 - XML, 2 - TXT, 3 - DOC");

        String key = in.nextLine();
        switch (key){
            case "1":
                handler = new XMLHandler();
                break;
            case "2":
                handler = new TXTHandler();
                break;
            case "3":
                handler = new DOCHandler();
                break;
            default:
                System.out.println("You entered unexpected value, XML is created by default");
                handler = new XMLHandler();
        }

        System.out.println("1 - Open document");
        System.out.println("2 - Create document");
        System.out.println("3 - Change document");
        System.out.println("4 - Save document");
        System.out.println("5 - Exit");
        do {
            userCommand = in.next();
            switch (userCommand){
                case "1":
                    handler.open();
                    break;
                case "2":
                    handler.create();
                    break;
                case "3":
                    handler.change();
                    break;
                case "4":
                    handler.save();
                    break;
                case "5":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Unknown command");
            }
        } while (!userCommand.equals("5"));
    }
}
