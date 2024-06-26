public class EchipaDeFotbal
{
    private int punctaj;
    private static String campionat="Euro 2024 ";// se poate afisa fara obiect
    String numeEchipa;

    public EchipaDeFotbal(int punctaj, String numeEchipa)
    {
        this.punctaj = punctaj;
        this.numeEchipa = numeEchipa;
    }
    public void afisareEchipa()
    {
        System.out.println(this.numeEchipa+ " are punctajul "+ this.punctaj+ " si face parte din campionatuol "+ EchipaDeFotbal.campionat);
    }
}
