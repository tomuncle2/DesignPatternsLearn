package com.caidi.design.create.builder;

/**
 * @author: 蔡迪
 * @date: 10:15 2020/10/16
 * @description:
 */
public class ComplexTerrainBuilder implements  TerrainBuilder{

        Terrain terrain = new Terrain();

        public TerrainBuilder buildWall() {
            terrain.wall = new Wall(1,1,1,1);
            return this;
        }

        public TerrainBuilder buildFort() {
            terrain.fort = new Fort(1,1,1,1);
            return this;
        }


        public TerrainBuilder buildMine() {
            terrain.mine = new Mine(1,1,1,1);
            return this;
        }

        public Terrain build() {
            return terrain;
        }
}