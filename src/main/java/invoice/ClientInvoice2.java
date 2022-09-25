package invoice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.IOException;

public class ClientInvoice2 {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("iic","BF4561E3A6CCF0CC58B65DA7ACC13E77")
                .addFormDataPart("dateTimeCreated","2022-09-25T10:48:53 02:00")
                .addFormDataPart("tin","L06515003A")
                .build();
        Request request = new Request.Builder()
                .url("https://efiskalizimi-app.tatime.gov.al/invoice-check/api/verifyInvoice")
                .method("POST", body)
                .build();

        try {
            Response response = client.newCall(request).execute();
            String teDhenatFatura = response.body().string();
            System.out.println("Të dhënat u morën\n");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonElement faturaBukur = JsonParser.parseString(teDhenatFatura);
            String faturaSuper = gson.toJson(faturaBukur);
            System.out.println(faturaSuper);
        } catch (IOException exception) {
            System.out.println("Ndodhi një gabim");
        }
        
    }
}
