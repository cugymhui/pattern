package com.learn.pattern.state;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 14:55
 * description 重复投票
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
