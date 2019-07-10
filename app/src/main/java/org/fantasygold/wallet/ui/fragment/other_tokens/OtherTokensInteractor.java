package org.fantasygold.wallet.ui.fragment.other_tokens;

import org.fantasygold.wallet.model.contract.Token;

import java.util.List;

import rx.Observable;

public interface OtherTokensInteractor {
    Observable<List<Token>> getTokenObservable();
}
