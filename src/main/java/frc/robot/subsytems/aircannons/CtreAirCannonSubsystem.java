// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsytems.aircannons;

import edu.wpi.first.wpilibj.PneumaticsControlModule;

public class CtreAirCannonSubsystem extends AirCannonSubsystem {

  /** Creates a new AirCannonSubsystem. */
  public CtreAirCannonSubsystem(
      int channel,
      PneumaticsControlModule pneumaticsControlModule) {
    super(pneumaticsControlModule.makeSolenoid(channel));
    setName("CTRE Air Cannon " + channel);
  }  

}
