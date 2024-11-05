package com.spring.hexagonal.domain.event;

import java.time.LocalDateTime;

public class UserCreatedEvent {
    private Long id;

    private LocalDateTime date;

    public UserCreatedEvent(Long id) {
        this.id = id;
        this.date = LocalDateTime.now();
    }

    public UserCreatedEvent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
