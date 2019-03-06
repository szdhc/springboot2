package com.szdhc.common.advice;

/**
 * @author zouke
 */
public class CustomErrorType {
    /**
     * 状态码
     */
    private int status;
    /**
     * 错误信息
     */
    private String message;

    public CustomErrorType(int status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
