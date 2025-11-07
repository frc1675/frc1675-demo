// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.HoldToPowerCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

@Logged
public class RobotContainer {

  
    private final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
  
    public Counter counter = new Counter();
   // public Roller roller = new Roller();
    public Shooter shooter = new Shooter();

    private final CommandXboxController driverController =
        new CommandXboxController(OperatorConstants.DriverControllerPort);
    
    public RobotContainer() {
      configureBindings();
    }
  
    private void configureBindings() {
      new Trigger(exampleSubsystem::exampleCondition)
          .onTrue(new ExampleCommand(exampleSubsystem));
  
     // driverController.b().whileTrue(exampleSubsystem.exampleMethodCommand());
     driverController.a().onTrue(new InstantCommand(() -> shooter.setTargetAngle(0)));
     driverController.b().onTrue(new InstantCommand(() -> shooter.setTargetAngle(360)));
     driverController.x().onTrue(new InstantCommand(() -> shooter.setTargetAngle(1800)));
    // driverController.leftBumper().whileTrue(new HoldToPowerCommand(roller));

  }

  public Command getAutonomousCommand() {
    return Autos.exampleAuto(exampleSubsystem);
  }

  public void teleopInit() {
    // Write code here to run when teleop starts
    // Just like all comments, "commented out" code does not run. This is usually a bad practice.
    // counter.increment(2);

    
  }

  public void teleopPeriodic() {
  }
}
