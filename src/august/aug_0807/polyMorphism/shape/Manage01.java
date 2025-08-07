package august.aug_0807.polyMorphism.shape;

public class Manage01 {
    // 사각형, 삼각형, 원 클래스는 서로 다른 타입이므로 각각 타입을 정의해서 같은 타입끼리 묶어 관리학겠다.
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle();
        }

        Triangle[] triangles = new Triangle[5];
        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle();
        }

        Circle[] circles = new Circle[3];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }

        Shape[] shapes = new Shape[4];
        shapes[0] = rectangles[0];
        shapes[1] = rectangles[1];
        shapes[2] = rectangles[2];
        shapes[3] = circles[2];

        Circle circle = (Circle) shapes[3]; // 다운캐스팅
    }
}

// Circle, Triangle, Rectangle 세가지를 하나의 자료형 Shpae 으로 관리하니 코드량도 적어지고 가독성, 유지보수성이 좋아짐.
// 자식클래스에서만 있는 고유 메서드를 실행하려면 업스케일링한 객체를 다시 자식클래스로 다운캐스팅 해 주어야 한다.