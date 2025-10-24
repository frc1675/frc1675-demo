// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.epilogue.Logged;

@Logged
public class Counter {
  public String mySecondVariable = "Gobblety gook";
  public int count = 0;

  public void increment(int incrementAmount) {
    if (count < 6) {
      count = count + incrementAmount;
    }
  }
}
