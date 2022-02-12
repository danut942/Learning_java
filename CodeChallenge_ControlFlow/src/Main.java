import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question = "";
        String choiceOne = "4";
        String choiceTwo = "6";
        String choiceThree = "9";

        String correctAnswer = choiceTwo;

        //Ask a question
        //Give answers

        //Have the user input an answer
        //Retrieve the user's input

        //if the user's input matches the correct Answer
        //then the user is correct and we want to print a congrats message

        //If the user is wrong
        //Print message for incorrect answer

        System.out.println("What is 3+3=?");
        System.out.println(choiceOne + ", "+ choiceTwo + ", " + choiceThree);

        Scanner input = new Scanner(System.in);
        String userchoice = input.next();

        if(userchoice.equals(choiceTwo)){
            System.out.println("Congrats, the answer is correct. 3+3=" + userchoice);
        } else {
            System.out.println("The answer is wrong!");
        }
    }
}
