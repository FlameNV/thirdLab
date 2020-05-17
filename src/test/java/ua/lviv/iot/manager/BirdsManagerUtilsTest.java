package ua.lviv.iot.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ua.lviv.iot.manager.BirdsManagerUtils;
import ua.lviv.iot.model.enums.SortType;

public class BirdsManagerUtilsTest extends BaseBirdsManagerTest {

	@Test
	public void testSortByWeightInGrams() {
		BirdsManagerUtils.sortByWeightInGrams(swans, SortType.ASC);
		assertEquals(5000, swans.get(0).getWeightInGrams());
		assertEquals(7000, swans.get(1).getWeightInGrams());
		assertEquals(9000, swans.get(2).getWeightInGrams());
	}

	@Test
	public void testSortByFoodPerDayInGrams() {
		BirdsManagerUtils.sortByFoodPerDayInGrams(swans, SortType.DESC);
		assertEquals(650, swans.get(0).getFoodPerDayInGrams());
		assertEquals(500, swans.get(1).getFoodPerDayInGrams());
		assertEquals(390, swans.get(2).getFoodPerDayInGrams());
	}

	@Test
	public void testSortByWidth() {
		BirdsManagerUtils.sortByWidth(swans, SortType.ASC);
		assertEquals(28, swans.get(0).getWidthInCentimeters());
		assertEquals(30, swans.get(1).getWidthInCentimeters());
		assertEquals(39, swans.get(2).getWidthInCentimeters());
	}

	@Test
	public void testSortByHeight() {
		BirdsManagerUtils.sortByHeight(swans, SortType.DESC);
		assertEquals(95, swans.get(0).getHeightInCentimeters());
		assertEquals(90, swans.get(1).getHeightInCentimeters());
		assertEquals(80, swans.get(2).getHeightInCentimeters());
	}

}