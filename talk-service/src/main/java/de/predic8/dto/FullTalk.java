package de.predic8.dto;

import java.util.Date;
import java.util.List;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
public class FullTalk {
	private String title;
	private Date date;
	private List<Speaker> speakers;

	public FullTalk(String title, Date date, List<Speaker> speakers) {
		this.title = title;
		this.date = date;
		this.speakers = speakers;
	}

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

	public List<Speaker> getSpeakers() {
		return speakers;
	}

	public void setSpeakers(List<Speaker> speakers) {
		this.speakers = speakers;
	}
}