package org.fantasygold.wallet.ui.fragment.about_fragment;

import org.fantasygold.wallet.model.Version;
import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentView;

public interface AboutView extends BaseFragmentView {
    void updateVersion(Version version);
}
