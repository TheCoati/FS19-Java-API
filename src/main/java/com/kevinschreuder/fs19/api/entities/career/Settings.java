package com.kevinschreuder.fs19.api.entities.career;

import lombok.Getter;
import com.kevinschreuder.fs19.api.entities.Entity;

public class Settings extends Entity
{
    /**
     * Name of the saveGame.
     */

    @Getter
    private String savegameName;

    /**
     * Identifying name of the saveGame map.
     */

    @Getter
    private String mapId;

    /**
     * Title of the saveGame map.
     */

    @Getter
    private String mapTitle;

    /**
     * Latest date of saveGame saved.
     */

    @Getter
    private String saveDate;

    /**
     * Index of the saveGame owning player model.
     */

    @Getter
    private int playerModelIndex;

    /**
     * Index of the saveGame owning player color.
     * @since v1.0.0 {Initial Release}
     */

    @Getter
    private int playerColorIndex;

    /**
     * Index of the saveGame owning player body type.
     */

    @Getter
    private int playerBodyIndex;

    @Getter
    private int playerHatIndex;

    @Getter
    private int playerAccessoryIndex;

    @Getter
    private int playerHairIndex;

    @Getter
    private int playerJacketIndex;

    @Getter
    private String playerName;

    @Getter
    private boolean resetVehicles;

    @Getter
    private boolean isPlantWitheringEnabled;

    @Getter
    private boolean trafficEnabled;

    @Getter
    private boolean stopAndGoBraking;

    @Getter
    private boolean automaticMotorStartEnabled;

    @Getter
    private boolean fruitDestruction;

    @Getter
    private boolean plowingRequiredEnabled;

    @Getter
    private boolean weedsEnabled;

    @Getter
    private boolean limeRequired;

    @Getter
    private boolean fuelUsageLow;

    @Getter
    private boolean helperBuyFuel;

    @Getter
    private boolean helperBuySeeds;

    @Getter
    private boolean helperBuyFertilizer;

    @Getter
    private int helperSlurrySource;

    @Getter
    private int helperManureSource;

    @Getter
    private int densityMapRevision;

    @Getter
    private int terrainLodTextureRevision;

    @Getter
    private int splitShapesRevision;

    @Getter
    private int tipCollisionRevision;

    @Getter
    private int placementCollisionRevision;

    @Getter
    private int mapDensityMapRevision;

    @Getter
    private int mapTerrainLodTextureRevision;

    @Getter
    private int mapSplitShapesRevision;

    @Getter
    private int mapTipCollisionRevision;

    @Getter
    private int mapPlacementCollisionRevision;

    @Getter
    private int difficulty;

    @Getter
    private int economicDifficulty;

    @Getter
    private int plantGrowthRate;

    @Getter
    private int dirtInterval;

    @Getter
    private double timeScale;

    @Getter
    private double autoSaveInterval;
}
