package ua.lviv.iot.writer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.manager.BaseBirdsManagerTest;
import ua.lviv.iot.model.AbstractBirds;

public class BirdsWriterTest extends BaseBirdsManagerTest {

	@Test
	public void testWriteToFile() {
		try (Writer csvWriter = new StringWriter()) {

			BirdsWriter writer = new BirdsWriter();
			writer.setCsvWriter(csvWriter);
			writer.writeToFile(swans);

			String expectedStr = "";
			for (AbstractBirds swan : swans) {
				expectedStr += swan.getHeaders() + swan.toCSV();
			}

			assertEquals(expectedStr, csvWriter.toString());
		} catch (Exception e) {
			fail("test failed");
		}
	}

}
