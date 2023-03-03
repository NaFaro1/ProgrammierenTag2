public class Do_Count {
    public static void main(String[] args) {
        int x = 0;
        doCount(x);
    }

    public static void doCount(int x) {
        do {
            System.out.println(x);
            x++;


        }  while (x <= 100);



    }
}