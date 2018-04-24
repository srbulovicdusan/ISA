package service;

import java.util.Collection;

import domain.TheaterOrCinema;

public interface TheaterOrCinemaServiceInterface {
	Collection<TheaterOrCinema> getTheaterOrCinemas();
	TheaterOrCinema addTheaterOrCinema(TheaterOrCinema tc);
	void deleteTheaterOrCinema(TheaterOrCinema tc);
	TheaterOrCinema getTheaterOrCinema(Long id);
}
