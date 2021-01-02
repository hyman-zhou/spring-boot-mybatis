package com.csasc.common.utils;

import com.csasc.common.entity.JsonResult;
import com.csasc.common.enums.ResultCode;

public class ResultTool {
    public static JsonResult success(){
        return new JsonResult(true);
    }
    public static <T> JsonResult<T> success(T data) {
        return new JsonResult<>(true,data);
    }
    public static JsonResult fail() {
        return new JsonResult(false);
    }
    public static JsonResult fail(ResultCode resultCode){
        return new JsonResult(false,resultCode);
    }
}
