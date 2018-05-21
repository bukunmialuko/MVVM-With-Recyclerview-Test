package ng.com.obkm.mvvmrecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import ng.com.obkm.mvvmrecyclerview.databinding.NewsBinding;
import ng.com.obkm.mvvmrecyclerview.viewmodel.NewsModel;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {

    List<NewsModel> newsList;
    private LayoutInflater layoutInflater;

    public CustomAdapter(List<NewsModel> newsList) {
        this.newsList = newsList;
    }

    @Override
    public CustomView onCreateViewHolder(ViewGroup parent, int viewType) {

        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater, parent, false);

        return new CustomView(newsBinding);
    }

    @Override
    public void onBindViewHolder(CustomView holder, int position) {
        NewsModel newsModel = newsList.get(position);
        holder.bind(newsModel);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }


    public class CustomView extends RecyclerView.ViewHolder {

        private NewsBinding newsBinding;

        public CustomView(NewsBinding newsBinding) {
            super(newsBinding.getRoot());
            this.newsBinding = newsBinding;
        }

        public void bind(NewsModel newsModel) {
            this.newsBinding.setNewsView(newsModel);
        }

        public NewsBinding getNewsBinding() {
            return newsBinding;
        }
    }
}
