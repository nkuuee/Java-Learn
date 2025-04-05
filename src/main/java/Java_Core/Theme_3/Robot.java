package Java_Core.Theme_3;

/**
 * В начальный момент робот находится в некоторой позиции на поле. Также известно,
 * куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота
 * в заданную точку игрового поля.
 */

public class Robot {
    int X; //смотрит слева направо
    int Y;//смотрит снизу вверх
    private Direction direction;

    public Robot(int X, int Y, Direction direction) {
        this.X = X;
        this.Y = Y;
        this.direction = direction;
    }

    public enum Direction {
        UP,
        DOWN,
        RIGHT,
        LEFT
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void turnRight() { //повернуться на 90 градусов по часовой стрелке
        Robot.Direction poChasovoy = getDirection();

        switch (poChasovoy) {
            case UP -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.UP;
        }
    }

    public void turnLeft() { //повернуться на 90 градусов против часовой стрелки
        Robot.Direction protivChasovoy = getDirection();

        switch (protivChasovoy) {
            case UP -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.UP;
        }
    }

    public void stepForward() { //шаг прямо(за один шаг робот изменяет одну свою координату на единицу)
        Robot.Direction pryamo = getDirection();
        switch (pryamo) {
            case UP -> Y++;
            case RIGHT -> X++;
            case DOWN -> Y--;
            case LEFT -> X--;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();
        System.out.println("The robot's position: " + robot.getX() + "," + robot.getY());
    }
}
