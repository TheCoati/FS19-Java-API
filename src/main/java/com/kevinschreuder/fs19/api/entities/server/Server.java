package com.kevinschreuder.fs19.api.entities.server;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import com.kevinschreuder.fs19.api.entities.Entity;

import java.util.ArrayList;
import java.util.List;

public class Server extends Entity
{
    @Getter
    private String game;

    @Getter
    private String version;

    @Getter
    private String server;

    @Getter
    private String name;

    @Getter
    private String mapName;

    @Getter
    private String dayTime;

    @Getter
    private String mapOverviewFilename;

    @Getter
    private String mapSize;

    @Getter
    @JacksonXmlProperty(localName = "Slots")
    private Slots slots;

    @Getter
    @JacksonXmlProperty(localName = "Vehicles")
    private List<Vehicle> vehicles = new ArrayList<>();

    @Getter
    @JacksonXmlProperty(localName = "Mods")
    private List<Mod> mods = new ArrayList<>();

    @Getter
    @JacksonXmlProperty(localName = "Farmlands")
    private List<Farmland> farmlands = new ArrayList<>();

    @Getter
    @JacksonXmlProperty(localName = "Fields")
    private List<Field> fields = new ArrayList<>();
}
