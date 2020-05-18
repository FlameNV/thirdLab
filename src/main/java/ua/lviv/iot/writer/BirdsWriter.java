package ua.lviv.iot.writer;

import ua.lviv.iot.model.AbstractBirds;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class BirdsWriter {

	private Writer csvWriter;

    public void setCsvWriter(Writer csvWriter){
        this.csvWriter = csvWriter;
    }

    public void writeToFile(List<AbstractBirds> birds) throws IOException{
        for (AbstractBirds bird : birds){
            String textWriter = bird.getHeaders() + ", " + bird.toCSV() + "\r\n";
            csvWriter.write(textWriter);
        }

    }

    public String stringWriter(){
        return csvWriter.toString();
    }
}
