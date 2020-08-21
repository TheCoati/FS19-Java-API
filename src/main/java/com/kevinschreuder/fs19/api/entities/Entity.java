package com.kevinschreuder.fs19.api.entities;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.ByteArrayOutputStream;

public abstract class Entity
{
    public String toString()
    {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream())
        {
            XmlMapper mapper = new XmlMapper();
            mapper.writeValue(outputStream, this);

            return outputStream.toString();
        }
        catch (Exception e)
        {
            return "";
        }

    }
}
