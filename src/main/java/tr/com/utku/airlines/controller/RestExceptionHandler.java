package tr.com.utku.airlines.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import tr.com.utku.airlines.controller.dto.common.ErrorDTO;
import tr.com.utku.airlines.controller.response.common.BaseResponse;
import tr.com.utku.airlines.services.exception.AirlinesBusinessException;

import java.util.Arrays;
import java.util.stream.Collectors;
@Slf4j
@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        BaseResponse response = new BaseResponse();
        response.setErrorList(ex.getBindingResult().getFieldErrors().stream().map(fieldError -> new ErrorDTO(fieldError.getField(), fieldError.getDefaultMessage())).collect(Collectors.toList()));
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AirlinesBusinessException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public BaseResponse handleException(AirlinesBusinessException e) {
        log.error("ERROR", e);
        BaseResponse response = new BaseResponse();
        response.setErrorList(Arrays.asList(new ErrorDTO(e.getKey(), "")));
        return response;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public BaseResponse handleException(Exception e) {
        log.error("ERROR", e);
        BaseResponse response = new BaseResponse();
        response.setErrorList(Arrays.asList(new ErrorDTO("e.getKey()", "")));
        return response;
    }



}
