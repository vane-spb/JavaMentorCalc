package com.company;

import com.company.Math.Equations.Equation;
import com.company.Math.Equations.TwoNumbersEquation;
import com.company.Math.Operations.Roman;
import com.company.Parsers.TestArab;
import com.company.Parsers.TestRoman;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        //proceed input
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        if (!(TestRoman.testString(input) | TestArab.testString(input)))
            throw new ParseException("Incorrect input", 0);

        //computing
        Equation eq = new TwoNumbersEquation(input);
        int solution = (int) eq.solve();

        //printing
        if (TestRoman.testString(input)) {
            System.out.println(Roman.intToRoman(solution));
        } else System.out.println(solution);
    }
}
