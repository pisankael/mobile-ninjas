package homeTask;

public class Role {

    boolean isSuperUser;
    int value;

    public Role() {
    }

    public Role(boolean isSuperUser, int value) {
       this.isSuperUser = isSuperUser;
       this.value = value;

    }

    public boolean getIsSuperUser(boolean isSuperUser) {
        return isSuperUser;
    }

    public void setSuperUser(boolean isSuperUser) {
        this.isSuperUser = isSuperUser;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
