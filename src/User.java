public class User {
    private String login;
    private String password;
    private Basket kor;

    public void setLogin(String login) {
        this.login = login;
    }
    public String getLogin() {
        return login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setKor(Basket kor) {
        this.kor = kor;
    }
    public Basket getKor() {
        return kor;
    }
    public int Enter(String login,String password){
        if(this.login.equals(login) && this.password.equals(password)){
            System.out.println("Вход выполнен");
            return 1;
        }
        else{
            System.out.println("Данные не совпадают. Попробуйте снова");
            return -1;
        }
    }
    public void ShowBasket(){
        for(int i = 0; i < kor.getKor().length;i++){
            Item temp = kor.getKor()[i];
            System.out.println(i+1 + ")" +temp.getName() + "(" + temp.getRate() + ") - " + temp.getCost() + " руб\n");
        }
    }
}
