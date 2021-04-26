package com.BeerProject.jwt.ressources;

import java.io.Serializable;

/**
 * Construit l'objet Token jwt avec le username et le password de l'user.  
 * Attention que les params utilisés dans le constructeur sont les mots 
 * à utiliser en json dans postman ou angular. 
 * @param username et password
 * @author Runolf
 *
 */
public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

    public JwtTokenRequest() {
        super();
    }
    
    public JwtTokenRequest(String username, String password) { // params = postman 
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

