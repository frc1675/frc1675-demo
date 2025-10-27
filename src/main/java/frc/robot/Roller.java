package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class Roller {
  private SparkMax motor = new SparkMax(20, MotorType.kBrushless);
  private double motorSpeed = 0.0;

  public void startMotor() {
    /**
     * We never write real timer-based code like this, but this demonstrates how the
     * robot processes information incrememttally.
     * 
     * NOTE: Q actually messed up on this, we were supposed to increase by 0.004, which would have
     * made the motor accelerate over a period of 5 seconds before hitting a speed of 1. Since
     * we increased by 0.04 instead, it only took half a second to reach "full speed," and that
     * was hard to see.
     */
    if (motorSpeed < 1) {
      motorSpeed = motorSpeed + 0.04;
    }
    
    motor.setVoltage(motorSpeed);
  }
}
