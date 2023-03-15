package com.piotrgrochowiecki.introtojsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.logging.Logger;

@Named("welcomePageBean")
@RequestScoped
public class WelcomePageBean {

    private String welcomeUserName;
    private String completedGreeting;

    @Inject
    ViewScopedBean viewScopedBean;

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
        FacesMessage messageToQ = new FacesMessage(FacesMessage.SEVERITY_INFO, completedGreeting, "We're so happy to see you");
        FacesContext.getCurrentInstance().addMessage("inputTextBox", messageToQ);
    }

    public String navigateToFlashPage() {
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("transmittedVariable", viewScopedBean.getDogs().get(0));
        return "flashscope.xhtml?faces-redirect=true";
    }

    public void ajaxTriggered() {
        Logger.getAnonymousLogger().info("This is an ajax-triggered log statement");
    }

    public void alsoAjaxTriggered(AjaxBehaviorEvent abe) {

    }
}