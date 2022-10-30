package com.github.novotnyr.soap;

import java.time.LocalDateTime;

public class CurrentLocalDateTime {
    private LocalDateTime dateTime;

    public CurrentLocalDateTime() {
        this.dateTime = LocalDateTime.now();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
