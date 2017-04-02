/*
 Samantha McCormick
 CSC240 Java Programming
*/

package assignment2;

import java.util.Scanner;

public class FlashcardMathTutor {

  public static void main(String[] args) {

    // The program starts by greeting the user.
    System.out.println("Hey there!");

    // The program outputs to the user the purpose of the program (flashcard math practice).
    System.out.println("This program is to help you practice math using flashcards.");

    // The program will then generate two random integer numbers between 1 and 100.
    // Note: Math.random() generates a double so force an integer here.
    int randomNumber1 = (int) (Math.random() * 100);
    int randomNumber2 = (int) (Math.random() * 100);

    // The program will present the user with an addition problem based on the two random numbers.
    System.out.print("What is " + randomNumber1 + " + " + randomNumber2 + "? ");

    // The program will accept the user’s answer on the same line as it presented the problem.
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();

    System.out.println("You answered: " + answer);

    // The program will output the result to the screen.
    int computedAnswer = randomNumber1 + randomNumber2;
    if (answer == computedAnswer) {
      System.out.println("Your answer is correct!");
    } else {
      System.out.println("Sorry, wrong answer. The correct answer is " + computedAnswer + ".");
    }

    // Finally, the program will say goodbye to the user and terminate.
    System.out.println("Goodbye!");
  }

}
