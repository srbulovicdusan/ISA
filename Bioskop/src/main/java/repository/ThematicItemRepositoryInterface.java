package repository;

import java.util.Collection;

import domain.ThematicItem;

public interface ThematicItemRepositoryInterface {
	
		Collection<ThematicItem> getItems();
		ThematicItem getItem(Long id);
		ThematicItem createItem(ThematicItem item);
		ThematicItem changeItem(ThematicItem item);
		void deleteItem(Long id);
}
