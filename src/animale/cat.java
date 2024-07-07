package animale;

public class cat extends Mamifer
{
    public cat(String nume, String culoare, boolean isVegetarian, String tipMamifer)
    {
        super(nume, culoare, isVegetarian, tipMamifer);
    }
    public void scoateSunete()
    {
        System.out.println(this.nume+ " miauna");
    }
}
