package com.testapps.sararagab.dataclass;

public class babynames {
    String babyname;
    String babyNamedesc;

    public String getBabyname() {
        return babyname;
    }

    public void setBabyname(String babyname) {
        this.babyname = babyname;
    }

    public String getBabyNamedesc() {
        return babyNamedesc;
    }

    public void setBabyNamedesc(String babyNamedesc) {
        this.babyNamedesc = babyNamedesc;
    }

    public babynames(String mbabyname, String mbabynamedesc) {

        this.babyname = mbabyname;
        this.babyNamedesc = mbabynamedesc;

    }
}
