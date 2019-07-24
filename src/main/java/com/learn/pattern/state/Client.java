package com.learn.pattern.state;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 15:02
 * description
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 9; i++) {
            vm.vote("u1", "A");
        }
    }

}
