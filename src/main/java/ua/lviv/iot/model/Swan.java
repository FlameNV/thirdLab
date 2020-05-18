package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.AbleToMigrate;
import ua.lviv.iot.model.enums.Sex;

public class Swan extends AbstractBirds {
	private float neckLenghtInMeters;

	public float getNeckLenghtInMeters() {
		return neckLenghtInMeters;
	}

	public void setNeckLenghtInMeters(float neckLenghtInMeters) {
		this.neckLenghtInMeters = neckLenghtInMeters;
	}

	public Swan(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex, int lenghtInCentimeters,
			int widthInCentimeters, int heightInCentimeters, String family) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
	}

	public Swan(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex, int lenghtInCentimeters,
			int widthInCentimeters, int heightInCentimeters, String family, float neckLenghtInMeters) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
		this.neckLenghtInMeters = neckLenghtInMeters;
	}

	@Override
	public String getHeaders() {
		return super.getHeaders() + "neckLenghtInMeters, ";
	}
	
	@Override
	public String toCSV() {
		return super.toCSV() + ", " + getNeckLenghtInMeters();
	}
	
}