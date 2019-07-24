package com.learn.pattern.flyweight;

/**
 * @author ymhui
 * @date 2019/7/23
 * @time 9:57
 * description 客户端
 */
public class Client {
    public static void main(String[] args) {
        String black = "black";
        String white = "white";
        ChessFactory chessFactory = ChessFactory.getChessFactory();
        Chess chess, _chess, chess1, chess2;
        chess = chessFactory.getChess(black);
        _chess = chessFactory.getChess(black);
        chess.operation(new Local(5, 5));
        _chess.operation(new Local(5, 6));
        System.out.println(chessFactory.getFlyWeightMap().size());

        chess1 = chessFactory.getChess(white);
        chess2 = chessFactory.getChess(white);
        chess1.operation(new Local(3, 4));
        chess2.operation(new Local(4, 5));
        System.out.println(chessFactory.getFlyWeightMap().size());
    }
}
