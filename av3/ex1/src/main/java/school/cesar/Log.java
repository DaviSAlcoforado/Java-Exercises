package school.cesar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Log {
    private FileOutputStream outputStream;
    public static final Log INSTANCE = new Log();

	public static Log getInstance() {
		return INSTANCE;
	}

    private Log() {
        try {
            this.outputStream = new FileOutputStream("arquivo.log");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        try {
            outputStream.write((message + "\n").getBytes());
            outputStream.flush();
        } catch (IOException e) {
        }
    }
}
