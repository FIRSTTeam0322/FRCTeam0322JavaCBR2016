// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc322.FRCTeam0322JavaCBR2016;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.ADXL345_SPI;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.interfaces.Accelerometer.Range;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController chassisSpeedController1;
    public static SpeedController chassisSpeedController2;
    public static SpeedController chassisSpeedController3;
    public static SpeedController chassisSpeedController4;
    public static RobotDrive chassisRobotDrive41;
    public static SpeedController ballCollectorleftBallSuck;
    public static SpeedController ballCollectorrightBallSuck;
    public static SpeedController shooterleftShoot;
    public static SpeedController shooterrightShoot;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static ADXRS450_Gyro chassisSensorsGyro1;
    public static ADXL345_SPI chassisSensorsAccelerometer1;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chassisSpeedController1 = new Talon(0);
        LiveWindow.addActuator("Chassis", "Speed Controller 1", (Talon) chassisSpeedController1);
        
        chassisSpeedController2 = new Talon(2);
        LiveWindow.addActuator("Chassis", "Speed Controller 2", (Talon) chassisSpeedController2);
        
        chassisSpeedController3 = new Talon(3);
        LiveWindow.addActuator("Chassis", "Speed Controller 3", (Talon) chassisSpeedController3);
        
        chassisSpeedController4 = new Talon(1);
        LiveWindow.addActuator("Chassis", "Speed Controller 4", (Talon) chassisSpeedController4);
        
        chassisRobotDrive41 = new RobotDrive(chassisSpeedController1, chassisSpeedController4,
              chassisSpeedController2, chassisSpeedController3);
        
        chassisRobotDrive41.setSafetyEnabled(true);
        chassisRobotDrive41.setExpiration(0.1);
        chassisRobotDrive41.setSensitivity(0.5);
        chassisRobotDrive41.setMaxOutput(1.0);
        chassisRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        chassisRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        ballCollectorleftBallSuck = new Talon(4);
        LiveWindow.addActuator("BallCollector", "leftBallSuck", (Talon) ballCollectorleftBallSuck);
        
        ballCollectorrightBallSuck = new Talon(5);
        LiveWindow.addActuator("BallCollector", "rightBallSuck", (Talon) ballCollectorrightBallSuck);
        
        shooterleftShoot = new Talon(6);
        LiveWindow.addActuator("Shooter", "leftShoot", (Talon) shooterleftShoot);
        
        shooterrightShoot = new Talon(7);
        LiveWindow.addActuator("Shooter", "rightShoot", (Talon) shooterrightShoot);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chassisSensorsGyro1 = new ADXRS450_Gyro();
        LiveWindow.addSensor("ChassisSensors", "Gyro 1", chassisSensorsGyro1);
        chassisSensorsAccelerometer1 = new ADXL345_SPI(SPI.Port.kOnboardCS1, Range.k2G);
        LiveWindow.addSensor("ChassisSensors", "Accelerometer 1", chassisSensorsAccelerometer1);
    }
}