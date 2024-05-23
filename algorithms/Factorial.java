package Leetcode.algorithms;

public class Factorial {
    public int findFactorialRecursive(int number) {
        if(number < 2) {
            return 1;
        }
        return number * findFactorialIterative(number-1);
    }

    public int findFactorialIterative(int number) {
        if(number < 2) {
            return 1;
        }
        int answer = 1;
        for(int i=2;i<=number;i++) {
            answer *= i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.findFactorialIterative(5));
        System.out.println(fact.findFactorialRecursive(5));
    }
}
