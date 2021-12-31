package com;

public class Individual {
    String name;
    Individual(String name){
        this.name= name;
    }
    Individual(){}
}
class Person extends Individual{
    public Person() {
        super();
    }
    Person(String name){
        super(name);
    }

}
class Pet extends Individual{
    public Pet() {
        super();
    }

    public Pet(String name) {
        super(name);
    }
}
class Dog extends Pet{
    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }
}
class Mutt extends Dog{
    public Mutt(String name) {
        super(name);
    }

    public Mutt() {
        super();
    }
}
class Pug extends Dog{
    public Pug() {
        super();
    }

    public Pug(String name) {
        super(name);
    }
}
class Cat extends Pet{
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
}
class EgyptianMau extends Cat{
    public EgyptianMau(String name) {
        super(name);
    }

    public EgyptianMau() {
    }
}
class Manx extends Cat{
    public Manx(String name) {
        super(name);
    }

    public Manx() {
    }
}
class Cymric extends Manx{
    public Cymric(String name) {
        super(name);
    }

    public Cymric() {
    }
}
class Rodent extends Pet{
    public Rodent() {
    }

    public Rodent(String name) {
        super(name);
    }
}
class Rat extends Rodent{
    public Rat() {
    }

    public Rat(String name) {
        super(name);
    }
}
class Mouse extends Rodent{
    public Mouse() {
    }

    public Mouse(String name) {
        super(name);
    }
}
class Hamster extends Rodent{
    public Hamster() {

    }

    public Hamster(String name) {
        super(name);
    }
}


