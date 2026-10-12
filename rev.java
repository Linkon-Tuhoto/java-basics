import java.util.Scanner;
import java.util.Arrays;

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
    /*public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");//println has new character after end of line while print doesn't but youn can add \n
        String name = scanner.nextLine();
        System.out.println("My name is " +name);

        System.out.println("What is your age ?");
        int age = scanner.nextInt();
        System.out.println("My age is " + age);

        scanner.close();
    }*/

        //Conditional Sentences
        /*public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter first number: ");
            int number1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter second number: ");
            int number2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What operation do you want to perform: ");
            String operation = scanner.nextLine();
            //Switch Case
            switch(operation) {
                case "sum":
                    System.out.printf("%d + %d = %d \n", number1, number2, number1 + number2);
                    break;
                case "sub":
                    System.out.printf("%d - %d = %d \n", number1, number2, number1 - number2);
                    break;
                case "div":
                    if(number2 == 0){
                        System.out.println("Cannot divide by zero: ");
                    }
                    else{
                        System.out.printf("%d / %d = %d \n", number1, number2, number1 / number2);
                    }
                    break;
                case "mult":
                    System.out.printf("%d * %d = %d \n", number1, number2, number1 * number2);
                    break;
                default:
                    System.out.printf("%s is not supported operation \n", operation);
            };
            
            //If Else Else If
            if(operation.equals("sum")){
                System.out.printf("%d + %d = %d \n", number1, number2, number1 + number2);
            }
            else if(operation.equals("sub")){
                System.out.printf("%d - %d = %d \n", number1, number2, number1 - number2);
            }
            else if(operation.equals("mult")){
                System.out.printf("%d * %d = %d \n", number1, number2, number1 * number2);
            }
            else if(operation.equals("div")){
                if(number2 == 0){
                    System.out.println("Cannot divide by zero");
                }
                else{
                    System.out.printf("%d / %d = %d \n", number1, number2 = number1 / number2);
                }
            }
            else{
                System.out.printf("%s is not supported operation \n", operation);
            } 
            scanner.close();
        }
        */

    public static void main(String[] args){
        char vowels[] = new char[5];
        // you can to declare and intialize arrays in one line
        //char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        // change value of an array vowels[3]= 'y';
        vowels[0]='a';
        vowels[1]='e';
        vowels[2]='i';
        vowels[3]='o';
        vowels[4]='u';

        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);
    }
    
}
