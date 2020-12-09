package cl.evilcorp.perritos2.data.model;

import java.util.List;
import java.util.Map;

public class BreedList {
    private String status;
    private Map<String, List<String>> message;

    public String getStatus() {
        return status;
    }

    public Map<String, List<String>> getMessage() {
        return message;
    }
}
