/**
 * Utility class for bitwise operations on integers.
 * Includes basic operators, shifts, bit counting, and common problems.
 */
public class BitwiseOperations {
    /**
     * Bitwise AND: Returns bits that are set in both a and b.
     * @param a first int
     * @param b second int
     * @return a & b
     */
    public static int and(int a, int b) {
        return a & b;
    }

    /**
     * Bitwise OR: Returns bits set in a or b or both.
     * @param a first int
     * @param b second int
     * @return a | b
     */
    public static int or(int a, int b) {
        return a | b;
    }

    /**
     * Bitwise XOR: Returns bits set in exactly one of a or b.
     * @param a first int
     * @param b second int
     * @return a ^ b
     */
    public static int xor(int a, int b) {
        return a ^ b;
    }

    /**
     * Bitwise NOT: Flips all bits in a.
     * @param a int to negate
     * @return ~a
     */
    public static int not(int a) {
        return ~a;
    }

    /**
     * Left shift: Shifts bits left by n, fills with 0.
     */
    public static int leftShift(int a, int n) {
        return a << n;
    }

    /**
     * Right shift: Arithmetic shift right by n, sign extends.
     */
    public static int rightShift(int a, int n) {
        return a >> n;
    }

    /**
     * Unsigned right shift: Logical shift right by n, fills with 0.
     */
    public static int unsignedRightShift(int a, int n) {
        return a >>> n;
    }

    /**
     * Counts number of 1 bits (population count).
     * @param a int to count
     * @return number of set bits
     */
    public static int countSetBits(int a) {
        int count = 0;
        while (a != 0) {
            count += a & 1;
            a >>>= 1;
        }
        return count;
    }

    /**
     * Checks if n is power of 2 using n & (n-1) == 0.
     */
    public static boolean isPowerOfTwo(int a) {
        return a > 0 && (a & (a - 1)) == 0;
    }

    /**
     * Finds the single number in array where every other number appears twice.
     * Uses XOR property: XOR all = unique.
     * @param arr input array
     * @return the single number
     */
    public static int singleNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
