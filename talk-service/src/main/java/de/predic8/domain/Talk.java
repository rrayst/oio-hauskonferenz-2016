package de.predic8.domain;

import javax.persistence.*;
import java.util.*;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@Entity
public class Talk {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	@Temporal(TemporalType.DATE)
	private Date date;
	@ElementCollection
	private List<String> speakers = new ArrayList<>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getSpeakers() {
		return speakers;
	}

	public void setSpeakers(List<String> speakers) {
		this.speakers = speakers;
	}
}