package Assignment5;

public class News implements INews{
//    public class News(){
//
//    }
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;
    int [] RateList = new int[3];

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }


    public float getAverageRate() {
        return AverageRate;
    }

    public News(int ID, String title, String publishDate, String author, String content) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
    }

    @Override
    public void Display() {
        System.out.println(ID);
        System.out.println(Title);
        System.out.println(PublishDate);
        System.out.println(Author);
        System.out.println(Content);
        System.out.println(AverageRate);
    }
    public News Calculate(){
        float t = 0;
        for (int r:RateList){
            t+=r;
        }
        AverageRate = t/3;
        return this;
    }
}
