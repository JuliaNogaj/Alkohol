package org.example;

public class Main {
    public static void main(String[] args)

    {

        System.out.println("Witaj w naszym banku !");
        System.out.println("                            ");

        Osoba julka = new Osoba("Ju","No" ,"fefgfgegege", 8889);
        julka.setHaslo(999);

if (julka.czyUzytkownikIstnieje())
{

    System.out.println("Uzytkownik istnieje ");
} else
{
   System.out.println("Nie istnieje ");

}
    }
}