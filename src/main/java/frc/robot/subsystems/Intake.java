// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  private final double INTAKE_POWER = 12 * 0.2;
  private SparkMax motorLeft = new SparkMax(9, MotorType.kBrushless);
  private SparkMax motorRight = new SparkMax(10, MotorType.kBrushless);

  /** Creates a new Intake. */
  public Intake() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void intake() {
    motorLeft.setVoltage(INTAKE_POWER);
    motorRight.setVoltage(-INTAKE_POWER);
  }
}
