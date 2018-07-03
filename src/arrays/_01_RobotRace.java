package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method*
public static void main(String[] args) {
	Random test = new Random();
	int moveDist = 100;
	int robot = 0;
	Robot[] robotStorage = new Robot[5];
	for (int i = 0; i < robotStorage.length; i++) {
		robotStorage[i] = new Robot();
		robotStorage[i].moveTo(moveDist, 550);
		moveDist += 100;
	}
	while (robotStorage[robot].getY() > 0) {
		int speed = test.nextInt(50);
		robotStorage[robot].move(speed);
		robot ++;
		if(robot > 4) {
			robot = 0;
		}
	}
	robotStorage[robot].moveTo(300, 300);
robotStorage[robot].sparkle();
robotStorage[robot].setSpeed(100);
robotStorage[robot].turn(99999);

}
	//2. create an array of 5 robots.*

	//3. use a for loop to initialize the robots.*

		//4. make each robot start at the bottom of the screen, side by side, facing up*

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.*

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.*

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
