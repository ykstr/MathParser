package de.ykstr.test;

import de.ykstr.entities.*;
import de.ykstr.entities.functions.Plus;

public class Test{
    public static void main(String[] args) {
        BinaryFunction f = new Plus(1,1);
        System.out.println(f);
        System.out.println(f.calculate());
    }
}
