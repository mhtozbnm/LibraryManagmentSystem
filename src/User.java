public class User {
    private String userTc;
    private String name;
    private String surname;

    public User(String userTc, String name, String surname) {
        this.userTc = userTc;
        this.name = name;
        this.surname = surname;
    }

    public User() {

    }

    public String getUserTc() {
        return userTc;
    }

    public void setUserTc(String userTc) {
        if (is_tc_correct(userTc) == true){
           this.userTc = userTc;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2) this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length() >= 2) this.surname = surname;
    }

    public static boolean is_tc_correct(String userTc) {
        if (userTc.length() == 11) {
            boolean hata = false;
            for (int i = 0; i<10; i++) {
                if(Character.isDigit(userTc.charAt(i)) == false) {
                    hata = true;
                }
            }
            if (hata == true) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
