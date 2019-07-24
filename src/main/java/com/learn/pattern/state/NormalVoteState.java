package com.learn.pattern.state;

/**
 * @author ymhui
 * @date 2019/7/24
 * @time 14:53
 * description 正常状态
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("投票成功！");
    }
}
