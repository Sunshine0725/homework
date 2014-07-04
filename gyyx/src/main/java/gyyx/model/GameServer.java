package gyyx.model;

public class GameServer {
	//服务器编号
	private int id;
	//所属游戏id
	private int gameCode;
	//服务器名称
	private String name;
	
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getGameCode() {
        return gameCode;
    }

    public void setGameCode(int gameCode) {
        this.gameCode = gameCode;
    }
    
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name)
    {
    	this.name = name == null ? null : name.trim();
    }
}
