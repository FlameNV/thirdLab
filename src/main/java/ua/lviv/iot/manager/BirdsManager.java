package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.model.AbstractBirds;
import ua.lviv.iot.model.enums.AbleToMigrate;

public class BirdsManager {

	private List<AbstractBirds> birds;
	
	public List<AbstractBirds> findByAbleToMigrate(AbleToMigrate ableToMigrate) {
		List<AbstractBirds> swans = new LinkedList<>();

		for (AbstractBirds bird : birds) {
			if (bird.getAbleToMigrate() == ableToMigrate) {
				swans.add(bird);
			}
		}
		return swans;
	}
	
	public void setBirds(List<AbstractBirds> birds) {
		this.birds = birds;
	}
}