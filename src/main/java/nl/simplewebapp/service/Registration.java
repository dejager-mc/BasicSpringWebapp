package nl.simplewebapp.service;

/**
 * Created by Machiel on 3-5-2015.
 */
public interface Registration {
    /**
     * Register user method
     * @param firstname
     * @param lastname
     * @param email
     */
    void registerUser(String firstname, String lastname, String email);
}
