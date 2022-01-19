package Conversion;

/**
 * BinaryToDecimal
 */
class BinaryToDecimal {

    public static void main(String[] args) {

        int toConvert = 1010;
        int decimalAns = 0;
        int i = 0;

        while (toConvert != 0) {
            int lastDigit = toConvert % 10;
            decimalAns = (int) (lastDigit * Math.pow(2, i)) + decimalAns;
            toConvert = toConvert / 10;
            i++;
        }
        System.out.println(decimalAns);
    }
}
