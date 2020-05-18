package ua.lviv.iot.model;

import ua.lviv.iot.model.enums.AbleToMigrate;
import ua.lviv.iot.model.enums.Sex;

public abstract class AbstractBirds {

	private AbleToMigrate ableToMigrate;
	private int weightInGrams;
	private int foodPerDayInGrams;
	private Sex sex;
	private int lenghtInCentimeters;
	private int widthInCentimeters;
	private int heightInCentimeters;
	private String family;

	public AbstractBirds(AbleToMigrate ableToMigrate, int weightInGrams, int foodPerDayInGrams, Sex sex,
			int lenghtInCentimeters, int widthInCentimeters, int heightInCentimeters, String family) {
		super();
		this.ableToMigrate = ableToMigrate;
		this.weightInGrams = weightInGrams;
		this.foodPerDayInGrams = foodPerDayInGrams;
		this.sex = sex;
		this.lenghtInCentimeters = lenghtInCentimeters;
		this.widthInCentimeters = widthInCentimeters;
		this.heightInCentimeters = heightInCentimeters;
		this.family = family;
	}

	public AbleToMigrate getAbleToMigrate() {
		return ableToMigrate;
	}

	public void setAbleToMigrate(AbleToMigrate ableToMigrate) {
		this.ableToMigrate = ableToMigrate;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public int getFoodPerDayInGrams() {
		return foodPerDayInGrams;
	}

	public void setFoodPerDayInGrams(int foodPerDayInGrams) {
		this.foodPerDayInGrams = foodPerDayInGrams;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public int getLenghtInCentimeters() {
		return lenghtInCentimeters;
	}

	public void setLenghtInCentimeters(int lenghtInCentimeters) {
		this.lenghtInCentimeters = lenghtInCentimeters;
	}

	public int getWidthInCentimeters() {
		return widthInCentimeters;
	}

	public void setWidthInCentimeters(int widthInCentimeters) {
		this.widthInCentimeters = widthInCentimeters;
	}

	public int getHeightInCentimeters() {
		return heightInCentimeters;
	}

	public void setHeightInCentimeters(int heightInCentimeters) {
		this.heightInCentimeters = heightInCentimeters;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getHeaders() {
		return "ableToMigrate, weightInGrams, foodPerDayInGrams, " +
				"sex, lenghtInCentimeters, widthInCentimeters, " +
				"heightInCentimeters, family";}
	
	public String toCSV() {
		return getAbleToMigrate() + ", "
				+ getWeightInGrams() + ", "
				+ getFoodPerDayInGrams() + ", "
				+ getSex() + ", "
				+ getLenghtInCentimeters() + ", "
				+ getWidthInCentimeters() + ", "
				+ getHeightInCentimeters() + ", "
				+ getFamily() + ", ";
		}
}