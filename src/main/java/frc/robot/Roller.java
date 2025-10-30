package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class Roller {
  /**
   * When we make something "final", it becomes a constant, meaning the value
   * cannot change. We use these to configure things on the robot, so they can
   * be easily updated and it's clearer than putting random numbers in the code.
   * Constants should generally go in the Constants file but we just have them
   * here for now.
   */
  private static final int ROLLER_MOTOR = 20;
  private static final double MOTOR_SPEED_ON = 2.0;
  private static final double MOTOR_SPEED_OFF = 0.0;
  private SparkMax motor = new SparkMax(ROLLER_MOTOR, MotorType.kBrushless);

  public void startMotor() {
    motor.setVoltage(MOTOR_SPEED_ON);
  }

  public void stopMotor() {
    motor.setVoltage(MOTOR_SPEED_OFF);
  }
}
