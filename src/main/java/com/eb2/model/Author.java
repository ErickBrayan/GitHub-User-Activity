package com.eb2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Author {
    private String email;
    private String name;

    @JsonProperty("email")
    public String getEmail() { return email; }
    @JsonProperty("email")
    public void setEmail(String value) { this.email = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @Override
    public String toString() {
        return "Author{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
