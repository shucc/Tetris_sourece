package dao;

import java.util.List;

import dto.Player;

/**
 * ���ݳ־ò�ӿ�
 * @author Administrator
 *
 */
public interface Data {

	/**
	 * ��ȡ����
	 * @return
	 */
	List<Player> loadData();
	
	/**
	 * �洢����
	 * @param players
	 */
	void saveData(Player players);
}