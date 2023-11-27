package com.ncu.theatre.entity;


import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long screeningId;

    private Long theatreId;
    private Long screenId;
    private String movieName;
    private Date screeningDate;
    private Time screeningTime;
    private int bookedTickets;
	public Long getScreeningId() {
		return screeningId;
	}
	public void setScreeningId(Long screeningId) {
		this.screeningId = screeningId;
	}
	public Long getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Long theatreId) {
		this.theatreId = theatreId;
	}
	public Long getScreenId() {
		return screenId;
	}
	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getScreeningDate() {
		return screeningDate;
	}
	public void setScreeningDate(Date screeningDate) {
		this.screeningDate = screeningDate;
	}
	public Time getScreeningTime() {
		return screeningTime;
	}
	public void setScreeningTime(Time screeningTime) {
		this.screeningTime = screeningTime;
	}
	public int getBookedTickets() {
		return bookedTickets;
	}
	public void setBookedTickets(int bookedTickets) {
		this.bookedTickets = bookedTickets;
	}
	
	 public Screening() {
	    }
	public Screening(Long screeningId, Long theatreId, Long screenId, String movieName, Date screeningDate,
			Time screeningTime, int bookedTickets) {
		super();
		this.screeningId = screeningId;
		this.theatreId = theatreId;
		this.screenId = screenId;
		this.movieName = movieName;
		this.screeningDate = screeningDate;
		this.screeningTime = screeningTime;
		this.bookedTickets = bookedTickets;
	}

}