package com.kevinschreuder.fs19.api.entities.career;

import lombok.Getter;
import com.kevinschreuder.fs19.api.entities.Entity;

public class Statistics extends Entity
{
    @Getter
    private double money;

    @Getter
    private double playTime;
}
