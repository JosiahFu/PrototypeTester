package frc.robot.modules;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboardTab;

public class SmartDashboardTalonFX {
    private TalonFX motor;
    private ControlMode m_controlMode;
    private String m_name;
    private double m_demand;

    public SmartDashboardTalonFX(int port, String name) {
        motor = new TalonFX(port);
        m_name = name;
    }

    public void periodic() {
        updateSmartDashboard();
        motor.set(m_controlMode, m_demand);
    }

    private void updateSmartDashboard() {
        SmartDashboardTab.putNumber("Prototyping", m_name, m_demand);
    }
}
