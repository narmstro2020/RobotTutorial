// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/** Add your docs here. */
public class SolenoidUtils {

    private SolenoidUtils(){
        //prevents instantiation
    }

    public static void setSolenoid(boolean button, Solenoid solenoid, boolean isRev) {
        if (button && !solenoid.get()) {
            solenoid.set(true);
        } else if (!button && solenoid.get()) {
            solenoid.set(false);
        }

        if (isRev) {
            SmartDashboard.putBoolean("Rev Solenoid", solenoid.get());
        }
    }

}
