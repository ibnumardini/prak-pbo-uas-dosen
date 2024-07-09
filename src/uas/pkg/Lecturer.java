/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pkg;

import uas.pkg.blueprint.Human;

/**
 *
 * @author ibnumardini
 */
public class Lecturer extends Human {

    private final String nip;
    private final String major;

    public Lecturer(String nip, String name, String gender, String major) {
        super.name = name;
        super.gender = gender;

        this.nip = nip;
        this.major = major;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String getGender() {
        return super.gender;
    }

    public String getNip() {
        return this.nip;
    }

    public String getMajor() {
        return this.major;
    }
    
    public String getEtiquetteName() {
        String etiquette = "Mr.";

        if ("Perempuan".equals(this.getGender())) {
            etiquette = "Mrs.";
        }

        return String.format("%s %s", etiquette, super.name);
    }
}
