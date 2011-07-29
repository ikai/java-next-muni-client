package com.ikaisays.muni.domain.Builders;

import com.ikaisays.muni.domain.Direction;

public class DirectionBuilder {
    private String tag;
    private String title;
    private String name;

    public DirectionBuilder setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public DirectionBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public DirectionBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Direction createDirection() {
        return new Direction(tag, title, name);
    }
}