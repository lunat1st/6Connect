package stage3;

import core.board.PieceColor;

import static core.board.PieceColor.BLACK;
import static core.board.PieceColor.WHITE;
import static core.game.Move.SIDE;

public class Road {
    private int pos;    //·������ ��Χ0-360
    private int dir;  //��·�ķ�������ǰ�������£��ң����£�����
    private int blackNum;    //������
    private int whiteNum;    //������
    private boolean legal; //��·�Ƿ�Ϸ� 1�Ϸ� 0���Ϸ�
    public static final int[] DIRECTION = {19, 1, 19 + 1, -19 + 1}; //����

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setBlackNum(int blackNum) {
        this.blackNum = blackNum;
    }

    public int getBlackNum() {
        return blackNum;
    }

    public void setWhiteNum(int whiteNum) {
        this.whiteNum = whiteNum;
    }

    public int getWhiteNum() {
        return whiteNum;
    }

    public boolean getLegal() {
        return legal;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Road) {
            Road road = (Road) obj;
            if ((road.pos == pos) && (road.dir == dir)
                    && (road.blackNum == blackNum)
                    && (road.whiteNum == whiteNum)) {
                return true;
            }
            return false;
        }
        return false;
    }


    public Road(int pos, int dir, int blackNum, int whiteNum, boolean legal) {
        super();
        this.pos = pos;
        this.dir = dir;
        this.blackNum = blackNum;
        this.whiteNum = whiteNum;
        this.legal = legal;
    }

    //�������
    public void addStone(PieceColor stone) {
        if (stone == BLACK) blackNum++;
        else if (stone == WHITE) whiteNum++;
//        if(blackNum + whiteNum >= 7) {
//            System.out.println("h");
//        }
    }

    //�Ƴ�����
    public void removeStone(PieceColor stone) {
        if (stone == BLACK) blackNum--;
        else if (stone == WHITE) whiteNum--;
    }

    public boolean isEmpty() {
        return blackNum == 0 && whiteNum == 0;
    }

}
