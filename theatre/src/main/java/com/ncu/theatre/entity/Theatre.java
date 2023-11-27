package com.ncu.theatre.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Theatre {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theatreId;

    private String theatreName;
    private String theatreCity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "theatreId")
    private List<Screen> screens;

    public Theatre() {
    }
    public Theatre(Long theatreId, String theatreName, String theatreCity, List<Screen> screens,
			List<Screening> screenings) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.screens = screens;
		this.screenings = screenings;
	}

	public Long getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Long theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getTheatreCity() {
		return theatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}

	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	public List<Screening> getScreenings() {
		return screenings;
	}

	public void setScreenings(List<Screening> screenings) {
		this.screenings = screenings;
	}

	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "theatreId")
    private List<Screening> screenings;

}