public class AverageOddEven {
    public static void main(String[] args) {
        int N = 5;
        int sumOdd = 0, sumEven = 0;
        for (int i = 1; i <= N; i++) {
            sumOdd += 2 * i - 1;
            sumEven += 2 * i;
        }
        System.out.println("Average of Odd Numbers: " + (sumOdd / N));
        System.out.println("Average of Even Numbers: " + (sumEven / N));
    }
}