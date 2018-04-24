package service;

import java.util.Collection;

import domain.Projection;
import domain.User;

public interface ProjectionServiceInterface {
	Collection<Projection> getProjections();
	Projection addProjection(Projection projection);
	void deleteProjection(Projection projection);
	Projection getProjection(Long id);
}
