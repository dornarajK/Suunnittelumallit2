package com.example.suunnittelumallit;

public abstract class Map {
    protected final int width;
    protected final int height;
    protected final Tile[][] tiles;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[height][width];

    }

    protected abstract Tile createTile();



    public void display(){
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (tiles[y][x] == null) {
                    tiles[y][x] = createTile();
                }
                System.out.print(tiles[y][x].getCharacter());
            }
            System.out.println();
        }
    }

}


