// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

/** Add your docs here. */
public class Roller {
    private int ROLLER_MOTOR = 20;
    private SparkMax motor = new SparkMax(ROLLER_MOTOR, MotorType.kBrushless);
    private double MOTOR_ON_SPEED = 3.0;
    private double MOTOR_OFF_SPEED = 0.0;
    public void startMotor() {
    
        motor.setVoltage(MOTOR_ON_SPEED);
}


    public void stopMotor() {
        motor.setVoltage(MOTOR_OFF_SPEED); }
}
