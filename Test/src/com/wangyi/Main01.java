package com.wangyi;

import java.util.Arrays;
import java.util.*;
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] x = new int[q];
        for(int i = 0; i < q; i++){
            x[i] = sc.nextInt();
        }
        int[] Xscores = new int[q];
        for(int i = 0; i < q; i++){
            int m = x[i]-1;
            Xscores[i] = scores[m];
        }
        Arrays.sort(scores);
        for(int i = 0; i < q; i++){
            int j = 0;
            System.out.println(Xscores[i]);
            for(; j<n;j++){
                if(scores[j] > Xscores[i])
                    break;
            }
            System.out.println(j);
            double p = (double)(j-1)/n*100;
            System.out.println(String.format("%.6f", p));
        }
    }
}

