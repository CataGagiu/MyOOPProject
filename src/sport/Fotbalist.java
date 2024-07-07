package sport;

public class Fotbalist extends  Sportiv
{
    Abilitate abilitate;
    Fotbalist(String nume)
    {
    }

    public Fotbalist() {

    }

    public void seAntreneaza()
    {
        System.out.println("fotbalistul trage la poarta");
    }
    public void seRecupereaza()
    {
        System.out.println(" fotbalistul se recupereaza");
    }

    public Fotbalist(Abilitate abilitate)
    {
        this.abilitate = abilitate;
    }

    public void afiseazaDinSuperclasa()

    {
        super.seRecupereaza();
    }

}
