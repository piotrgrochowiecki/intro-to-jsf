package com.piotrgrochowiecki.introtojsf;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.servlet.http.Part;


import java.io.Serializable;
import java.util.logging.Logger;

@ViewScoped
@Named("fileUploadBean")
public class FileUploadPageBean implements Serializable {

    Part uploadedFile;

    public Part getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(Part uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public void uploadFile() {
        Logger.getAnonymousLogger().info("Uploaded file mimetype " + uploadedFile.getContentType());
    }
}
