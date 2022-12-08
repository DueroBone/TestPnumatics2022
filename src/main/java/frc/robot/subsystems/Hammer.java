package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class Hammer {
    private static DoubleSolenoid piston;
    Compressor compressor;
    public Hammer(){
    piston = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 3, 4);
    }
    public static Command contract(final boolean contracted) {
        System.out.println("Is hammer extended: " + contracted);
    
        if (contracted) {    // if true then shift to low gear
          piston.set(DoubleSolenoid.Value.kForward); // solenoid controls output that pulls piston in or out
        } else {
          piston.set(DoubleSolenoid.Value.kReverse);
        }
        return null;
    }
    public static void pistonToggle(){
      piston.toggle();
    }
}