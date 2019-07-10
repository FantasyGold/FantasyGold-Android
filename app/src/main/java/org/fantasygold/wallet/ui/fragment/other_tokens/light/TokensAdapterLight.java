package org.fantasygold.wallet.ui.fragment.other_tokens.light;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.fantasygold.wallet.R;
import org.fantasygold.wallet.model.contract.Token;
import org.fantasygold.wallet.ui.fragment.other_tokens.OnTokenClickListener;
import org.fantasygold.wallet.ui.fragment.other_tokens.TokenViewHolder;
import org.fantasygold.wallet.ui.fragment.other_tokens.TokensAdapter;
import org.fantasygold.wallet.ui.fragment.other_tokens.UpdateSocketInstance;

import java.util.List;

public class TokensAdapterLight extends TokensAdapter {

    public TokensAdapterLight(List<Token> tokens, UpdateSocketInstance socketInstance, OnTokenClickListener listener) {
        super(tokens, socketInstance, listener);
    }

    @Override
    public TokenViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TokenViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.lyt_token_list_item_light, parent, false), socketInstace, parent.getContext(), listener);
    }

    @Override
    public void onBindViewHolder(TokenViewHolder holder, int position) {
        holder.bind(tokens.get(position));
    }
}
