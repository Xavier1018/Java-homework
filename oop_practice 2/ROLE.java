
public class ROLE {
	private String Name;
	private int life;
	private int Magic;
	
	public ROLE(String Name,int life,int Magic) {
		this.Name=Name;
		this.life=life;
		this.Magic=Magic;
	}
	
	public String getName() {
		return Name;
	}
	public int getLife() {
		return life;
	}
	public int getMagic() {
		return Magic;
	}
	
	
	public void reduceLife(int damage) {
		this.life = Math.max(0, this.life-damage);
	}
	
	public void reduceMagic(int cost) {
		this.Magic -=cost;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s , life: %d , Magic: %d", Name,life,Magic);
	}
}
