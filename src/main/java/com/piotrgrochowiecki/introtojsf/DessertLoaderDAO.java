package com.piotrgrochowiecki.introtojsf;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.LinkedList;
import java.util.List;

@ApplicationScoped
@Named("dessertDao")
public class DessertLoaderDAO {

    private List<Dessert> desserts;

    @PostConstruct
    public void loadDesserts() {
        Dessert iceCream = new Dessert("Ice Cream", 10001);
        Dessert fudgeSundae = new Dessert("Fudge Sundae", 10002);
        Dessert kheer = new Dessert("Kheer", 10003);
        Dessert applePie = new Dessert("Apple Pie", 10004);
        Dessert candiedApple = new Dessert("Candied Apple", 10005);

        desserts = new LinkedList<>();

        desserts.add(kheer);
        desserts.add(iceCream);
        desserts.add(applePie);
        desserts.add(candiedApple);
        desserts.add(fudgeSundae);
    }

    public List<Dessert> getDesserts() {
        return desserts;
    }

    public void setDesserts(List<Dessert> desserts) {
        this.desserts = desserts;
    }

    public Dessert findDessertById(int id) {
        for (Dessert dessert : desserts) {
            if (dessert.getId() == id) {
                return dessert;
            }
        }
        return null;
    }

    public Dessert findDessertByName(String name) {
        for (Dessert dessert : desserts) {
            if (dessert.getName().equals(name)) {
                return dessert;
            }
        }
        return null;
    }
}
