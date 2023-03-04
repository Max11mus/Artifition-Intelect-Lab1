package ua.edu.knu.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import ua.edu.knu.modem.Modem;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileLoader {
    private ObjectMapper objectMapper = new ObjectMapper();

    public Modem loadModemFromFile(String path) throws URISyntaxException, IOException {
        String json = readFile(path);

        Modem modem;
        modem = objectMapper.readValue(json, Modem.class);
        return modem;
    }

    public String readFile(String path) throws URISyntaxException, IOException {
        URI uri = getClass().getResource(path).toURI();
        Path filePath = Path.of(uri);
        return String.join("", Files.readAllLines(filePath));
    }

}
