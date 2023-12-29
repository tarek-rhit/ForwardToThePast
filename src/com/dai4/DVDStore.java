package com.dai4;
import java.util.*;

public class DVDStore {

    //Les attributs
    private Map<String, Integer> prices;
    private Map<String, Integer> discounts;

    //Le constructeur
    public DVDStore() {
        prices = new HashMap<>();
        discounts = new HashMap<>();
    }


    public void setPrice(String movie, int price) {
        prices.put(movie, price);
    }

    public void setDiscount(String movie, int discount) {
        discounts.put(movie, discount);
    }


    //La méthode de calcul de prix final aprés réduction
    public int calculateTotal(String cart) {
        String[] cartItems = cart.split("\n");
        Map<String, Integer> movieCount = new HashMap<>();

        for (String item : cartItems) {
            String movie = item.trim();
            movieCount.put(item, movieCount.getOrDefault(item, 0) + 1);
        }

        int prixTotal = 0;
        int distinctMovies = movieCount.size();


        for (String movie : movieCount.keySet()) {
            int count = movieCount.get(movie);
            int discount = 0;
            int price = 0;
            if (prices.containsKey(movie)) {
                price = prices.get(movie);
                discount = discounts.getOrDefault(movie, 0);
                prixTotal += (price * count) * (100 - discount) / 100;

            } else {
                prixTotal = ((price * count) * (100 - discount) / 100) + 20;
            }

        }

        if (distinctMovies >= 2) {
            prixTotal = (int) (prixTotal * (1.0 - getDiscount(distinctMovies)));
        }

        return prixTotal;
    }

    private double getDiscount(int distinctMovies) {
        if(distinctMovies == 2) {
            //10% de réduction pour 2 différents films
            return 0.1;
        }else if (distinctMovies == 3) {
            //20% de réduction pour 3 différents films
            return 0.2;
        }
        return 0.0;
    }
}


