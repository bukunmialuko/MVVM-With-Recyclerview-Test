package ng.com.obkm.mvvmrecyclerview.model;

public class News {

    public String Title;
    public String Desc;

    public News() {
    }

    public News(String title, String desc) {
        Title = title;
        Desc = desc;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
