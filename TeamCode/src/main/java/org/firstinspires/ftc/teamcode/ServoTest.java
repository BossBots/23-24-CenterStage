package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class ServoTest extends LinearOpMode {
    private Servo claw;
    private double releasePos = 0.4;
    private double storePix = 0.35;
    @Override
    public void runOpMode() throws InterruptedException {
        // Initialize claw servos
        claw = hardwareMap.get(Servo.class, "clawServo");

        // Wait for the start button to be pressed
        waitForStart();

        while (opModeIsActive()) {
            // Open the claw
            claw.setPosition(storePix);
            sleep(1000); // Wait for 1 second

            // Close the claw
            claw.setPosition(releasePos);
            sleep(1000); // Wait for 1 second
        }
    }
}
