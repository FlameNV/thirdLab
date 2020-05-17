package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.AbleToMigrate;
import ua.lviv.iot.model.enums.Sex;

public class Colibri extends AbstractBirds {

	private int wingFlapSpeedInSweepsPerSecond;

	public int getWingFlapSpeedInSweepsPerSecond() {
		return wingFlapSpeedInSweepsPerSecond;
	}

	public void setWingFlapSpeedInSweepsPerSecond(int wingFlapSpeedInSweepsPerSecond) {
		this.wingFlapSpeedInSweepsPerSecond = wingFlapSpeedInSweepsPerSecond;
	}

	public Colibri(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex,
			int lenghtInCentimeters, int widthInCentimeters, int heightInCentimeters, String family) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
	}

	public Colibri(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex,
			int lenghtInCentimeters, int widthInCentimeters, int heightInCentimeters, String family,
			int wingFlapSpeedInSweepsPerSecond) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
		this.wingFlapSpeedInSweepsPerSecond = wingFlapSpeedInSweepsPerSecond;
	}

}