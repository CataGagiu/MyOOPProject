package animale;

import java.util.Objects;

public class Mamifer extends Animal
{
    String tipMamifer;

    public Mamifer(String nume, String culoare, boolean isVegetarian, String tipMamifer) {
        super(nume, culoare, isVegetarian);
        this.tipMamifer = tipMamifer;
    }

    public void sunetAnimal() {
        if (Objects.equals(nume, "caine")) System.out.println(this.nume + " latra");
        else if (Objects.equals(nume, "mata")) System.out.println(nume+ " miauna");
        else
            System.out.println(nume+ " scoate sunete");
    }
}