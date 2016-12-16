package de.predic8.domain;

import javax.persistence.*;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"abbreviation"})})
@Entity
public class Speaker {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private String abbreviation;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
