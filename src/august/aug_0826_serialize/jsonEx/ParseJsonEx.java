package august.aug_0826_serialize.jsonEx;

// Json에서 속성 순서는 중요하지 않아 추가한 순서대로 작성하지 않아도 상관없다.
// 줄바꿈 처리도 되지 않음. 오히려 이 점이 네트워크 전송량을 줄여주어 장점이 되었다.

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

// .json 파일을 파싱하는 방법 실습
public class ParseJsonEx {
    public static void main(String[] args) throws IOException {
        // 파일로부터 Json 읽어오기
        try (BufferedReader br = new BufferedReader(new FileReader("rjh.json", Charset.forName("UTF-8")))) {
            String json = br.readLine();
            JSONObject root = new JSONObject(json);
            System.out.println(root.getString("name"));
            System.out.println(root.getString("id"));
            System.out.println(root.getString("pw"));

            JSONObject obj = root.getJSONObject("tel");
            System.out.println("home tel: " + obj.getString("home"));
            System.out.println("mobile tel: " + obj.getString("mobile"));

            JSONArray skill = root.getJSONArray("skill");
            for (int i = 0; i < skill.length(); i++) {
                System.out.print(skill.getString(i) + " ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
