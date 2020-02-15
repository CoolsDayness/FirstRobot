/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
  /**
   * Creates a new DriveSubsystem.
   */
  
  private final DifferentialDrive m_robotDrive;
  public DriveSubsystem() {
    m_robotDrive = new DifferentialDrive(Constants.m_left,Constants.m_right);
  }
  public void drive(double xSpeed, double zRotation){
    m_robotDrive.arcadeDrive(xSpeed,zRotation);
  }
  public void shoot(double speed){
    Constants.m_shooter.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
