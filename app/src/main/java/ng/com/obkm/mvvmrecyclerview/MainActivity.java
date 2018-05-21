package ng.com.obkm.mvvmrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ng.com.obkm.mvvmrecyclerview.adapter.CustomAdapter;
import ng.com.obkm.mvvmrecyclerview.viewmodel.NewsModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<NewsModel> newsList;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsList = new ArrayList<>();

        setData();
        customAdapter = new CustomAdapter(newsList);
        recyclerView.setAdapter(customAdapter);


    }


    private void setData() {
        NewsModel newsModel = new NewsModel();
        newsModel.Title = "Fist Title";
        newsModel.Desc = "This is first title";
        newsList.add(newsModel);

        NewsModel newsModel1 = new NewsModel();
        newsModel1.Title = "Second Title";
        newsModel1.Desc = "This is second title";
        newsList.add(newsModel1);

        NewsModel newsModel2 = new NewsModel();
        newsModel2.Title = "Second Title";
        newsModel2.Desc = "This is second title";
        newsList.add(newsModel2);

        NewsModel newsModel3 = new NewsModel();
        newsModel3.Title = "Third Title";
        newsModel3.Desc = "This is third title";
        newsList.add(newsModel3);

        NewsModel newsModel4 = new NewsModel();
        newsModel4.Title = "Fourth Title";
        newsModel4.Desc = "This is fourth title";
        newsList.add(newsModel4);

        NewsModel newsModel5 = new NewsModel();
        newsModel5.Title = "Fifth Title";
        newsModel5.Desc = "This is fifth title";
        newsList.add(newsModel5);

        NewsModel newsModel6 = new NewsModel();
        newsModel6.Title = "Sixth Title";
        newsModel6.Desc = "This is sixth title";
        newsList.add(newsModel6);

        NewsModel newsModel7 = new NewsModel();
        newsModel7.Title = "Seventh Title";
        newsModel7.Desc = "This is seventh title";
        newsList.add(newsModel7);
    }


}
