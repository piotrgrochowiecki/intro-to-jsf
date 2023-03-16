package com.piotrgrochowiecki.introtojsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.ConverterException;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.lang.annotation.Annotation;

@FacesConverter(forClass = Dessert.class)
@Named("dessertConverter")
@RequestScoped
public class DessertConverter implements Converter {

    @Inject
    DessertLoaderDAO dessertDao;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s != null) {
            try {
                return (Dessert) dessertDao.findDessertByName(s);
            } catch (Exception ex) {
                throw new ConverterException(new FacesMessage(ex.getMessage()));
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o != null && o instanceof Dessert) {
            return ((Dessert)o).getName();
        }
        return null;
    }
}
