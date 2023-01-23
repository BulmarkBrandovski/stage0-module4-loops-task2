package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }

        int pow = 0;

        while (pow <= power) {
            int numInPower = 1;
            int prevPow = 1;

            while (prevPow <= pow) {
                numInPower *= 2;
                prevPow++;
            }

            System.out.println(numInPower);

            pow++;
        }
    }
}
