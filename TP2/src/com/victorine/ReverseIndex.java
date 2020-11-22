package com.victorine;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ReverseIndex extends Index {

    private TreeMap<Integer, TreeSet<String>> reverseIndex;

    public ReverseIndex(){ super();} //nous gardons le constructeur de la classe Index class

    public void createReverseIndex(){
        reverseIndex = new TreeMap<>();

        Set<Map.Entry<String, TreeSet<Integer>>> elementsIndex = super.index.entrySet();

        for (Map.Entry<String, TreeSet<Integer>> thisElement : elementsIndex) {
            String thisInput = thisElement.getKey();
            TreeSet<Integer> thisPages = thisElement.getValue();
            for (Integer number : thisPages) {
                TreeSet<String> existingInputs = reverseIndex.get(number);
                if (existingInputs == null) {
                    TreeSet<String> newInputNumber = new TreeSet<>();
                    newInputNumber.add(thisInput);
                    reverseIndex.put(number, newInputNumber);
                }
                else {
                    existingInputs.add(thisInput);
                    reverseIndex.put(number, existingInputs);
                }
            }
        }
    }

    public void displayRIndex() {
        if (reverseIndex == null) {
            return;
        }

        Set<Map.Entry<Integer, TreeSet<String>>> elementsIndexPage = reverseIndex.entrySet();

        for (Map.Entry<Integer, TreeSet<String>> number :
                elementsIndexPage) {
            Integer thisNumber = number.getKey();
            TreeSet<String> inputs = number.getValue();
            System.out.print(thisNumber + " : ");

            for (String input : inputs) {
                System.out.print(input + " ");
            }

            System.out.println();
        }
    }

    public Set<String> search(Integer page) {
        return reverseIndex.get(page);
    }

    public Set<String> remove(Integer page) {
        return reverseIndex.remove(page);
    }

}



