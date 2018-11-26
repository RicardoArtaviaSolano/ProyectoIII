package ConsumirREST;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Serializador {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Method to deserialize a json of the holder class
     * @param json string with the json to deserialize
     * @return the instance of the holder class
     * @throws IOException in case of an error
     */
    public static TemporalHolder deserializeHolder(String json) throws IOException {
        return objectMapper.readValue(json, TemporalHolder.class);
    }

    public static String serializeDriver(Driver driver) throws JsonProcessingException {
        return objectMapper.writeValueAsString(driver);
    }

    public static Driver deserializeDriver(String json) throws IOException {
        return objectMapper.readValue(json, Driver.class);
    }

    public static String serializeRider(Rider rider) throws JsonProcessingException {
        return objectMapper.writeValueAsString(rider);
    }

    public static Rider deserializeRider(String json) throws IOException {
        return objectMapper.readValue(json, Rider.class);
    }

    public static String serializeRoute(SubRoute subRoute) throws JsonProcessingException {
        return objectMapper.writeValueAsString(subRoute);
    }

    public static SubRoute deserializeRoute(String json) throws IOException {
        return objectMapper.readValue(json, SubRoute.class);
    }
}
