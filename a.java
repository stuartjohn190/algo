package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number");
        int n = keyboard.nextInt();
        boolean visited[] = new boolean[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            visited[i]=true;
        }
        for(i=2;i*i<=n;i++)
        {
            if(visited[i])
            {
               for(j=2*i;j<n;j+=i)
               {
                   visited[j]=false;
               }
            }

        }
        for(i=2;i<n;i++)
        {
            if(visited[i])
                System.out.println(i);
        }

    }
}
