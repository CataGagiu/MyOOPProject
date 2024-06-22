public class Person
{
    int birthYear;// better to store birth year
    char sex;
    String firstName;
    String lastName;

    public Person(char sex, int birthYear)
    {
        this.sex = sex;
        this.birthYear = birthYear;
    }
    Person(int birthYear)
    {
        birthYear = 2006;
    }
    Person(char sex, String firstName, String lastName)
    {
      this.sex=sex;// se refera la atributul din clasa curenta
     this.firstName=firstName;
      this.lastName=lastName;
    }
    public int returnAge(int birthYear)
   {
       return 2024-birthYear;
    }
    public void  afiseaza()
    {
        System.out.println(firstName+" are " +returnAge(2000)+ " ani" );
    }
}
