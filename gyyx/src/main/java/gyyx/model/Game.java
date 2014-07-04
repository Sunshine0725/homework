package gyyx.model;

public class Game {
	//游戏id
	private int code;
	//游戏名称
	private String game;
	
	public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public String getGame() {
    	return game;
    }
    
    public void setGame(String game)
    {
    	this.game = game == null ? null : game.trim();
    }
}
