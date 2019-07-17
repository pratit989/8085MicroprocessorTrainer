package com.example.a8085microprocessortrainer;

class OpcodeRecognizer {

    static String opcode_switch(String data, String ProgramCounter) {
        String last_executed = ProgramCounter;
        switch (data) {
            case "CE":
                // mnemo = "ACI";
                HexadecimalAdd.adder_function(GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1], GlobalVariables.A);
                HexadecimalAdd.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                String hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "8F":
                // mnemo = "ADC A";
                HexadecimalAdd.adder_function(GlobalVariables.A, GlobalVariables.A);
                HexadecimalAdd.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "88":
                // mnemo = "ADC B";
                HexadecimalAdd.adder_function(GlobalVariables.B, GlobalVariables.A);
                HexadecimalAdd.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "89":
                // mnemo = "ADC C";
                HexadecimalAdd.adder_function(GlobalVariables.C, GlobalVariables.A);
                HexadecimalAdd.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "8A":
                // mnemo = "ADC D";
                HexadecimalAdd.adder_function(GlobalVariables.D, GlobalVariables.A);
                HexadecimalAdd.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "8B":
                // mnemo = "ADC E";
                HexadecimalAdd.adder_function(GlobalVariables.E, GlobalVariables.A);
                HexadecimalAdd.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "8C":
                // mnemo = "ADC H";
                HexadecimalAdd.adder_function(GlobalVariables.H, GlobalVariables.A);
                HexadecimalAdd.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "8D":
                // mnemo = "ADC L";
                HexadecimalAdd.adder_function(GlobalVariables.L, GlobalVariables.A);
                HexadecimalAdd.adder_function(GlobalVariables.final_sum, GlobalVariables.B0_CY);
                hex = GlobalVariables.final_sum;
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "8E":
                // mnemo = "ADC M";
                GlobalVariables.M = GlobalVariables.H + GlobalVariables.L;
                // Getting Data from M memory location
                String M_DATA = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.M)];
                // Adding and Storing final answer in Accumulator
                hex = HexadecimalAdd.adder_function(HexadecimalAdd.adder_function(M_DATA, GlobalVariables.A), GlobalVariables.B0_CY);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "87":
                // mnemo = "ADD A";
                hex = HexadecimalAdd.adder_function(GlobalVariables.A, GlobalVariables.A);
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
                hex = HexadecimalAdd.adder_function(GlobalVariables.B, GlobalVariables.A);
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
                hex = HexadecimalAdd.adder_function(GlobalVariables.C, GlobalVariables.A);
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
                hex = HexadecimalAdd.adder_function(GlobalVariables.D, GlobalVariables.A);
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
                hex = HexadecimalAdd.adder_function(GlobalVariables.E, GlobalVariables.A);
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
                hex = HexadecimalAdd.adder_function(GlobalVariables.H, GlobalVariables.A);
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
                hex = HexadecimalAdd.adder_function(GlobalVariables.L, GlobalVariables.A);
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
                hex = HexadecimalAdd.adder_function(M_DATA, GlobalVariables.A);
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
                hex = HexadecimalAdd.adder_function(GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1], GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
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
                hex = LogicalOperators.AND(GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1], GlobalVariables.A);
                if (!hex.substring(0, 2).equals("00") && hex.length() == 4) {
                    GlobalVariables.A = hex.substring(0, 2);
                    GlobalVariables.B = hex.substring(2);
                } else if (hex.substring(0, 2).equals("00")) {
                    GlobalVariables.A = hex.substring(2);
                } else {
                    GlobalVariables.A = hex;
                }
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "CD":
                // CALL
                GlobalVariables.S = ProgramCounter.substring(0, 2);
                GlobalVariables.P = ProgramCounter.substring(2);
                GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                return last_executed;
            case "DC":
                // CC
                if (GlobalVariables.B0_CY.equals("01")) {
                    GlobalVariables.S = ProgramCounter.substring(0, 2);
                    GlobalVariables.P = ProgramCounter.substring(2);
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "FC":
                // CM
                if (GlobalVariables.B7_S.equals("01")) {
                    GlobalVariables.S = ProgramCounter.substring(0, 2);
                    GlobalVariables.P = ProgramCounter.substring(2);
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
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
                    GlobalVariables.S = ProgramCounter.substring(0, 2);
                    GlobalVariables.P = ProgramCounter.substring(2);
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "C4":
                // CNZ
                if (!GlobalVariables.B6_Z.equals("01")) {
                    GlobalVariables.S = ProgramCounter.substring(0, 2);
                    GlobalVariables.P = ProgramCounter.substring(2);
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "F4":
                // CP
                if (!GlobalVariables.B7_S.equals("01")) {
                    GlobalVariables.S = ProgramCounter.substring(0, 2);
                    GlobalVariables.P = ProgramCounter.substring(2);
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "EC":
                // CPE
                if (GlobalVariables.B2_P.equals("01")) {
                    GlobalVariables.S = ProgramCounter.substring(0, 2);
                    GlobalVariables.P = ProgramCounter.substring(2);
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "FE":
                // CPI
                HexadecimalSubtract.Compare(GlobalVariables.A, GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1]);
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "E4":
                // CPO
                if (!GlobalVariables.B2_P.equals("01")) {
                    GlobalVariables.S = ProgramCounter.substring(0, 2);
                    GlobalVariables.P = ProgramCounter.substring(2);
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "CZ":
                // CZ
                if (GlobalVariables.B6_Z.equals("01")) {
                    GlobalVariables.S = ProgramCounter.substring(0, 2);
                    GlobalVariables.P = ProgramCounter.substring(2);
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
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
                hex = HexadecimalSubtract.Subtract(GlobalVariables.A).toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.A = hex;
                return last_executed;
            case "05":
                // DCR B
                hex = HexadecimalSubtract.Subtract(GlobalVariables.B).toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.B = hex;
                return last_executed;
            case "0D":
                // DCR C
                hex = HexadecimalSubtract.Subtract(GlobalVariables.C).toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.C = hex;
                return last_executed;
            case "15":
                // DCR D
                hex = HexadecimalSubtract.Subtract(GlobalVariables.D).toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.D = hex;
                return last_executed;
            case "1D":
                // DCR E
                hex = HexadecimalSubtract.Subtract(GlobalVariables.E).toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.E = hex;
                return last_executed;
            case "25":
                // DCR H
                hex = HexadecimalSubtract.Subtract(GlobalVariables.H).toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.H = hex;
                return last_executed;
            case "2D":
                // DCR L
                hex = HexadecimalSubtract.Subtract(GlobalVariables.L).toUpperCase();
                hex = "00".substring(hex.length()) + hex;
                GlobalVariables.L = hex;
                return last_executed;
            case "35":
                // DCR M
                GlobalVariables.M = GlobalVariables.H + GlobalVariables.L;
                // Getting Data from M memory location
                M_DATA = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.M)];
                hex = HexadecimalSubtract.Subtract(M_DATA).toUpperCase();
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
            case "F3":
                // DI
                GlobalVariables.Interrupt_Enable = 0;
                return last_executed;
            case "FB":
                // EI
                GlobalVariables.Interrupt_Enable = 1;
                return last_executed;
            case "76":
                // HLT
                MainActivity.current = "HLT";
                return last_executed;
            case "DB":
                // IN
                return last_executed;
            case "3C":
                // INR A
                GlobalVariables.A = HexadecimalAdd.adder_function(GlobalVariables.A, "01");
                return last_executed;
            case "04":
                // INR B
                GlobalVariables.B = HexadecimalAdd.adder_function(GlobalVariables.B, "01");
                return last_executed;
            case "0C":
                // INR C
                GlobalVariables.C = HexadecimalAdd.adder_function(GlobalVariables.C, "01");
                return last_executed;
            case "14":
                // INR D
                GlobalVariables.D = HexadecimalAdd.adder_function(GlobalVariables.D, "01");
                return last_executed;
            case "1C":
                // INR E
                GlobalVariables.E = HexadecimalAdd.adder_function(GlobalVariables.E, "01");
                return last_executed;
            case "24":
                // INR H
                GlobalVariables.H = HexadecimalAdd.adder_function(GlobalVariables.H, "01");
                return last_executed;
            case "2C":
                // INR L
                GlobalVariables.L = HexadecimalAdd.adder_function(GlobalVariables.L, "01");
                return last_executed;
            case "34":
                // INR M
                GlobalVariables.M = GlobalVariables.H + GlobalVariables.L;
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.M)] = HexadecimalAdd.adder_function(GlobalVariables.M, "01");
                return last_executed;
            case "03":
                // INX B
                MSB = ToBinary.to_binary_function(GlobalVariables.B);
                LSB = ToBinary.to_binary_function(GlobalVariables.C);
                String INR_INT = Integer.toHexString(Integer.parseInt(MSB + LSB, 2) + 1);
                SUM_STRING = "0000".substring(INR_INT.length()) + INR_INT;
                GlobalVariables.H = SUM_STRING.substring(0, 2).toUpperCase();
                GlobalVariables.L = SUM_STRING.substring(2).toUpperCase();
                return last_executed;
            case "13":
                // INX D
                MSB = ToBinary.to_binary_function(GlobalVariables.D);
                LSB = ToBinary.to_binary_function(GlobalVariables.E);
                INR_INT = Integer.toHexString(Integer.parseInt(MSB + LSB, 2) + 1);
                SUM_STRING = "0000".substring(INR_INT.length()) + INR_INT;
                GlobalVariables.H = SUM_STRING.substring(0, 2).toUpperCase();
                GlobalVariables.L = SUM_STRING.substring(2).toUpperCase();
                return last_executed;
            case "23":
                // INX H
                MSB = ToBinary.to_binary_function(GlobalVariables.B);
                LSB = ToBinary.to_binary_function(GlobalVariables.C);
                INR_INT = Integer.toHexString(Integer.parseInt(MSB + LSB, 2) + 1);
                SUM_STRING = "0000".substring(INR_INT.length()) + INR_INT;
                GlobalVariables.H = SUM_STRING.substring(0, 2).toUpperCase();
                GlobalVariables.L = SUM_STRING.substring(2).toUpperCase();
                return last_executed;
            case "33":
                // INX SP
                MSB = ToBinary.to_binary_function(GlobalVariables.S);
                LSB = ToBinary.to_binary_function(GlobalVariables.P);
                INR_INT = Integer.toHexString(Integer.parseInt(MSB + LSB, 2) + 1);
                SUM_STRING = "0000".substring(INR_INT.length()) + INR_INT;
                GlobalVariables.H = SUM_STRING.substring(0, 2).toUpperCase();
                GlobalVariables.L = SUM_STRING.substring(2).toUpperCase();
                return last_executed;
            case "DA":
                // JC
                if (GlobalVariables.B0_CY.equals("01")) {
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "FA":
                // JM
                if (GlobalVariables.B7_S.equals("01")) {
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "C3":
                // JMP
                GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                return last_executed;
            case "D2":
                // JNC
                if (GlobalVariables.B0_CY.equals("00")) {
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "C2":
                // JNZ
                if (GlobalVariables.B6_Z.equals("00")) {
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "F2":
                // JP
                if (GlobalVariables.B7_S.equals("00")) {
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "EA":
                // JPE
                if (GlobalVariables.B2_P.equals("01")) {
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "E2":
                // JPO
                if (GlobalVariables.B2_P.equals("00")) {
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "CA":
                // JZ
                if (GlobalVariables.B6_Z.equals("01")) {
                    GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                    GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                    last_executed = Integer.toString(Integer.parseInt(GlobalVariables.H + GlobalVariables.L) - 1);
                }
                return last_executed;
            case "3A":
                // LDA
                GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                GlobalVariables.A = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 2);
                return last_executed;
            case "0A":
                // LDAX B
                GlobalVariables.A = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.B + GlobalVariables.C)];
                return last_executed;
            case "1A":
                // LDAX D
                GlobalVariables.A = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.D + GlobalVariables.E)];
                return last_executed;
            case "2A":
                // LHLD
                GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L) + 1];
                GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 2);
                return last_executed;
            case "01":
                // LXI B
                GlobalVariables.B = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                GlobalVariables.C = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 2);
                return last_executed;
            case "11":
                // LXI D
                GlobalVariables.D = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                GlobalVariables.E = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 2);
                return last_executed;
            case "21":
                // LXI H
                GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 2);
                return last_executed;
            case "31":
                // LXI SP
                GlobalVariables.S = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2];
                GlobalVariables.P = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 2);
                return last_executed;
            case "7F":
                // MOV A,A
                return last_executed;
            case "78":
                // MOV A,B
                GlobalVariables.A = GlobalVariables.B;
                return last_executed;
            case "79":
                // MOV A, C
                GlobalVariables.A = GlobalVariables.C;
                return last_executed;
            case "7A":
                // MOV A, D
                GlobalVariables.A = GlobalVariables.D;
                return last_executed;
            case "7B":
                // MOV A, E
                GlobalVariables.A = GlobalVariables.E;
                return last_executed;
            case "7C":
                // MOV A, H
                GlobalVariables.A = GlobalVariables.H;
                return last_executed;
            case "7D":
                // MOV A, L
                GlobalVariables.A = GlobalVariables.L;
                return last_executed;
            case "7E":
                // MOV A, M
                GlobalVariables.A = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)];
                return last_executed;
            case "47":
                // MOV B, A
                GlobalVariables.B = GlobalVariables.A;
                return last_executed;
            case "40":
                // MOV B, B
                return last_executed;
            case "41":
                // MOV B, C
                GlobalVariables.B = GlobalVariables.C;
                return last_executed;
            case "42":
                // MOV B, D
                GlobalVariables.B = GlobalVariables.D;
                return last_executed;
            case "43":
                // MOV B, E
                GlobalVariables.B = GlobalVariables.E;
                return last_executed;
            case "44":
                // MOV B, H
                GlobalVariables.B = GlobalVariables.H;
                return last_executed;
            case "45":
                // MOV B, L
                GlobalVariables.B = GlobalVariables.L;
                return last_executed;
            case "46":
                // MOV B, M
                GlobalVariables.B = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)];
                return last_executed;
            case "4F":
                // MOV C, A
                GlobalVariables.C = GlobalVariables.A;
                return last_executed;
            case "48":
                // MOV C, B
                GlobalVariables.C = GlobalVariables.B;
                return last_executed;
            case "49":
                // MOV C, C
                return last_executed;
            case "4A":
                // MOV C, D
                GlobalVariables.C = GlobalVariables.D;
                return last_executed;
            case "4B":
                // MOV C, E
                GlobalVariables.C = GlobalVariables.E;
                return last_executed;
            case "4C":
                // MOV C, H
                GlobalVariables.C = GlobalVariables.H;
                return last_executed;
            case "4D":
                // MOV C, L
                GlobalVariables.C = GlobalVariables.L;
                return last_executed;
            case "4E":
                // MOV C, M
                GlobalVariables.C = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)];
                return last_executed;
            case "57":
                // MOV D, A
                GlobalVariables.D = GlobalVariables.A;
                return last_executed;
            case "50":
                // MOV D, B
                GlobalVariables.D = GlobalVariables.B;
                return last_executed;
            case "51":
                // MOV D, C
                GlobalVariables.D = GlobalVariables.C;
                return last_executed;
            case "52":
                //MOV D, D
                return last_executed;
            case "53":
                // MOV D, E
                GlobalVariables.D = GlobalVariables.E;
                return last_executed;
            case "54":
                // MOV D, H
                GlobalVariables.D = GlobalVariables.H;
                return last_executed;
            case "55":
                // MOV D, L
                GlobalVariables.D = GlobalVariables.L;
                return last_executed;
            case "56":
                // MOV D, M
                GlobalVariables.D = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)];
                return last_executed;
            case "5F":
                // MOV E, A
                GlobalVariables.E = GlobalVariables.A;
                return last_executed;
            case "58":
                // MOV E, B
                GlobalVariables.E = GlobalVariables.B;
                return last_executed;
            case "59":
                // MOV E, C
                GlobalVariables.E = GlobalVariables.C;
                return last_executed;
            case "5A":
                // MOV E, D
                GlobalVariables.E = GlobalVariables.D;
                return last_executed;
            case "5B":
                // MOV E, E
                return last_executed;
            case "5C":
                // MOV E, H
                GlobalVariables.E = GlobalVariables.H;
                return last_executed;
            case "5D":
                // MOV E, L
                GlobalVariables.E = GlobalVariables.L;
                return last_executed;
            case "5E":
                // MOV E, M
                GlobalVariables.E = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)];
                return last_executed;
            case "67":
                // MOV H, A
                GlobalVariables.H = GlobalVariables.A;
                return last_executed;
            case "60":
                // MOV H, B
                GlobalVariables.H = GlobalVariables.B;
                return last_executed;
            case "61":
                // MOV H, C
                GlobalVariables.H = GlobalVariables.C;
                return last_executed;
            case "62":
                // MOV H, D
                GlobalVariables.H = GlobalVariables.D;
                return last_executed;
            case "63":
                // MOV H, E
                GlobalVariables.H = GlobalVariables.E;
                return last_executed;
            case "64":
                // MOV H, H
                return last_executed;
            case "65":
                // MOV H, L
                GlobalVariables.H = GlobalVariables.L;
                return last_executed;
            case "66":
                // MOV H, M
                GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)];
                return last_executed;
            case "6F":
                // MOV L, A
                GlobalVariables.L = GlobalVariables.A;
                return last_executed;
            case "68":
                // MOV L, B
                GlobalVariables.L = GlobalVariables.B;
                return last_executed;
            case "69":
                // MOV L, C
                GlobalVariables.L = GlobalVariables.C;
                return last_executed;
            case "6A":
                // MOV L, D
                GlobalVariables.L = GlobalVariables.D;
                return last_executed;
            case "6B":
                // MOV L, E
                GlobalVariables.L = GlobalVariables.E;
                return last_executed;
            case "6C":
                // MOV L, H
                GlobalVariables.L = GlobalVariables.H;
                return last_executed;
            case "6D":
                // MOV L, L
                return last_executed;
            case "6E":
                // MOV L, M
                GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)];
                return last_executed;
            case "77":
                // MOV M, A
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)] = GlobalVariables.A;
                return last_executed;
            case "70":
                // MOV M, B
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)] = GlobalVariables.B;
                return last_executed;
            case "71":
                // MOV M, C
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)] = GlobalVariables.C;
                return last_executed;
            case "72":
                // MOV M, D
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)] = GlobalVariables.C;
                return last_executed;
            case "73":
                // MOV M, E
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)] = GlobalVariables.E;
                return last_executed;
            case "74":
                // MOV M, H
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)] = GlobalVariables.H;
                return last_executed;
            case "75":
                // MOV M, L
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)] = GlobalVariables.L;
                return last_executed;
            case "3E":
                // MVI A
                GlobalVariables.A = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "06":
                // MVI B
                GlobalVariables.B = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "0E":
                // MVI C
                GlobalVariables.C = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "16":
                // MVI D
                GlobalVariables.D = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "1E":
                // MVI E
                GlobalVariables.E = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "26":
                // MVI H
                GlobalVariables.H = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "2E":
                // MVI L
                GlobalVariables.L = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "36":
                // MVI M
                GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.H + GlobalVariables.L)] = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                last_executed = Integer.toString(Integer.parseInt(ProgramCounter) + 1);
                return last_executed;
            case "32":
                // STA
                String address = GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 2] + GlobalVariables.memory_space[Integer.parseInt(ProgramCounter) + 1];
                GlobalVariables.memory_space[Integer.parseInt(address)] = GlobalVariables.A;
                return last_executed;
            default:
                return last_executed;
        }
    }
}
