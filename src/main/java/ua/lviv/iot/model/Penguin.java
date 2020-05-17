package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.AbleToMigrate;
import ua.lviv.iot.model.enums.Sex;

public class Penguin extends AbstractBirds {

	private int submarineSpeedInMetersPerSecond;

	public int getSubmarineSpeedInMetersPerSecond() {
		return submarineSpeedInMetersPerSecond;
	}

	public void setSubmarineSpeedInMetersPerSecond(int submarineSpeedInMetersPerSecond) {
		this.submarineSpeedInMetersPerSecond = submarineSpeedInMetersPerSecond;
	}

	public Penguin(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex,
			int lenghtInCentimeters, int widthInCentimeters, int heightInCentimeters, String family) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
	}

	public Penguin(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex,
			int lenghtInCentimeters, int widthInCentimeters, int heightInCentimeters, String family,
			int submarineSpeedInMetersPerSecond) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
		this.submarineSpeedInMetersPerSecond = submarineSpeedInMetersPerSecond;
	}

}