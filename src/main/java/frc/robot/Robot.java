// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

  @Override
  public void robotInit() {
    // This code runs first when robot code starts usually after turning the robot on.  
  }

  @Override
  public void robotPeriodic() {
    // After robotInit() this code runs every 20 milliseconds in a loop regardless
    // of mode.
  }

  @Override
  public void disabledInit() {
    // Runs once when robot enters disabled mode.
  }

  @Override
  public void disabledPeriodic() {
    // Runs every 20 milliseconds when robot is in disabled mode after
    // disabledInit()
  }

  @Override
  public void disabledExit() {
    // Runs once when robot exits disabled mode.
  }

  @Override
  public void autonomousInit() {
    // Runs once when robot enters autonomous mode.
  }

  @Override
  public void autonomousPeriodic() {
    // Runs every 20 milliseconds when robot is in autonomous mode after
    // autonomousInit()
  }

  @Override
  public void autonomousExit() {
    // Runs once when robot exits autonomous mode.
  }

  @Override
  public void teleopInit() {
    // Runs once when robot enters teleop mode.

  }

  @Override
  public void teleopPeriodic() {
    // Runs every 20 milliseconds when robot is in teleop mode after teleopInit()
  }

  @Override
  public void teleopExit() {
    // Runs once when robot exits teleop mode.

  }

  @Override
  public void testInit() {
    // Runs once when robot enters test mode.

  }

  @Override
  public void testPeriodic() {
    // Runs every 20 milliseconds when robot is in test mode after testInit()

  }

  @Override
  public void testExit() {
    // Runs once when robot exits test mode.

  }
}
