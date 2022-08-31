package org.example;

public class Osoba
{

    public String name;
    public String surname;
    private String login;
    private int haslo;
    


    public Osoba(String name, String surname, String login, int haslo) 
    {
        this.surname = surname;
        this.haslo = haslo;
        this.name = name;
        this.login=login;
        
    }

    public int getHaslo()


    {
        return haslo;
    }

    public void setHaslo(int haslo)
    {
        if (haslo == 8889) {
            this.haslo = haslo;
        } else
        {
            System.out.println("Niepoprawne haslo");

        }
    }

    public boolean czyUzytkownikIstnieje () {
        if (surname.length() >= 3 && name.length() >= 3) {
            return true;

        } else {

            return false;
        }


    }

    }