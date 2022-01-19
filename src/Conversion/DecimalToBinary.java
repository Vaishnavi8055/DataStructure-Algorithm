package Conversion;

/**
 * DecimalToBinary
 */
public class DecimalToBinary {

    public static void main(String[] args) {


        int toConvert = 1000;
        int binaryRepAns = 0;
        int i = 0;

        while (toConvert != 0) {

            // It is a bitwise-AND which first converts decimal to binary and then do & (AND) operation
            // bitwise & with 1 returns last bit of binary rep.
            int lastBit = toConvert & 1;

            // Now reverse the bits to get correct binary representation of number
            // reverseAns = (bit*10^i)+reverseAns
            binaryRepAns = (int) (lastBit * Math.pow(10, i)) + binaryRepAns;
            toConvert = toConvert >> 1;
            i++;

        }
        System.out.println(binaryRepAns);
    }
}