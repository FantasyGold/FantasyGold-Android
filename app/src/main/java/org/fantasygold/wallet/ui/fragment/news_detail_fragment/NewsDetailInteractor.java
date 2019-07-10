package org.fantasygold.wallet.ui.fragment.news_detail_fragment;

import org.fantasygold.wallet.model.news.News;

public interface NewsDetailInteractor {
    News getNews(int newsPosition);
}
