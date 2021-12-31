package com;

import java.util.LinkedList;
import java.util.Stack;

public class Shape {
    public static void main(String[] args) {
       Base1 b1 = new Drive();
       if(b1 instanceof Drive){
           Class c = b1.getClass();
           Class b = Drive.class;
           b.getSuperclass();
           Stack<Integer> s1 = new Stack<Integer>();
           System.out.println(c);
       }
    }
}
class Base1{}
class Drive extends Base1{}
