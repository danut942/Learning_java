import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat){
            System.out.println("Play current song");
            System.out.println("Take the song off the repeat");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Play next song");
    }
}
