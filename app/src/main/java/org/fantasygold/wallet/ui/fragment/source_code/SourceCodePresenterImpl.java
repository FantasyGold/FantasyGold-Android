package org.fantasygold.wallet.ui.fragment.source_code;

import org.fantasygold.wallet.ui.base.base_fragment.BaseFragmentPresenterImpl;

public class SourceCodePresenterImpl extends BaseFragmentPresenterImpl implements SourceCodePresenter {
    SourceCodeInteractor mSourceCodeInteractor;
    SourceCodeView mSourceCodeView;

    SourceCodePresenterImpl(SourceCodeView sourceCodeView, SourceCodeInteractor sourceCodeInteractor) {
        mSourceCodeInteractor = sourceCodeInteractor;
        mSourceCodeView = sourceCodeView;
    }

    @Override
    public SourceCodeView getView() {
        return mSourceCodeView;
    }
}
