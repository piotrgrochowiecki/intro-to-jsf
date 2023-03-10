package com.piotrgrochowiecki.introtojsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@Named("welcomePageBean")
@RequestScoped
public class WelcomePageBean {

    private String welcomeUserName;
    private String completedGreeting;

    public String getWelcomeUserName() {
        return welcomeUserName;
    }

    public void setWelcomeUserName(String welcomeUserName) {
        this.welcomeUserName = welcomeUserName;
    }

    public String getCompletedGreeting() {
        return completedGreeting;
    }

    public void setCompletedGreeting(String completedGreeting) {
        this.completedGreeting = completedGreeting;
    }

    public void sayHello() {
        completedGreeting = "Hello, " + welcomeUserName;
    }

    public String navigateToFlashPage() {
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("transmittedVariable", "Piotr sent this");
        return "flashscope.xhtml?faces-redirect=true";
    }
}