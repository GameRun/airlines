package tr.com.utku.airlines.services.exception;

import lombok.Getter;

@Getter
public class AirlinesBusinessException extends RuntimeException {

    private String key;

    public AirlinesBusinessException(String key) {
        this.key = key;
    }
}
