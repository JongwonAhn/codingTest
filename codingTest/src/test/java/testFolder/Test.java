package testFolder;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONArray;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class Test {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        URL url = null;
        String readLine = null;
        StringBuilder buffer = null;
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        HttpURLConnection urlConnection = null;

        int connTimeout = 50000;
        int readTimeout = 100000;

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("NAME", "홍길동");
        jsonObject.addProperty("PHONE_NUMBER", "01012341234");
        jsonObject.addProperty("E_MAIL", "ccc@cc.com");

        String apiUrl = "http://211.106.171.36:50000/RESTAdapter/RecruitingTest";    // 각자 상황에 맞는 IP & url 사용

        try
        {
            url = new URL(apiUrl);

            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setConnectTimeout(connTimeout);
            urlConnection.setReadTimeout(readTimeout);
            urlConnection.setRequestProperty("Content-Type", "application/json;");
            urlConnection.setDoOutput(true);
            urlConnection.setInstanceFollowRedirects(true);

            outputStream = urlConnection.getOutputStream();

            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
            bufferedWriter.write(jsonObject.toString());
            bufferedWriter.flush();

            buffer = new StringBuilder();
            if(urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK)
            {
                bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
                while((readLine = bufferedReader.readLine()) != null)
                {
                    buffer.append(readLine).append("\n");
                }
            }
            else
            {
                buffer.append("\"code\" : \""+urlConnection.getResponseCode()+"\"");
                buffer.append(", \"message\" : \""+urlConnection.getResponseMessage()+"\"");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        /*System.out.println("결과 : " + buffer.toString());*/
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(buffer.toString());

        String xml_data = element.getAsJsonObject().get("XML_DATA").getAsString();
        //System.out.println("xml_data = "+xml_data);
        byte[] decodedBytes = Base64.getDecoder().decode(xml_data);
        String decodedString = new String(decodedBytes,"EUC-KR");

        System.out.println("decodedString = " + decodedString);


        // xml 파일을 document로 파싱하기

        String data = decodedString;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource( new StringReader( data ) );
        Document doc = builder.parse( is );
        System.out.println(doc.getElementsByTagName("HEADER"));

        for(int i=0; i<doc.getElementsByTagName("HEADER").getLength(); i++){
            for(int j=0; j<doc.getElementsByTagName("HEADER").item(i).getChildNodes().getLength(); j++) {
                System.out.println(doc.getElementsByTagName("HEADER").item(i).getChildNodes().item(j).getTextContent());
            }
        }
        //        String json_data =  element.getAsJsonObject().get("JSON_DATA").getAsString();
//        System.out.println("json_data = " + json_data);



    }

}
