public class PersonalInfoData extends BaseData {
    /**
     * any other data which you can say is not base data,
     * for example personal information needed for signing up for account
     */
    public String firstName;
    public String secondName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
