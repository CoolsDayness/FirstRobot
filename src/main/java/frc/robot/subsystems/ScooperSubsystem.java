/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ScooperSubsystem extends SubsystemBase {
  /**
   * Creates a new ScooperSubsystem.
   */
  private static final SpeedController m_scooper = new PWMVictorSPX(Constants.m_scooper);
  public ScooperSubsystem() {

  }
  public void scooper(double scooper){
    m_scooper.set(scooper);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
