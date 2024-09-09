public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 1000; j++) {

            boolean divisibleBy3 = j % 3 == 0;
            boolean divisibleBy5 = j % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                i++;
            }
        }
        System.out.println(i);
    }
}
