package com.piotrgrochowiecki.introtojsf;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@ViewScoped
@Named("ajaxBean")
public class FocusedAjaxBean implements Serializable {

    private String theInputValue;

    public String getTheInputValue() {
        return theInputValue;
    }

    public void setTheInputValue(String theInputValue) {
        this.theInputValue = theInputValue;
    }
}
