public class Password {
    private static String password = "我爱你";  // 默认开机密码

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Password.password = password;
    }

    @Override
    public String toString() {
        return "Password{" +
                "password='" + password + '\'' +
                '}';
    }
}
