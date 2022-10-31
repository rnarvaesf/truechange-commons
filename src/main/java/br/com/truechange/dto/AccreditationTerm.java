package br.com.truechange.dto;

public class AccreditationTerm {
    private String n;
    private String cce;
    private String term;
    private String name;
    private String status;
    private String description;
    private String startExpirationDate;
    private String endExpirationDate;

    public AccreditationTerm(){}
    public AccreditationTerm(String n, String cce, String term, String name, String status, String description, String startExpirationDate, String endExpirationDate) {
        this.n = n;
        this.cce = cce;
        this.term = term;
        this.name = name;
        this.status = status;
        this.description = description;
        this.startExpirationDate = startExpirationDate;
        this.endExpirationDate = endExpirationDate;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getCce() {
        return cce;
    }

    public void setCce(String cce) {
        this.cce = cce;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartExpirationDate() {
        return startExpirationDate;
    }

    public void setStartExpirationDate(String startExpirationDate) {
        this.startExpirationDate = startExpirationDate;
    }

    public String getEndExpirationDate() {
        return endExpirationDate;
    }

    public void setEndExpirationDate(String endExpirationDate) {
        this.endExpirationDate = endExpirationDate;
    }
}
