import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    // Привет
    // здоавтсуйтет
    // здравствуйте правильно
    //okgbqwogjqoeigjpgiorjwuirghiueng3rjhiJ3WRTIFSJGKKASRJKIw5yo4mgi3q5kgi9gjku9i5j

    private static Category[] catalogue = new Category[3];
    private static User user = new User();
    private static Basket basket = new Basket();
    private static String[] categoriesNames = {"Мясные продукты", "Молочные продукты", "Хлебобулочные изделия"};
    public static void main(String[] args) {
        user.setLogin("admin");
        user.setPassword("admin");
        boolean entered = false;
        String str2;
        System.out.println("Добро пожаловать в Пятёрочку");
        Start();
        while(true){
            if(entered){
                str2 = "2) Корзина\n";
            } else{
                str2 = "2) Войти в аккаунт \n";
            }
            System.out.println("------------------\nМеню действий\n" +
                    "1) Посмотреть каталог\n" +
                    str2 +
                    "Выберите действие:");
            int c = scan.nextInt();
            scan.nextLine();
            switch(c){
                case 1:
                    System.out.println("У нас есть такие продукты:");
                    printCatalog();
                    break;
                case 2:
                    if(entered){
                        System.out.println("Меню действий:\n" +
                                "1) Просмотреть корзину\n" +
                                "2) Добавить в корзину\n" +
                                "Выберите действие:");
                        int c1 = scan.nextInt();
                        switch (c1){
                            case 1:

                                break;
                            case 2:
                                break;
                        }

                    }else {
                        System.out.print("Введите логин:");
                        String log = scan.nextLine();
                        System.out.print("Введите пароль:");
                        String pw = scan.nextLine();
                        if (user.Enter(log, pw) == 1) {
                            entered = true;
                        } else {
                            entered = false;
                        }
                    }
                    break;
            }
        }
    }
    public static void Start(){
        for (int i = 0; i < catalogue.length; i++) {
            catalogue[i] = new Category();
            catalogue[i].setName(categoriesNames[i]);
            Item[] temp = new Item[5];
            for (int i1 = 0; i1 < temp.length; i1++) {
                temp[i1] = new Item();
                temp[i1].setName("HH" + i);
            }
            catalogue[i].setArray(temp);
        }
    }
    public static void printCatalog(){
        for (int i = 0; i < catalogue.length; i++) {
            System.out.println(i+ 1 + ")" +catalogue[i].getName() + ":\n" + catalogue[i].itemList());
        }
    }
}