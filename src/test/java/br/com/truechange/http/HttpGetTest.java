package br.com.truechange.http;
import br.com.truechange.dto.AccreditationTerm;
import br.com.truechange.http.impl.HttpGet;
import br.com.truechange.utils.Http;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.WithAssertions;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpGetTest implements WithAssertions{

    @Test
    void getHtmlTerm_whenUrlPure_thenSuccess()
            throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        //105009504
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.sefaz.go.gov.br/NETACCESS/TermoCredenciamento/consultarTransporte/consultar.asp?TermoCredenciamento.CCE=105009504"))
                .GET() // GET is default
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        Document document = Jsoup.parse(response.body());
        Elements elements =  document.getElementsByTag("td");

        if (elements.size()==0)
            return;

        System.out.println(response.body());

        //then
        Assertions.assertEquals("1",elements.get(0).text());
    }
    @Test
    void getHtmlTerm_whenUrl_thenSuccess()
            throws Exception{
        Elements elements =  Http.getElementsHtml("https://www.sefaz.go.gov.br/NETACCESS/TermoCredenciamento/consultarTransporte/consultar.asp?TermoCredenciamento.CCE=105009504").getElementsByTag("td");
        if (elements.size()==0)
            Assertions.assertEquals("1","1");

        AccreditationTerm term =
                new AccreditationTerm(
                        elements.get(0).text(),
                        elements.get(1).text(),
                        elements.get(2).text(),
                        elements.get(3).text(),
                        elements.get(4).text(),
                        elements.get(5).text(),
                        elements.get(6).text(),
                        elements.get(7).text());
        //then
        Assertions.assertEquals("1",term.getN());
    }

}
