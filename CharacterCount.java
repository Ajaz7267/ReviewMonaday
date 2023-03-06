package com.bridgelabz;

    public class CharacterCount {
        public static void main(String[] args) {
            String Sentence = "Absbsbbd";
            int[] charCounts = new int[128];
            for (int i = 0; i < Sentence.length(); i++) {
                 char Characters = Sentence.charAt(i);
                 charCounts[Characters]++;
            }
            for (int i = 0; i < charCounts.length; i++) {
                if (charCounts[i] > 0) {
                System.out.println((char) i + " = " + charCounts[i]);
                }
            }
        }
    }

