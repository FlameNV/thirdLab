package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ua.lviv.iot.manager.BirdsManagerUtils;
import ua.lviv.iot.model.enums.SortType;

public class BirdsManagerUtilsTest extends BaseBirdsManagerTest {

	@Test
	public void testSortByWeightInGrams() {
		BirdsManagerUtils.sortByWeightInGrams(swans, SortType.ASC);
		assertEquals(7000, swans.get(0).getWeightInGrams());
		assertEquals(5000, swans.get(1).getWeightInGrams());
		assertEquals(9000, swans.get(2).getWeightInGrams());
	}

	@Test
	public void testSortByFoodPerDayInGrams() {
		BirdsManagerUtils.sortByFoodPerDayInGrams(swans, SortType.DESC);
		assertEquals(500, swans.get(0).getWeightInGrams());
		assertEquals(390, swans.get(1).getWeightInGrams());
		assertEquals(650, swans.get(2).getWeightInGrams());
	}

}