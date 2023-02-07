package data;

import com.sun.jdi.PrimitiveValue;

public enum UserEnam {
    VALIDUSER("valid", true), NOTVALIDMAIL("noemail", false),NOTTELEPHONENUMBERS("NOTEL",false);
    private String type;

    UserEnam(String type, boolean result) {
        this.type = type;
        this.result = result;
    }

    public boolean isResult() {
        return result;
    }

    private boolean result;
    public String getType(){
        return type;
    }
}
