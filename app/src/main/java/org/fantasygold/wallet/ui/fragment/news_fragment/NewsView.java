package org.fantasygold.wallet.ui.fragment.news_fragment;

import org.fantasygold.wallet.model.news.News;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

import java.util.List;

public interface NewsView extends BaseFragmentView {
    void startRefreshAnimation();

    void setAdapterNull();

    void updateNews(List<News> newses);

    void stopRefreshRecyclerAnimation();
}