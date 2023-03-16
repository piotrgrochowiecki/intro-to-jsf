package com.piotrgrochowiecki.introtojsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.Date;

@RequestScoped
@Named("html5bean")
public class HTML5PageBean {

    private String dateIn;
    private Date dateObjectIn;
    private Date dateOnjectOut;

    public Date getDateOnjectOut() {
        return dateOnjectOut;
    }

    public void setDateOnjectOut(Date dateOnjectOut) {
        this.dateOnjectOut = dateOnjectOut;
    }

    private String dateOut;

    public Date getDateObjectIn() {
        return dateObjectIn;
    }

    public void setDateObjectIn(Date dateObjectIn) {
        this.dateObjectIn = dateObjectIn;
    }

    public void transformDates() {
        dateOnjectOut = dateObjectIn;
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
