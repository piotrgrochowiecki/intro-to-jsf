package com.piotrgrochowiecki.introtojsf;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("sessionScopedBean")
@SessionScoped
public class SessionScopedBean implements Serializable {
}
