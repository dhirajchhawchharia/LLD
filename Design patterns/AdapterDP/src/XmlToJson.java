class JSONAnalyticsTool {
    String jsonData;

    public void setJsonData(String s) {
        jsonData = s;
    }

    public void analyseData() {
        if(jsonData.contains("json")) {
            System.out.println("Analysing json data");
        }
        else {
            System.out.println("Not JSON data. Please convert to json");
        }
    }
}

interface AnalyticsToolConverter {
    public void analyseData(String s);
}

class XmlToJsonConverter implements  AnalyticsToolConverter {
    JSONAnalyticsTool jsonAnalyticsTool;

    public XmlToJsonConverter() {
        System.out.println("Creating new json analytics tool");
        jsonAnalyticsTool = new JSONAnalyticsTool();
    }

    @Override
    public void analyseData(String s) {
        s += ": converted to json";
        jsonAnalyticsTool.setJsonData(s);
        jsonAnalyticsTool.analyseData();
    }
    
}

public class XmlToJson {
    public static void main(String[] args) {
        // case 1
        String jsonData = "This is json data";
        JSONAnalyticsTool jsonAnalyticsTool = new JSONAnalyticsTool();
        jsonAnalyticsTool.setJsonData(jsonData);
        jsonAnalyticsTool.analyseData();


        //case 2
        String jsonData2 = "This is data which is not in expected format";
        jsonAnalyticsTool.setJsonData(jsonData2);
        jsonAnalyticsTool.analyseData();

        //case 3
        String xmlData = "This is XML data";
        AnalyticsToolConverter analyticsToolConverter = new XmlToJsonConverter();
        analyticsToolConverter.analyseData(xmlData);
    }
}
