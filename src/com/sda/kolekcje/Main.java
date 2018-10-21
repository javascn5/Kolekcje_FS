package com.sda.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
        List<String> lista = new ArrayList<>();

        lista.add("Jan");
        lista.add("Maciej");
        lista.add("Tadeusz");

        System.out.println("Rozmiar: " + lista.size());

        lista.add("Mateusz");
        lista.add("Karol");

        System.out.println("Rozmiar: " + lista.size());

        for (String imie: lista){
            System.out.println("Imie: " + imie);
        }

        for (int i = 0; i < lista.size() ; i++) {
            System.out.println("Imie: " + lista.get(i));
        }

        lista.remove("Jan");
        lista.remove(0);
        try {
            String imie = lista.get(2);
            System.out.println("Element o indeksie 2: " + imie);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Nie ma takiego elementu tablicy");
            e.printStackTrace();
        }


        lista.clear(); // czyszczenie listy z elementów
         */

        User user1 = new User("Anna","Dąb",15);
        User user2 = new User("Kasia","Kowalska",25);
        User user3 = new User("Maria","Kowalczyk",50);

        List<User> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        for (User lista: userList){
            System.out.println("Imie: " + lista.getName() + " Nazwisko: " + lista.getLastname() + " Wiek: " + lista.getAge());
        }
        for (User lista: userList){
            System.out.println(lista.toString());
        }


    }
}
