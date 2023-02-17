package pages;

public class RobotJ {
    public static void main(String[] args) { // TODO Auto-generated method stub Robot robot; try { robot = new Robot(); robot.mouseMove(0, 900); robot.delay(1000); robot.mousePress(InputEvent.BUTTON1_MASK); robot.mouseRelease(InputEvent.BUTTON1_MASK); robot.delay(1000); robot.mouseMove(300, 490); robot.mousePress(InputEvent.BUTTON3_DOWN_MASK); robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK); robot.delay(1000); robot.mouseMove(400, 690); robot.delay(1000); robot.mousePress(InputEvent.BUTTON1_MASK); robot.mouseRelease(InputEvent.BUTTON1_MASK); robot.delay(1000); robot.mouseMove(1300, 150); } catch (AWTException e) { // TODO Auto-generated catch block e.printStackTrace(); } } }

    }
}
