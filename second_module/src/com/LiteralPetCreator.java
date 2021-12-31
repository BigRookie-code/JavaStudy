package com;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator{
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            List.<Class<? extends  Pet>>of(Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class, Pug.class, EgyptianMau.class,
                    Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class);
    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
