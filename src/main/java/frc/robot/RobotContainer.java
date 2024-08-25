// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {

  private final PneumaticHub pneumaticHub = new PneumaticHub();
  private final Compressor pneumaticHubCompressor = pneumaticHub.makeCompressor();
  private final Solenoid solenoidRev = pneumaticHub.makeSolenoid(0);
  private final Solenoid solenoidCTRE = new Solenoid(PneumaticsModuleType.CTREPCM, 0);
  private final CommandXboxController controller = new CommandXboxController(0);

  public RobotContainer() {
    pneumaticHub.enableCompressorDigital();
    SmartDashboard.putData(solenoidRev);
    SmartDashboard.putData(pneumaticHubCompressor);
    configureBindings();
  }

  private void configureBindings() {
    controller.a().onTrue(Commands.runOnce(() -> solenoidRev.set(true)));
    // Try this for the onFalse

    // leave the ctre solenoid as an exercise for you
    // use the b button.

  }

  public Command getAutonomousCommand() {
    /*
     * Acquire the command currently selected and pass it up to autoInit in Robot.
     */
    return Commands.print("No autonomous command configured");
  }
}
