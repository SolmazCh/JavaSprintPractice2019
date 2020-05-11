package Practice_HardTasks;

/*
Given two positive integers m and n, find their greatest common divisor,
that is, the largest positive integer that evenly divides both m and n.
if m = 15 and n = 25, then result greatest common divisor is = 5.//EBOB tapilmasi
 */

public class commonDivisor {
    public static int commonDivisor(int m, int n) {
        //WRITE YOUR CODE HERE

        while (m != n) {
            if (m > n) {
                m -= n;
            } else {
                n -= m;
            }
        }
        return n;
    }
}