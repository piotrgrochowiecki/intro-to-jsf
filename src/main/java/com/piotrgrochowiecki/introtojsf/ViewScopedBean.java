package com.piotrgrochowiecki.introtojsf;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("viewScopedBean")
@ViewScoped
public class ViewScopedBean implements Serializable {

    List<String> dogs;

    @PostConstruct
    public void initDogs() {
        dogs = new ArrayList<>();
        dogs.add("corgi");
        dogs.add("retriever");
    }

    @PreDestroy
    public void cleanUp() {
        dogs = null;
    }

    public void getSession() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.invalidate();
    }

    public List<String> getDogs() {
        return dogs;
    }

    public void setDogs(List<String> dogs) {
        this.dogs = dogs;
    }
}
