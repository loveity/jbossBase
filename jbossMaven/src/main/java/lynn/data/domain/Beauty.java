package lynn.data.domain;

import java.util.Date;

public class Beauty {
    private String UUID;

    private String NAME;

    private Integer SEX;

    private String IDCARED;

    private Date BORN;

    private String ADDRESS;

    private Integer ISBEAUTY;

    private Integer ISCHU;

    private String MAJOR;

    private String TEL;

    private byte[] PHOTO;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID == null ? null : UUID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public Integer getSEX() {
        return SEX;
    }

    public void setSEX(Integer SEX) {
        this.SEX = SEX;
    }

    public String getIDCARED() {
        return IDCARED;
    }

    public void setIDCARED(String IDCARED) {
        this.IDCARED = IDCARED == null ? null : IDCARED.trim();
    }

    public Date getBORN() {
        return BORN;
    }

    public void setBORN(Date BORN) {
        this.BORN = BORN;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS == null ? null : ADDRESS.trim();
    }

    public Integer getISBEAUTY() {
        return ISBEAUTY;
    }

    public void setISBEAUTY(Integer ISBEAUTY) {
        this.ISBEAUTY = ISBEAUTY;
    }

    public Integer getISCHU() {
        return ISCHU;
    }

    public void setISCHU(Integer ISCHU) {
        this.ISCHU = ISCHU;
    }

    public String getMAJOR() {
        return MAJOR;
    }

    public void setMAJOR(String MAJOR) {
        this.MAJOR = MAJOR == null ? null : MAJOR.trim();
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL == null ? null : TEL.trim();
    }

    public byte[] getPHOTO() {
        return PHOTO;
    }

    public void setPHOTO(byte[] PHOTO) {
        this.PHOTO = PHOTO;
    }
}