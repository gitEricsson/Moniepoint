package week2.day1;
import java.util.Scanner;

public class DigitsToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Amount in digits");
        int amount = scanner.nextInt();

        if (amount < 0 || amount > 2000000000) {
            System.out.println("Amount must be between 0 and a 2000000000.");
            return;
        }

        DigitsToWords digitsToWords = new DigitsToWords();
        System.out.println(digitsToWords.digitsResult(amount));
    }

    public String digitsResult(int amount) {
        int amountDigitsCount = numberOfDigitsInAmount(amount);
        int divisor = (int) Math.pow(10, amountDigitsCount - 1);
        StringBuilder amountInWords = new StringBuilder();

        for (int i = amountDigitsCount; i >= 0 && divisor > 0; i--){
            int digit = amount / divisor;

            amount %= divisor;
            divisor /= 10;

            if (i % 3 == 1 && digit != 0) {
               String word = aDigitToWord(digit, "unit");
               amountInWords.append(word).append(" ");

            }
            if (i % 3 == 2 && digit != 0) {
                if (digit == 1){
                    int digitNextToOne = amount / divisor;

                    String word = aDigitToWord(10 + digitNextToOne, "ones");
                    amountInWords.append(word).append(" ");

                    if(i == 5){
                        if (amount != 0){
                            amountInWords.append("thousand").append(", ");
                        }
                        if (amount == 0){
                            amountInWords.append("thousand").append(" ");
                        }
                    }
                    if(i == 8){
                        if (amount != 0){
                            amountInWords.append("million").append(", ");
                        }
                        if (amount == 0){
                            amountInWords.append("million").append(" ");
                        }
                    }

                    i--;
                    amount %= divisor;
                    divisor /= 10;
                    continue;
                }
                String word = aDigitToWord(digit, "tens");
                amountInWords.append(word).append(" ");

            }

            if (i % 3 == 0 && digit != 0) {
            String word = aDigitToWord(digit, "hundreds");
            amountInWords.append(word).append(" ");

            if (amount != 0){
                amountInWords.append("and").append(" ");
            }
            }

            if(i == 4){
                if (amount != 0){
                    amountInWords.append("thousand").append(", ");
                }
                if (amount == 0){
                    amountInWords.append("thousand").append(" ");
                }
            }

            if(i == 7){
                if (amount != 0){
                    amountInWords.append("million").append(", ");
                }
                if (amount == 0){
                    amountInWords.append("million").append(" ");
                }
            }
            if(i == 10){
                if (amount != 0){
                    amountInWords.append("billion").append(", ");
                }
                if (amount == 0){
                    amountInWords.append("billion").append(" ");
                }
            }

        }


        return amountInWords.toString().trim();
    }


    public int numberOfDigitsInAmount(int amount) {
        if (amount == 0) {
            return 1;
        }

        int count = 0;
        while (amount > 0) {
            amount /= 10;
            count++;
        }
        return count;
    }

    public String aDigitToWord(int aDigit, String placeValue) {

        if (placeValue.equals("unit")) {
            return switch (aDigit) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "";
            };
        }

        if (placeValue.equals("ones")) {
            return switch (aDigit) {
                case 11 -> "eleven";
                case 12 -> "twelve";
                case 13 -> "thirteen";
                case 14 -> "fourteen";
                case 15 -> "fifteen";
                case 16 -> "sixteen";
                case 17 -> "seventeen";
                case 18 -> "eighteen";
                case 19 -> "nineteen";
                default -> "";
            };
        }


        if (placeValue.equals("tens")) {
            return switch (aDigit) {
                case 1 -> "ten";
                case 2 -> "twenty";
                case 3 -> "thirty";
                case 4 -> "forty";
                case 5 -> "fifty";
                case 6 -> "sixty";
                case 7 -> "seventy";
                case 8 -> "eighty";
                case 9 -> "ninety";
                default -> "";
            };
        }

        if (placeValue.equals("hundreds")) {
            return switch (aDigit) {
                case 1 -> "one hundred";
                case 2 -> "two hundred";
                case 3 -> "three hundred";
                case 4 -> "four hundred";
                case 5 -> "five hundred";
                case 6 -> "six hundred";
                case 7 -> "seven hundred";
                case 8 -> "eight hundred";
                case 9 -> "nine hundred";
                default -> "";
            };
        }

        return "";
    }

}


