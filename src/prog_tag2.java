import java.util.Scanner;

public class prog_tag2
{


        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("please enter a number");
//            int firstNumber = scanner.nextInt();
//            int secondNumber = 3;
//            int result = firstNumber % secondNumber;
//            if (result == 0) {
//                System.out.println("The Number is divisible by 3");
//            } else {
//                System.out.println("The number is not divisible babe");
//            }
//            int number = 2;
//            // number += 2;
//            number = number + 2;
//            System.out.println(number);
            int dividend =17;
            int divisor = 9;
            int resultOfDivisible = isDivisible(dividend, divisor);
            if (resultOfDivisible != 0){
                System.out.println(dividend + "is divisible by " + divisor);
            }
        }

    private static int isDivisible() {
        return 0;
    }

    public static int isDivisible (int dividend, int divisor){
            int restFromDivision = dividend % divisor;
            int returnValue =0;
            if (restFromDivision ==0) {
                returnValue =0;
                return dividend;
            }
                return returnValue;
            }
        }




