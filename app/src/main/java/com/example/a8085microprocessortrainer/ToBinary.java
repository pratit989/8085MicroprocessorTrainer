package com.example.a8085microprocessortrainer;

import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;

class ToBinary {

    static String final_value = "";

    static String to_binary_function(String a) {
        String[] values;
        values = a.split("");
        int msb;
        // Converting MSB in Binary
        switch (values[1])
        {
            case "A":
                msb = 10;
                break;
            case "B":
                msb = 11;
                break;
            case "C":
                msb = 12;
                break;
            case "D":
                msb = 13;
                break;
            case "E":
                msb = 14;
                break;
            case "F":
                msb = 15;
                break;
            case "a":
                msb = 10;
                break;
            case "b":
                msb = 11;
                break;
            case "c":
                msb = 12;
                break;
            case "d":
                msb = 13;
                break;
            case "e":
                msb = 14;
                break;
            case "f":
                msb = 15;
                break;
            default:
                msb = parseInt(values[1]);
        }
        int lsb;
        // Converting LSB in Binary
        switch (values[2])
        {
            case "A":
                lsb = 10;
                break;
            case "B":
                lsb = 11;
                break;
            case "C":
                lsb = 12;
                break;
            case "D":
                lsb = 13;
                break;
            case "E":
                lsb = 14;
                break;
            case "F":
                lsb = 15;
                break;
            case "a":
                lsb = 10;
                break;
            case "b":
                lsb = 11;
                break;
            case "c":
                lsb = 12;
                break;
            case "d":
                lsb = 13;
                break;
            case "e":
                lsb = 14;
                break;
            case "f":
                lsb = 15;
                break;
            default:
                lsb = parseInt(values[2]);
        }
        // Combining MSB and LSB
        String msb_final = "0000".substring(toBinaryString(msb).length()) + toBinaryString(msb);
        String lsb_final = "0000".substring(toBinaryString(lsb).length()) + toBinaryString(lsb);
        final_value = msb_final + lsb_final;
        return final_value;
    }

    static class bit_separator {

        static String[] bin;

        // Converting Binary String to 8 bit Array
        private static void bit_separator_function(String binary1, int[] num)
        {
            Arrays.fill(num, 0);
            int i,back = num.length - binary1.length();
            bin = binary1.split("");
            bin = Arrays.copyOfRange(bin, 1, bin.length);
            for (i = 0; i < 8;)
            {
                try {
                    num[i] = parseInt(bin[i-back]);
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