import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//Ask the user their name
    System.out.println("What is your name?");
    String name = scan.next();
    //As the user how many classes they take
    System.out.println("How many classes do you take?");
    int classes = scan.nextInt();
    //Ask the user the grade of their first class
    System.out.println("What is your grade for your first class?");
    int grade = scan.nextInt();
    //Declares i as one and total as 0
    int i = 1;
    double total = 0;
    //Prints the average of all the grades added up
   System.out.println("Your average is " + getAve(classes, grade, i, total));
  }
//Method; reutns a double; takes in 3 parameters: classes, grade, i, and total
  public static double getAve(int classes, int grade, int i, double total) {
  //Has scanner within the method
    Scanner scan = new Scanner(System.in);
//This if statement states that if i is less than the number of classes it will continue to print the print statement
    if (i < classes) {
      i++;
      System.out.println("What is your grade for your next class?");
      grade = scan.nextInt();
      //At the end of the method it prints the average grade by adding all the grades inputed by the user and dividing them by the number of classes inputed by the user
      total = grade + getAve(classes, grade, i, total);
    }

    return total / classes;
  }

}