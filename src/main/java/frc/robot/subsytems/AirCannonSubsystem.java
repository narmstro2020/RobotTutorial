// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsytems;

import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AirCannonSubsystem extends SubsystemBase {

  private final Solenoid solenoidRev;

  /** Creates a new AirCannonSubsystem. */
  public AirCannonSubsystem(int channel, PneumaticHub pneumaticHub) {
    solenoidRev = pneumaticHub.makeSolenoid(channel);
    setName("AirCannon" + channel);
  }

  public boolean isSolenoidOn() {
    return solenoidRev.get();
  }

  public Command fireCommand() {
    return runOnce(() -> solenoidRev.set(true));
  }

  public Command closeAirCommand() {
    return runOnce(() -> solenoidRev.set(false));
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void initSendable(SendableBuilder builder) {
    super.initSendable(builder);
    builder.addBooleanProperty(
        "Valve Open",
        solenoidRev::get,
        null);
  }

}
