package com.csasc.common.enums;

/**
 *
 */
public enum ResultCode {
    //成功
    SUCCESS(200,"success"),
    //默认失败
    COMMON_FAILED(404,"failed! not found"),
    SERVER_ERROR(500,"failed! server error"),
    ;
    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public static String getMessageByCode(Integer code){
        for(ResultCode ele:values()){ //values会默认取出enum中的值对象列表，每个值都是一个ResultCode对象
            if(ele.getCode().equals(code)){
                return ele.getMessage();
            }
        }
        return null;
    }
}
