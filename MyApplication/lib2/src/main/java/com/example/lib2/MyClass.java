package com.example.lib2;

public class MyClass{
        public static void main(String[] args) {
            String input = "DFdfsDEFGRgbjd";
            String output = MyClass(input);
            System.out.println(output);
        }

        public static String MyClass(String input) {
            StringBuilder output = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    output.append(Character.toUpperCase(c));
                } else if (Character.isUpperCase(c)) {
                    output.append(Character.toLowerCase(c));
                } else {
                    output.append(c);
                }
            }

            return output.toString();
        }
    }





