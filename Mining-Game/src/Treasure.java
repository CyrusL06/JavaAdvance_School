
public class Treasure {
	public int value;
 	public int x;
	public int y;
	
   public Treasure(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public void Collect() {
    }
	
	public int GetDistance(int dx, int dy)
	{
		return Math.abs(dy-y) + Math.abs(dx-x);
	}
}
