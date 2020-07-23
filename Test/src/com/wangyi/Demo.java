package com.wangyi;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Demo{
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        System.out.println("please input:");
        if(scan.hasNext()) {
            list.add(scan.next());
        }
        for(String x:list) {
            System.out.println(x);
        }
    }

}
