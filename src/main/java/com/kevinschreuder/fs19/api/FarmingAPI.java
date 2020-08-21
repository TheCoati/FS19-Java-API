package com.kevinschreuder.fs19.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.kevinschreuder.fs19.api.entities.Entity;
import com.kevinschreuder.fs19.api.entities.career.Career;
import com.kevinschreuder.fs19.api.entities.server.Server;
import com.kevinschreuder.fs19.api.entities.economy.Economy;

import java.io.IOException;
import java.net.URL;

public class FarmingAPI
{
    private final String baseURL;
    private final String code;

    public FarmingAPI(String baseURL, String code)
    {
        this.baseURL = baseURL;
        this.code = code;
    }

    public Server getServer() throws IOException
    {
        final String endpoint = this.baseURL + "/feed/dedicated-server-stats.xml?code=" + this.code;

        return (Server) this.parse(endpoint, Server.class);
    }

    public String getMapImage(int quality, int size)
    {
        return this.baseURL + "/feed/dedicated-server-stats-map.jpg?code=" + this.code + "&quality="  + quality + "&size=" + size;
    }

    public Career getCareer() throws IOException
    {
        final String endpoint = this.baseURL + "/feed/dedicated-server-savegame.html?code=" + this.code + "&file=careerSavegame";

        return (Career) this.parse(endpoint, Career.class);
    }

    public Economy getEconomy() throws IOException
    {
        final String endpoint = this.baseURL + "/feed/dedicated-server-savegame.html?code=" + this.code + "&file=economy";

        return (Economy) this.parse(endpoint, Economy.class);
    }

    private Entity parse(String endpoint, Class<? extends Entity> clazz) throws IOException
    {
        URL uri = new URL(endpoint);
        XmlMapper mapper = (XmlMapper) new XmlMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return mapper.readValue(uri, clazz);
    }
}
