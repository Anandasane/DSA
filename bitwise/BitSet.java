import java.util.Arrays;

/**
 * Custom BitSet class similar to java.util.BitSet.
 * Uses boolean[] internally for bit manipulation.
 * Supports set, clear, flip, logical ops, shifts.
 */
public class BitSet {
    private boolean[] bits;
    private int size;

    /**
     * Constructs a BitSet with given size, all bits false.
     * @param size number of bits
     */
    public BitSet(int size) {
        if (size < 1) throw new IllegalArgumentException("Size must be positive");
        this.size = size;
        this.bits = new boolean[size];
    }

    /**
     * Sets the bit at position pos to true.
     * @param pos bit position (0 to size-1)
     */
    public void set(int pos) {
        checkBounds(pos);
        bits[pos] = true;
    }

    /**
     * Sets bits from 'from' to 'to' inclusive to true.
     * @param from start pos
     * @param to end pos
     */
    public void set(int from, int to) {
        checkBounds(Math.max(from, 0));
        checkBounds(Math.min(to, size - 1));
        for (int i = from; i <= to; i++) {
            bits[i] = true;
        }
    }

    /**
     * Clears the bit at position pos to false.
     * @param pos bit position
     */
    public void clear(int pos) {
        checkBounds(pos);
        bits[pos] = false;
    }

    /**
     * Clears all bits to false.
     */
    public void clearAll() {
        Arrays.fill(bits, false);
    }

    /**
     * Returns the bit value at pos.
     * @param pos bit position
     * @return true if set
     */
    public boolean get(int pos) {
        checkBounds(pos);
        return bits[pos];
    }

    /**
     * Flips bit at pos (true<->false).
     * @param pos bit position
     */
    public void flip(int pos) {
        checkBounds(pos);
        bits[pos] = !bits[pos];
    }

    /**
     * Flips all bits.
     */
    public void flipAll() {
        for (int i = 0; i < size; i++) {
            bits[i] = !bits[i];
        }
    }

    /**
     * Returns the length of the bitset.
     * @return size
     */
    public int length() {
        return size;
    }

    /**
     * Returns number of set bits.
     * @return cardinality
     */
    public int cardinality() {
        int count = 0;
        for (boolean b : bits) {
            if (b) count++;
        }
        return count;
    }

    /**
     * Bitwise AND with other, returns new BitSet.
     * @param other other BitSet
     * @return this & other
     */
    public BitSet and(BitSet other) {
        BitSet result = new BitSet(Math.max(size, other.size));
        for (int i = 0; i < result.size; i++) {
            boolean a = i < size ? bits[i] : false;
            boolean b = i < other.size ? other.bits[i] : false;
            result.bits[i] = a && b;
        }
        return result;
    }

    /**
     * Bitwise OR with other, returns new BitSet.
     * @param other other BitSet
     * @return this | other
     */
    public BitSet or(BitSet other) {
        BitSet result = new BitSet(Math.max(size, other.size));
        for (int i = 0; i < result.size; i++) {
            boolean a = i < size ? bits[i] : false;
            boolean b = i < other.size ? other.bits[i] : false;
            result.bits[i] = a || b;
        }
        return result;
    }

    /**
     * Bitwise XOR with other, returns new BitSet.
     * @param other other BitSet
     * @return this ^ other
     */
    public BitSet xor(BitSet other) {
        BitSet result = new BitSet(Math.max(size, other.size));
        for (int i = 0; i < result.size; i++) {
            boolean a = i < size ? bits[i] : false;
            boolean b = i < other.size ? other.bits[i] : false;
            result.bits[i] = a != b;
        }
        return result;
    }

    /**
     * Left shifts bits by n positions, pads left with false (0).
     * Increases size.
     * @param n shift amount
     * @return shifted BitSet
     */
    public BitSet leftShift(int n) {
        BitSet result = new BitSet(size + n);
        for (int i = 0; i < size; i++) {
            result.bits[i + n] = bits[i];
        }
        return result;
    }

    /**
     * Right shifts bits by n positions, pads right with false (0).
     * Decreases size if n > 0.
     * @param n shift amount
     * @return shifted BitSet
     */
    public BitSet rightShift(int n) {
        if (n >= size) return new BitSet(1);
        BitSet result = new BitSet(size - n);
        for (int i = 0; i < result.size; i++) {
            result.bits[i] = bits[i + n];
        }
        return result;
    }

    /**
     * Internal bounds check for pos.
     */
    private void checkBounds(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Pos: " + pos + ", size: " + size);
        }
    }

    /**
     * Returns string representation of bits (0/1 string).
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (boolean b : bits) {
            sb.append(b ? '1' : '0');
        }
        return sb.toString();
    }
}
