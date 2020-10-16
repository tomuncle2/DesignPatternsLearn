package com.caidi.design.create.builder;

/**
 * @author: 蔡迪
 * @date: 23:30 2020/10/15
 * @description:
 */
public interface TerrainBuilder {
    // 构建墙
    TerrainBuilder buildWall();
    // 构建堡垒
    TerrainBuilder buildFort();
    // 构建矿井
    TerrainBuilder buildMine();
    // 构建Terrain对象
    Terrain build();
}