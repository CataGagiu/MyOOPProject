public class Car
{
    String marca;
    int anFabricatie;
    String categorie;
    String model;
    String culoare;
    int putere;
    // adaugati un camp nou de tip culoare
    // scrie o metoda care afiseaza masina mea are culoarea x si apelati metoada in main
    public Car()
    {
        System.out.println("se apeleaza constructorul din Clasa Car");
        categorie="autoturism";
    }
    public Car(String marcaNoua, String modelnou)
    {
        System.out.println("se apeleaza constructorul nr 2");
        marca=marcaNoua;
        model=modelnou;
    }
    public void afiseaza()
    {
        System.out.println("Masina mea este un "+ marca+" " + model + " are categoria "+ categorie+" cu puterea "+putere+ " de cai si este din "+ anFabricatie+ " si are culoarea " + culoare);
    }
}
