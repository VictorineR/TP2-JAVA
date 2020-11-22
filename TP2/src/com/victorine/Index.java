package com.victorine;

import java.util.*;

public class Index {
    TreeMap<String, TreeSet<Integer>> index = new TreeMap(); //Index --> dictionnaire.

    public Index(){
        index = new TreeMap<>();
    }

    //Fonction
    public void add(String new_Word, int page){
        TreeSet<Integer> existingNumber = (TreeSet)this.index.get(new_Word); //créer un variable qui stock toute les âges existantes

        if (existingNumber == null){ //on verifis si le tableau est vide ou non
            TreeSet<Integer> numberNewWord = new TreeSet(); // si il y a rien dans notre tableau on l'initialise avec le nouveau mot que l'utilisateur à ajouter
            numberNewWord.add(page); //fonction add --> fonction déjà présent dans Java, ici on ajoute un valeure dans un tableau
            index.put(new_Word, numberNewWord);
        } else {
            existingNumber.add(page);
            index.put(new_Word, existingNumber);
        }
    }

    public Set<Integer> remove(String remove_Word){
        return index.remove(remove_Word);
    }

    public Set<Integer> search(String search_Word){
        return index.get(search_Word);
    }

    public void display(){
        Set<Map.Entry<String, TreeSet<Integer>>> copy = index.entrySet(); //prendre en copie la collection, on fait copie.

        for (Map.Entry<String, TreeSet<Integer>> copies : copy) {    //boucle for pour each qui vas prendre chaque élément et le remplacer pour chaque variable.
            String thisWord = copies.getKey(); //récupérer le String
            Set<Integer> thisPage = copies.getValue();//récupérer un interger

            System.out.println("The word " + thisWord + " is in : ");

            for (int thisPages : thisPage){
                System.out.println(thisPage+" ");
            }
            System.out.println();
        }
    }




}
