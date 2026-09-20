package stage2;

import core.board.PieceColor;
import core.game.Move;

/**
 * G09Board类，扩展了core.board.Board类，提供了一些特定的操作以适应G09棋盘的需求。
 * G09棋盘的棋格被定义为一个19*19的网格。
 */
public class G09Board extends core.board.Board {
    // 全局变量，代表棋盘的索引，便于通过字符访问棋盘位置
    private final String INDEX = "ABCDEFGHIJKLMNOPQRS";

    /**
     * 根据棋盘坐标获取棋子颜色
     *
     * @param c 列的位置
     * @param r 行的位置
     * @return 棋子的颜色
     */
    public PieceColor get(int c, int r) {
        return super.get(INDEX.charAt(c), INDEX.charAt(r));
    }

    /**
     * 根据起始和目标位置进行一次棋子移动
     *
     * @param c0 起始列坐标
     * @param r0 起始行坐标
     * @param c1 目标列坐标
     * @param r1 目标行坐标
     */
    public void makeMove(int c0, int r0, int c1, int r1) {
        super.makeMove(new Move(INDEX.charAt(c0), INDEX.charAt(r0), INDEX.charAt(c1), INDEX.charAt(r1)));
    }

    /**
     * 根据指定位置和棋子颜色，执行一步棋子的放置
     *
     * @param c     棋子放置位置的列坐标
     * @param r     棋子放置位置的行坐标
     * @param color 棋子的颜色
     */
    public void makeOneMove(int c, int r, PieceColor color) {
        super.set(c + r * 19, color); // 将棋子的位置视为一维数组的索引，并设置为指定颜色
    }

    /**
     * 撤销一步棋子的放置
     *
     * @param c 棋子放置位置的列坐标
     * @param r 棋子放置位置的行坐标
     */
    public void unMakeOneMove(int c, int r) {
        super.set(c + r * 19, PieceColor.EMPTY); // 将棋子的位置设置为空
    }
}
