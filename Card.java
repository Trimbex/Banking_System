public class Card
{

    int CardNo;
    int CCV;
    String ExpDate;

    public Card(int cardNo, int CCV, String expDate) {
        CardNo = cardNo;
        this.CCV = CCV;
        ExpDate = expDate;
    }

    public int getCardNo() {
        return CardNo;
    }

    public void setCardNo(int cardNo) {
        CardNo = cardNo;
    }

    public int getCCV() {
        return CCV;
    }

    public void setCCV(int CCV) {
        this.CCV = CCV;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String expDate) {
        ExpDate = expDate;
    }

}
