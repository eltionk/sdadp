package invoice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.IOException;

public class DPTinvoiceD implements InvoiceDownload{
    @Override
    public String downloadInvoice(String iic, String cratedDate, String tin) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("iic", iic)
                .addFormDataPart("dateTimeCreated", cratedDate)
                .addFormDataPart("tin", tin)
                .build();
        Request request = new Request.Builder()
                .url("https://efiskalizimi-app.tatime.gov.al/invoice-check/api/verifyInvoice")
                .method("POST", body)
                .build();

        try {
            Response response = client.newCall(request).execute();
            String teDhenatFatura = response.body().string();
            String faturaSuper = formatInvoice(teDhenatFatura);
            return faturaSuper;
        } catch (IOException exception) {
            System.out.println("Ndodhi një gabim");
        }
        return "";
    }

    private String formatInvoice(String teDhenatFatura) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement faturaBukur = JsonParser.parseString(teDhenatFatura);
        String faturaSuper = gson.toJson(faturaBukur);
        return faturaSuper;
    }
}
