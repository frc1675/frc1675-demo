// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  private final double INTAKE_POWER = 12 * 0.2;
  private final double OUTTAKE_POWER = -12 * 0.2;
  private SparkMax motorLeft = new SparkMax(9, MotorType.kBrushless);
  private SparkMax motorRight = new SparkMax(10, MotorType.kBrushless);
private State currentState = State.INERT; 

enum State {
  INERT,
  INTAKING,
  OUTTAKING
}

  /** Creates a new Intake. */
  public Intake() {}

  @Override
  public void periodic() {
    if (currentState == State.INTAKING) {
      motorLeft.setVoltage(INTAKE_POWER);
      motorRight.setVoltage(-INTAKE_POWER);
    }
    
  if (currentState == State.OUTTAKING) {
    motorLeft.setVoltage(OUTTAKE_POWER);
    motorRight.setVoltage(-OUTTAKE_POWER);
  }
  if (currentState == State.INERT) {
    motorLeft.setVoltage(0);
    motorRight.setVoltage(0);
  }
    // This method will be called once per scheduler run
  }

  public void intake() {
    currentState =State.INTAKING;
    }

  public void outtake() {
    currentState =State.OUTTAKING;
    }
    
    public void inert() {
    currentState =State.INERT;
    }
}
