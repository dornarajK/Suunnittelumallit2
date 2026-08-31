package com.example.suunnittelumallit;


public class Game {

    public static final String MAP_TYPE = "city";
    public static final int MAP_WIDTH = 5;
    public static final int MAP_HEIGHT = 5;

    public Map createMap(String type, int width, int height) {
        return switch (type) {
            case "city" -> new CityMap(width, height);
            case "wilderness" -> new WildernessMap(width, height);
            default -> throw new IllegalArgumentException("Unknown map type: " + type);
        };
    }

    public static void main(String[] args) {
        Game game = new Game();
        Map map = game.createMap(MAP_TYPE, MAP_WIDTH, MAP_HEIGHT);
        map.display();
    }
}

