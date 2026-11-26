//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.


    Scanner input = new Scanner(System.in);

    //Question number 1
    /*
    1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
If the number is a multiple of 5, you need to print "Buzz" instead of that
number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
instead of that number.
     */

    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz ");
        } else if (i % 3 == 0) {
            System.out.println("Fizz ");
        } else if (i % 5 == 0) {
            System.out.println("Buzz ");
        } else {
            System.out.println(i);
        }
    }
// End question 1


    // Question 2
        /*
        2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT
         */

    System.out.println("Enter your sentence");
    String sentence = input.nextLine();
    for (int i = sentence.length() - 1; i >= 0; i--) {
        System.out.print(sentence.charAt(i));
    }
    System.out.println("");
    // End question 2


    // Question 3
    /*
3.Write a program to find the factorial value of any number entered
through the keyboard.

     */
    //
    System.out.println("Enter the number for print factorial of it");
    int number = input.nextInt();
    long fact = 1;

    while(number < 0){
        System.out.println("do not enter negative number please enter another number");
        number = input.nextInt();
    }

    for (int i = 1; i <= number; i++) {
        fact = fact * i;
    }
    System.out.println("Factorial of: " + fact);




    // End question 3


    // Question 4
    System.out.println("Enter two number the first number will be rasid to the power of second number");
    System.out.println("First number");
    int number1 = input.nextInt();
    System.out.println("Second number");
    int number2 = input.nextInt();

    long result = 1;

    for (int i = 1; i <= number2; i++) {
        result = result * number1;
    }
    System.out.println(result);

    // end of question 4


    //question 5
    /*
    5.Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.
     */

    int evenSum = 0;
    int oddSum = 0;
    System.out.println("Enter integer number or enter -1 to stop the program and print the sum of your odd number and even number");
    int numbers = input.nextInt();

    while (numbers != -1) {
        if (numbers % 2 == 0) {
            evenSum = evenSum + numbers;
        } else {
            oddSum = oddSum + numbers;
        }
        numbers = input.nextInt();

    }
    System.out.println("Total sum of even " + evenSum);
    System.out.println("Total sum of odd " + oddSum);


    //end of question  5


    // question 6
    /*
    6.Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.
     */

    System.out.println("Enter number to check is prime or not");
    int num = input.nextInt();
    boolean isPrime=true;
    if (num <= 1) {
        isPrime = false;
    }


    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            isPrime = false;

            break;
        }

    }
    if(isPrime == true) {
        System.out.println("prime");
    } else {
        System.out.println("not prime number");
    }

    //end of question 6


    // question 7

    for (int week = 1; week <= 4; week++) {
        System.out.println("Week " + week);

        for (int Day = 1; Day <= 7; Day++) {
            System.out.println("Day " + Day);
        }
    }


//end of question 7


    //question 8
    /*
    8.Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.
     */

    System.out.println("Enter word to check is palindrom or not");
    input.nextLine();
    String yourWord = input.nextLine();
    StringBuilder stb = new StringBuilder(yourWord);
    String output = stb.reverse().toString();
    System.out.println("output: " + output);
    if (yourWord.equals(output)) {
        System.out.println("String is palindrome");
    } else {
        System.out.println("String is not palindrom");
    }
    //End of question 8


}
