import java.util.BitSet;

/**
 * Single-file demo for bitwise operations and BitSet.
 * Keeps everything in one class so it compiles/runs without extra files.
 */
public class BitwiseDemo {

    public static void main(String[] args) {
        System.out.println("=== Bitwise Operations Demo ===");

        // Basic bitwise operators
        int a = 5; // 0101
        int b = 3; // 0011

        System.out.println("a & b = " + and(a, b));                   // 0001 = 1
        System.out.println("a | b = " + or(a, b));                   // 0111 = 7
        System.out.println("a ^ b = " + xor(a, b));                 // 0110 = 6
        System.out.println("~a = " + not(a));                      // -6

        // Shifts
        System.out.println("a << 2 = " + leftShift(a, 2));          // 20
        System.out.println("a >> 1 = " + rightShift(a, 1));         // 2
        System.out.println("a >>> 1 = " + unsignedRightShift(a, 1)); // 2

        // Count set bits
        System.out.println("Set bits in 13 (1101): " + countSetBits(13)); // 3

        // Power of two check
        System.out.println("8 is power of 2: " + isPowerOfTwo(8)); // true

        // Single number problem (XOR based)
        int[] arr = {2, 2, 1};
        System.out.println("Single number: " + singleNumber(arr)); // 1

        System.out.println("\n=== BitSet Demo ===");

        // BitSet usage
        BitSet bs1 = new BitSet(8);
        bs1.set(0, 3); // {0,1,2}
        bs1.set(5);
        System.out.println("bs1: " + bs1);

        BitSet bs2 = new BitSet(8);
        bs2.set(1, 2); // {1}
        bs2.set(4);
        System.out.println("bs2: " + bs2);

        // BitSet logical operations (BitSet.and/or/xor mutate receiver and return void)
        BitSet temp = (BitSet) bs1.clone();
        temp.and(bs2);
        System.out.println("bs1 & bs2: " + temp);

        temp = (BitSet) bs1.clone();
        temp.or(bs2);
        System.out.println("bs1 | bs2: " + temp);

        temp = (BitSet) bs1.clone();
        temp.xor(bs2);
        System.out.println("bs1 ^ bs2: " + temp);

        // Flip bits
        bs1.flip(1);
        System.out.println("bs1 flip(1): " + bs1);

        // Cardinality
        System.out.println("bs1 cardinality: " + bs1.cardinality());

        // BitSet doesn't have direct shift APIs; use brute-force shift helpers.
        System.out.println("bs1 << 1: " + leftShiftBruteForce(bs1, 1));
        System.out.println("bs1 >> 1: " + rightShiftBruteForce(bs1, 1));

        // Clear all bits
        bs1.clear();
        System.out.println("bs1 clear(): " + bs1);
    }

    /* =====================
     * BitwiseOperations
     * ===================== */

    private static int and(int a, int b) {
        return a & b;
    }

    private static int or(int a, int b) {
        return a | b;
    }

    private static int xor(int a, int b) {
        return a ^ b;
    }

    private static int not(int a) {
        return ~a;
    }

    private static int leftShift(int a, int shift) {
        return a << shift;
    }

    private static int rightShift(int a, int shift) {
        return a >> shift;
    }

    private static int unsignedRightShift(int a, int shift) {
        return a >>> shift;
    }

    /**
     * Counts set bits in an integer using Brian Kernighan’s algorithm.
     */
    private static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    /**
     * Returns true if n is a power of two.
     */
    private static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    /**
     * XOR-based single number.
     * Assumes exactly one unique number and others appear twice.
     */
    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int x : nums) {
            result ^= x;
        }
        return result;
    }

    /* =====================
     * BitSet shift helpers
     * ===================== */

    /**
     * Brute-force left shift for BitSet.
     * Set bits at index i move to i+shift.
     */
    private static BitSet leftShiftBruteForce(BitSet bs, int shift) {
        if (shift < 0) return rightShiftBruteForce(bs, -shift);

        BitSet result = new BitSet(bs.length() + shift);
        for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i + 1)) {
            result.set(i + shift);
        }
        return result;
    }

    /**
     * Brute-force right shift for BitSet.
     * Set bits at index i move to i-shift.
     */
    private static BitSet rightShiftBruteForce(BitSet bs, int shift) {
        if (shift < 0) return leftShiftBruteForce(bs, -shift);
        if (shift == 0) return (BitSet) bs.clone();

        BitSet result = new BitSet(Math.max(0, bs.length() - shift));
        for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i + 1)) {
            int newIndex = i - shift;
            if (newIndex >= 0) {
                result.set(newIndex);
            }
        }
        return result;
    }
}

