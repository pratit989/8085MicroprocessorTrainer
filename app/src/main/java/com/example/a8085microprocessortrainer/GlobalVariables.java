package com.example.a8085microprocessortrainer;

class GlobalVariables {
    // Memory
    static String[] memory_space = new String[64000];

    // Registers
    static String A = "CC", B = "FF", C = "2A", D = "00", E = "7B", F = "44", H = "00", L = "FB";
    static String M = H + L;
    static String S = "00", P = "00";

    // Flags
    static String B7_S = "00", B6_Z = "00", B5 = "00", B4_AC = "00", B3 = "00", B2_P = "00", B1 = "00", B0_CY = "00";

    // Starting Address of Program & Other Records
    static String starting_address = "";
    static String data = "";

    // Carry Variables
    static String carry_in, carry_out;

    // 1-Byte Arrays
    static int[] num1 = new int[8];
    static int[] num2 = new int[8];
    static int[] sum;
    static int Interrupt_Enable = 0;

    // Final Sum Variable
    static String final_sum = "";
}
