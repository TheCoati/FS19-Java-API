package com.kevinschreuder.fs19.api.entities.economy;

import com.kevinschreuder.fs19.api.entities.Entity;
import lombok.Getter;

public class GreatDemand extends Entity
{
    @Getter
    private int itemId;

    @Getter
    private String fillTypeName;

    @Getter
    private double demandMultiplier;

    @Getter
    private int demandStartDay;

    @Getter
    private int demandStartHour;

    @Getter
    private int demandDuration;

    @Getter
    private boolean isRunning;

    @Getter
    private boolean isValid;
}
