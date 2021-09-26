package tr.com.utku.airlines.controller.response.common;

import lombok.Data;
import tr.com.utku.airlines.controller.dto.common.ErrorDTO;

import java.util.List;

@Data
public class BaseResponse {

    public BaseResponse() {
        this.result = ResultCode.SUCCESS_CODE;
        this.resultMessage = "Başarılı";
    }

    private String result;
    private String resultMessage;
    private List<ErrorDTO> errorList;

    public void setErrorList(List<ErrorDTO> errorList) {
        this.errorList = errorList;
        this.result = ResultCode.ERROR_CODE;
        this.resultMessage = "Hatalı";
    }

    static class ResultCode {
        private static String SUCCESS_CODE = "1";
        private static String ERROR_CODE = "0";
    }

}
