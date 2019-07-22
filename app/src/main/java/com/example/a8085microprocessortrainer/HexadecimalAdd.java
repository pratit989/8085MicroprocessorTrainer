package com.example.a8085microprocessortrainer;

import java.util.Arrays;

class HexadecimalAdd {

    static String adder_function(String a1, String b1) {

        GlobalVariables.final_sum = "";

        // Converting Input to Binary
        ToBinary.to_binary_function(a1);
        a1 = ToBinary.final_value;
        ToBinary.to_binary_function(b1);
        b1 = ToBinary.final_value;

        // Converting to 8-bit Format
        ToBinary.bit_separator.bit_separator_starter(a1, b1);

        // Addition
        half_adder.half_adder_function(GlobalVariables.num1, GlobalVariables.num2);

        // Array to String
        StringBuilder stringBuffer = new StringBuilder(GlobalVariables.final_sum);
        for (int i = 0; i < GlobalVariables.sum.length; i++) {
            stringBuffer.append(GlobalVariables.sum[i]);
        }
        String temp = stringBuffer.toString();
        // temp = "000000000".substring(stringBuffer.toString().length()+GlobalVariables.carry_out) + GlobalVariables.carry_out + stringBuffer.toString();

        // Binary to Decimal
        int final1 = Integer.parseInt(temp, 2);

        // Decimal to Hexadecimal
        GlobalVariables.final_sum = "00".substring(Integer.toHexString(final1).length()) + Integer.toHexString(final1).toUpperCase();
        // GlobalVariables.final_sum = "0000".substring(GlobalVariables.final_sum.length()) + GlobalVariables.final_sum;

        // Parity Check
        int count = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '1') {
                count++;
            }
        }
        // Setting Parity Flag

        if (count % 2 == 0) {
            GlobalVariables.B2_P = "01";
        } else {
            GlobalVariables.B2_P = "00";
        }
        // Setting Zero Flag
        if (final1 != 0) {
            GlobalVariables.B6_Z = "00";
        } else {
            GlobalVariables.B6_Z = "01";
        }
        // Setting Sign Flag
        if (stringBuffer.toString().substring(0, 1).equals("1")) {
            GlobalVariables.B7_S = "01";
        } else {
            GlobalVariables.B7_S = "00";
        }
        // Setting F register value
        if (!GlobalVariables.B7_S.equals("00") || !GlobalVariables.B6_Z.equals("00") || !GlobalVariables.B4_AC.equals("00") || !GlobalVariables.B2_P.equals("00") || !GlobalVariables.B0_CY.equals("00")) {
            String string_F = Integer.toString(Integer.parseInt(GlobalVariables.B7_S)) + Integer.parseInt(GlobalVariables.B6_Z) + Integer.parseInt(GlobalVariables.B5) + Integer.parseInt(GlobalVariables.B4_AC) + Integer.parseInt(GlobalVariables.B3) + Integer.parseInt(GlobalVariables.B2_P) + Integer.parseInt(GlobalVariables.B1) + Integer.parseInt(GlobalVariables.B0_CY);
            GlobalVariables.F = Integer.toHexString(Integer.parseInt(string_F)).toUpperCase();
        } else {
            GlobalVariables.F = "00";
        }
        return GlobalVariables.final_sum;
    }

    static class full_adder {

        static void full_adder_method(int a, int b, int carry_in, int i) {
            GlobalVariables.sum[i] = carry_in + a;
            if (GlobalVariables.sum[i] > 1) {
                GlobalVariables.carry_out = "01";
                GlobalVariables.sum[i] = 0;
            } else {
                GlobalVariables.carry_out = "00";
            }
            GlobalVariables.sum[i] = GlobalVariables.sum[i] + b;
            if (GlobalVariables.sum[i] > 1) {
                GlobalVariables.carry_out = "01";
                GlobalVariables.sum[i] = 0;
            }
        }
    }

    static class half_adder {

        static void half_adder_function(int[] a, int[] b) {
            if (a.length == b.length || a.length > b.length) {
                GlobalVariables.sum = new int[a.length];
            } else {
                GlobalVariables.sum = new int[b.length];
            }
            Arrays.fill(GlobalVariables.sum,0);
            GlobalVariables.carry_in = "00";
            try {
                try {
                    GlobalVariables.sum[GlobalVariables.sum.length - 1] = a[GlobalVariables.sum.length - 1] + b[GlobalVariables.sum.length - 1];
                } catch (Exception ignored) {
                }
                if (GlobalVariables.sum[GlobalVariables.sum.length - 1] > 1) {
                    GlobalVariables.sum[GlobalVariables.sum.length - 1] = 0;
                    GlobalVariables.carry_in = "01";
                } else {
                    GlobalVariables.carry_in = "00";
                }
                for (int i = GlobalVariables.sum.length - 2; i >= 0; ) {
                    try {
                        full_adder.full_adder_method(a[i], b[i], Integer.parseInt(GlobalVariables.carry_in), i);
                    } catch (Exception ignored) {
                    }
                    GlobalVariables.carry_in = GlobalVariables.carry_out;
                    // Setting Auxiliary Carry Flag
                    if (i == 4 && GlobalVariables.carry_in.equals("01")) {
                        GlobalVariables.B4_AC = "01";
                    }
                    // 9th bit carry
                    if (i == 0 && GlobalVariables.carry_in.equals("01")) {
                        GlobalVariables.carry_out = "01";
                    } else {
                        GlobalVariables.carry_out = "00";
                    }
                    i--;
                }
                // Setting Carry Flag
                GlobalVariables.B0_CY = GlobalVariables.carry_in;
            } catch (Exception ignored) {
            }
        }
    }
}
