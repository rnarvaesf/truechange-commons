package br.com.truechange.http;


import br.com.truechange.dto.AccreditationTerm;

public interface HttpGet {
    AccreditationTerm getElementsHtml(String url) throws Exception;
}
