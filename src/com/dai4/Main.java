package com.dai4;


public class Main {

    public static void main(String[] args) {
	// write your code here

        //Initialisation d'un nouveau strore
        DVDStore store = new DVDStore();

        // Configuration des prix et des remises
        store.setPrice("Back to the Future 1", 15);
        store.setPrice("Back to the Future 2", 15);
        store.setPrice("Back to the Future 3", 15);

        store.setDiscount("Back to the Future 1", 0);
        store.setDiscount("Back to the Future 2", 10);
        store.setDiscount("Back to the Future 3", 20);

        // Exemples d'achats
        String cart1 = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3";
        String cart2 = "Back to the Future 1\nBack to the Future 3";
        String cart3 = "Back to the Future 1";
        String cart4 = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3\nBack to the Future 2";
        String cart5 = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3\nLa chèvre";

        // Calcul et affichage des prix
        System.out.println(store.calculateTotal(cart1)); // 36
        System.out.println(store.calculateTotal(cart2)); // 27
        System.out.println(store.calculateTotal(cart3)); // 15
        System.out.println(store.calculateTotal(cart4)); // 48
        System.out.println(store.calculateTotal(cart5)); // 56



    }
}
