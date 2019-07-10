package org.fantasygold.wallet.ui.fragment.overview_fragment.dark;


import android.util.Pair;

import org.fantasygold.wallet.R;
import org.fantasygold.wallet.ui.fragment.overview_fragment.CopyableOverviewItem;
import org.fantasygold.wallet.ui.fragment.overview_fragment.OverviewFragment;

import java.util.List;

public class OverviewFragmentDark extends OverviewFragment {

    @Override
    protected int getLayout() {
        return R.layout.fragment_overview;
    }

    @Override
    public void setUpOverview(List<CopyableOverviewItem> overview) {
        mOverviewAdapter = new OverviewAdapter(overview, R.layout.item_overview);
        mRecyclerViewOverview.setAdapter(mOverviewAdapter);
    }

}
