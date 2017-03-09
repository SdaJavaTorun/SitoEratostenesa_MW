package com.sdajava.eratostenes2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        int zakres;

        //Określanie zakresu wyświetlania liczb pierwszych

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program wyświetli liczby pierwsze z podanego zakresu");

        System.out.println("Wprowadź zakres dla liczb pierwszych");

        zakres = Integer.parseInt(br.readLine());

        ArrayList<Integer> integerArrayList = new ArrayList<>(); //nasza przechowalnia na liczby pierwsze

        //Tworzymy algorytm Sita Eratostenesa

        int normalNumbers;

        for (int i = 2; i <= Math.floor(Math.sqrt(zakres)); i++) {  //Math.floor - bez zaokrąglania inkrementacja nie będzie działać
            for (int j = 2; j <= zakres; j++) {
                if (i * j <= zakres) {
                    normalNumbers = i * j;
                    integerArrayList.add(normalNumbers);    //wypełniamy listę
                }
            }
            int primeNumbers = 2;
            while (primeNumbers <= zakres) {
                if (integerArrayList.contains(primeNumbers)) {
                } else {

                    System.out.print(primeNumbers + " ");  //wyświetlamy tylko listę, która nie zawiera powtórzeń (wielokrotności danej liczby)
                }
                primeNumbers++;
            }
        }
    }
}














