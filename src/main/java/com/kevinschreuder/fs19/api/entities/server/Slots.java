package com.kevinschreuder.fs19.api.entities.server;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import com.kevinschreuder.fs19.api.entities.Entity;

import java.util.ArrayList;
import java.util.List;

public class Slots extends Entity
{
    @Getter
    private int capacity;

    @Getter
    private int numUsed;

    @Getter
    @JacksonXmlProperty(localName = "Player")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Player> players = new ArrayList<>();
}
