package br.com.truechange.http.impl;

import br.com.truechange.dto.AccreditationTerm;
import br.com.truechange.utils.Http;
import org.jsoup.select.Elements;

public class HttpGet implements br.com.truechange.http.HttpGet {


    public HttpGet(){}

    @Override
    public AccreditationTerm getElementsHtml(String url) throws Exception {
        Elements elements =  Http.getElementsHtml(url).getElementsByTag("td");
        if (elements.size()==0)
            return null;

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

        return  term;
    }
}
