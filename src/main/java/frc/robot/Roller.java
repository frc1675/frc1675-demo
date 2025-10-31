package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;



// This is another custom class, which represents a single roller on the physical robot.
public class Roller {

  private final int ROLLER_MOTOR = 20;
  private SparkMax motor = new SparkMax(ROLLER_MOTOR, MotorType.kBrushless);
  private final double MOTOR_OFF_SPEED = 0.0;
private final double MOTOR_ON_SPEED = 4.0;
  public void startMotor() {
    motor.setVoltage(MOTOR_ON_SPEED);
  }

  public void stopMotor() {
    motor.setVoltage(MOTOR_OFF_SPEED);
  }
  private final int ROLLER_SECOND = 17;
  private SparkMax motor2 = new SparkMax(ROLLER_SECOND, MotorType.kBrushless);
  private final double MOTOR_OFF_SPEEDSECOND = 0.0;
private final double MOTOR_ON_SPEEDSECOND = 4.0;
  public void startMotorMotor() {
    motor2.setVoltage(MOTOR_ON_SPEEDSECOND);
  }

  public void stopMotorMotor() {
    motor2.setVoltage(MOTOR_OFF_SPEEDSECOND);
  }
}

