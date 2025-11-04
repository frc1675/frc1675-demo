package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DutyCycleEncoder;



// This is another custom class, which represents a single roller on the physical robot.
public class Roller {

  private final int ROLLER_MOTOR = 20;
  private SparkMax motor = new SparkMax(ROLLER_MOTOR, MotorType.kBrushless);
  private final double MOTOR_OFF_SPEED = 0.0;
private final double MOTOR_ON_SPEED = -6.0;
private final int ENCODER_CHANNEL = 7;
private final int HOMESWITCH_CHANNEL = 8;
private DutyCycleEncoder encoder = new DutyCycleEncoder(ENCODER_CHANNEL);
private DigitalInput homeSwitch = new DigitalInput(HOMESWITCH_CHANNEL);
  public void startMotor() {
    motor.setVoltage(MOTOR_ON_SPEED);
  }

  public void stopMotor() {
    motor.setVoltage(MOTOR_OFF_SPEED);
  }

  public double getEncoderValue() {
    return encoder.get();
  }

  public boolean getHomeSwitchValue() {
    return homeSwitch.get();
  }
  private final int ROLLER_SECOND = 17;
  private SparkMax motor2 = new SparkMax(ROLLER_SECOND, MotorType.kBrushless);
  private final double MOTOR_OFF_SPEEDSECOND = 0.0;
private final double MOTOR_ON_SPEEDSECOND = -6.0;
  public void startMotorMotor() {
    motor2.setVoltage(MOTOR_ON_SPEEDSECOND);
  }

  public void stopMotorMotor() {
    motor2.setVoltage(MOTOR_OFF_SPEEDSECOND);
  }
}

