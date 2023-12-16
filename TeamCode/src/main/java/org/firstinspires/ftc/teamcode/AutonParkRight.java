package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class AutonParkRight extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        Mecanum mecanum = new Mecanum(
                hardwareMap.get(BNO055IMU.class, "imu"),
                hardwareMap.get(DcMotor.class, "frontLeft"),
                hardwareMap.get(DcMotor.class, "frontRight"),
                hardwareMap.get(DcMotor.class, "backRight"),
                hardwareMap.get(DcMotor.class, "backLeft")
        );
        waitForStart();
        if (opModeIsActive()) {
            mecanum.forward(0.5, 0, 1300);
            mecanum.forward(-0.5, 0, 1300);

            mecanum.drift(0.5, 0, 450);
        }
    }
}
