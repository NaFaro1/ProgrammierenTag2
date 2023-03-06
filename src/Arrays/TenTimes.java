package Arrays;

public class TenTimes {
    public static void main(String[] args) {
        printSentence("Hallo! Hilfe!", 0);
    }
    public static void printSentence(String sentence, int startingNumber) {

        if (startingNumber != 10){
            startingNumber++;

            System.out.println(sentence);
            printSentence(sentence, startingNumber);
        } else {
            System.out.println("Finished!");
        }

    }
}
