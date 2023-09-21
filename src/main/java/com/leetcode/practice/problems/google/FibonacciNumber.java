package com.leetcode.practice.problems.google;

/*Input  : n = 1

        Output : 1

        Input  : n = 9


        Output : 34

        Input  : n = 10

        Output : 55*
The Fibonacci numbers are the numbers in the following integer sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
        /
 */

public class FibonacciNumber {

    public static void main(String[] args) {
        int n=9;
        System.out.println(fibOption1(9));
        System.out.println(fibOption2(9));
        System.out.println(fibOption3(9));
    }

    private static int fibOption1(int n) {

        int a = 0, b = 1, c;
        if (n == 0) {
            return a;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
//        Time Complexity: O(n)
//        Auxiliary Space: O(1)


    }

    private static int fibOption2(int n) {

        if(n<=1){
            return n;
        }
        return fibOption2(n-1)+ fibOption2(n-2);
//        Time Complexity: Exponential, as every function calls two other functions.
//        Auxiliary space complexity: O(n), as the maximum depth of the recursion tree is n.
    }


    //Dynamic programming approach
    private static int fibOption3(int n) {

        int f[] = new int[n+2];
        int i;
        f[0]= 0;
        f[1] =1;

        for(i =2 ; i<=n ; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
//        Time complexity: O(n) for given n
//        Auxiliary space: O(n)
    }
}
