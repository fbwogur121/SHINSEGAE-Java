package august.aug_0805.morningTest;

public class ShopService {
    // 1. 자신의 객체를 정적(static) 필드에 미리 생성
    private static ShopService instance = new ShopService();

    // 2. 생성자를 private으로 막아서 외부에서 new로 못 만들게 함
    private ShopService() {
    }

    // 3. 오직 이 메소드로만 객체를 얻도록 함
    public static ShopService getInstance() {
        return instance;
    }
}
