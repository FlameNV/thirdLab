package ua.lviv.iot.writer;

import ua.lviv.iot.model.AbstractBirds;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class BirdsWriter {

	private Writer csvWriter = new StringWriter();

	public void setCsvWriter(Writer csvWriter) {
		this.csvWriter = csvWriter;
	}

	public void writeToFile(List<AbstractBirds> birds) throws IOException {
		for (AbstractBirds bird : birds) {
			csvWriter.write(bird.getHeaders());
			csvWriter.write(bird.toCSV());
		}
	}
}
