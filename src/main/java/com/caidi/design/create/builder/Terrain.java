package com.caidi.design.create.builder;

/**
 * @author: 蔡迪
 * @date: 23:34 2020/10/15
 * @description: 地形 地势
 */

public class Terrain {
     Wall wall;
     Fort fort;
     Mine mine;

    public Terrain(){
    }

    @Override
    public String toString() {
        return "Terrain{" +
                "wall=" + wall +
                ", fort=" + fort +
                ", mine=" + mine +
                '}';
    }
//    // sout
//    class ComplexTerrainBuilder implements TerrainBuilder{
//        Terrain terrain = new Terrain();
//
//        public TerrainBuilder buildWall() {
//            terrain.wall = new Wall(1,1,1,1);
//            return new ComplexTerrainBuilder();
//        }
//
//        public TerrainBuilder buildFort() {
//            terrain.fort = new Fort(1,1,1,1);
//            return new ComplexTerrainBuilder();
//        }
//
//
//        public TerrainBuilder buildMine() {
//            terrain.mine = new Mine(1,1,1,1);
//            return new ComplexTerrainBuilder();
//        }
//
//        public Terrain build() {
//            return null;
//        }
//    }

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

    @Override
    public String toString() {
        return "Wall{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
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

    @Override
    public String toString() {
        return "Fort{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
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


    @Override
    public String toString() {
        return "Mine{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}
