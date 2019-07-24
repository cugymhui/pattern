package com.learn.pattern.state;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 14:48
 * description 抽象状态
 */
public interface VoteState {
    /**
     *
     * @param user
     * @param voteItem
     * @param voteManager
     */
    void vote(String user,String voteItem,VoteManager voteManager);
}
