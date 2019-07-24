package classesForParsing;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Code {
    @JsonAlias("Date")
    private String date;
    @JsonAlias("PreviousDate")
    private String previousDate;
    @JsonAlias("PreviousURL")
    private String previousURL;
    @JsonAlias("Timestamp")
    private String timestamp;
    @JsonAlias("Valute")
    private Valute valute;
}
