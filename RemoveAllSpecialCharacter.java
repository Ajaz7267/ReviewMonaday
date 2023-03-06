//Write a program to remove all special character from a string.
package com.bridgelabz;

import java.util.Scanner;

public class RemoveAllSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String SpecialCharacter = sc.nextLine();
        String StringWithOutCharacter = SpecialCharacter.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.print("String without special characters:" +StringWithOutCharacter+ " ");
    }
}
