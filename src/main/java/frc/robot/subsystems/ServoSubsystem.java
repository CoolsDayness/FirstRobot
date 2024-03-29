/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ServoSubsystem extends SubsystemBase {
  private static final Servo M_SERVO = new Servo(Constants.m_servo);
  /**
   * Creates a new ServoSubsystem.
   */

   
  public ServoSubsystem() {

  }

  public void aim(double pos){
    M_SERVO.setPosition(pos);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
