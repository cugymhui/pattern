package com.learn.pattern.flyweight;

import lombok.Data;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 8:58
 * description 棋子位置信息
 */
@Data
public class Local {
    private int x;
    private int y;

    public Local(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // 省略get和set方法

    @Override
    public String toString() {
        return "横：" + x + ", 纵：" + y;
    }

}
