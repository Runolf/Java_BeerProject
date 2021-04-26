package com.BeerProject.jwt.ressources;

import java.io.Serializable;

/**
 * Contient le token en String construit précédemment.
 * @author Runolf
 *
 */
public class JwtTokenResponse implements Serializable {

  private static final long serialVersionUID = 8317676219297719109L;

  private final String token;

    public JwtTokenResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}