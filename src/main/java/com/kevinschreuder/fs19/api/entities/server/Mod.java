package com.kevinschreuder.fs19.api.entities.server;

import lombok.Getter;
import com.kevinschreuder.fs19.api.entities.Entity;

public class Mod extends Entity
{
    @Getter
    private String name;

    @Getter
    private String author;

    @Getter
    private String version;

    @Getter
    private String title;
}
