package com.spring.hexagonal.infrastructure.adapter.exception;

import java.time.LocalDateTime;
import java.util.List;

public class ExceptionResponse {

    private LocalDateTime date;

    private String message;

    private List<String> details;

    public ExceptionResponse() {
    }

    public ExceptionResponse(LocalDateTime date, String message, List<String> details) {
        this.date = date;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }
}
