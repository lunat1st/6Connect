package stage1;

import core.board.PieceColor;

import static core.board.PieceColor.BLACK;
import static core.board.PieceColor.WHITE;
import static core.game.Move.SIDE;

public class Road {

	/**
	 * @return the ifleage
	 */
	public boolean isIfleage() {
		return ifleage;
	}
	/**
	 * @param ifleage the ifleage to set
	 */
	public void setIfleage(boolean ifleage) {
		this.ifleage = ifleage;
	}

	//ĳ���ĸ�ǰ�������λ���������˷���  = -ǰ������
	//ǰ�������£� �ң����£����ϣ�  {col������row����}
	public static final int _FORWARD[] = { SIDE, 1, SIDE+1, -SIDE+1 };
	
	public Road(int startPos, int dir, int blackNum, int whiteNum, boolean active) {
		super();
		this.startPos = startPos;
		this.dir = dir;
		this.blackNum = blackNum;
		this.whiteNum = whiteNum;
		this.ifleage = active;
	}
	//���·�����һ������
	public void addStone(PieceColor stone) {
		if (stone == BLACK) blackNum++;
		else if (stone == WHITE) whiteNum++;
	}
	//�Ӹ�·���Ƴ�һ������
	public void removeStone(PieceColor stone) {
		if (stone == BLACK) blackNum--;
		else if (stone == WHITE) whiteNum--;
	}
	
	public int getBlackNum() {
		return blackNum;
	}
	public int getWhiteNum() {
		return whiteNum;
	}
	
	public boolean isEmpty() {
		return blackNum == 0 && whiteNum == 0;
	}
	
	public int getStartPos() {
		return startPos;
	}

	public int getDir() {
		return dir;
	}

	private int startPos; 	//��·�����ı�� ��0~360��
	private	int dir;   	  	//��·�ķ�������ǰ������ �£��ң����£�����

	private int blackNum; 	//��·�к��ӵĸ���
	private int whiteNum; 	//��·�а��ӵĸ���
	
	private boolean ifleage; //�Ƿ�Ϸ���·
		
}
