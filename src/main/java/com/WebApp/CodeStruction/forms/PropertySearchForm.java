package com.WebApp.CodeStruction.forms;

public class PropertySearchForm {

    String pin;
    String owner;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public PropertySearchForm() {
    }

    public PropertySearchForm(String pin, String owner) {
        this.pin = pin;
        this.owner = owner;
    }
}
