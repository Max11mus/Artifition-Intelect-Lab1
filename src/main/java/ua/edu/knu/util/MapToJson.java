package ua.edu.knu.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

    public class MapToJson {
        private ObjectMapper objectMapper = new ObjectMapper();

        public String toString(Map<?,?> map) throws JsonProcessingException {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
        }
    }
