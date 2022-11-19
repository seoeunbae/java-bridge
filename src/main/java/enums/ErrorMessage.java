package enums;

public enum ErrorMessage {
    INVALID_BRIDGE_SIZE("[ERROR] 유효한 다리 길이가 아닙니다. 유효 다리 길이는 3이상 20이하 입니다.");
    private String value;

    ErrorMessage(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
