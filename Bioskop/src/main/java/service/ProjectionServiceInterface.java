package service;

import java.util.Collection;

import domain.Projection;

public interface ProjectionServiceInterface {
	Collection<Projection> getProjections();
	Projection addProjection(Projection projection);
	void deleteProjection(Projection projection);
	Projection getProjection(Long id);
}
