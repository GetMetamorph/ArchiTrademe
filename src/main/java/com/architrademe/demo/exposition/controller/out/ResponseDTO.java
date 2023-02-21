package com.architrademe.demo.exposition.controller.out;

public class ResponseDTO<T> {
    private String message;
    private T data;
    private boolean success;

    public ResponseDTO(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setSuccess(boolean b) {
        this.success = b;
    }
}
