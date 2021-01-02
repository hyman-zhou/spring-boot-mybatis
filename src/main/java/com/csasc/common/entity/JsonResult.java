package com.csasc.common.entity;

import com.csasc.common.enums.ResultCode;

import java.io.Serializable;

public class JsonResult<T> implements Serializable {
    private Boolean success;
    private Integer errorCode;
    private String errorMsg;
    private T data;

    public JsonResult() {
    }
    public JsonResult(Boolean success){
        this.success = success;
        this.errorCode = success ? ResultCode.SUCCESS.getCode() : ResultCode.COMMON_FAILED.getCode();
        this.errorMsg = success ? ResultCode.SUCCESS.getMessage() : ResultCode.COMMON_FAILED.getMessage();
    }
    public JsonResult(Boolean success,ResultCode resultCode){
        this.success = success;
        this.errorCode = success ? ResultCode.SUCCESS.getCode() : (resultCode == null ? ResultCode.COMMON_FAILED.getCode() : resultCode.getCode());
        this.errorMsg = success ? ResultCode.SUCCESS.getMessage() : (resultCode == null ? ResultCode.COMMON_FAILED.getMessage():resultCode.getMessage());
    }

    public JsonResult(Boolean success, T data) {
        this.success = success;
        this.errorCode = success ? ResultCode.SUCCESS.getCode() : ResultCode.COMMON_FAILED.getCode();
        this.errorMsg = success ? ResultCode.SUCCESS.getMessage() : ResultCode.COMMON_FAILED.getMessage();
        this.data = data;
    }
    public JsonResult(Boolean success,ResultCode resultCode,T data){
        this.success = success;
        this.errorCode = success ? ResultCode.SUCCESS.getCode() : (resultCode == null ? ResultCode.COMMON_FAILED.getCode() : resultCode.getCode());
        this.errorMsg = success ? ResultCode.SUCCESS.getMessage() : (resultCode == null ? ResultCode.COMMON_FAILED.getMessage():resultCode.getMessage());
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setData(T data) {
        this.data = data;
    }
}
