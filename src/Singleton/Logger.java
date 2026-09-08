package Singleton;


import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;

    private FileWriter writer;

    private Logger() {
        try {
            writer = new FileWriter("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void write(String message) {
        try {
            writer.write(message + System.lineSeparator());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setFileName(String fileName) {
        try {
            if (writer != null) {
                writer.close();
            }

            writer = new FileWriter(fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}