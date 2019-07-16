package com.example.a8085microprocessortrainer;

import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;

class ToBinary {

    static String final_value = "";

    static String to_binary_function(String a) {
        final_value = "";
        StringBuilder final_string = new StringBuilder(final_value);
        String[] values;
        values = a.split("");
        for (int i = 1; i < values.length; i++) {
            int val;
            switch (values[i]) {
                case "A":
                    val = 10;
                    break;
                case "B":
                    val = 11;
                    break;
                case "C":
                    val = 12;
                    break;
                case "D":
                    val = 13;
                    break;
                case "E":
                    val = 14;
                    break;
                case "F":
                    val = 15;
                    break;
                case "a":
                    val = 10;
                    break;
                case "b":
                    val = 11;
                    break;
                case "c":
                    val = 12;
                    break;
                case "d":
                    val = 13;
                    break;
                case "e":
                    val = 14;
                    break;
                case "f":
                    val = 15;
                    break;
                default:
                    val = parseInt(values[i]);
            }
            String val_string = "0000".substring(toBinaryString(val).length()) + toBinaryString(val);
            final_string.append(val_string);
        }
        final_value = final_string.toString();
        return final_value;
    }

    static class bit_separator {

        static String[] bin;

        // Converting Binary String to 8 bit Array
        private static void bit_separator_function(String binary1, int[] num)
        {
            Arrays.fill(num, 0);
            int i;
            bin = binary1.split("");
            bin = Arrays.copyOfRange(bin, 1, bin.length);
            for (i = 0; i < 8;)
            {
                try {
                    num[i] = parseInt(bin[i]);
                }catch (Exception ignored){
                }
                i++;
            }
        }
        static void bit_separator_starter(String binary1, String binary2)
        {
            bit_separator_function(binary1, GlobalVariables.num1);
            bit_separator_function(binary2, GlobalVariables.num2);
        }
    }
}