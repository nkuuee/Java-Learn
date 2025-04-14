package Java_Core.Theme_4;

public class Robot_Pro {

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();
    }

    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public static class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);
        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        for (int chetchik = 1; chetchik <= 3; chetchik++) {

            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException e) {
                if (chetchik == 3) {
                    throw new RobotConnectionException("Не удалось подключиться после 3 попыток");
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public static void main(String[] args) {

        RobotConnectionManager RCM = new RobotConnectionManager() {

            @Override
            public RobotConnection getConnection() {
                return new RobotConnection() {

                    @Override
                    public void moveRobotTo(int x, int y) {
                        throw new RobotConnectionException("Ошибка");
                        //System.out.println("Робот перемещен в точку: " + x + ", " + y);
                    }

                    @Override
                    public void close() {
                        //System.out.println("Соединение с роботом закрыто");
                    }
                };
            }
        };
        moveRobot(RCM, 4, 10);
    }
}
