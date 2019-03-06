package com.szdhc.common.advice;

/**
 * 返回订制的json文档错误
 *
 * @author zouke
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerAdviceException extends ResponseEntityExceptionHandler {
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<?> handleException(HttpServletRequest request, Throwable e) {
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(new CustomErrorType(status.value(), e.getMessage()), status);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statutsCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statutsCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statutsCode);
    }
}
