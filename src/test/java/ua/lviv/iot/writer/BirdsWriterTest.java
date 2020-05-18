package ua.lviv.iot.writer;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.manager.BaseBirdsManagerTest;
import ua.lviv.iot.model.AbstractBirds;

public class BirdsWriterTest extends BaseBirdsManagerTest {

	@Test
    public void testWriter(){
        try(Writer file = new FileWriter("Birds.csv")){
            BirdsWriter writer = new BirdsWriter();
            writer.setCsvWriter(file);
            writer.writeToFile(swans);
        }catch (Exception n) {
            fail("*****The testWriter FAILED******");
        }
    }

    @Test
    public void testFormating(){
        try(Writer csvWriter = new StringWriter()){
            BirdsWriter writer = new BirdsWriter();
            writer.setCsvWriter(csvWriter);
            writer.writeToFile(swans);
            String textWriter = "";

            for (AbstractBirds bird : swans) {
                textWriter += bird.getHeaders() + ", " + bird.toCSV() + "\r\n";

            }
            Assertions.assertEquals(textWriter, writer.stringWriter());
        }
        catch (Exception n){
            fail("****The testFormating FAILED****");
        }
    }

}
