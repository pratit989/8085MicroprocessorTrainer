package com.example.a8085microprocessortrainer;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

// import android.app.Activity;

public class MainActivity extends AppCompatActivity {

    static String current = "";
    int counter = 0, startup = 0, memory = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (startup == 0) {
            Arrays.fill(GlobalVariables.memory_space, "00");
            startup = 1;
            setContentView(R.layout.activity_main);
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            view1.setText(R.string.default_keyword1);
            view2.setText(R.string.default_keyword2);
            GlobalVariables.A = "CC";
            GlobalVariables.B = "FF";
            GlobalVariables.C = "2A";
            GlobalVariables.D = "00";
            GlobalVariables.E = "7B";
            GlobalVariables.F = "44";
            GlobalVariables.H = "00";
            GlobalVariables.L = "FB";
            GlobalVariables.memory_space[8192] = "21";
            GlobalVariables.memory_space[8193] = "14";
            GlobalVariables.memory_space[8194] = "20";
            GlobalVariables.memory_space[8195] = "46";
            GlobalVariables.memory_space[8196] = "23";
            GlobalVariables.memory_space[8197] = "97";
            GlobalVariables.memory_space[8198] = "86";
            GlobalVariables.memory_space[8199] = "05";
            GlobalVariables.memory_space[8200] = "C2";
            GlobalVariables.memory_space[8201] = "06";
            GlobalVariables.memory_space[8202] = "20";
            GlobalVariables.memory_space[8203] = "32";
            GlobalVariables.memory_space[8204] = "20";
            GlobalVariables.memory_space[8205] = "20";
            GlobalVariables.memory_space[8206] = "EF";
            GlobalVariables.memory_space[8212] = "04";
            GlobalVariables.memory_space[8213] = "05";
        }
    }

    public void reset(View view) {
        TextView view1 = findViewById(R.id.textView);
        TextView view2 = findViewById(R.id.textView2);
        view1.setText(R.string.default_keyword1);
        view2.setText(R.string.default_keyword2);
        current = "";
    }

    public void shift(View view) {
        if (!current.equals("HLT")) {
            current = "SHIFT";
        }
    }

    public void exreg_si(View view) {
        if (!current.equals("HLT")) {
            if (current.equals("SHIFT")) {
                TextView view1 = findViewById(R.id.textView);
                TextView view2 = findViewById(R.id.textView2);
                view1.setText(".");
                view2.setText("");
                current = "EXREG";
            }
        }
    }

    public void a(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXREG":
                    view1.setText("A");
                    view2.setText(GlobalVariables.A);
                    current = "a";
                    break;
                case "EXMEM":
                    if (view1.getText().toString().equals(".")) {
                        view1.setText("A");
                    } else {
                        view1.append("A");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("A");
                    } else {
                        view2.append("A");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
            }
        }
    }

    public void b(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXREG":
                    view1.setText("B");
                    view2.setText(GlobalVariables.B);
                    current = "b";
                    break;
                case "EXMEM":
                    if (view1.getText().toString().equals(".")) {
                        view1.setText("B");
                    } else {
                        view1.append("B");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("B");
                    } else {
                        view2.append("B");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
            }
        }
    }

    public void c(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXREG":
                    view1.setText("C");
                    view2.setText(GlobalVariables.C);
                    current = "c";
                    break;
                case "EXMEM":
                    if (view1.getText().toString().equals(".")) {
                        view1.setText("C");
                    } else {
                        view1.append("C");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("C");
                    } else {
                        view2.append("C");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
            }
        }
    }

    public void d(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXREG":
                    view1.setText("D");
                    view2.setText(GlobalVariables.D);
                    current = "d";
                    break;
                case "EXMEM":
                    if (view1.getText().toString().equals(".")) {
                        view1.setText("D");
                    } else {
                        view1.append("D");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("D");
                    } else {
                        view2.append("D");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
            }
        }
    }

    public void e(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXREG":
                    view1.setText("E");
                    view2.setText(GlobalVariables.E);
                    current = "e";
                    break;
                case "EXMEM":
                    if (view1.getText().toString().equals(".")) {
                        view1.setText("E");
                    } else {
                        view1.append("E");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("E");
                    } else {
                        view2.append("E");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
            }
        }
    }

    public void f(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXREG":
                    view1.setText("F");
                    view2.setText(GlobalVariables.F);
                    current = "f";
                    break;
                case "EXMEM":
                    if (view1.getText().toString().equals(".")) {
                        view1.setText("F");
                    } else {
                        view1.append("F");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("F");
                    } else {
                        view2.append("F");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
            }
        }
    }

    public void h(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXREG":
                    view1.setText("H");
                    view2.setText(GlobalVariables.H);
                    current = "h";
                    break;
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("8");
                    } else {
                        view1.append("8");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("8");
                    } else {
                        view2.append("8");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("8");
                    } else if (view1.getText().length() < 4) {
                        view1.append("8");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
            }
        }
    }

    public void l(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXREG":
                    view1.setText("L");
                    view2.setText(GlobalVariables.L);
                    current = "l";
                    counter = 0;
                    break;
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("9");
                    } else {
                        view1.append("9");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("9");
                    } else {
                        view2.append("9");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("9");
                    } else if (view1.getText().length() < 4) {
                        view1.append("9");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
            }
        }
    }

    public void next(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            if (view1.getText().length() == 4 && current.equals("EXMEM")) {
                current = "EXMEM NEXT";
                try {
                    String memory_address_input = Integer.toHexString(Integer.parseInt(view1.getText().toString(), 16));
                    int memory_address_output = Integer.parseInt(memory_address_input, 16);
                    view2.setText(GlobalVariables.memory_space[memory_address_output]);
                } catch (Exception e) {
                    view1.setText(R.string.error);
                    view2.setText("");
                }
            } else if (view2.getText().length() == 2 && current.equals("EXMEM NEXT") && view1.getText().length() == 4) {
                String memory_address_input = Integer.toHexString(Integer.parseInt(view1.getText().toString(), 16));
                int memory_address_output = Integer.parseInt(memory_address_input, 16);
                GlobalVariables.memory_space[memory_address_output] = view2.getText().toString();
                try {
                    counter = memory_address_output;
                    if (counter < 64000) {
                        counter++;
                        memory_address_input = "0000".substring(Integer.toHexString(counter).length()) + Integer.toHexString(counter).toUpperCase();
                        view1.setText(memory_address_input);
                        view2.setText(GlobalVariables.memory_space[counter]);
                    } else {
                        view1.setText(R.string.error);
                    }
                } catch (Exception e) {
                    view1.setText(R.string.error);
                    view2.setText("");
                }
            } else if (!current.equals("SHIFT")) {
                switch (current) {
                    case "a":
                        view1.setText("B");
                        view2.setText(GlobalVariables.B);
                        current = "b";
                        break;
                    case "b":
                        view1.setText("C");
                        view2.setText(GlobalVariables.C);
                        current = "c";
                        break;
                    case "c":
                        view1.setText("D");
                        view2.setText(GlobalVariables.D);
                        current = "d";
                        break;
                    case "d":
                        view1.setText("E");
                        view2.setText(GlobalVariables.E);
                        current = "e";
                        break;
                    case "e":
                        view1.setText("F");
                        view2.setText(GlobalVariables.F);
                        current = "f";
                        break;
                    case "f":
                        view1.setText("H");
                        view2.setText(GlobalVariables.H);
                        current = "h";
                        break;
                    case "h":
                        view1.setText("L");
                        view2.setText(GlobalVariables.L);
                        current = "l";
                        break;
                    case "l":
                        String memory_address = Integer.toHexString(counter);
                        String data = GlobalVariables.memory_space[counter];
                        view1.setText(memory_address);
                        view2.setText(data);
                        if (counter < 64000) {
                            memory = 1;
                            counter++;

                        } else {
                            counter = 0;
                            view1.setText("A");
                            view2.setText(GlobalVariables.A);
                            current = "a";
                        }
                        break;
                    default:
                        view1.setText(R.string.error);
                        view2.setText("");
                }
            }
        }
    }

    public void prev(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            if (view1.getText().length() == 4 && current.equals("EXMEM")) {
                view1.setText(R.string.error);
                view2.setText("");
            } else if (view2.getText().length() == 2 && current.equals("EXMEM NEXT") && view1.getText().length() == 4) {
                String memory_address_input = Integer.toHexString(Integer.parseInt(view1.getText().toString(), 16));
                int memory_address_output = Integer.parseInt(memory_address_input, 16);
                GlobalVariables.memory_space[memory_address_output] = view2.getText().toString();
                try {
                    counter = memory_address_output;
                    if (counter > 0) {
                        counter--;
                        memory_address_input = "0000".substring(Integer.toHexString(counter).length()) + Integer.toHexString(counter).toUpperCase();
                        view1.setText(memory_address_input);
                        view2.setText(GlobalVariables.memory_space[counter]);
                    } else {
                        view1.setText(R.string.error);
                    }
                } catch (Exception e) {
                    view1.setText(R.string.error);
                    view2.setText("");
                }
            } else if (!current.equals("SHIFT")) {
                switch (current) {
                    case "b":
                        view1.setText("A");
                        view2.setText(GlobalVariables.A);
                        current = "a";
                        break;
                    case "c":
                        view1.setText("B");
                        view2.setText(GlobalVariables.B);
                        current = "b";
                        break;
                    case "d":
                        view1.setText("C");
                        view2.setText(GlobalVariables.C);
                        current = "c";
                        break;
                    case "e":
                        view1.setText("D");
                        view2.setText(GlobalVariables.D);
                        current = "d";
                        break;
                    case "f":
                        view1.setText("E");
                        view2.setText(GlobalVariables.E);
                        current = "e";
                        break;
                    case "h":
                        view1.setText("F");
                        view2.setText(GlobalVariables.F);
                        current = "f";
                        break;
                    case "l":
                        if (memory == 1) {
                            if (counter - 1 == 0) {
                                view1.setText("L");
                                view2.setText(GlobalVariables.L);
                                current = "l";
                                counter = 0;
                                memory = 0;
                            } else {
                                String memory_address = Integer.toHexString(counter - 2);
                                String data = GlobalVariables.memory_space[counter - 2];
                                view1.setText(memory_address);
                                view2.setText(data);
                                if (counter > 0) {
                                    counter--;
                                    memory = 1;
                                }
                            }
                        } else {
                            view1.setText("H");
                            view2.setText(GlobalVariables.H);
                            current = "h";
                        }
                        break;
                    default:
                        view1.setText(R.string.error);
                        view2.setText("");
                }
            }
        }
    }

    public void exmem(View view) {
        if (!current.equals("SHIFT") && !current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            view1.setText(".");
            view2.setText("");
            current = "EXMEM";
        }
    }

    public void zero(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("0");
                    } else {
                        view1.append("0");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("0");
                    } else {
                        view2.append("0");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("0");
                    } else if (view1.getText().length() < 4) {
                        view1.append("0");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
                    break;
            }
        }
    }

    public void one(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("1");
                    } else {
                        view1.append("1");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("1");
                    } else {
                        view2.append("1");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("1");
                    } else if (view1.getText().length() < 4) {
                        view1.append("1");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
                    break;
            }
        }
    }

    public void two(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("2");
                    } else {
                        view1.append("2");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("2");
                    } else {
                        view2.append("2");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("2");
                    } else if (view1.getText().length() < 4) {
                        view1.append("2");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
                    break;
            }
        }
    }

    public void three(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("3");
                    } else {
                        view1.append("3");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("3");
                    } else {
                        view2.append("3");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("3");
                    } else if (view1.getText().length() < 4) {
                        view1.append("3");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
                    break;
            }
        }
    }

    public void four(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("4");
                    } else {
                        view1.append("4");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("4");
                    } else {
                        view2.append("4");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("4");
                    } else if (view1.getText().length() < 4) {
                        view1.append("4");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
                    break;
            }
        }
    }

    public void five(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("5");
                    } else {
                        view1.append("5");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("5");
                    } else {
                        view2.append("5");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("5");
                    } else if (view1.getText().length() < 4) {
                        view1.append("5");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
                    break;
            }
        }
    }

    public void six(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("6");
                    } else {
                        view1.append("6");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("6");
                    } else {
                        view2.append("6");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("6");
                    } else if (view1.getText().length() < 4) {
                        view1.append("6");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
                    break;
            }
        }
    }

    public void seven(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            switch (current) {
                case "EXMEM":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("7");
                    } else {
                        view1.append("7");
                    }
                    break;
                case "EXMEM NEXT":
                    if (view2.getText().length() == 2) {
                        view2.setText("7");
                    } else {
                        view2.append("7");
                        GlobalVariables.memory_space[Integer.parseInt(view1.getText().toString(), 16)] = view2.getText().toString();
                    }
                    break;
                case "go":
                    if (view1.getText().toString().equals(".") || view1.getText().toString().length() == 4) {
                        view1.setText("7");
                    } else if (view1.getText().length() < 4) {
                        view1.append("7");
                    }
                    break;
                default:
                    view1.setText(R.string.error);
                    view2.setText("");
                    break;
            }
        }
    }

    public void fill(View view) {
        if (!current.equals("HLT")) {
            TextView view1 = findViewById(R.id.textView);
            TextView view2 = findViewById(R.id.textView2);
            if (current.equals("EXMEM NEXT") && view1.getText().length() == 4 && view2.getText().length() == 2) {
                String memory_address_input = Integer.toHexString(Integer.parseInt(view1.getText().toString(), 16));
                int memory_address_output = Integer.parseInt(memory_address_input, 16);
                GlobalVariables.memory_space[memory_address_output] = view2.getText().toString();
                view1.setText(".");
                view2.setText("");
                current = ".";
            } else if (current.equals("go") && view1.getText().length() == 4) {
                GlobalVariables.starting_address = view1.getText().toString();
                GlobalVariables.data = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.starting_address, 16)];
                for (; !GlobalVariables.data.equals("EF") && !current.equals("HLT"); ) {
                    GlobalVariables.starting_address = Integer.toHexString(Integer.parseInt(OpcodeRecognizer.opcode_switch(GlobalVariables.data, GlobalVariables.starting_address), 16) + 1);
                    GlobalVariables.data = GlobalVariables.memory_space[Integer.parseInt(GlobalVariables.starting_address, 16)];
                }
            }
        }
    }

    public void go(View view) {
        if (current.equals(".")) {
            current = "go";
        }
    }
}
