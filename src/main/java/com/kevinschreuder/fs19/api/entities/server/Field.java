package com.kevinschreuder.fs19.api.entities.server;

import lombok.Getter;
import com.kevinschreuder.fs19.api.entities.Entity;

public class Field extends Entity
{
    @Getter
    private int id;

    @Getter
    private double x;

    @Getter
    private double z;

    @Getter
    private boolean isOwned;
}
