package com.piotrgrochowiecki.introtojsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped
@Named("html5bean")
public class HTML5PageBean {

    private String dateIn;
    private String dateOut;

    public void transformDates() {
        dateOut = dateIn;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }
}
