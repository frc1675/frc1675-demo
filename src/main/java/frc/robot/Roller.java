package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

@Logged
public class Roller {
  /**
   * This lesson was a review activity where we set up a second motor to run.
   * This is one way to make that happen.
   */
  private static final int ROLLER_MOTOR_TOP = 17;
  private static final int ROLLER_MOTOR_BOTTOM = 20;
  private static final int ENCODER_CHANNEL = 7;
  private static final int HOMESWITCH_CHANNEL = 9;
  private static final double MOTOR_SPEED_ON = -4.0;
  private static final double MOTOR_SPEED_OFF = 0.0;
  private SparkMax motorTop = new SparkMax(ROLLER_MOTOR_TOP, MotorType.kBrushless);
  private SparkMax motorBottom = new SparkMax(ROLLER_MOTOR_BOTTOM, MotorType.kBrushless);

  private DutyCycleEncoder encoder = new DutyCycleEncoder(ENCODER_CHANNEL);
  private DigitalInput homeSwitch = new DigitalInput(HOMESWITCH_CHANNEL);

  public void startMotor() {
    motorTop.setVoltage(MOTOR_SPEED_ON);
    motorBottom.setVoltage(MOTOR_SPEED_ON);
  }
  
  public void stopMotor() {
    motorTop.setVoltage(MOTOR_SPEED_OFF);
    motorBottom.setVoltage(MOTOR_SPEED_OFF);
  }

  public double getEncoderValue() {
    return encoder.get();
  }

  public boolean getHomeSwitchValue() {
    return homeSwitch.get();
  }
}
