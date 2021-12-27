package com;

import java.util.Objects;

public class Pack {
    int age;
    String name;
    public Pack(){

    }

    public Pack(String name) {
        this.name = name;
    }

    public Pack(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println("this pack.name is"+name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pack pack = (Pack) o;
        return age == pack.age && Objects.equals(name, pack.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
