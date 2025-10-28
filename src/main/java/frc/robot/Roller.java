// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

/** Add your docs here. */
public class Roller {
    private final int ROLLER_MOTOR = 20;
    private final double MOTOR_ON_SPEED = 2.0;
    private final double MOTOR_OFF_SLEED = 0.0;

    private final SparkMax motor = new  SparkMax(ROLLER_MOTOR, MotorType.kBrushless);

    public void startMotor() {
        /*if (speed < 1) {
            speed = speed + 0.04;
        }
    
        motor.setVoltage(MOTOR_ON_SPEED);*/

    }

    public void stopMotor() {
        motor.setVoltage(0);
    }
}
