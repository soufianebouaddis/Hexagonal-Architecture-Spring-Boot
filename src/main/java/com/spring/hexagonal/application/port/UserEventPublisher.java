package com.spring.hexagonal.application.port;

import com.spring.hexagonal.domain.event.UserCreatedEvent;

public interface UserEventPublisher {
    void publishUserCreatedEvent(UserCreatedEvent event);
}
