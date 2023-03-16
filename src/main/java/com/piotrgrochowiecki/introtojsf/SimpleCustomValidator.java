package com.piotrgrochowiecki.introtojsf;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

import java.util.regex.Pattern;

@FacesValidator("selectValidator")
public class SimpleCustomValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        boolean foundSelect = Pattern.compile(Pattern.quote("select"), Pattern.CASE_INSENSITIVE).matcher(o.toString()).find();
        if (foundSelect) {
            throw new ValidatorException(new FacesMessage("Validation error: we found word SELECT"));
        }
    }
}
