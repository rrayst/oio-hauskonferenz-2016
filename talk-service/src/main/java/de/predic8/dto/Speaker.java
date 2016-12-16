package de.predic8.dto;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
public class Speaker {
	private String firstname;
	private String lastname;

    public Speaker() {
    }

	public Speaker(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

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
}