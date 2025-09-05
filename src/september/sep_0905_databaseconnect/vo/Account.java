package september.sep_0905_databaseconnect.vo;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
    private String ano;
    private String owner;
    private Long balance;
}
