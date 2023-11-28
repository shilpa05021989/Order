package com.dynamic.programming.demo.recursion;

public class Recursion {

    public int iterator(int n) {
        int result = 0;
        if(n==0){
            return 0;
        }
        for(int i=1; i<=n; i++){
            result += i;
        }
        return result;
    }

    public int headRecursion(int n){
        System.out.println("calling function n = "+ n);
        if(n==0){
            return 0;
        }

        int res= n + headRecursion(n-1);
        System.out.println("called function  "+ n + " + headRecursion( " + (n-1)+")");
        return res;
    }

    public  int tailRecursion(int n, int acc){
        if(n==0){
            System.out.println("Base case " + acc);
            return acc;
        }
        System.out.println("Before recursion n=" + n);
        int res = tailRecursion(n-1, n+acc);
        System.out.println("After recursion res=" + res + "n ="+n);
        return res;

    }

    public int headFib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1) {
            return 1;
        }
        int fib1 = headFib(n-1);
        int fib2 = headFib(n-2);
        int res = fib1 + fib2;
        return res;
    }
    public int tailFib(int n, int a, int b){
        //f(0)=a f(1)=b f(2)=f(1)+f(0)

        if(n==0) return a;
        if(n==1) return b;
        //f(3)=f(2)+f(1)= b+a
        //f(4)=f(3)+f(2)
        //f(5)=f(4)+f(3)
        System.out.println("n = "+n+" a =" + a+" b= "+b);
        int res=  tailFib(n-1,b,b+a);
        System.out.println(" after n = "+n+" a =" + a+" b= "+b);
        return res;

    }
}
