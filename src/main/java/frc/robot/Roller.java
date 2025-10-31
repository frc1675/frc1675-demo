// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

/** Add your docs here. */
public class Roller {
    private final int SHOOTER_MOTOR_BOTTOM = 20;
    private final int SHOOTER_MOTOR_TOP = 17;
    private final double MOTOR_ON_SPEED = 4.0;
    private final double MOTOR_OFF_SPEED = 0.0;

    private final SparkMax motor = new SparkMax(SHOOTER_MOTOR_BOTTOM, MotorType.kBrushless);
    private final SparkMax motor2 = new SparkMax(SHOOTER_MOTOR_TOP, MotorType.kBrushless);

    public void startMotor() {
        /*if (speed < 1) {
            speed = speed + 0.04;
        }*/
    
        /*motor.setVoltage(MOTOR_ON_SPEED);
        motor2.setVoltage(MOTOR_ON_SPEED);*/
        motor.setVoltage(MOTOR_ON_SPEED);
        motor2.setVoltage(MOTOR_ON_SPEED);

    }

    /*public void HoldToPowerCommand(){
        motor.setVoltage(MOTOR_ON_SPEED);
        motor2.setVoltage(MOTOR_ON_SPEED);
        
    }*/

    public void stopMotor() {
        motor.setVoltage(0);
        motor2.setVoltage(0);
    }
}
