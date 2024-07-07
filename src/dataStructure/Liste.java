package dataStructure;

import java.util.ArrayList;

public class Liste
{
    public static void main(String[] args)
    {
        ArrayList<String> listadestudenti = new ArrayList<>();
        listadestudenti.add("Catalin");
        listadestudenti.add("Dan");
        listadestudenti.add("Vasile");
        System.out.println(listadestudenti.get(1));
            for (String c : listadestudenti)
            {
            System.out.println(c);
            }
        listadestudenti.remove(1); // sterge un element din lista
        System.out.println(listadestudenti.size());// marimea listei, cate elemente are
        System.out.println(listadestudenti.contains("Catalin"));
        //tema
        System.out.println("exercitii tema");
        ArrayList<String> listaDeCursuriIT = new ArrayList<>();
        listaDeCursuriIT.add(" Testare manuala ");
        listaDeCursuriIT.add(" Testare automata ");
        listaDeCursuriIT.add(" Front-end ");
        listaDeCursuriIT.add(" Java ");
        System.out.println("elementul de pe a 2-a pozitie este " + listaDeCursuriIT.get(1) + " din " + listaDeCursuriIT.size() + " elemente din lista");
        listaDeCursuriIT.add(" Design ");
        System.out.println(listaDeCursuriIT);
        listaDeCursuriIT.set(4, " WEB Design ");
        System.out.println(listaDeCursuriIT);
        System.out.println("afiseaza lista printr-o metoda separata:");
        afiseazaLista(listaDeCursuriIT);
        System.out.println();
        System.out.println("afiseaza lista fara primul element: ");
        listaDeCursuriIT.remove(0); // sterge primul element din lista
        afiseazaLista(listaDeCursuriIT);
        System.out.println("afiseaza lista cu mesajul \" vreau sa urmez un curs de \" inaintea cursului: ");
        afiseazaListaCuMesaj(listaDeCursuriIT);
        ArrayList<Integer> nume=new ArrayList<>();
        ArrayList<Boolean> valori= new ArrayList<>();
    }

    public static void afiseazaLista(ArrayList<String> lista)
    {
        for (String element : lista)
        {
            System.out.println(element);
        }
    }
    public static void afiseazaListaCuMesaj(ArrayList<String> lista)
    {
        for (String element : lista)
        {
            System.out.println("vreau sa urmez un curs de "+element);
        }
    }
}

