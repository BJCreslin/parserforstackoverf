package classesForParsing;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Valute {
    @JsonAlias({"aud","AUD"})
    private AUD aud;
    @JsonAlias({"azn","AZN"})
    private AZN azn;
}
