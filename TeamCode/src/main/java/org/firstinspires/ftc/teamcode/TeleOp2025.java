package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.Intake;

@TeleOp(name = "Alpha", group = "competition")
public class TeleOp2025 extends OpMode {
    DriveTrain drive;
//    Intake intake;
//    Arm arm;
//    Slide slide;
//    ArmServo1 armServo1;
    Claw PTOtoggle1;
//    Turner greenSwitch;
//    Turner purpleSwitch;
//    Turner fullRotator1;
//    Turner fullRotator2;
    // Claw claw3;
    // Claw claw4;
//    Claw claw5;

    boolean doneInit = false;

    boolean intakeOn = false;
    // boolean pastBack = false;
    // boolean currentBack;
     boolean pastA = false;
     boolean currentA;
    // boolean pastY = false;
    // boolean currentY;
    // boolean pastX = false;
    // boolean currentX;
    // boolean pastB = false;
    // boolean currentB;
    // boolean pastB2 = false;
    // boolean currentB2;

     boolean pastD_Up = false;
     boolean currentD_Up;
    // boolean pastD_Down = false;
    // boolean currentD_Down;
    // boolean pastD_Right = false;
    // boolean currentD_Right;
    boolean halfSpeed = false;
    double multiplier;

     boolean pastRightTriggered = false;
//    boolean pastLeftTriggered = false;
     boolean currentRightTrigger = false;
     boolean currentLeftTrigger = false;
     double rightTriggerValue = 0;
     double leftTriggerValue = 0;
    // boolean pastBumpered = false;
    // boolean currentRightBumper = false;
    // boolean currentLeftBumper = false;
    // boolean rightBumperValue = false;
    // boolean leftBumperValue = false;

//    boolean pastServo1ed = false;
    boolean greenActive = false;
    int greenNum = 0;
    boolean purpleActive = false;
    int purpleNum = 0;

    // boolean holdArm = false;

    @Override
    public void start() {
        while(!doneInit){}
        PTOtoggle1.open(); //vertical flip
        // claw2.open(); // horizontal flip
        // claw3.close(); //
        // claw4.open();
//         claw5.close();
//         arm.setZeroPosition();
//         armServo1.zeroEncoder();
//        slide.setZeroPosition();

        //intake.setState("off");
    }

    @Override
    public void init() {
        drive = new DriveTrain(hardwareMap, "fl", "fr", "bl", "br");
//        intake = new Intake(hardwareMap, "intake");
        PTOtoggle1 = new Claw(hardwareMap, "PTO1", 0.68, 1);
//        greenSwitch = new Turner(hardwareMap, "green");
//        purpleSwitch = new Turner(hardwareMap, "purple");
//        fullRotator1 = new Turner(hardwareMap, "rot1");
//        fullRotator2 = new Turner(hardwareMap, "rot2");

        // arm = new Arm(hardwareMap, "am1", 10, 1100, 0.05);
//        slide = new Slide(hardwareMap, "am2", 10, 1100, 0.05);
        // armServo1 = new ArmServo1(hardwareMap, "claw5", 0, 1000);
//         claw1 = new Claw(hardwareMap, "claw1", 0,0.43,0.05);
//         claw2 = new Claw(hardwareMap, "claw2", 0.78,0,0.25);
//         claw3 = new Claw(hardwareMap, "claw3", 0.65, 0.85,0);
//         claw4 = new Claw(hardwareMap, "claw4", 0.15, 0,0);
//        claw5 = new Claw(hardwareMap, "claw5", 0, 0.268);

        //intake = new Intake(hardwareMap, "intMotor");
        doneInit = true;
    }

