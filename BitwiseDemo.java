/**
 * Demo class for BitwiseOperations and BitSet.
 * Shows all methods and sample problems.
 */
public class BitwiseDemo {
    public static void main(String[] args) {
        System.out.println("=== Bitwise Operations Demo ===");

        // Basic bitwise operators
        int a = 5; // 101 binary
        int b = 3; // 011 binary
        System.out.println("a & b = " + BitwiseOperations.and(a, b)); // 001 = 1
        System.out.println("a | b = " + BitwiseOperations.or(a, b));   // 111 = 7
        System.out.println("a ^ b = " + BitwiseOperations.xor(a, b));  // 110 = 6
        System.out.println("~a = " + BitwiseOperations.not(a));        // -6

        // Shifts
        System.out.println("a << 2 = " + BitwiseOperations.leftShift(a, 2)); // 20
        System.out.println("a >> 1 = " + BitwiseOperations.rightShift(a, 1)); // 2
        System.out.println("a >>> 1 = " + BitwiseOperations.unsignedRightShift(a, 1)); // 2

        // Count set bits
        System.out.println("Set bits in 13 (1101): " + BitwiseOperations.countSetBits(13)); // 3

        // Power of two check
        System.out.println("8 is power of 2: " + BitwiseOperations.isPowerOfTwo(8)); // true

        // Single number problem
        int[] arr = {2, 2, 1};
        System.out.println("Single number: " + BitwiseOperations.singleNumber(arr)); // 1

        System.out.println("\n=== BitSet Demo ===");

        // BitSet usage
        BitSet bs1 = new BitSet(8);
        bs1.set(0, 3); // 11110000
        bs1.set(5);
        System.out.println("bs1: " + bs1); // 11100100

        BitSet bs2 = new BitSet(8);
        bs2.set(1, 2);
        bs2.set(4);
        System.out.println("bs2: " + bs2); // 01101000

        System.out.println("bs1 & bs2: " + bs1.and(bs2));
        System.out.println("bs1 | bs2: " + bs1.or(bs2));
        System.out.println("bs1 ^ bs2: " + bs1.xor(bs2));

        bs1.flip(1);
        System.out.println("bs1 flip(1): " + bs1);

        System.out.println("bs1 cardinality: " + bs1.cardinality());

        // Shifts on BitSet
        System.out.println("bs1 << 1: " + bs1.leftShift(1));
        System.out.println("bs1 >> 1: " + bs1.rightShift(1));

        bs1.clearAll();
        System.out.println("bs1 clearAll: " + bs1);
    }
}
