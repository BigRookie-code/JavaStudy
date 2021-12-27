package com;

import org.junit.Test;
class base{

}
public class PackDem {
    String a;
    base b;
    protected void finalize(){
        System.out.println("Error");
    }


    public static void main(String[] args) {
        new PackDem();
        System.gc();
    }
    @Test
    public void test() throws Throwable {
        System.out.println(a);
        System.out.println(b);
//        String c;
//        System.out.println(c);
        System.gc();
//        super.finalize();
    }

}



