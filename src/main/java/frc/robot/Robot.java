// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {

  private final Solenoid solenoidRev = new Solenoid(PneumaticsModuleType.REVPH, 0);
  private final Solenoid solenoidCTRE = new Solenoid(PneumaticsModuleType.CTREPCM, 0);
  private final XboxController controller = new XboxController(0);
  private boolean buttonA = false;
  private boolean buttonB = false;

  @Override
  public void teleopPeriodic() {
    buttonA = controller.getAButton();
    buttonB = controller.getBButton();

    SolenoidUtils.setSolenoid(buttonA, solenoidRev, true);
    SolenoidUtils.setSolenoid(buttonB, solenoidCTRE, false);

  }



  @Override
  public void teleopExit() {
    solenoidCTRE.set(false);
    solenoidRev.set(false);
    SmartDashboard.putBoolean("Rev Solenoid", solenoidRev.get());
  }

}
