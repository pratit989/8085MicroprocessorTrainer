package com.example.a8085microprocessortrainer;

class HexadecimalSubtract {

    static void Compare(String num1, String num2)
    {
        String add_zero = "";
        String num1_Binary = ToBinary.to_binary_function(num1);
        String num2_Binary = ToBinary.to_binary_function(num2);
        int num1_Decimal = Integer.parseInt(num1_Binary,2);
        int num2_Decimal = Integer.parseInt(num2_Binary,2);
        if (num1_Decimal<num2_Decimal) {
            GlobalVariables.B0_CY = "01";
            GlobalVariables.B6_Z = "00";
        } else if (num1_Decimal==num2_Decimal) {
            GlobalVariables.B0_CY = "00";
            GlobalVariables.B6_Z = "01";
            add_zero = "0";
        } else {
            GlobalVariables.B0_CY = "00";
            GlobalVariables.B6_Z = "00";
        }
        int difference = num1_Decimal - num2_Decimal;
        if (difference < 0) {
            GlobalVariables.B7_S = "01";
            difference = difference*-1;
        } else {
            GlobalVariables.B7_S = "00";
        }
        int count = 0;
        for (int i = 0; i < ToBinary.to_binary_function(Integer.toHexString(difference)+add_zero).length(); i++) {
            if (ToBinary.to_binary_function(Integer.toHexString(difference)+add_zero).charAt(i) == '1') {
                count++;
            }
        }
        if (count % 2 == 0) {
            GlobalVariables.B2_P = "01";
        } else {
            GlobalVariables.B2_P = "00";
        }
        if (!GlobalVariables.B7_S.equals("00") || !GlobalVariables.B6_Z.equals("00") || !GlobalVariables.B4_AC.equals("00") || !GlobalVariables.B2_P.equals("00") || !GlobalVariables.B0_CY.equals("00")) {
            String string_F = Integer.toString(Integer.parseInt(GlobalVariables.B7_S)) + Integer.parseInt(GlobalVariables.B6_Z) + Integer.parseInt(GlobalVariables.B5) + Integer.parseInt(GlobalVariables.B4_AC) + Integer.parseInt(GlobalVariables.B3) + Integer.parseInt(GlobalVariables.B2_P) + Integer.parseInt(GlobalVariables.B1) + Integer.parseInt(GlobalVariables.B0_CY);
            GlobalVariables.F = Integer.toHexString(Integer.parseInt(string_F)).toUpperCase();
        } else {
            GlobalVariables.F = "00";
        }
    }

    static String Subtract(String num1)
    {
        String add_zero = "";
        String num1_Binary = ToBinary.to_binary_function(num1);
        String num2_Binary = ToBinary.to_binary_function("01");
        int num1_Decimal = Integer.parseInt(num1_Binary,2);
        int num2_Decimal = Integer.parseInt(num2_Binary,2);
        if (num1_Decimal==num2_Decimal) {
            GlobalVariables.B6_Z = "01";
            add_zero = "0";
        }
        int difference = num1_Decimal - num2_Decimal;
        if (difference < 0) {
            GlobalVariables.B7_S = "01";
            difference = difference*-1;
        } else {
            GlobalVariables.B7_S = "00";
        }
        int count = 0;
        for (int i = 0; i < ToBinary.to_binary_function(Integer.toHexString(difference)+add_zero).length(); i++) {
            if (ToBinary.to_binary_function(Integer.toHexString(difference)+add_zero).charAt(i) == '1') {
                count++;
            }
        }
        if (count % 2 == 0) {
            GlobalVariables.B2_P = "01";
        } else {
            GlobalVariables.B2_P = "00";
        }
        if (!GlobalVariables.B7_S.equals("00") || !GlobalVariables.B6_Z.equals("00") || !GlobalVariables.B4_AC.equals("00") || !GlobalVariables.B2_P.equals("00") || !GlobalVariables.B0_CY.equals("00")) {
            String string_F = Integer.toString(Integer.parseInt(GlobalVariables.B7_S)) + Integer.parseInt(GlobalVariables.B6_Z) + Integer.parseInt(GlobalVariables.B5) + Integer.parseInt(GlobalVariables.B4_AC) + Integer.parseInt(GlobalVariables.B3) + Integer.parseInt(GlobalVariables.B2_P) + Integer.parseInt(GlobalVariables.B1) + Integer.parseInt(GlobalVariables.B0_CY);
            GlobalVariables.F = Integer.toHexString(Integer.parseInt(string_F)).toUpperCase();
        } else {
            GlobalVariables.F = "00";
        }
        return Integer.toHexString(difference);
    }
    static void Decrement_16Bit(String a, String b)
    {
        String MSB = ToBinary.to_binary_function(a);
        String LSB = ToBinary.to_binary_function(b);
        if (Integer.parseInt(MSB+LSB,2) == 1) {
            GlobalVariables.B6_Z = "01";
        } else if (Integer.parseInt(MSB+LSB,2) < 1) {
            GlobalVariables.B7_S = "01";
        } else {
            GlobalVariables.B6_Z = "00";
            GlobalVariables.B7_S = "00";
        }
        int SUB_INT = Integer.parseInt(MSB+LSB,2) - 1;
        int count = 0;
        String SUB_STRING = "0000000000000000".substring(Integer.toBinaryString(SUB_INT).length()) + Integer.toBinaryString(SUB_INT);
        for (int i = 0; i < Integer.toBinaryString(SUB_INT).length(); i++) {
            if (Integer.toBinaryString(SUB_INT).charAt(i) == '1') {
                count++;
            }
        }
        if (count % 2 == 0) {
            GlobalVariables.B2_P = "01";
        } else {
            GlobalVariables.B2_P = "00";
        }
        if (!GlobalVariables.B7_S.equals("00") || !GlobalVariables.B6_Z.equals("00") || !GlobalVariables.B4_AC.equals("00") || !GlobalVariables.B2_P.equals("00") || !GlobalVariables.B0_CY.equals("00")) {
            String string_F = Integer.toString(Integer.parseInt(GlobalVariables.B7_S)) + Integer.parseInt(GlobalVariables.B6_Z) + Integer.parseInt(GlobalVariables.B5) + Integer.parseInt(GlobalVariables.B4_AC) + Integer.parseInt(GlobalVariables.B3) + Integer.parseInt(GlobalVariables.B2_P) + Integer.parseInt(GlobalVariables.B1) + Integer.parseInt(GlobalVariables.B0_CY);
            GlobalVariables.F = Integer.toHexString(Integer.parseInt(string_F)).toUpperCase();
        } else {
            GlobalVariables.F = "00";
        }
        SUB_STRING = "0000".substring(Integer.toHexString(Integer.parseInt(SUB_STRING,2)).length()) + Integer.toHexString(Integer.parseInt(SUB_STRING,2));
        a = SUB_STRING.substring(0,2).toUpperCase();
        b = SUB_STRING.substring(2).toUpperCase();
    }
}
