package org.example.exception;


import org.example.constant.ErrorCode;

public class UnknownException extends Exception{
    public UnknownException(String reason) {
        super(String.format("[%s] %s: %s", ErrorCode.E000.getCode(), ErrorCode.E000.getErrMsg(), reason));
    }
}