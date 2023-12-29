package com.dai4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DVDStoreTest {

    @Test
    //J'ai fait cet exemple en troisième lieu
    public void testExemple1() {

        DVDStore store1 = new DVDStore();
        store1.setPrice("Back to the future 1",15);
        store1.setPrice("Back to the future 2",15);
        store1.setPrice("Back to the future 3",15);

        store1.setDiscount("Back to the future 1",0);
        store1.setDiscount("Back to the future 2",0);
        store1.setDiscount("Back to the future 3",0);

        String cart1 = "Back to the future 1\nBack to the future 2\nBack to the future 3";
        int prixTotal = store1.calculateTotal(cart1);
        assertEquals(36,prixTotal);
    }

    @Test
    // Puis, j'ai réalisé ce test de l'exmple 2 ça marche aussi
    public void testExample2() {
        DVDStore store2 = new DVDStore();
        store2.setPrice("Back to the Future 1", 15);
        store2.setPrice("Back to the Future 2", 15);
        store2.setPrice("Back to the Future 3", 15);
        store2.setDiscount("Back to the Future 1", 0);
        store2.setDiscount("Back to the Future 3", 20);

        String cart2 = "Back to the Future 1\nBack to the Future 3";
        int total = store2.calculateTotal(cart2);
        assertEquals(27, total);
    }

    @Test
    //J'ai commencé par ce test de l'exemple 3 => ça marche
    public void testExample3() {
        DVDStore store3 = new DVDStore();
        store3.setPrice("Back to the Future 1", 15);
        store3.setDiscount("Back to the Future 1", 0);

        String cart3 = "Back to the Future 1";
        int total = store3.calculateTotal(cart3);
        assertEquals(15, total);
    }

    @Test
    //Je l'ai réalisé en 4 ème lieu
    public void testExample4() {
        DVDStore store4 = new DVDStore();
        store4.setPrice("Back to the Future 1", 15);
        store4.setPrice("Back to the Future 2", 15);
        store4.setPrice("Back to the Future 3", 15);
        store4.setPrice("Back to the Future 2", 15);
        store4.setDiscount("Back to the Future 1", 0);
        store4.setDiscount("Back to the Future 2", 0);
        store4.setDiscount("Back to the Future 3", 0);
        store4.setDiscount("Back to the Future 2", 0);

        String cart4 = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3\nBack to the Future 2";
        int total = store4.calculateTotal(cart4);
        assertEquals(48, total);
    }

    @Test
    //finalement j'ai terminé avec ça
    public void testExample5() {
        DVDStore store5 = new DVDStore();
        store5.setPrice("Back to the Future 1", 15);
        store5.setPrice("Back to the Future 2", 15);
        store5.setPrice("Back to the Future 3", 15);
        store5.setPrice("La chèvre", 20);

        store5.setDiscount("Back to the Future 1", 20);
        store5.setDiscount("Back to the Future 2", 20);
        store5.setDiscount("Back to the Future 3", 20);
        store5.setDiscount("La chèvre", 0);

        String cart5 = "Back to the Future 1\nBack to the Future 2\nBack to the Future 3\nLa chèvre";
        int total = store5.calculateTotal(cart5);
        assertEquals(56, total);
    }


}
