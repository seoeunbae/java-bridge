package util;

import enums.BridgeEnum;
import enums.ErrorMessage;

import java.util.regex.Pattern;

public class ValidationUtil {
    public static int isValidSize(int size){
        if(size < BridgeEnum.MIN_SIZE.getValue() || size > BridgeEnum.MAX_SIZE.getValue()) throw new IllegalArgumentException(ErrorMessage.INVALID_BRIDGE_SIZE.getValue());
        return size;
    }

    public static String isValidMoving(String moving) {
        if( !Pattern.matches("^[UD]$", moving) ) throw new IllegalArgumentException(ErrorMessage.INVALID_MOVING_SPOT.getValue());
        return moving;
    }

    public static String isValidRetry(String retrial) {
        if( !Pattern.matches("^[RG]$", retrial) ) throw new IllegalArgumentException(ErrorMessage.INVALID_RETRIAL.getValue());
        return retrial;
    }

}
