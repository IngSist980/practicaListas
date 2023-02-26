package com.mycompany.practicalistas;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author R
 */
public class PracticaListas {

    public static void main(String[] args) {

        List<String> Nombres;

        Nombres = new ArrayList<>();

        Nombres.add("Costa Rica");
        Nombres.add("Canada");
        Nombres.add("México");

        System.out.println(Nombres.contains("Canada"));

    }
}
