package com.bridgelabz;

import java.util.Arrays;
public class AllPrimeNumberAndSort {
    public static void main(String[] args) {
        int[] numbers = {5,7,2,1,9,6,17,7}; //1 is not prime it is starting number
        int[] primes = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                primes[count] = numbers[i];
                count++;
            }
        }
        Arrays.sort(primes, 0, count);
        System.out.print("Prime numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(primes[i] + " ");
        }
    }
            public static boolean isPrime(int n) {
                if (n < 2) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }

