package com.piotrgrochowiecki.introtojsf;

public class Dessert {

    private String name;
    private int id;

    public Dessert(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dessert)) return false;

        Dessert dessert = (Dessert) o;

        if (getId() != dessert.getId()) return false;
        return getName() != null ? getName().equals(dessert.getName()) : dessert.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getId();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
