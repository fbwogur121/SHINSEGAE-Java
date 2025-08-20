package board_Proj_v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data // getter/setter 자동생성 지원
@Builder // builder 패턴 사용
@NoArgsConstructor // 디폴트 생성자
@AllArgsConstructor // 모든 변수 들어간 생성자
public class Board {
    private int bno;
    private String bWriter;
    private Date bDate;
    private String bTitle;
    private String bContent;
}