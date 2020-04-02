/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.restuser.web.dto;

import java.io.Serializable;

/**
 *
 * @author Alejo
 */

public class UserDto implements Serializable {
    

  
    private Long id;
    private String userName;
    private String password;
    private String name;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
      public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
