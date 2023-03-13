package com.piotrgrochowiecki.introtojsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.List;

@RequestScoped
@Named("componentListing")
public class InputComponentPageBean {

    private String password1;
    private int selectOneRadioSelection;
    private int selectOneMenuSelection;
    private int selectListBoxSelection;
    private int selectOneMenu;
    private Dessert radioButtonDessert;
    private Dessert listBoxDessert;
    private List<Dessert> selectManyDesserts;

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public int getSelectOneRadioSelection() {
        return selectOneRadioSelection;
    }

    public void setSelectOneRadioSelection(int selectOneRadioSelection) {
        this.selectOneRadioSelection = selectOneRadioSelection;
    }

    public int getSelectOneMenuSelection() {
        return selectOneMenuSelection;
    }

    public void setSelectOneMenuSelection(int selectOneMenuSelection) {
        this.selectOneMenuSelection = selectOneMenuSelection;
    }

    public int getSelectListBoxSelection() {
        return selectListBoxSelection;
    }

    public void setSelectListBoxSelection(int selectListBoxSelection) {
        this.selectListBoxSelection = selectListBoxSelection;
    }

    public int getSelectOneMenu() {
        return selectOneMenu;
    }

    public void setSelectOneMenu(int selectOneMenu) {
        this.selectOneMenu = selectOneMenu;
    }

    public Dessert getRadioButtonDessert() {
        return radioButtonDessert;
    }

    public void setRadioButtonDessert(Dessert radioButtonDessert) {
        this.radioButtonDessert = radioButtonDessert;
    }

    public Dessert getListBoxDessert() {
        return listBoxDessert;
    }

    public void setListBoxDessert(Dessert listBoxDessert) {
        this.listBoxDessert = listBoxDessert;
    }

    public List<Dessert> getSelectManyDesserts() {
        return selectManyDesserts;
    }

    public void setSelectManyDesserts(List<Dessert> selectManyDesserts) {
        this.selectManyDesserts = selectManyDesserts;
    }
}
