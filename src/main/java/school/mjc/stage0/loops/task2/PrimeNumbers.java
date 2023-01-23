package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 2;

        while (num <= printToInclusive) {

            boolean isPrime = true;
            int previousNumber = 2;

            while (previousNumber < num) {
                if (num % previousNumber == 0) {
                    isPrime = false;
                    break;
                }
                previousNumber++;
            }

            if (isPrime) {
                System.out.println(num);
            }

            num++;

        }

    }
}
