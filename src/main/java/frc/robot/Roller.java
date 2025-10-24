package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

// This is another custom class, which represents a single roller on the physical robot.
public class Roller {
  /**
   * This variable represents a single motor used to power our roller.
   * private: Before, we had used "public" for all our access modifiers, but in
   *   some cases, we might not want something else having direct access to our
   *   motor, so we make it private. This means that it can only be used inside of
   *   this Roller class.
   * SparkMax: Once again, our type. This time, SparkMax is the specific type 
   *   ("brand") of motor controller we use on team 1675. Other teams, or maybe us
   *   in the future may use a different kind of motor controller, which would need
   *   a different class. This comes from a "vendor dependency," meaning the
   *   internal code for controlling the SparkMax is written by someone else (in
   *   this case, REV Robotics)
   * new SparkMax
   *   - 20: This is the channel (CAN ID) of the motor we want to connect to. This
   *     is usually labeled on the physical robot.
   *   - MotorType.kBrushless - The type of motor. We'll pretty much always use
   *     brushless motors. If you want details, ask Peter.
   */
  private SparkMax motor = new SparkMax(20, MotorType.kBrushless);

  public void startMotor() {
    /**
     * Technically not an actual voltage, but this is how we send power to a motor.
     * We use 12V batteries, meaning 12 is the max we can set the voltage to.
     */
    motor.setVoltage(1);
  }
}
