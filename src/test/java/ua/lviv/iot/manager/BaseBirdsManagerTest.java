package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.model.AbstractBirds;
import ua.lviv.iot.model.Swan;
import ua.lviv.iot.model.enums.AbleToMigrate;
import ua.lviv.iot.model.enums.Sex;

public class BaseBirdsManagerTest {

	protected List<AbstractBirds> swans;

	@BeforeEach
	public void createSwans() {

		swans = new LinkedList<>();

		swans.add(new Swan(AbleToMigrate.YES, 7000, 500, Sex.MALE, 80, 30, 90, "Anatidae", (float) 0.50));
		swans.add(new Swan(AbleToMigrate.YES, 5000, 390, Sex.FEMALE, 70, 28, 80, "Anatidae", (float) 0.70));
		swans.add(new Swan(AbleToMigrate.YES, 9000, 650, Sex.MALE, 90, 39, 95, "Anatidae", (float) 0.90));
	}
}
