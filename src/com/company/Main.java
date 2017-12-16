package com.company;

import java.io.LineNumberReader;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean ans = true;
        Stack<Integer> stack = new Stack<Integer>();
            while (sc.hasNext() == true) {
                System.out.println("oke");
                for(int i = 0; i< 3;i++)
                    sc.next();
                stack.push(sc.nextInt());
                System.out.println(stack.peek());
            }
        System.out.println(stack.size());
        for(int i = stack.size(); i > 0; i--){
            System.out.println(stack.peek());
            if(a > stack.pop()){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }

}