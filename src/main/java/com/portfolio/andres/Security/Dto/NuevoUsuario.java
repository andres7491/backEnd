/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.andres.Security.Dto;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author andre
 */
public class NuevoUsuario {
    private String nombre;
    private String nombreUSuario;
    private String email;
    private String password;
    private Set<String> roles=new HashSet<>();
    
    //Getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUSuario;
    }

    public void setNombreUsuario(String nombreUSuario) {
        this.nombreUSuario = nombreUSuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
    
    
}
