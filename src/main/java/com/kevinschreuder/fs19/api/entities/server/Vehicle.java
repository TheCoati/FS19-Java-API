package com.kevinschreuder.fs19.api.entities.server;

import lombok.Getter;
import com.kevinschreuder.fs19.api.entities.Entity;

public class Vehicle extends Entity
{
    @Getter
    private String name;

    @Getter
    private String category;

    @Getter
    private double x;

    @Getter
    private double y;

    @Getter
    private double z;

    @Getter
    private String fillTypes;

    @Getter
    private String fillLevels;

    @Getter
    private boolean isAIActive;
}
