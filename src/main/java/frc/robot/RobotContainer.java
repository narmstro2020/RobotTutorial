// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class RobotContainer {

  /*
   * This is where we define our robot components and/or subsystems in the properties/fields area
   */

  public RobotContainer() {

    /*
     * Do other initialization stuff
     */

    configureBindings();
  }

  private void configureBindings() {

    /*
     * Connect buttons and other triggers to commands
     */
  }

  public Command getAutonomousCommand() {
    /*
     * Acquire the command currently selected and pass it up to autoInit in Robot.  
     */
    return Commands.print("No autonomous command configured");
  }
}
