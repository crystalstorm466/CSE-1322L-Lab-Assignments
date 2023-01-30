package Lab05;

public class Periodical extends Item {

    private int issueNum;

    public int getIssueNum() { return issueNum; }
    public void setIssueNum(int issueNum) { this.issueNum = issueNum; }

    public Periodical() {
        issueNum = 0;
    }

    public Periodical(String title, int issueNum) {
        super.setTitle(title);
        this.issueNum = issueNum;
    }

    @Override
    public String getListing() {
        String list = ("Periodical Title - " + getTitle() + "\n" +
                "Issue # - " + issueNum);
        return list;
    }

}