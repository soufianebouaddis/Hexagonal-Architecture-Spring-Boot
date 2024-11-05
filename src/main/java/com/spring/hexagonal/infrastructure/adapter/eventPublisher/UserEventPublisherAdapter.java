package com.spring.hexagonal.infrastructure.adapter.eventPublisher;

import com.spring.hexagonal.application.port.UserEventPublisher;
import com.spring.hexagonal.domain.event.UserCreatedEvent;
import org.springframework.context.ApplicationEventPublisher;



public class UserEventPublisherAdapter implements UserEventPublisher{

    private final ApplicationEventPublisher applicationEventPublisher;

    public UserEventPublisherAdapter(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void publishUserCreatedEvent(final UserCreatedEvent event) {
        this.applicationEventPublisher.publishEvent(event);
    }
}
