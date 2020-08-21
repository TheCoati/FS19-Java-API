package com.kevinschreuder.fs19.api.entities.economy;

import com.kevinschreuder.fs19.api.entities.Entity;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Economy extends Entity
{
    @Getter
    private List<GreatDemand> greatDemands = new ArrayList<>();
}
