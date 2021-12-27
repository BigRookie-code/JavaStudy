package com;

import org.junit.Test;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Myclass {
    private final int i=10;
    public final void print(){
        System.out.println(s);
    }
    public static final String s = new String("hello world");
    @Test
    public void test(){
        Scanner input = new Scanner(new adaptedRandom());
        while(input.hasNext()){
            System.out.println(input.next());
        }
    }
}
class adaptedRandom implements Readable{
    private Random r = new Random(47);
    private static final char[] s = "dsgdsgdinged".toCharArray();
    private int count = 2;
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0) return -1;
        for(int i=0;i<4;i++) {
            cb.append(s[r.nextInt(s.length)]);
        }
        cb.append(" ");
        return 5;
    }

}
interface game{
    void play();
}
class coin implements game{
    public void play(){
        System.out.println("抛硬币");
    }
}
class tou implements game{
    public void play(){
        System.out.println("掷骰子");
    }
}
interface factory{
    game getGame();
}
class coinfactory implements factory{
    public game getGame(){
        return new coin();
    }
}
class toufactory implements factory{
    public game getGame(){
        return new tou();
    }
}
class test{
    public static void playgame(factory fact){
        game s = fact.getGame();
        s.play();
    }

    public static void main(String[] args) {
        playgame(new coinfactory());
        playgame(new toufactory());
    }
}
class Outer{
    class Inner{

    }
    public Inner to(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o1= new Outer();
        Outer.Inner i1 = o1.to();
    }

}
interface a{
    void print();
}
class nameObj{
    public a fact(){
        return new a(){
            {
                System.out.println("实例初始化即为构造器");
            }
            public void print(){
                System.out.println("neibulei");
            }
        };
    }

    public static void main(String[] args) {
        nameObj t = new nameObj();
        a aobj = t.fact();
        aobj.print();
    }
}
interface U{
    void f();
    void g();
    void h();
}
class A {
    public U getU(){
        return new U(){
            public void f(){
                System.out.println("f");
            }
            public void g(){}
            public void h(){}
        };
    }
}
class B{
    private U[] objs = new U[10];
    private int index = -1;
    public void addobj(U obj){
        objs[++index] = obj;
    }
    public void clc(){
        if(index==-1) return ;
        for(int i=0;i<=index;i++) objs[i]=null;
        return;
    }
    public void breach(){
        for(int i= 0 ;i<=index;i++) {
            objs[i].f();
            objs[i].g();
            objs[i].h();
        }
        return;
    }
    public static class test{
        public static void main(String[] args) {
            A temp =new A();
            U[] testA = new U[10];
            for (int i=0;i<10;i++){
                testA[i] = temp.getU();
            }
            B testB = new B();
            for(int i=0;i<10;i++) {
                testB.addobj(testA[i]);
            }
            testB.breach();
            testB.clc();
            return ;
        }


    }



}
class CollectionTest{
    public static void main(String[] args) {

        List<Integer> list1 =new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<Integer>();
        ListIterator<Integer> it = list1.listIterator(2);
        for(int i=1;i>=0;i--){
            Integer n = it.previous();
            list2.add(n);
        }
        System.out.println(list2);
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(1);
        stk.push(2);
        stk.peek();
        stk.pop();





    }
}
class Gerbil {
    private static int id =0;
    private int getbilNumber ;
    private String name;
    Gerbil(String name){
        this.name = name;
        getbilNumber = id ++;
    }
    void hop(){
        System.out.println(getbilNumber + "号: 正在跳跃");
    }
    public String toString(){
        return new String(getbilNumber + " " + name);
    }

    public static void main(String[] args) {
        Map<String,Gerbil> m_map = new HashMap<String,Gerbil>();
        m_map.put("doudou",new Gerbil("doudou"));
        m_map.put("goudou",new Gerbil("goudou"));
        m_map.put("foudou",new Gerbil("foudou"));
        Iterator<Map.Entry<String,Gerbil>> it = m_map.entrySet().iterator();


        //Set<Map.Entry<String, Gerbil>> entries = m_map.entrySet();

        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        Gerbil t = m_map.get("goudou");
        t.hop();
        Set<String> m_set = m_map.keySet();

    }
}
class ArrayIsNotIterable{
    static <T> void test(Iterable<T> ib){
        for(T t: ib)
            System.out.print(t+" ");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        test(Arrays.asList(1,2,3));
    }
}

class Ioexception extends Exception{
    public static void h() throws Ioexception {
        throw new Ioexception();
    }
    public static void main(String[] args) {
        try {
            h();
        }catch (Exception e){
            var i =10;
            var s = new String("dighnd");
            List<String> l1 = new ArrayList<>(){};
            String s1 = new String("dsigndg");
            int[] nums = new int[]{1,2,3,4};
            System.out.println(s1);
            System.out.println(s);
            System.out.println(i);
            e.printStackTrace();
        }

    }
}
class Regex{
    public static void main(String[] args) {
        ArrayList<String> strs =new ArrayList<>(Arrays.asList("^Java","\\Breg.*","n.w\\s+h(a|i)s",
        "s?","s*","s+","s{4}","s{1}","s{0,3}"));
        String s = "Java now has regular expressions";
        Pattern p = Pattern.compile(s);
        int id =1;
        for(String t: strs){
            p=Pattern.compile(t);
            Matcher m =p.matcher(s);
            id++;
            while (m.find())
                System.out.println("find!:  "+id+" "+m.group()+" "+m.start()+"-"+m.end());
        }
    }
}










