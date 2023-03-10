package com.piotrgrochowiecki.introtojsf;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("viewScopedBean")
@ViewScoped
public class ViewScopedBean implements Serializable {
}
