// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Roller;

/**
 * This is a custom command. It gives us more control over an InstantCommand.
 * In particular, we created this one to allow us to stop when a button gets
 * released. We can create a command by right-clicking the "commands" folder
 * on the left, pressing "Create a new class/command", and choosing Command
 * from the menu.
 */
public class HoldToPowerCommand extends Command {
  private final Roller roller;

  public HoldToPowerCommand(Roller roller) {
    this.roller = roller;
  }

  /**
   * Commands follow a similar lifecycle to the robot itself. You can think of
   * this initialize method as a parallel to teleopInit, but instead of running
   * one when teleop starts, it runs once when the command itself starts, which
   * in our case happens when a button is pressed.
   */
  @Override
  public void initialize() {
    roller.startMotor();
  }

  /**
   * Similarly, this is like teleopPeriodic, in that when the command is "alive,"
   * this method gets called every time during each step of the robot loop. For
   * this command, there's nothing we need to do here.
   */
  @Override
  public void execute() {}

  /**
   * There isn't a parallel to this one from the overall robot lifecycle, but it
   * runs when the command is "complete." It would be like running a method when
   * the robot becomes disabled. This would usually be cleanup, or in our case, to
   * stop the motor.
   */
  @Override
  public void end(boolean interrupted) {
    roller.stopMotor();
  }

  /**
   * In some cases, we may want to implement something to make the command turn itself
   * off. That can be done here.
   */
  @Override
  public boolean isFinished() {
    return false;
  }
}
