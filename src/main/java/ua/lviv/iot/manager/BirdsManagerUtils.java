package ua.lviv.iot.manager;

import java.util.List;
import java.util.Comparator;

import ua.lviv.iot.model.AbstractBirds;
import ua.lviv.iot.model.enums.SortType;

public class BirdsManagerUtils {

	public static final SortByWeight SORT_BY_WEIGHT = new SortByWeight();

	public static void sortByWeightInGrams(List<AbstractBirds> birds, SortType sortType) {
		birds.sort(sortType == SortType.ASC ? SORT_BY_WEIGHT : SORT_BY_WEIGHT.reversed());
	}

	public static void sortByFoodPerDayInGrams(List<AbstractBirds> birds, SortType sortType) {

		BirdsManagerUtils utils = new BirdsManagerUtils();
		birds.sort(sortType == SortType.ASC ? utils.new SortByFoodPerDay() : utils.new SortByFoodPerDay().reversed());
	}

	public static void sortByWidth(List<AbstractBirds> birds, SortType sortType) {
		Comparator<AbstractBirds> comparator = new Comparator<AbstractBirds>() {
			@Override
			public int compare(AbstractBirds firstBird, AbstractBirds secondBird) {
				return firstBird.getWidthInCentimeters() - secondBird.getWidthInCentimeters();
			}
		};
		birds.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
	}

	public static void sortByHeight(List<AbstractBirds> birds, SortType sortType) {
		Comparator<AbstractBirds> comparator = (firstBird, secondBird) -> firstBird.getHeightInCentimeters()
				- secondBird.getHeightInCentimeters();
		birds.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
	}

	private static class SortByWeight implements Comparator<AbstractBirds> {
		@Override
		public int compare(AbstractBirds firstSwan, AbstractBirds secondSwan) {
			return firstSwan.getWeightInGrams() - (secondSwan.getWeightInGrams());
		}
	}

	private class SortByFoodPerDay implements Comparator<AbstractBirds> {
		@Override
		public int compare(AbstractBirds firstSwan, AbstractBirds secondSwan) {
			return firstSwan.getFoodPerDayInGrams() - secondSwan.getFoodPerDayInGrams();
		}
	}

}
