public class Animal
{   public String nume;
    public String culoare;
    public boolean isVegetarian;

    public Animal()
    {
        this.nume="unknown";
        this.culoare="unknown";
        this.isVegetarian=true;
    }

    public Animal(String nume)
    {
        this.nume = nume;
    }

    public Animal(String nume, String culoare)
    {
        this.nume = nume;
        this.culoare = culoare;
    }

    public Animal(String nume, String culoare, boolean isVegetarian)
    {
        this.nume = nume;
        this.culoare = culoare;
        this.isVegetarian = isVegetarian;
    }
    public void mananca()
    {   String numeAnimal=nume;
        System.out.println(nume+ " mananca");
    }
    public void doarme()
    {
        System.out.println(nume+ " doarme");
    }
    public String culoareAnimal()
    {
         String mesaj=nume+ " de culoare " + culoare;
         return mesaj;
    }
}
