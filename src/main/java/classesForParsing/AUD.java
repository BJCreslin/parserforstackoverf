package classesForParsing;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AUD {
    @JsonAlias("ID")
    private String id;
    @JsonAlias("NumCode")
    private long numCode;
    @JsonAlias("CharCode")
    private String charCode;
    @JsonAlias("Nominal")
    private String nominal;
    @JsonAlias("Name")
    private String name;
    @JsonAlias("Value")
    private BigDecimal value;
    @JsonAlias("Previous")
    private BigDecimal previous;


}
