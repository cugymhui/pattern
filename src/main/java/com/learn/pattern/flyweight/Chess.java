package com.learn.pattern.flyweight;

import lombok.Data;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 9:00
 * description 抽象棋子类
 */
@Data
public abstract class Chess {
    private String type;

    public Chess(String type){
        this.type = type;
    }

//    public String getType(){
//        return type;
//    }

    public abstract void operation(Local local);
}
