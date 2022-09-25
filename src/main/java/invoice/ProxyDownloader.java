package invoice;

import javax.script.ScriptEngine;
import java.util.HashMap;

public class ProxyDownloader implements InvoiceDownload{
    InvoiceDownload invoiceDownloader;

    HashMap<String, String> invoiceCache = new HashMap<String, String>();

    public ProxyDownloader (InvoiceDownload invoiceDownloader) {
        this.invoiceDownloader = invoiceDownloader;
    }

    @Override
    public String downloadInvoice(String iic, String cratedDate, String tin) {
        String fatura = "";
        if (invoiceCache.keySet().contains(iic)){
            fatura = invoiceCache.get(iic);
            return fatura;
        }

        fatura = this.invoiceDownloader.downloadInvoice(iic , cratedDate, tin);
        this.invoiceCache.put(iic, fatura);
        return fatura;
    }
}
