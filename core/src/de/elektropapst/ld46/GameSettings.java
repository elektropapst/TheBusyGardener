package de.elektropapst.ld46;

public class GameSettings {

    public final float PLAYER_MOVE_STEP = 0.2f;


    public final float INITIAL_FLOWER_SPAWN_INTERVAL = 1.0f;        // initial flower spawn in s
    public final float FINAL_FLOWER_SPAWN_INTERVAL = 5.0f;          // final flower spawn in s
    public final float FLOWER_SPAWN_INTERVAL_INC_STEP = 0.5f;       // increase each in s
    public final float FLOWER_SPAWN_INTERVAL_INC_INTERVAL = 4.5f;   // increase intervall in s

    public final float TIME_FOR_WATERING = 12.0f;

    public final float FLOWER_WATER_REQUIREMENT_CHANCE = 0.1f;
    public final float FLOWER_WATER_REQUIREMENT_TICK = 5.0f;

    public final int MAX_DEAD_PLANTS = 3;
    public final int TILE_SIZE = 64;

    public final float MUSIC_VOLUME = 0.2f;
    public static final float SOUND_VOLUME = 0.5f;

}
