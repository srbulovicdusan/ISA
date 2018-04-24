package repository;

import java.util.Collection;

import domain.Projection;
import domain.ThematicItem;
import domain.User;

public interface ProjectionInterface {
	Collection<Projection> getProjections();
	Projection addProjection(Projection projection);
	void deleteProjection(Projection projection);
	Projection getProjection(Long id);
	
}
