public class Factorizer {
    public static void main(String[] args) {
        int numberA = 3;
        int numberB = 9;

        //create an instance of this class
        Factorizer factorizer = new Factorizer();

        //now call the method
        boolean result = factorizer.isFactor(numberA, numberB);

        if(result) {
            System.out.printf("%d is a factor of %d\n", numberA, numberB);
        } else {
            System.out.printf("%d is NOT a factor of %d\n", numberA, numberB);
        }

        int numberC = 4;
        int numberD = 11;

        boolean result2 = factorizer.isFactor(numberC, numberD);

        if(result2) {
            System.out.printf("%d is a factor of %d\n", numberC, numberD);
        } else {
            System.out.printf("%d is NOT a factor of %d\n", numberC, numberD);
        }
    }
    public boolean isFactor(int a, int b) {
        int ans = b % a;
        return ans == 0;
    }
}
