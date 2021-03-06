/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase {
  /**
   * Creates a new PneumaticsSubsystem.
   */
  
  private static final DoubleSolenoid m_solenoid = new DoubleSolenoid(Constants.m_solenoid1, Constants.m_solenoid2);
  
   public PneumaticsSubsystem() {
  }
  
  public void Up(){
    m_solenoid.set(Value.kForward);
  }

  public void Down(){
    m_solenoid.set(Value.kReverse);
  } 

  public void Off(){
    m_solenoid.set(Value.kOff);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
