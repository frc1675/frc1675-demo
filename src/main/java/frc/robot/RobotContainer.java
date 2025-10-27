// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

@Logged
public class RobotContainer {
  private final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();

  public Counter counter = new Counter();
  public Roller roller = new Roller();
  
  private final CommandXboxController driverController =
      new CommandXboxController(OperatorConstants.DriverControllerPort);
  
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new Trigger(exampleSubsystem::exampleCondition)
        .onTrue(new ExampleCommand(exampleSubsystem));

    driverController.b().whileTrue(exampleSubsystem.exampleMethodCommand());
  }

  public Command getAutonomousCommand() {
    return Autos.exampleAuto(exampleSubsystem);
  }

  // Write code here to run when teleop starts
  public void teleopInit() {
    // When we called roller.startMotor() here, nothing happened. Technically, it increased the voltage to 0.04, but that wasn't strong enough to actually spin the roller.
  }

  // Write code here to run every loop during teleop
  public void teleopPeriodic() {
    // After we moved this here, we were able to observe the roller on the robot accelerate.
    roller.startMotor();
  }
}
