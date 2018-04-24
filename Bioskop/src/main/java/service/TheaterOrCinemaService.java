package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.TheaterOrCinema;
import repository.TheaterOrCinemaRepository;
@Service
public class TheaterOrCinemaService implements TheaterOrCinemaServiceInterface{

	@Autowired
	TheaterOrCinemaRepository repository;
	
	@Override
	public Collection<TheaterOrCinema> getTheaterOrCinemas() {
		return repository.getTheaterOrCinemas();
	}

	@Override
	public TheaterOrCinema addTheaterOrCinema(TheaterOrCinema tc) {
		return repository.addTheaterOrCinema(tc);
	}

	@Override
	public void deleteTheaterOrCinema(TheaterOrCinema tc) {
		repository.deleteTheaterOrCinema(tc);
	}

	@Override
	public TheaterOrCinema getTheaterOrCinema(Long id) {
		return repository.getTheaterOrCinema(id);
	}

}
