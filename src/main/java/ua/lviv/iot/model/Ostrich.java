package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.AbleToMigrate;
import ua.lviv.iot.model.enums.Sex;

public class Ostrich extends AbstractBirds {

	private float legSpanInMeters;

	public float getLegSpanInMeters() {
		return legSpanInMeters;
	}

	public void setLegSpanInMeters(float legSpanInMeters) {
		this.legSpanInMeters = legSpanInMeters;
	}

	public Ostrich(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex,
			int lenghtInCentimeters, int widthInCentimeters, int heightInCentimeters, String family) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
	}

	public Ostrich(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex,
			int lenghtInCentimeters, int widthInCentimeters, int heightInCentimeters, String family,
			float legSpanInMeters) {
		super(ableToMigrate, weightInGrams, foodPerDayInGrams, sex, lenghtInCentimeters, widthInCentimeters,
				heightInCentimeters, family);
		this.legSpanInMeters = legSpanInMeters;
	}

	@Override
	public String getHeaders() {
		return super.getHeaders() + "legSpanInMeters, ";
	}
	
	@Override
	public String toCSV() {
		return super.toCSV() + ", " + getLegSpanInMeters();
	}
	
}