    @Override
    public void loop() {

        // currentB2 = gamepad1.b;
        // if(currentB2 && !pastB) {
        //     halfSpeed = !halfSpeed;
        // }
        // pastB2 = currentB2;

        if(halfSpeed) {
            multiplier = 0.1;
        }else{
            multiplier = 0.6;
        }
        telemetry.addData("half speed", halfSpeed);

        drive.setPowersToZero();
        drive.calculatePower(new double[] {multiplier * gamepad1.left_stick_x, multiplier * gamepad1.left_stick_y, multiplier * -gamepad1.right_stick_x});
        drive.normalizePowers();
        drive.pushPowers();
//
//
//        currentD_Up = gamepad1.dpad_up;
//        if (currentD_Up && !pastD_Up) {
//            // Toggle intake state
//            intakeOn = !intakeOn;
//        }
//        if (intakeOn) {
//            intake.movePower(true);
//            telemetry.addData("Intake", "ON");
//        } else {
//            intake.stop();
//            telemetry.addData("Intake", "OFF");
//        }
//        pastD_Up = currentD_Up;

        currentA = gamepad1.a;
        if(currentA && !pastA) {
            PTOtoggle1.toggle();
        }
        pastA = currentA;

//        if (detects green) {
//            greenActive = true;
//            greenNum = 0;
//        } else if (detects purple) {
//            purpleActive = true;
//            purpleNum = 0;
//        }
//        if(greenActive) {
//            if(greenNum < 300) {
//                greenNum++;
//                greenSwitch.movePower(true);
//            } else {
//                greenSwitch.stop();
//                greenActive = false;
//            }
//        }
//        if (purpleActive) {
//            if (purpleNum < 300) {
//                purpleNum++;
//                purpleSwitch.movePower(false);
//            } else {
//                purpleSwitch.stop();
//                purpleActive = false;
//            }
//        }

//
//         rightTriggerValue = gamepad1.right_trigger;
//
//         if(rightTriggerValue > 0.5) {
//             currentRightTrigger = true;
//         } else {
//             currentRightTrigger = false;
//         }
//         if(currentRightTrigger && !pastRightTriggered) {
//            fullRotator1.movePower(true);
//         } else {
//             fullRotator1.stop();
//         }

//
//         leftTriggerValue = gamepad1.left_trigger;
//
//         if(leftTriggerValue > 0.5) {
//             currentLeftTrigger = true;
//         }
//         if(currentLeftTrigger && !pastLeftTriggered) {
//             fullRotator2.movePower(false);
//         }
//









//
//
//        currentD_Up = gamepad1.dpad_up;
//        if(currentD_Up && !pastD_Up) {
//            greenSwitch.movePower(true);
//            telemetry.addData("D", greenSwitch);
//        }else{
//            greenSwitch.movePower(true);
//            telemetry.addData("STOP", greenSwitch);
//        }
//        pastD_Up = currentD_Up;
//
//        currentD_Down = gamepad1.dpad_down;
//        if(currentD_Down && !pastD_Down) {
//            slide.movePower(false);
//            telemetry.addData("D", slide);
//        }else{
//            slide.stop();
//            telemetry.addData("STOP", slide);
//        }
//        pastD_Down = currentD_Down;

//        currentD_Down = gamepad1.dpad_down;
//        if(currentD_Down && !pastD_Down) {
//            intake.setState("intaking");
//        }
//        pastD_Down = currentD_Down;
//
//        currentD_Right = gamepad1.dpad_right;
//        if(currentD_Right && !pastD_Right) {
//            intake.setState("off");
//        }
//        pastD_Right = currentD_Right;
//
//
//
//
//         currentD_Right = gamepad2.dpad_right;
//         if(currentD_Right && pastD_Right){
//             loopHold0 = loopNum+100;
//             loopHold1 = loopNum+200;
//             loopHold2 = loopNum+480;
//             loopHold3 = loopNum+600;
//             loopHold4 = loopNum+750;

// //            claw1.open();
// //            claw1.close();
// //            claw2.close();
// //            claw3.open();
// //            claw1.open();
//             telemetry.addData("transferfunction", true);

//         }
//         pastD_Right = currentD_Right;
//


        // rightBumperValue = gamepad2.right_bumper;
        // leftBumperValue = gamepad2.left_bumper;

//        if(rightBumperValue) {
//            claw5.open();
//        }else{
//            claw5.close();
//        }


        // if(rightBumperValue) {
        //     currentRightBumper = true;

        // }
        // else if(leftBumperValue) {
        //     currentLeftBumper = true;
        // }

        // if(currentRightBumper) {
        //     armServo1.movePower(true);
        // }
        // else if(currentLeftBumper) {
        //     armServo1.movePower(false);
        // }

        // if(!(currentLeftBumper || currentRightBumper)) {
        //     if(!pastBumpered) {
        //         armServo1.stop();
        //     }
        // }

        // pastBumpered = currentRightBumper || currentLeftBumper;
        // currentRightBumper = false;
        // currentLeftBumper = false;

        // if(gamepad2.dpad_down){ // hold arm if  dpad down is pressed
        //     holdArm = true;
        // }

        // if(holdArm){ // hold arm
        //     arm.carry();
        // }
//
//        currentA = gamepad2.a;
//        currentY = gamepad2.y;
//        if(currentA) {
//            armServo1.open();
//            telemetry.addData("servo1up", armServo1);
//        }
//        else if(currentY) {
//            armServo1.close();
//            telemetry.addData("servo1down", armServo1);
//        }
//
//        if(!(currentA || currentY)) {
//            if(!pastServo1ed) {
//                armServo1.stop();
//                telemetry.addData("servo1stop", armServo1);
//            }
//        }
//
//        pastServo1ed = currentA || currentY;
//        currentA = false;
//        currentY = false;

        // currentB = gamepad2.b;
        // if(currentB && !pastB) {
        //     claw1.changePosition(); // claw 1 is 1st servo on vertical arm port 0

        // }
        // pastB = currentB;


        // currentX = gamepad2.x;
        // if(currentX && !pastX) {
        //     claw2.changePosition(); //flip input down port 1
        // }
        // pastX = currentX;


        // currentY = gamepad2.y;
        // if(currentY && !pastY) {
        //     claw3.toggle(); // claw for vertical arm
        // }
        // pastY = currentY;

        // currentA = gamepad2.a;
        // if(currentA && !pastA) {
        //     claw4.toggle(); // claw claw port 3
        //     claw3.toggle();
        // }
        // pastA = currentA;


        // telemetry.addData("arm Position", arm.getCurrentPosition());
        // telemetry.addData("arm 2 Position", armServo1.getCurrentPosition());
        // telemetry.update();
    }

    @Override
    public void stop() {
        drive.stop();
        // arm.stop();
//        slide.stop();
//        intake.setState("off");
//        intake.stop();
    }
}