package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private DcMotorEx intakeMotor;

    private double positionModifier;
    private double targetPosition;
    private double powerIncrement;

    private double actualPosition;
    private double powerDecrement;

    private double armMotorCurrentPower;

    public double TARGET_INCREMENT;
    public double MAX_POSITION;

    public double startPosition;
    public double endPosition;

    public Intake(HardwareMap map, String armName) {
        intakeMotor = map.get(DcMotorEx.class, armName);

        intakeMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        intakeMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//BL -----------------=-afahfia;ohfe;woiufhaw;oeifhaw;oeifhaw;oeifjawo;iefjaewoi;fawefij;oaefwi;ojaefwij;o
//        this.powerIncrement = powerIncrement;
//
//        positionModifier = intakeMotor.getCurrentPosition();
//        targetPosition = getCurrentPosition();
//
//        startPosition = getCurrentPosition(); // set startPosition to start position of motor
//        endPosition = startPosition - 50; // create endPosition to create a max/min range of motor movement. FOR TELEOP
//
//        armMotorCurrentPower = 0;
    }
//
//    public void moveVelocity(double velocity) { // auto set velocity function
//        if ((velocity > 0 && getCurrentPosition() > MAX_POSITION) || (velocity < 0 && getCurrentPosition() < -50)) {
//            intakeMotor.setVelocity(1);
//        } else {
//            intakeMotor.setVelocity(velocity);
//        }
//    }

    public void movePower(boolean direction) { // teleop move function
        if (direction) {
            intakeMotor.setPower(-0.5);
        } else {
            intakeMotor.setPower(0.5);
        }
    }
//
//    public boolean moveToTarget() {
//
//        actualPosition = getCurrentPosition();
//        if (actualPosition < targetPosition + 10 && actualPosition > targetPosition - 10) {
//            intakeMotor.setPower(0.05);
//            return true;
//        } else if (actualPosition < targetPosition) {
//            intakeMotor.setPower(0.3);
//
//            return false;
//        } else {
//            intakeMotor.setPower(-0.3);
//
//            return false;
//        }
//    }
//
//    public double getCurrentPosition() {
//        return intakeMotor.getCurrentPosition() - positionModifier;
//    }
//
//    public void setZeroPosition() {
//        positionModifier = intakeMotor.getCurrentPosition();
//        targetPosition = getCurrentPosition();
//    }

//    public void incrementTargetPosition() {
//        if (!(targetPosition > MAX_POSITION)) {
//            targetPosition += TARGET_INCREMENT;
//        }
//    }
//
//    public void decrementTargetPosition() {
//        if (targetPosition + 50 > TARGET_INCREMENT) {
//            targetPosition -= TARGET_INCREMENT;
//        }
//    }

    //Stops
    public void stop() {
        intakeMotor.setPower(0);

    }

//
//    public double getModifier() {
//        return positionModifier;
//    }
}