import classesForParsing.Code;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.var;

public class Solution {
    public static void main(String[] args) {
        String jsonText = "{\"Date\": \"2019-07-24T11:30:00+03:00\",\n" +
                "    \"previousDate\": \"2019-07-23T11:30:00+03:00\",\n" +
                "    \"PreviousURL\": \"\\/\\/www.cbr-xml-daily.ru\\/archive\\/2019\\/07\\/23\\/daily_json.js\",\n" +
                "    \"Timestamp\": \"2019-07-23T20:00:00+03:00\",\n" +
                "    \"Valute\": {\n" +
                "        \"AUD\": {\n" +
                "            \"ID\": \"R01010\",\n" +
                "            \"NumCode\": \"036\",\n" +
                "            \"CharCode\": \"AUD\",\n" +
                "            \"Nominal\": 1,\n" +
                "            \"Name\": \"Австралийский доллар\",\n" +
                "            \"Value\": 44.3355,\n" +
                "            \"Previous\": 44.3488\n" +
                "        },\n" +
                "        \"AZN\": {\n" +
                "            \"ID\": \"R01020A\",\n" +
                "            \"NumCode\": \"944\",\n" +
                "            \"CharCode\": \"AZN\",\n" +
                "            \"Nominal\": 1,\n" +
                "            \"Name\": \"Азербайджанский манат\",\n" +
                "            \"Value\": 36.9976,\n" +
                "            \"Previous\": 37.1221\n" +
                "        }\n" +
                "   }\n" +
                "}";

        var objectMapper = new ObjectMapper();
        System.out.println(jsonText);
        objectMapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS,true);
        objectMapper.configure(DeserializationFeature.USE_LONG_FOR_INTS,true);
        try{
            Code code = objectMapper.readValue(jsonText, Code.class);
            System.out.println(code);
            System.out.println(code.getValute());
            System.out.println(code.getValute().getAud());
            System.out.println(code.getValute().getAzn());

        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
            System.out.println("Error parsing");
        }


    }
}
