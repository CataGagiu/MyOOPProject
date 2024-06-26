public class Elev
{
    String  nume;
    double mediaGenerala;
    static String diriginte= "dirigu";

    public Elev(String nume, double mediaGenerala)
    {
        this.nume = nume;
        this.mediaGenerala = mediaGenerala;
    }
    public void afisareElev()
    {
        System.out.println("elevul "+ this.nume+" care are media "+this.mediaGenerala+" are diriginte pe "+ Elev.diriginte);
    }
}
