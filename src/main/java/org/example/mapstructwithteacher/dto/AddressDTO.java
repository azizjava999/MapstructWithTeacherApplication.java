package org.example.mapstructwithteacher.dto;

public class AddressDTO {
    private String cnt;
    private String cty;

    @Override
    public String toString() {
        return "AddressDTO{" +
                "cnt='" + cnt + '\'' +
                ", cty='" + cty + '\'' +
                '}';
    }

    public AddressDTO() {
    }

    public AddressDTO(String cnt, String cty) {
        this.cnt = cnt;
        this.cty = cty;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getCnt() {
        return cnt;
    }

    public String getCty() {
        return cty;
    }
}
