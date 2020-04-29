package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.AbleToMigrate;
import ua.lviv.iot.model.enums.Sex;

public class Parrot extends AbstractBirds {

	private boolean canSpeak;

	public boolean isCanSpeak() {
		return canSpeak;
	}

	public void setCanSpeak(boolean canSpeak) {
		this.canSpeak = canSpeak;
	}

	public Parrot(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex,
			int lenghtInCentimeters, int widthInCentimeters, int heightInCentimeters, String family) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
	}

	public Parrot(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex,
			int lenghtInCentimeters, int widthInCentimeters, int heightInCentimeters, String family, boolean canSpeak) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
		this.canSpeak = canSpeak;
	}

}