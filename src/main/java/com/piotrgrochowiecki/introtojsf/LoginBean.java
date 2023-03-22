package com.piotrgrochowiecki.introtojsf;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;

import java.io.Serializable;

@SessionScoped
@Named("loginBean")
public class LoginBean implements Serializable {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        // Znajdź użytkownika po loginie w źródle danych,
            // jeśli jest taki użytkownik, porównaj hasło wprowadzane z tym w bazie,
            // jeśli nie ma, zwróć wiadomość o braku użytkownika lub rzuć wyjątek (mniej preferowane),
        // jeśli hasło się zgadza, dodaj użytkownika (id) oraz jego rolę do sesji
        if (username.equals("admin") && password.equals("password")) {
            FacesContext context = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
            session.setAttribute("role", "user");
            return "flashscope.xhtml?faces-redirect=true";
        } else {
            // If the login fails, display an error message
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Invalid username or password"));
            return null;
        }
    }

}
