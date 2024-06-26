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
        Animal pisica= new Animal("pisica", "neagra");
        System.out.println("dog: Animalul cu numele "+ dog.nume + " cu culoarea " + dog.culoare + " este vegetarian " + dog.isVegetarian);
        System.out.println("pisica: " + pisica.nume + " " + pisica.culoare +" " + pisica.isVegetarian);
        Animal elefant= new Animal("elefant","gri");
        elefant.mananca();
        elefant.doarme();
        System.out.println(elefant.afiseazaCuloarea());
        System.out.println(pisica.afiseazaCuloarea());

    }
}