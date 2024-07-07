package animale;

public class dog extends  Mamifer
{
    public dog(String nume, String culoare, boolean isVegetarian, String tipMamifer)
    {
        super(nume, culoare, isVegetarian, tipMamifer);
    }
    public void scoatesunete()
    {
        System.out.println(this.nume+ " latra");
    }
}
