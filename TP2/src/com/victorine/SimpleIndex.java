package com.victorine;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;


public class SimpleIndex {
     TreeMap <String, Integer> index; //Index --> dictionnaire.

    //Constructor
    public SimpleIndex () {
        index = new TreeMap<>();
    }

    //Methode
    public void add (String new_Word, int Page_nb){ //on créeer des paramètre
        this.index.put(new_Word, Page_nb);
    }

    public boolean remove(String remove_Word){
        this.index.remove(remove_Word);
        return false;
    }

    public Integer search (String search_Word){
        return this.index.get(search_Word); //il sait qu'il récuppere le nb dans la page car il récuppère un interger
    }

    public void display(){
        Set<Map.Entry<String, Integer>> copy = index.entrySet(); //prendre en copie la collection, on fait copie.

        for (Map.Entry<String, Integer> copies : copy) {    //boucle for pour each qui vas prendre chaque élément et le remplacer pour chaque variable.
            String thisWord = copies.getKey(); //récupérer le String
            Integer thisPage = copies.getValue();//récupérer un interger

            System.out.println("The word " + thisWord);
            System.out.println("is present in "+thisPage+" pages\n");
        }
    }
}
