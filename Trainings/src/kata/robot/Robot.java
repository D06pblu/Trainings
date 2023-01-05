package kata.robot;

public class Robot {
    private int x;
    private int y;
    private Direction dir;

    public Robot(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public Direction getDirection() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (dir == Direction.UP) {
            dir = Direction.LEFT;
        } else if (dir == Direction.DOWN) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.DOWN;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.UP;
        }
    }

    public void turnRight() {
        if (dir == Direction.UP) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.DOWN) {
            dir = Direction.LEFT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.UP;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        }
    }

    public void stepForward() {
        if (dir == Direction.UP) {
            y++;
        }
        if (dir == Direction.DOWN) {
            y--;
        }
        if (dir == Direction.LEFT) {
            x--;
        }
        if (dir == Direction.RIGHT) {
            x++;
        }
    }
    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Текущее положение: \n X: "+robot.getX() + ", Y: "+robot.getY() +
                "\n\nТочка назначения: \n X: "+toX + ", Y: "+toY + "\n\n");

        int changeX = robot.getX() - toX;
        int changeY = robot.getY() - toY;

        if(changeX == 0 && changeY == 0){
            System.out.println("Робот прибыл в пункт назначения");
        }

        if (changeX <= 0 && changeY < 0) { //левый нижний угол
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
                System.out.println(robot.getDirection());
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                System.out.println("X: " + robot.getX() + ", Y: " + robot.getY());
            }
            robot.turnRight();
            while (robot.getX() != toX){
                robot.stepForward();
                System.out.println("X: " + robot.getX() + ", Y: " + robot.getY());
            }
        } else if (changeX < 0 && changeY >= 0){ //левый верхний
            while (robot.getDirection() != Direction.DOWN){
                robot.turnLeft();
                System.out.println(robot.getDirection());
            }
            while (robot.getY() != toY){
                robot.stepForward();
                System.out.println("X: " + robot.getX() + ", Y: " + robot.getY());
            }
            robot.turnLeft();
            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println("X: " + robot.getX() + ", Y: " + robot.getY());
            }
        } else if (changeX >= 0 && changeY > 0){ //правый верхний
            while (robot.getDirection() != Direction.DOWN){
                robot.turnRight();
                System.out.println(robot.getDirection());
            }
            while (robot.getY() != toY){
                robot.stepForward();
                System.out.println("X: " + robot.getX() + ", Y: " + robot.getY());
            }
            robot.turnRight();
            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println("X: " + robot.getX() + ", Y: " + robot.getY());
            }
        } else if (changeX > 0 && changeY <= 0) { //правый нижний
            while (robot.getDirection() != Direction.UP){
                robot.turnRight();
                System.out.println(robot.getDirection());
            }
            while (robot.getY() != toY){
                robot.stepForward();
                System.out.println("X: " + robot.getX() + ", Y: " + robot.getY());
            }
            robot.turnLeft();
            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println("X: " + robot.getX() + ", Y: " + robot.getY());
            }
        }
    }
}
