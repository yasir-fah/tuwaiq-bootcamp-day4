import java .util .Scanner;

public class day4Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1.Write a program that prints the numbers from 1 to 100 such that:
            If the number is a multiple of 3, you need to print "Fizz" instead of that
            number.
            If the number is a multiple of 5, you need to print "Buzz" instead of that number.
            If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
            instead of that number. */

        System.out.println("--------------  Exercise one    --------------");
        for (int i = 0; i <= 100; i++) {
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                }else if(i % 3 == 0){
                    System.out.println("Fizz");
                }else if( i % 5 == 0){
                    System.out.println("Buzz");
                }else {
                    System.out.println(i);
                }
        }





        /*2.Write a Java program to reverse a string.*/

        System.out.println("--------------  Exercise two    --------------");
            System.out.println("enter a string that you want to reverse it: ");
            String sentence = input.nextLine();

            for(int i = sentence.length() -1; i >= 0; i--) { // hence 'sentence.length() -1' to stay at the boundary of string
                System.out.print(sentence.charAt(i)); // expect the user will enter non-null value
            }





        /*3.Write a program to find the factorial value of any number entered
            through the keyboard. */

        System.out.println("--------------  Exercise three    --------------");
        System.out.println("entr number that you want to see it's factorial: ");
        int number = input.nextInt();

        int counter = 1;
        for (int i = number; i >0 ; i--) {
            counter = counter * i;

        }
        System.out.println("the factorial of "+number+"! is equal to = "+counter);





        /*
        4.Two numbers are entered through the keyboard. Write a program to find
            the value of one number raised to the power of another. (Do not use Java
            built-in method)
         */

        System.out.println("--------------  Exercise four   --------------");

        String choice;

        do{
            System.out.println("Enter the First number:");
            int number1 = input.nextInt();

            System.out.println("Enter the Second number:");
            int number2 = input.nextInt();

            input.nextLine();

            System.out.println("Choose the power you want: (number1 - number2 - exit)");
            choice = input.nextLine();

            switch(choice){
                case "number1": {
                    int result = 1;
                    for (int i = 0; i < number1 ; i++) {
                        result *= number2;

                    }System.out.println(number2+"^"+number1+" = "+result);
                    break;
                }
                case "number2": {
                    int result = 1;
                    for (int i = 0; i < number2 ; i++) {
                        result *= number1;

                    }System.out.println(number1+"^"+number2+" = "+result);
                    break;
                }
                case "exit":
                    System.out.println("You exited");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while(!choice.equals("exit"));





        /*5.Write a program that reads a set of integers, and then prints the sum of
            the even and odd integers.
         */

        System.out.println("--------------  Exercise five    --------------");
        System.out.println("Enter your range of numbers");
        int range = input.nextInt();

        int oddCounter = 0;
        int evenCounter = 0;

        for(int i = 1; i <= range; i++){
            if(i % 2 == 1){
                oddCounter = oddCounter +i;
            }else if(i % 2 == 0){
                evenCounter = evenCounter +i;
            }
        }
        System.out.println("the summation of odd number = "+oddCounter);
        System.out.println("the summation of even number = "+evenCounter);





        /*6.Write a program that prompts the user to input a positive integer. It
            should then output a message indicating whether the number is a prime
            number.
         */

        System.out.println("--------------  Exercise six    --------------");
        System.out.println("Enter a number and see whether it's prime or not:");
        int theNumber = input.nextInt();

        if(theNumber <=1 ){
            System.out.println("Please start with 2 to check if it is prime or not");
        }else {
            boolean isPrime = true;

            for (int i = 2; i <= (int)Math.sqrt(theNumber); i++) {
                if(theNumber % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("this is a Prime number: "+ theNumber);
            }else {
                System.out.println("this is NOT a Prime number: "+ theNumber);
            }
        }





        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
            another for loop to print the days (Days 1 -7) for each week. */

        System.out.println("--------------  Exercise seven    --------------");

        for (int i = 1; i <= 4 ; i++) {
            System.out.println("week:"+i);
                for (int j = 1; j <= 7; j++) {
                    System.out.println("day: "+j);
                }

        }





        /*8.Write a program thats check if the word is a palindrome or not. hint: A
            string is said to be a palindrome if it is the same if we start reading it from
            left to right or right to left. */

        System.out.println("--------------  Exercise eight    --------------");
        System.out.println("enter your word to check whether it's palindrome or not");
        String word = input.nextLine();

        String palindrome = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
                palindrome += word.charAt(i);
        }
        if(word.equals(palindrome)){
            System.out.println("Your word considered as a palindrome: "+word);
        }else{
            System.out.println("your word doesn't considered as a palindrome: "+word);
        }
    }
}
