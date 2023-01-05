package kata.robot;

public class RobotMovement {
    public static void main(String[] args) {

        int randomDirection = (int) (Math.random() * 3 + 1);
        int startX = (int) (Math.random() * 20 - 10);
        int startY = (int) (Math.random() * 20 - 10);
        int finishX = (int) (Math.random() * 20 - 10);
        int finishY = (int) (Math.random() * 20 - 10);

//        Robot robot = switch (randomDirection) {
//            case 1 -> new Robot(startX, startY, Direction.DOWN);
//            case 2 -> new Robot(startX, startY, Direction.RIGHT);
//            case 3 -> new Robot(startX, startY, Direction.UP);
//            case 4 -> new Robot(startX, startY, Direction.LEFT);
//            default -> throw new IllegalStateException("Unexpected value: " + randomDirection);
//        };
//        robot.moveRobot(robot, finishX, finishY);
    }
}
