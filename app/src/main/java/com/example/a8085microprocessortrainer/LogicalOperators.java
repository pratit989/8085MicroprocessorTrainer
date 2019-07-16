package com.example.a8085microprocessortrainer;

class LogicalOperators {

    static String complement(String data)
    {
        String binary_string = "";
        ToBinary.bit_separator.bit_separator_starter(ToBinary.to_binary_function(data), "");
        StringBuilder binary_buffer = new StringBuilder(binary_string);
        for (int i = 0; i < GlobalVariables.num1.length ; i++)
        {
            if (GlobalVariables.num1[i] == 1) {
                binary_buffer.append(0);
            } else if (GlobalVariables.num1[i] == 0) {
                binary_buffer.append(1);
            }
        }
        return Integer.toHexString(Integer.parseInt(binary_buffer.toString(), 2)).toUpperCase();
    }

    static String AND(String data1, String data2)
    {
        String binary_string = "";
        ToBinary.bit_separator.bit_separator_starter(ToBinary.to_binary_function(data1), ToBinary.to_binary_function(data2));
        StringBuilder binary_buffer = new StringBuilder(binary_string);
        for (int i = 0; i < 8; i++)
        {
            if (GlobalVariables.num1[i] == 1 && GlobalVariables.num2[i] == 1) {
                binary_buffer.append(1);
            } else {
                binary_buffer.append(0);
            }
        }
        // Parity Check
        int count = 0;
        for (int i = 0; i < binary_buffer.length(); i++) {
            if (binary_buffer.charAt(i) == '1') {
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
        if (Integer.parseInt(binary_buffer.toString(), 2) != 0) {
            GlobalVariables.B6_Z = "01";
        } else {
            GlobalVariables.B6_Z = "00";
        }

        // Setting Sign Flag
        if (Integer.parseInt(ToBinary.to_binary_function(data1).substring(ToBinary.to_binary_function(data1).length()-1)) == 1) {
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
        return Integer.toHexString(Integer.parseInt(binary_buffer.toString(), 2)).toUpperCase();
    }
}
