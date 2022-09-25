package invoice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        InvoiceDownload real = new DPTinvoiceD();
        InvoiceDownload invoiceDownloader = new ProxyDownloader(real);
        long start = System.currentTimeMillis();
        for (int i=0; i<100; i++){
        String fatura = invoiceDownloader.downloadInvoice("67B2E3AD6DB1BEA5E9C220B88B4D3422", "2022-09-25T10:50:46 02:00", "L07004002P");
            System.out.println(fatura);
        }
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println("Koha per marrjen e informacioneve është " + diff);
    }
}