package com.bn.jwt.users;

public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserRole (String role){
        this.role = role; //diferencia  variavel do construtor para o do metodo
    }

    public String getRole() {
        return role;
    }
}
