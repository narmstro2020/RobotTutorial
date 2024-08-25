// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsytems.aircannons;

import edu.wpi.first.wpilibj.PneumaticHub;

public class RevAirCannonSubsystem extends AirCannonSubsystem {

  /** Creates a new AirCannonSubsystem. */
  public RevAirCannonSubsystem(int channel, PneumaticHub pneumaticHub) {
    super(pneumaticHub.makeSolenoid(channel));
    setName("REV Air Cannon " + channel);
  } 
}
