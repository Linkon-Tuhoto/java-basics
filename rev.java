import java.util.Scanner;
public class rev {
    //OPERATORS
    /*public static void main(String[] args){
        int age = 50;
        System.out.println("My age is " + age + " years old");
    }*/

       /* public static void main(String[] args){
            int number1 = 5;
            double number2 = number1;
            System.out.println("The value of number2 is " + number2);
        }*/

          /*  public static void main (String[] args){
                double number1 = 5;
                int number2 = (int)number1;// add (int) to tell compiler you are convering double to int

                System.out.println("The value of number2 is " + number2);
            }*/

    //STRING METHOD
    /*public static void main(String[] args){
        String name = "Linkon";

        System.out.println("My name is " + name.toUpperCase());
    }*/

        //STRING FORMATTING
        // affirmative specifiers
        //%f - floating point number/ double number
        //%d - integer
        //%s - string
        //%c - character
        //%b - boolean
   /*public static void main(String[] args){
    String name = "Linkon";
    int age = 60;
    String country = "Kenya";
    String profession = "Software Engineer";
    String formattedString = String.format("My name is %s. I am %d years old. I live in %s and I work as a %s.", name, age, country, profession);

    System.out.println(formattedString);
   }*/

    //User Inputting
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");//println has new character after end of line while print doesn't but youn can add \n
        String name = scanner.nextLine();
        System.out.println("My name is " +name);

        System.out.println("What is your age ?");
        int age = scanner.nextInt();
        System.out.println("My age is " + age);

        scanner.close();
    }
    
}
