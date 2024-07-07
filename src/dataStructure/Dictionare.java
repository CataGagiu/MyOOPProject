package dataStructure;

import java.util.HashMap;

public class Dictionare
{
    public static void main(String[] args) {
        HashMap<Integer, String> dictionar = new HashMap<>();
        dictionar.put(1, " first");
        dictionar.put(2, " second ");
        dictionar.put(3, " third");
        dictionar.put(4, " for");
        dictionar.put(7, " seven");
        System.out.println(dictionar);
        dictionar.remove(3);
        System.out.println("dupa stergerea elementului cu valoare 3 " + dictionar);
        System.out.println("afiseaza elementul cu linia 2 : " + dictionar.get(2));
        System.out.println("returneaza toate valorile: " + dictionar.values());
        System.out.println("afiseaza toate keyle: " + dictionar.keySet());
        System.out.println("le poti si utiliza valorile " + dictionar.entrySet());
        dictionar.replace(2, "tri");
        System.out.println(dictionar);
        dictionar.put(2, "second");
        for (int i : dictionar.keySet())
            System.out.println(i);
        for (String value : dictionar.values())
            System.out.println(value);

        System.out.println("exercitii:");
        HashMap<String, Boolean> calificariSferturi = new HashMap<>();
        calificariSferturi.put("Franta", true);
        calificariSferturi.put("Romania", false);
        calificariSferturi.put("Italia", false);
        calificariSferturi.put("Olanda", true);
        calificariSferturi.put("Portugalia", true);
        System.out.println(calificariSferturi);
        for (String c : calificariSferturi.keySet())
        {
            if (calificariSferturi.get(c))
            {
                System.out.println(c);
            }
        }
    }
}
