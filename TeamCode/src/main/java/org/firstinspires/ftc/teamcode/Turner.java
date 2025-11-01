package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Turner {
    private CRServo crServo;

    public Turner(HardwareMap map, String name) {
        crServo = map.get(CRServo.class, name);
    }

    public void movePower(boolean forward) {
        if(forward) {
            crServo.setPower(0.5);
        } else {
            crServo.setPower(-0.5);
        }
    }

    public void stop() {
        crServo.setPower(0);
    }
}
