import animale.Animal;
import animale.Mamifer;
import etc.Book;
import etc.ClassDemo;
import sport.EchipaDeFotbal;
import sport.Fotbalist;
import sport.Volebalist;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        ClassDemo obiect1 = new ClassDemo();
        obiect1.attribute2 = "ceva";
        obiect1.getAtribute1();

        Human cristina = new Human();
        Human nicu = new Human();
        cristina.email = "cristina@tst.com";
        Book book1 =new Book();
        book1.autor = "Mihai Eminescu";
        book1.titlu = "Poezii";
        System.out.println(book1.autor);
        System.out.println(book1.titlu);
        book1.afiseaza();
        book1.titlu="Basme";
        book1.afiseaza();

        // exercitiu
        // creati un obiect nou book2
        // pret=35
        //titlu "Amintiri din copilarie"
        //autor "ion creanga"
        // apelati cele dou metode cu obiectul nou creat

        Book  book2= new Book();
        book2.autor="Ion Creanga";
        book2.titlu="Amintiri din copilarie";
        book2.setPret(35.0);
        book2.afiseaza();

        Car myCar= new Car();
        myCar.marca="peugeot";
        myCar.model="408";
        myCar.anFabricatie=2024;
        myCar.categorie="autoturism";
        myCar.culoare="gri";
        myCar.putere=130;
        myCar.afiseaza();

        Car myOldCar= new Car();
        myOldCar.afiseaza();

        Car catasCar=new Car("VW", "passat");
        // exemplu clasa person

        Person bula=new Person('m',"Bula", "Gogu");
        System.out.println("bula are "+ bula.returnAge(2006));
        Person alinuta=new Person('f', "Alinuta", "Bulinuta");
        System.out.println(alinuta.firstName+" "+ alinuta.lastName);
        bula.afiseaza();
        System.out.println("ex nr 1:");
        //Exercitiul 1:
        Animal dog= new Animal();
        Animal pisica= new Mamifer("pisica", "neagra", false, "felina");
        System.out.println("dog: Animalul cu numele "+ dog.nume + " cu culoarea " + dog.culoare + " este vegetarian " + dog.isVegetarian);
        System.out.println("pisica: " + pisica.nume + " " + pisica.culoare +" " + pisica.isVegetarian);
        Animal elefant= new Animal("elefant","gri");
        elefant.mananca();
        elefant.doarme();
        System.out.println(elefant.afiseazaCuloarea());
        System.out.println(pisica.afiseazaCuloarea());
        // din clasa elev

        Elev elev1= new Elev("Popescu Andrei", 9.68);
        Elev elev2=new Elev("Popescu Alina", 9.82);
        elev1.afisareElev();
        elev2.afisareElev();
        Elev.diriginte="noul dirig";
        elev2.mediaGenerala=8;;
        elev2.afisareElev();
    EchipaDeFotbal Romania= new EchipaDeFotbal(4,"Romania");
    EchipaDeFotbal Belgia= new EchipaDeFotbal(6,"Belgia");
    Romania.afisareEchipa();
    Belgia.afisareEchipa();

    Fotbalist fotbalist1= new Fotbalist();
    Volebalist volebalist1=new Volebalist();
    fotbalist1.seAntreneaza();
    fotbalist1.seRecupereaza();

    volebalist1.seAntreneaza();
    volebalist1.seRecupereaza();

    Mamifer caine= new Mamifer("caine", "roscat", false, "terestru");
    Mamifer mata= new Mamifer("mata", "lila-n dungi cu picatele", false, "terestru");
    caine.sunetAnimal();
    mata.sunetAnimal();
    Movie movie1=new Movie();
    movie1.setTitlu("Titanic");
    movie1.setTipFilm("drama");
    movie1.setScorIMDB(8.7);
        System.out.println(movie1.getTitlu() + " are scorul " + movie1.getScorIMDB()+ " si este " + movie1.getTipFilm());
        fotbalist1.afiseazaDinSuperclasa();
    }

}