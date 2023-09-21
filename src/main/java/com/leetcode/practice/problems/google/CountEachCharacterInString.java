package com.leetcode.practice.problems.google;

import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CountEachCharacterInString {

    //Example . ilovejava has a 2 times rest all characters are only time

    public static void main(String[] args) {


        String rex = "SSS";
        String replace =  "X";
        String str = "she sells sea shells";

        Pattern p = Pattern.compile(rex);


        Matcher m = p.matcher(str);
        String val = m.replaceAll(replace);
        System.out.println(val);

    }

}
