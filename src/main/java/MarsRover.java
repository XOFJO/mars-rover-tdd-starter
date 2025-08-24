public class MarsRover {
    private int x_coordination;
    private int y_coordination;
    private String direction;
    private final String NORTH_DIRECTION = "N";
    private final String SOUTH_DIRECTION = "S";
    private final String WEST_DIRECTION = "W";
    private final String EAST_DIRECTION = "E";

    public MarsRover(int x_coordination, int y_coordination, String direction) {
        this.x_coordination = x_coordination;
        this.y_coordination = y_coordination;
        this.direction = direction;

    }
    public void execute(String commands) {
        commands.chars().forEach(command -> {
            if (command == 'M') {
                move(this.direction, true);
            } else if (command == 'L') {
                changeDirection("L");
            } else if (command == 'R') {
                changeDirection("R");
            } else if (command == 'B') {
                move(this.direction, false);
            }
        });
    }

    private void changeDirection(String direction) {
        switch (this.direction) {
            case NORTH_DIRECTION -> this.direction = direction.equals("L") ? WEST_DIRECTION : EAST_DIRECTION;
            case SOUTH_DIRECTION -> this.direction = direction.equals("L") ? EAST_DIRECTION : WEST_DIRECTION;
            case WEST_DIRECTION -> this.direction = direction.equals("L") ? SOUTH_DIRECTION : NORTH_DIRECTION;
            case EAST_DIRECTION -> this.direction = direction.equals("L") ? NORTH_DIRECTION : SOUTH_DIRECTION;
        }
    }

    private void move(String cur_direction, boolean isForward) {
        switch (cur_direction) {
            case NORTH_DIRECTION -> this.y_coordination += isForward ? 1 : -1;
            case SOUTH_DIRECTION -> this.y_coordination += isForward ? -1 : 1;
            case WEST_DIRECTION -> this.x_coordination += isForward ? -1 : 1;
            case EAST_DIRECTION -> this.x_coordination += isForward ? 1 : -1;
        }
    }

    public String report() {
        return "(" + this.x_coordination + ", " +  this.y_coordination + ")" + " " + this.direction;
    }
}
