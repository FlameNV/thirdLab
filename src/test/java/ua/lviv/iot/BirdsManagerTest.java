package ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.manager.BirdsManager;
import ua.lviv.iot.model.AbstractBirds;
import ua.lviv.iot.model.enums.AbleToMigrate;

class BirdsManagerTest extends BaseBirdsManagerTest {

	private BirdsManager birdsManager;
	List<AbstractBirds> foundSwans;

	@BeforeEach
	public void setUp() {
		birdsManager = new BirdsManager();
		birdsManager.setBirds(swans);
	}

	@Test
	public void testFindByAbleToMigrate() {
		foundSwans = birdsManager.findByAbleToMigrate(AbleToMigrate.YES);

		assertEquals(1, foundSwans.size());
	}
}
