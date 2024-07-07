package etc;

public class Book
{
    private double pret=50.0;// pretul nu poate fi modificat din exterior
    public String titlu;// titlul ppoate fi modificat didn exterior
    public String autor;// la fel si autorul
    public String editura;// editura
    public void setPret(double pretnou)
    {
        pret=pretnou;
    }
    public double getPret()
    {
        return pret;
    }
    public void afiseaza()
    {
        System.out.println("Cartea cu titlul "+titlu+" are autorul "+ autor+" cu pretul " +getPret());
    }
}
