// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;

import java.security.Permissions;

import com.revrobotics.spark.SparkMax;

import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

@Logged

public class Shooter extends SubsystemBase {
    private final int ROLLER_MOTOR = 20;
  private SparkMax motor = new SparkMax(ROLLER_MOTOR, MotorType.kBrushless);
  private final double MOTOR_OFF_SPEED = 0.0;
private final double MOTOR_ON_SPEED = -6.0;
private final int ENCODER_CHANNEL = 7;
private final int HOMESWITCH_CHANNEL = 8;
private DutyCycleEncoder encoder = new DutyCycleEncoder(ENCODER_CHANNEL);
private DigitalInput homeSwitch = new DigitalInput(HOMESWITCH_CHANNEL);
private final int ROLLER_SECOND = 17;
private SparkMax motor2 = new SparkMax(ROLLER_SECOND, MotorType.kBrushless);
private final double MOTOR_OFF_SPEEDSECOND = 0.0;
private final double MOTOR_ON_SPEEDSECOND = -6.0;

private ProfiledPIDController pid;

private double currentAngle = 0;
private double currentPidAngle = 0;
private double targetAngle = 0; 
  /** Creates a new Shooter. */
  public Shooter() {
   
    TrapezoidProfile.Constraints pidprofile = new TrapezoidProfile.Constraints(1000, 1000);
    pid = new ProfiledPIDController(0.01, 0, 0.01, pidprofile);
  }

  @Override
  public void periodic() {
if (currentAngle < targetAngle){
  currentAngle =currentAngle +1;
}
double difference = pid.calculate(currentPidAngle, targetAngle);

currentPidAngle = currentPidAngle + difference;
  }
  public void setTargetAngle(double target) {
    targetAngle = target;
  }
}
