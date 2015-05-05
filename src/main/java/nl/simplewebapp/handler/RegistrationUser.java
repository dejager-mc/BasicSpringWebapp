package nl.simplewebapp.handler;

import nl.simplewebapp.service.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

/**
 * Created by Machiel on 3-5-2015. okok
 */
@Component
@ManagedBean
@SessionScoped
public class RegistrationUser implements Serializable{

    @Autowired
    Registration registration;

    private String firstname;
    private String lastname;
    private String email;

    /**
     * Method registers user
     */
    public void register() {
        // Output some info
        System.out.println("RegistrationUserBean:: Registering user " + firstname + " " + lastname + ", with email " + email);

        // Call the business object to register the user
        registration.registerUser(firstname, lastname, email);

        // Set the message here
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registration success", "success");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    // Set the registration attribute used by Spring
    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
