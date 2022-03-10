package com.bridgelabz;
import java.lang.Math;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int head=0,tail=0;
        double headPercent,tailPercent;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times coin to flip : ");
        int n=sc.nextInt();
        System.out.println(n);
        double number;
        for(int i=0;i<n;i++)
        {
            number = Math.random();
            if(number<=0.5)
            {System.out.println("tail "+number);
                tail++;
            }
            if(number> 0.5)
            {System.out.println("head "+number);
                head++;
            }

        }

        tailPercent= (float) (tail*100)/n;
        headPercent = (float) (head*100)/n;


        System.out.println("Tail flipped "+tailPercent+"%");
        System.out.println("Head flipped "+headPercent+"%");

    }
}
