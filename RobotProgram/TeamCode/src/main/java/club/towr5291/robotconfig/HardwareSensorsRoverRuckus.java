package club.towr5291.robotconfig;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import club.towr5291.functions.Constants;
import club.towr5291.functions.FileLogger;
import club.towr5291.functions.TOWR5291Utils;
import club.towr5291.libraries.robotConfig;
import club.towr5291.libraries.robotConfigSettings;

public class HardwareSensorsRoverRuckus {

    public DigitalChannel limitSwitch1AngleMotor;
    public DigitalChannel limitSwitch2AngleMotor;
    public DigitalChannel limitSwitch3AngleMotor;
    public DigitalChannel limitSwitch4AngleMotor;
    /* local OpMode members. */
    HardwareMap hwMap            = null;
    //set up the variables for the logger
    private FileLogger fileLogger = null;
    private static final String TAG = "HardwareDriveMotors";

    /* Constructor */
    public HardwareSensorsRoverRuckus(){

    }

    public void init(FileLogger fileloggerhandle, HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        this.fileLogger = fileloggerhandle;

        limitSwitch1AngleMotor = hwMap.get(DigitalChannel.class, "limitSwitch1");
        limitSwitch2AngleMotor = hwMap.get(DigitalChannel.class, "limitSwitch2");
        limitSwitch3AngleMotor = hwMap.get(DigitalChannel.class, "limitSwitch3");
        limitSwitch4AngleMotor = hwMap.get(DigitalChannel.class, "limitSwitch4");

        limitSwitch1AngleMotor.setMode(DigitalChannel.Mode.INPUT);
        limitSwitch2AngleMotor.setMode(DigitalChannel.Mode.INPUT);
        limitSwitch3AngleMotor.setMode(DigitalChannel.Mode.INPUT);
        limitSwitch4AngleMotor.setMode(DigitalChannel.Mode.INPUT);

    }


    public boolean getLimitSwitch1AngleMotorState() {
        return limitSwitch1AngleMotor.getState();
    }

    public boolean getLimitSwitch2AngleMotorState() {
        return limitSwitch2AngleMotor.getState();
    }

    public boolean getLimitSwitch3AngleMotorState() {
        return limitSwitch3AngleMotor.getState();
    }

    public boolean getLimitSwitch4AngleMotorState() {
        return limitSwitch4AngleMotor.getState();
    }

}
