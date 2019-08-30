package bignumbers;

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("12345678910123456789");
        big = big.multiply(BigInteger.valueOf(123456789));
        System.out.println(big);
    }
}
