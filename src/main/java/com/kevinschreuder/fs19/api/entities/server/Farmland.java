package com.kevinschreuder.fs19.api.entities.server;

import lombok.Getter;
import com.kevinschreuder.fs19.api.entities.Entity;

public class Farmland extends Entity
{
    @Getter
    private String name;

    @Getter
    private int id;

    @Getter
    private int owner;

    @Getter
    private int area;

    @Getter
    private double x;

    @Getter
    private double z;
}
