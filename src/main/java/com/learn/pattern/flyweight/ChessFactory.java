package com.learn.pattern.flyweight;

import lombok.Data;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 9:53
 * description 棋子工厂类
 */
@Data
public class ChessFactory {
    private static ChessFactory chessFactory;
    private ConcurrentMap<String, Chess> flyWeightMap; // 共享池

    private ChessFactory() {
        flyWeightMap = new ConcurrentHashMap<>();
    }

    // 双重锁单例模式获取棋子工厂类
    public static ChessFactory getChessFactory() {
        synchronized (ChessFactory.class) {
            if (chessFactory == null) {
                synchronized (ChessFactory.class) {
                    chessFactory = new ChessFactory();
                }
            }
        }
        return chessFactory;
    }

    // 棋子工厂根据color构造不同的对象，并放入共享池
    public Chess getChess(String color) {
        if (!flyWeightMap.containsKey(color)) {
            flyWeightMap.put(color, new BlackWhiteChess(color));
        }
        return flyWeightMap.get(color);
    }
}
