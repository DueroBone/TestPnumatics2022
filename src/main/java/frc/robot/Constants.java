// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class OIConstants {
        // Xbox controller button mappings
        public static final int kXboxButtonA = 1;
        public static final int kXboxButtonB = 2;
        public static final int kXboxButtonX = 3;
        public static final int kXboxButtonY = 4;
        public static final int kXboxBumperLeft = 5;
        public static final int kXboxBumperRight = 6;
        public static final int kXboxButtonBack = 7;
        public static final int kXboxButtonStart = 8;
        public static final int kXboxStickPressLeft = 9;
        public static final int kXboxStickPressRight = 10;

        public static final int kXboxAxisLeftStickX = 0;  // for .getRawAxis()
        public static final int kXboxAxisLeftStickY = 1;
        public static final int kXboxAxisLeftTrigger = 2;
        public static final int kXboxAxisRightTrigger = 3;
        public static final int kXboxAxisRightStickX = 4;
        public static final int kXboxAxisRightStickY = 5;
 
        // LogiTech controller axis mappings
        public static final int kLogiAxisLeftStickX = 1;
        public static final int kLogiAxisLeftStickY = 2;
        public static final int kLogiAxisTriggers = 3; // left trigger only=-1.0, right only=1.0, both/none=0.0
        public static final int kLogiAxisRightStickX = 4;
        public static final int kLogiAxisRightStickY = 5;
        public static final int kLogiAxisDpad = 6;

        public static final int kLogiButtonA = 1;
        public static final int kLogiButtonB = 2;
        public static final int kLogiButtonX = 3;
        public static final int kLogiButtonY = 4;
        public static final int kLogiBumperLeft = 5;
        public static final int kLogiBumperRight = 6;
        public static final int kLogiButtonBack = 7; 
        public static final int kLogiButtonStart = 8; 
        public static final int kLogiStickPressLeft = 9; 
        public static final int kLogiStickPressRight = 10;
    }
}
