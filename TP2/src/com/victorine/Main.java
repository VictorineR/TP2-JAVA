package com.victorine;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void ex1() {
        try{
            Student Emmanuelle = new Student("1", 15, 15,15);
            Student Lisa = new Student("6", 19,19, 19);
            Student Victor = new Student("3",18,18,18);
            Student Victorine = new Student("4",20,20,20);

            Promotion L3 = new Promotion();
            L3.add(Emmanuelle);
            L3.add(Lisa);
            L3.add(Victor);
            L3.add(Victorine);

            L3.displayPromo();

            L3.sortByRegister();
            L3.displayPromo();

            L3.sortByAverage();
            L3.displayPromo();


            System.out.println("Student with the best Lab Score");
            System.out.println(L3.getBestLab().getRegister_number() + " with a grade of " + L3.getBestLab().getLab_score());

        }catch (Student.InvalidNoteException message){
            System.out.println(message.getMessage());
        }
    }

    public static void ex2() {
        Scanner input = new Scanner(System.in);
        SimpleIndex collection = new SimpleIndex();

        collection.add("Fleur", 2);
        collection.add("Emmanuelle", 13);
        collection.add("Sophie", 15);
        collection.add("Victor", 29);

        System.out.println("This collection contains: ");
        collection.display();

        System.out.println(" ");
        System.out.println("            * ---------- Search function ---------- *");

        System.out.println("Which word do you want to search :  ");
        String word = input.next(); //nouveau scanf, redemande à l'utilisateur ce qu'il veux chercher
        System.out.println("Found page: " + collection.search(word));

        System.out.println(" ");
        System.out.println("            * ---------- Adding function ---------- *");

        System.out.print("-> Which word do you want add: ");
        String word2 = input.next();
        System.out.print("-> Which page(s) contain this word: ");
        int pageNumber = input.nextInt();
        collection.add(word2, pageNumber);
        System.out.println("\nThe index is now the following:");
        collection.display();

        System.out.println(" ");
        System.out.println("            * ---------- Remove function ---------- *");
        System.out.print("-> Enter the word to supress:");
        String word3 = input.next();
        System.out.println(collection.remove(word3));
        System.out.println("The " + word3);

        System.out.println("\nThe index is now the following:");
        collection.display();
    }

    public static void ex3(){
        Scanner input = new Scanner(System.in);
        SimpleIndex collection = new SimpleIndex();

        collection.add("Fleur", 2);
        collection.add("Emmanuelle", 13);
        collection.add("Sophie", 15);
        collection.add("Victor", 29);

        System.out.println("This collection contains: ");
        collection.display();

        System.out.println(" ");
        System.out.println("            * ---------- Search function ---------- *");

        System.out.println("Which word do you want to search :  ");
        String word = input.next(); //nouveau scanf, redemande à l'utilisateur ce qu'il veux chercher
        System.out.println("Found page: " + collection.search(word));

        System.out.println(" ");
        System.out.println("            * ---------- Remove function ---------- *");

        System.out.print("-> Enter the word to supress:");
        String word3 = input.next();
        System.out.println(collection.remove(word3));
        System.out.println("The word which you have remove " + word3);

        System.out.println("\nThe index is now the following:");
        collection.display();

        System.out.println(" ");
        System.out.println("            * ---------- Adding function ---------- *");

        System.out.print("-> Which word do you want add: ");
        String word2 = input.next();
        System.out.print("-> Which page(s) contain this word: ");
        Set<Integer> paper = new TreeSet<>();

        while(input.hasNextInt()){ //Tant que l'utilisateur va rentrer un chiffre, une page, le progremme/la boucle while va tourner pour qu'un mot ait plusieurs pages
            int pageNumber = input.nextInt();
            collection.add(word2, pageNumber);
            paper.add(pageNumber);
        }
        System.out.println("The word "+ word3 +" has been added " + paper);
        System.out.println(collection.search(word));

        System.out.println("The index is now the following:");
        collection.display();
    }

    public static void ex4(){

        ReverseIndex idx = new ReverseIndex () ;
        idx.add ("Java", 14) ;
        idx.add ("Vernis", 83) ;
        idx.add ("William", 5) ;
        idx.add ("Lampe", 2020) ;

        idx.createReverseIndex() ;
        idx.displayRIndex() ;
    }


    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        ex4();
    }

}

