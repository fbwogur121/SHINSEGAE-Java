package august.aug_0826_serialize.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJsonEx {
    public static void main(String[] args) throws IOException {
        // 1. json 객체 생성
        JSONObject root = new JSONObject();

        // 2. json 객체에 속성들 추가
        root.put("id", "rjh");
        root.put("name", "류재혁");
        root.put("pw", "1234");

        // 3. 복합 속성(배열 속성) 추가
        JSONObject tel = new JSONObject();
        tel.put("home", "010-1111-1414");
        tel.put("mobile", "010-1111-1212");
        root.put("tel", tel);

        JSONArray skill = new JSONArray();
        skill.put("Java");
        skill.put("Kotlin");
        skill.put("JPA");
        skill.put("SpringBoot");
        root.put("skill", skill);

        // 4. json 객체 얻기
        String json = root.toString();

        // 5. 콘솔에 출력
        System.out.println(json);

        // 6. 파일에 출력(파일에 저장)
        try (Writer writer = new FileWriter("rjh.json", Charset.forName("UTF-8"))) {
            writer.write(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
