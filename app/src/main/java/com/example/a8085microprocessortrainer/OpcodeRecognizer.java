package com.example.a8085microprocessortrainer;

class OpcodeRecognizer {

    static String opcode_switch(String data, String address) {
        String last_executed = address;
        switch (data) {
            case "CE":
                // mnemo = "ACI";
                HexadecimalAdder.adder_function(GlobalVariables.memory_space[Integer.parseInt(address) + 1], GlobalVariables.A);
                HexadecimalAdder.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                String hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "8F":
                // mnemo = "ADC A";
                HexadecimalAdder.adder_function(GlobalVariables.A, GlobalVariables.A);
                HexadecimalAdder.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "88":
                // mnemo = "ADC B";
                HexadecimalAdder.adder_function(GlobalVariables.B, GlobalVariables.A);
                HexadecimalAdder.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "89":
                // mnemo = "ADC C";
                HexadecimalAdder.adder_function(GlobalVariables.C, GlobalVariables.A);
                HexadecimalAdder.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "8A":
                // mnemo = "ADC D";
                HexadecimalAdder.adder_function(GlobalVariables.D, GlobalVariables.A);
                HexadecimalAdder.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "8B":
                // mnemo = "ADC E";
                HexadecimalAdder.adder_function(GlobalVariables.E, GlobalVariables.A);
                HexadecimalAdder.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "8C":
                // mnemo = "ADC H";
                HexadecimalAdder.adder_function(GlobalVariables.H, GlobalVariables.A);
                HexadecimalAdder.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "8D":
                // mnemo = "ADC L";
                HexadecimalAdder.adder_function(GlobalVariables.L, GlobalVariables.A);
                HexadecimalAdder.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "8E":
                // mnemo = "ADC M";
                GlobalVariables.M = GlobalVariables.H + GlobalVariables.L;
                // Getting Data from M memory location
                String M_DATA = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.M)];
                // Adding and Storing final answer in Accumulator
                hex = HexadecimalAdder.adder_function(HexadecimalAdder.adder_function(M_DATA, GlobalVariables.A), GlobalVariables.B0_CY);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "87":
                // mnemo = "ADD A";
                hex = HexadecimalAdder.adder_function(GlobalVariables.A, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "80":
                // mnemo = "ADD B";
                hex = HexadecimalAdder.adder_function(GlobalVariables.B, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "81":
                // mnemo = "ADD C";
                hex = HexadecimalAdder.adder_function(GlobalVariables.C, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "82":
                // mnemo = "ADD D";
                hex = HexadecimalAdder.adder_function(GlobalVariables.D, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "83":
                // mnemo = "ADD E";
                hex = HexadecimalAdder.adder_function(GlobalVariables.E, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "84":
                // mnemo = "ADD H";
                hex = HexadecimalAdder.adder_function(GlobalVariables.H, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "85":
                // mnemo = "ADD L";
                hex = HexadecimalAdder.adder_function(GlobalVariables.L, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "86":
                // mnemo = "ADD M";
                GlobalVariables.M = GlobalVariables.H + GlobalVariables.L;
                // Getting Data from M memory location
                M_DATA = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.M)];
                // Adding and Storing final answer in Accumulator
                hex = HexadecimalAdder.adder_function(M_DATA, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "C6":
                // mnemo = "ADI";
                hex = HexadecimalAdder.adder_function(GlobalVariables.memory_space[Integer.parseInt(address) + 1], GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "A7":
                // ANA A
                hex = LogicalOperators.AND(GlobalVariables.A, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "A0":
                // ANA B
                hex = LogicalOperators.AND(GlobalVariables.B, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "A1":
                // ANA C
                hex = LogicalOperators.AND(GlobalVariables.C, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "A2":
                // ANA D
                hex = LogicalOperators.AND(GlobalVariables.D, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "A3":
                // ANA E
                hex = LogicalOperators.AND(GlobalVariables.E, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "A4":
                // ANA H
                hex = LogicalOperators.AND(GlobalVariables.H, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "A5":
                // ANA L
                hex = LogicalOperators.AND(GlobalVariables.L, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "A6":
                // ANA M
                GlobalVariables.M = GlobalVariables.H + GlobalVariables.L;
                // Getting Data from M memory location
                M_DATA = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.M)];
                // Adding and Storing final answer in Accumulator
                hex = LogicalOperators.AND(M_DATA, GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "E6":
                // ANI
                hex = LogicalOperators.AND(GlobalVariables.memory_space[Integer.parseInt(address) + 1], GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "CD":
                // CALL
                String stack = address;
                GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(address) + 2];
                GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(address) + 1];
                last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                return last_executed;
            case "DC":
                // CC
                if (GlobalVariables.B0_CY.equals("01")) {
                    stack = address;
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(address) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(address) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                    return last_executed;
                }
            case "FC":
                // CM
                if (GlobalVariables.B7_S.equals("01")) {
                    stack = address;
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(address) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(address) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                    return last_executed;
                }
            case "2F":
                // CMA
                hex = LogicalOperators.complement(GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "3F":
                // CMC
                hex = LogicalOperators.complement(GlobalVariables.B0_CY);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                return last_executed;
            case "BF":
                // CMP A
                HexadecimalSubtract.Compare(GlobalVariables.A, GlobalVariables.A);
                return last_executed;
            case "B8":
                // CMP B
                HexadecimalSubtract.Compare(GlobalVariables.A, GlobalVariables.B);
                return last_executed;
            case "B9":
                // CMP C
                HexadecimalSubtract.Compare(GlobalVariables.A, GlobalVariables.C);
                return last_executed;
            case "BA":
                // CMP D
                HexadecimalSubtract.Compare(GlobalVariables.A, GlobalVariables.D);
                return last_executed;
            case "BB":
                // CMP E
                HexadecimalSubtract.Compare(GlobalVariables.A, GlobalVariables.E);
                return last_executed;
            case "BC":
                // CMP H
                HexadecimalSubtract.Compare(GlobalVariables.A, GlobalVariables.H);
                return last_executed;
            case "BD":
                // CMP L
                HexadecimalSubtract.Compare(GlobalVariables.A, GlobalVariables.L);
                return last_executed;
            case "BE":
                // CMP M
                GlobalVariables.M = GlobalVariables.H + GlobalVariables.L;
                // Getting Data from M memory location
                M_DATA = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.M)];
                HexadecimalSubtract.Compare(GlobalVariables.A, M_DATA);
                return last_executed;
            case "D4":
                // CNC
                if (!GlobalVariables.B0_CY.equals("01")) {
                    stack = address;
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(address) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(address) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                    return last_executed;
                }
            case "C4":
                // CNZ
                if (!GlobalVariables.B6_Z.equals("01")) {
                    stack = address;
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(address) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(address) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                    return last_executed;
                }
            case "F4":
                // CP
                if (!GlobalVariables.B7_S.equals("01")) {
                    stack = address;
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(address) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(address) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                    return last_executed;
                }
            case "EC":
                // CPE
                if (GlobalVariables.B2_P.equals("01")) {
                    stack = address;
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(address) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(address) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                    return last_executed;
                }
            case "FE":
                // CPI
                HexadecimalSubtract.Compare(GlobalVariables.A, GlobalVariables.memory_space[Integer.parseInt(address) + 1]);
                last_executed = Integer.toString(Integer.parseInt(address) + 1);
                return last_executed;
            case "E4":
                // CPO
                if (!GlobalVariables.B2_P.equals("01")) {
                    stack = address;
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(address) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(address) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                    return last_executed;
                }
            case "CZ":
                // CZ
                if (GlobalVariables.B6_Z.equals("01")) {
                    stack = address;
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(address) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(address) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                    return last_executed;
                }
            case "27":
                // DAA
                int Least_Significant_Nibble_Decimal = Integer.parseInt(ToBinary.to_binary_function(GlobalVariables.A).substring(4), 2);
                int Most_Significantly_Nibble_Decimal = Integer.parseInt(ToBinary.to_binary_function(GlobalVariables.A).substring(0, 4), 2);
                if (Most_Significantly_Nibble_Decimal > 9 || GlobalVariables.B0_CY.equals("01")) {
                    Most_Significantly_Nibble_Decimal = Most_Significantly_Nibble_Decimal + 6;
                    GlobalVariables.B0_CY = "01";
                }
                if (Least_Significant_Nibble_Decimal > 9 || Integer.parseInt(GlobalVariables.B4_AC) == 1) {
                    Least_Significant_Nibble_Decimal = Least_Significant_Nibble_Decimal + 6;
                    if (Least_Significant_Nibble_Decimal > 15) {
                        Least_Significant_Nibble_Decimal = Least_Significant_Nibble_Decimal - 16;
                        Most_Significantly_Nibble_Decimal = Most_Significantly_Nibble_Decimal + 1;
                        if (Most_Significantly_Nibble_Decimal > 15) {
                            Most_Significantly_Nibble_Decimal = Most_Significantly_Nibble_Decimal - 16;
                            GlobalVariables.B0_CY = "01";
                        }
                    }
                }
                GlobalVariables.A = Integer.toHexString(Most_Significantly_Nibble_Decimal) + Integer.toHexString(Least_Significant_Nibble_Decimal);
                return last_executed;
            case "09":
                // DAD B
                String MSB = ToBinary.to_binary_function(GlobalVariables.B);
                String LSB = ToBinary.to_binary_function(GlobalVariables.C);
                String MSB_H = ToBinary.to_binary_function(GlobalVariables.H);
                String LSB_L = ToBinary.to_binary_function(GlobalVariables.L);
                int SUM_INT = Integer.parseInt(MSB_H + LSB_L, 2) + Integer.parseInt(MSB + LSB, 2);
                if (SUM_INT > 65535) {
                    SUM_INT = SUM_INT - 65536;
                    GlobalVariables.B0_CY = "01";
                } else {
                    GlobalVariables.B0_CY = "00";
                }
                String SUM_STRING = "0000".substring(Integer.toHexString(SUM_INT).length()) + Integer.toHexString(SUM_INT);
                GlobalVariables.H = SUM_STRING.substring(0, 2);
                GlobalVariables.L = SUM_STRING.substring(2);
                return last_executed;
            case "19":
                // DAD D
                MSB = ToBinary.to_binary_function(GlobalVariables.D);
                LSB = ToBinary.to_binary_function(GlobalVariables.E);
                MSB_H = ToBinary.to_binary_function(GlobalVariables.H);
                LSB_L = ToBinary.to_binary_function(GlobalVariables.L);
                SUM_INT = Integer.parseInt(MSB_H + LSB_L, 2) + Integer.parseInt(MSB + LSB, 2);
                if (SUM_INT > 65535) {
                    SUM_INT = SUM_INT - 65536;
                    GlobalVariables.B0_CY = "01";
                } else {
                    GlobalVariables.B0_CY = "00";
                }
                SUM_STRING = "0000".substring(Integer.toHexString(SUM_INT).length()) + Integer.toHexString(SUM_INT);
                GlobalVariables.H = SUM_STRING.substring(0, 2);
                GlobalVariables.L = SUM_STRING.substring(2);
                return last_executed;
            case "29":
                // DAD H
                MSB = ToBinary.to_binary_function(GlobalVariables.H);
                LSB = ToBinary.to_binary_function(GlobalVariables.L);
                MSB_H = ToBinary.to_binary_function(GlobalVariables.H);
                LSB_L = ToBinary.to_binary_function(GlobalVariables.L);
                SUM_INT = Integer.parseInt(MSB_H + LSB_L, 2) + Integer.parseInt(MSB + LSB, 2);
                if (SUM_INT > 65535) {
                    SUM_INT = SUM_INT - 65536;
                    GlobalVariables.B0_CY = "01";
                } else {
                    GlobalVariables.B0_CY = "00";
                }
                SUM_STRING = "0000".substring(Integer.toHexString(SUM_INT).length()) + Integer.toHexString(SUM_INT);
                GlobalVariables.H = SUM_STRING.substring(0, 2);
                GlobalVariables.L = SUM_STRING.substring(2);
                return last_executed;
            case "39":
                // DAD SP
                MSB = ToBinary.to_binary_function(GlobalVariables.S);
                LSB = ToBinary.to_binary_function(GlobalVariables.P);
                MSB_H = ToBinary.to_binary_function(GlobalVariables.H);
                LSB_L = ToBinary.to_binary_function(GlobalVariables.L);
                SUM_INT = Integer.parseInt(MSB_H + LSB_L, 2) + Integer.parseInt(MSB + LSB, 2);
                if (SUM_INT > 65535) {
                    SUM_INT = SUM_INT - 65536;
                    GlobalVariables.B0_CY = "01";
                } else {
                    GlobalVariables.B0_CY = "00";
                }
                SUM_STRING = "0000".substring(Integer.toHexString(SUM_INT).length()) + Integer.toHexString(SUM_INT);
                GlobalVariables.H = SUM_STRING.substring(0, 2);
                GlobalVariables.L = SUM_STRING.substring(2);
                return last_executed;
            case "3D":
                // DCR A
                hex = HexadecimalSubtract.Subtract(GlobalVariables.A, "01").toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.A = hex;
                return last_executed;
            case "05":
                // DCR B
                hex = HexadecimalSubtract.Subtract(GlobalVariables.B, "01").toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.B = hex;
                return last_executed;
            case "0D":
                // DCR C
                hex = HexadecimalSubtract.Subtract(GlobalVariables.C, "01").toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.C = hex;
                return last_executed;
            case "15":
                // DCR D
                hex = HexadecimalSubtract.Subtract(GlobalVariables.D, "01").toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.D = hex;
                return last_executed;
            case "1D":
                // DCR E
                hex = HexadecimalSubtract.Subtract(GlobalVariables.E, "01").toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.E = hex;
                return last_executed;
            case "25":
                // DCR H
                hex = HexadecimalSubtract.Subtract(GlobalVariables.H, "01").toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.H = hex;
                return last_executed;
            case "2D":
                // DCR L
                hex = HexadecimalSubtract.Subtract(GlobalVariables.L, "01").toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.L = hex;
                return last_executed;
            case "35":
                // DCR M
                GlobalVariables.M = GlobalVariables.H + GlobalVariables.L;
                // Getting Data from M memory location
                M_DATA = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.M)];
                hex = HexadecimalSubtract.Subtract(M_DATA, "01").toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.M)] = hex;
                return last_executed;
            case "0B":
                // DCX B
                HexadecimalSubtract.Decrement_16Bit(GlobalVariables.B, GlobalVariables.C);
                return last_executed;
            case "1B":
                // DCX D
                HexadecimalSubtract.Decrement_16Bit(GlobalVariables.D, GlobalVariables.E);
                return last_executed;
            case "2B":
                // DCX H
                HexadecimalSubtract.Decrement_16Bit(GlobalVariables.H, GlobalVariables.L);
                return last_executed;
            case "3B":
                // DCX SP
                HexadecimalSubtract.Decrement_16Bit(GlobalVariables.S, GlobalVariables.P);
                return last_executed;
            default:
                return last_executed;
        }
    }
}
