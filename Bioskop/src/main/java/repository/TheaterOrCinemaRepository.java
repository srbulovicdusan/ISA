package repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import domain.Adresa;
import domain.TheaterOrCinema;

@Repository
public class TheaterOrCinemaRepository implements TheaterOrCinemaRepositoryInterface{

	private Collection<TheaterOrCinema> cinemas = new ArrayList<TheaterOrCinema>();
	
	@Override
	public Collection<TheaterOrCinema> getTheaterOrCinemas() {
		Adresa adresa = new Adresa("City", "Street", "021 49 49 49");
		TheaterOrCinema c1 = new TheaterOrCinema("Name1",adresa, "Description1..................", true);
		TheaterOrCinema c2 = new TheaterOrCinema("Name2",adresa, "Description2..................", true);
		TheaterOrCinema c3 = new TheaterOrCinema("Name3",adresa, "Description3..................", false);
		TheaterOrCinema c4 = new TheaterOrCinema("Name4",adresa, "Description4..................", true);
		cinemas.add(c1);
		cinemas.add(c2);
		cinemas.add(c3);
		cinemas.add(c4);
		return cinemas;
	}

	@Override
	public TheaterOrCinema addTheaterOrCinema(TheaterOrCinema tc) {
		cinemas.add(tc);
		return tc;
	}

	@Override
	public void deleteTheaterOrCinema(TheaterOrCinema tc) {
		cinemas.remove(tc);
	}

	@Override
	public TheaterOrCinema getTheaterOrCinema(Long id) {

		for (TheaterOrCinema tc : cinemas){
			if (tc.getId() == id){
				return tc;
			}
		}
		return null;
	}

}
