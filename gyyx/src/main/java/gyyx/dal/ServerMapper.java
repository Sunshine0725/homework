package gyyx.dal;

import gyyx.model.GameServer;

import java.util.List;

public interface ServerMapper {
	//��ȡ�������б�
	List<GameServer> getServerList(int gameCode);
}
