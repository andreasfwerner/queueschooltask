import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.print(">");
            String[] userInput = userScanner.nextLine().split(" ", 2);

            switch (userInput[0]) {
                case "add" -> {
                    if (userInput.length > 1) {
                        AddHandler.Handle(userInput[1]);
                        break;
                    }
                    System.out.println("Add takes 1 argument: add {String}");
                }
                case "exit" -> {
                    running = false;
                }
                case "rem" -> {
                    RemHandler.Handle("");
                }
                case "size" -> {
                    SizeHandler.Handle("");
                }
                default -> {
                  System.out.println("Not an command");
                }
          }
        }
    }
}



