package com.tisem.response;

public class CounterResponse {
    private String messageText;
    private Boolean success;

    public CounterResponse(Boolean success) {
        this.success = success;
    }

    public CounterResponse() {
    }

    public CounterResponse(Boolean success, String messageText) {
        this.success = success;
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public static CounterResponse success() {
        return new CounterResponse(true);
    }

    public static CounterResponse fail(String message) {
        return new CounterResponse(false, message);
    }

}