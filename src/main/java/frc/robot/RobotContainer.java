// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsytems.aircannons.AirCannonSubsystem;
import frc.robot.subsytems.aircannons.CtreAirCannonSubsystem;
import frc.robot.subsytems.aircannons.RevAirCannonSubsystem;

public class RobotContainer {

  private final CommandXboxController controller = new CommandXboxController(0);
  private PneumaticHub pneumaticHub = new PneumaticHub();
  private PneumaticsControlModule pneumaticsControlModule = new PneumaticsControlModule();
  private final AirCannonSubsystem airCannonSubsystem0 = new RevAirCannonSubsystem(0, pneumaticHub);
  private final AirCannonSubsystem airCannonSubsystem1 = new CtreAirCannonSubsystem(1, pneumaticsControlModule);


  public RobotContainer() {
    SmartDashboard.putData(pneumaticHub.makeCompressor());
    SmartDashboard.putData(pneumaticsControlModule.makeCompressor());
    SmartDashboard.putData(airCannonSubsystem0);
    SmartDashboard.putData(airCannonSubsystem1);
    configureBindings();
  }

  private void configureBindings() {
    controller.a().onTrue(airCannonSubsystem0.fireCommand());
    controller.a().onFalse(airCannonSubsystem0.closeAirCommand());
    controller.b().onTrue(airCannonSubsystem1.fireCommand());
    controller.b().onFalse(airCannonSubsystem1.closeAirCommand());
  }

  public Command getAutonomousCommand() {
    /*
     * Acquire the command currently selected and pass it up to autoInit in Robot.
     */
    return Commands.print("No autonomous command configured");
  }
}
