package nl.simplewebapp.service.impl;

import nl.simplewebapp.service.Registration;
import org.springframework.stereotype.Service;

/**
 * Created by Machiel on 3-5-2015.
 */
@Service
public class RegistrationImpl implements Registration {
    public void registerUser(String firstname, String lastname, String email) {
        // Output some info
        System.out.println("RegistrationBoImpl:: Registering user " + firstname + " " + lastname + ", with email " + email);

        // TODO: Contact your database here
        // ...

    }
}