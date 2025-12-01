public class Diamond extends Treasure {
    public int depth; 
    public boolean status; 

    public Diamond(int x, int y, int value, int depth) {
        super(x, y, value);
        this.depth = depth;
        this.status = true;
    }

    public int CalDistance(int xd, int yd) {
        return Math.abs(x - xd) + Math.abs(y - yd);
    }

    @Override
    public void Collect() {
        this.status = false; 
        value = 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Depth: " + depth + ", Found: " + status;
    }    
}