package com.learn.pattern.state;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 14:56
 * description
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
