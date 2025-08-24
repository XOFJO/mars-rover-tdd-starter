public class MarsRover {
    private int x_coordination;
    private int y_coordination;
    private String direction;
    private final String NORTH_DIRECTION = "N";
    private final String SOUTH_DIRECTION = "S";
    private final String WEST_DIRECTION = "W";
    private final String EAST_DIRECTION = "E";

    public MarsRover(int x, int y, String direction) {
        this.x_coordination = x;
        this.y_coordination = y;
        this.direction = direction;

    }
    public void execute(String command) {
        if (command.equals("M")) {
            switch (this.direction) {
                case NORTH_DIRECTION -> this.y_coordination += 1;
                case SOUTH_DIRECTION -> this.y_coordination -= 1;
                case WEST_DIRECTION -> this.x_coordination -= 1;
                case EAST_DIRECTION -> this.x_coordination += 1;
            }
        } else if (command.equals("L")) {
            switch (this.direction) {
                case NORTH_DIRECTION -> this.direction = WEST_DIRECTION;
                case SOUTH_DIRECTION -> this.direction = EAST_DIRECTION;
                case WEST_DIRECTION -> this.direction = SOUTH_DIRECTION;
                case EAST_DIRECTION -> this.direction = NORTH_DIRECTION ;
            }
        } else if (command.equals("R")) {
            switch (this.direction) {
                case NORTH_DIRECTION -> this.direction = EAST_DIRECTION;
                case SOUTH_DIRECTION -> this.direction = WEST_DIRECTION;
                case WEST_DIRECTION -> this.direction = NORTH_DIRECTION;
                case EAST_DIRECTION -> this.direction = SOUTH_DIRECTION ;
            }
        }
    }

    public String report() {
        return "(" + this.x_coordination + ", " +  this.y_coordination + ")" + " " + this.direction;
    }
}
