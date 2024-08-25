// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsytems.aircannons;

import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public abstract class AirCannonSubsystem extends SubsystemBase {

  private final Solenoid solenoid;

  /** Creates a new AirCannonSubsystem. */
  AirCannonSubsystem(Solenoid solenoid) {
    this.solenoid = solenoid;
  }

  public boolean isSolenoidOn() {
    return solenoid.get();
  }

  public Command fireCommand() {
    return runOnce(() -> solenoid.set(true));
  }

  public Command closeAirCommand() {
    return runOnce(() -> solenoid.set(false));
  }

  @Override
  public void periodic() {
  }

  @Override
  public void initSendable(SendableBuilder builder) {
    super.initSendable(builder);
    builder.addBooleanProperty(
        "Valve Open",
        solenoid::get,
        null);
  }

}
