package com.ncu.theatre.entity;

import jakarta.persistence.*;

@Entity
public class Screen {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long screenId;

    private Long theatreId;
    private int seatsNumber;
	public Long getScreenId() {
		return screenId;
	}
	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}
	public Long getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Long theatreId) {
		this.theatreId = theatreId;
	}
	public int getSeatsNumber() {
		return seatsNumber;
	}
	public void setSeatsNumber(int seatsNumber) {
		this.seatsNumber = seatsNumber;
	}
	
	 public Screen() {
	    }
	public Screen(Long screenId, Long theatreId, int seatsNumber) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.seatsNumber = seatsNumber;
	}

}