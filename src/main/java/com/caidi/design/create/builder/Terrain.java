package com.caidi.design.create.builder;

/**
 * @author: 蔡迪
 * @date: 23:34 2020/10/15
 * @description: 地形 地势
 */
public class Terrain {
    private Wall wall;
    private Fort fort;
    private Mine mine;

    // sout
    static class ComplexTerrainBuilder implements TerrainBuilder{
        private Wall wall;
        private Fort fort;
        private Mine mine;
        @Override
        public TerrainBuilder buildWall() {
            wall = new Wall(1,1,1,1);
            return new ComplexTerrainBuilder();
        }

        @Override
        public TerrainBuilder buildFort() {
            fort = new Fort(1,1,1,1);
            return new ComplexTerrainBuilder();
        }

        @Override
        public TerrainBuilder buildMine() {
            mine = new Mine(1,1,1,1);
            return new ComplexTerrainBuilder();
        }
    }

    // sout
}

// 墙
class Wall{
    int x, y, w, h;

    public Wall(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}

// 构建堡垒
class Fort{
    int x, y, w, h;

    public Fort(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}

// 构建矿井
class Mine{
    int x, y, w, h;

    public Mine(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}
