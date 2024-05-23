package Leetcode.algorithms.recursions;

public class Fibonacci {
    public int findFibonacciByRecursive(int n) {
        if(n==0) {
            return 0;
        }
        else if(n==1 || n==2) {
            return 1;
        }
        return findFibonacciByRecursive(n-1) + findFibonacciByRecursive(n-2);
    }

    public int findFibonacciByIterative(int n) {
        if(n==0) {
            return 0;
        }
        else if(n==1 || n==2) {
            return 1;
        }
        else {
            int[] arr = {1,1};
            for(int i=3;i<=n;i++) {
                int temp = arr[1];
                arr[1] = arr[0] + arr[1];
                arr[0] = temp;
            }
            return arr[1];
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.findFibonacciByIterative(5));
        System.out.println(fibonacci.findFibonacciByRecursive(5));
    }
}
