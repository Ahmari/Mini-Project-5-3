import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("How many classes do you take?");
    int classes = scan.nextInt();
    System.out.println("What is your grade for your first class?");
    int i = 0;
  }

  public static void getAve(int classes, int grade, int i){
    Scanner scan = new Scanner(System.in);
    if(i < classes){
    i++;
    System.out.println("What is your grade for your next class?");
    grade = scan.nextInt(grade);
    }else {
    System.out.println("Done");

    getAve( classes,  grade, i);
  }
}

}