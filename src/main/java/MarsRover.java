public class MarsRover {
    private int x;
    private int y;
    private String direction;
    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }
    public void execute(String command) {
        if (command.equals("M")) {
            if (this.direction.equals("N")) {
                this.y += 1;
            } else if (this.direction.equals("S")) {
                this.y -= 1;
            } else if (this.direction.equals("W")) {
                this.x -= 1;
            } else if (this.direction.equals("E")) {
                this.x += 1;
            }
        }
    }

    public String report() {
        return "(" + this.x + ", " +  this.y + ")" + " " + this.direction;
    }
}
