package com.kevinschreuder.fs19.api.entities.career;

import lombok.Getter;
import com.kevinschreuder.fs19.api.entities.Entity;

public class Career extends Entity
{
    @Getter
    private int revision;

    @Getter
    private boolean valid;

    @Getter
    private Settings settings;

    @Getter
    private Map map;

    @Getter
    private Statistics statistics;
}
