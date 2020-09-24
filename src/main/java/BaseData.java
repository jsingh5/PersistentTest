public class BaseData {
    public String userName;
    public String password;
    public boolean githubSignIn = false;
    public boolean googleSignIn = false;
    public boolean firstTier = false;
    public boolean SecondTier = false;
    public boolean ThirdTier = false;
    public String region;
    public String dbName;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getKeySpaceName() {
        return keySpaceName;
    }

    public void setKeySpaceName(String keySpaceName) {
        this.keySpaceName = keySpaceName;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String keySpaceName;
    public String dbUserName;
    public String dbPassword;

    public PersonalInfoData personalInfoData = new PersonalInfoData();

    public PersonalInfoData getPersonalInfoData() {
        return personalInfoData;
    }

    public void setPersonalInfoData(PersonalInfoData personalInfoData) {
        this.personalInfoData = personalInfoData;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isFirstTier() {
        return firstTier;
    }

    public void setFirstTier(boolean firstTier) {
        this.firstTier = firstTier;
    }

    public boolean isSecondTier() {
        return SecondTier;
    }

    public void setSecondTier(boolean secondTier) {
        SecondTier = secondTier;
    }

    public boolean isThirdTier() {
        return ThirdTier;
    }

    public void setThirdTier(boolean thirdTier) {
        ThirdTier = thirdTier;
    }

    public boolean isGithubSignIn() {
        return githubSignIn;
    }

    public void setGithubSignIn(boolean githubSignIn) {
        this.githubSignIn = githubSignIn;
    }

    public boolean isGoogleSignIn() {
        return googleSignIn;
    }

    public void setGoogleSignIn(boolean googleSignIn) {
        this.googleSignIn = googleSignIn;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
