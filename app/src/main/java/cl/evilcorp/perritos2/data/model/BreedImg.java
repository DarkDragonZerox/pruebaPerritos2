package cl.evilcorp.perritos2.data.model;

import java.util.Map;

public class BreedImg {
    private String status;
    private Map<String, String> message;


    public String getStatus() {
        return status;
    }

    public Map<String, String> getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "BreedImg{" +
                "status='" + status + '\'' +
                ", message=" + message +
                '}';
    }
}
