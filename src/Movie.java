public class Movie
{
   private String titlu;
   private String tipFilm;
    private double scorIMDB;

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setTipFilm(String tipFilm) {
        this.tipFilm = tipFilm;
    }

    public void setScorIMDB(double scorIMDB) {
        this.scorIMDB = scorIMDB;
    }

    public String getTitlu()
    {
        return titlu;
    }

    public String getTipFilm()
    {
        return tipFilm;
    }

    public double getScorIMDB()
    {
        return scorIMDB;
    }
}
