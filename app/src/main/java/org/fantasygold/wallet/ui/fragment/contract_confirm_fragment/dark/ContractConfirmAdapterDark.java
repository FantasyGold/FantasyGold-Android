package org.fantasygold.wallet.ui.fragment.contract_confirm_fragment.dark;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.fantasygold.wallet.model.contract.ContractMethodParameter;
import org.fantasygold.wallet.ui.fragment.contract_confirm_fragment.ContractConfirmAdapter;
import org.fantasygold.wallet.ui.fragment.contract_confirm_fragment.ContractConfirmFooterViewHolder;
import org.fantasygold.wallet.ui.fragment.contract_confirm_fragment.ContractConfirmViewHolder;
import org.fantasygold.wallet.ui.fragment.contract_confirm_fragment.OnValueClick;

import java.util.List;

public class ContractConfirmAdapterDark extends ContractConfirmAdapter {
    public ContractConfirmAdapterDark(List<ContractMethodParameter> params, String mineAddress, OnValueClick clickListener) {
        super(params, mineAddress, clickListener);
    }

    @Override
    protected RecyclerView.ViewHolder getItemView(LayoutInflater inflater, ViewGroup parent) {
        return new ContractConfirmViewHolder(LayoutInflater.from(parent.getContext()).inflate(org.fantasygold.wallet.R.layout.lyt_confirm_list_item, parent, false), clickListener);
    }

    @Override
    protected RecyclerView.ViewHolder getFooterView(LayoutInflater inflater, ViewGroup parent) {
        return new ContractConfirmFooterViewHolder(LayoutInflater.from(parent.getContext()).inflate(org.fantasygold.wallet.R.layout.lyt_confirm_list_footer, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ContractConfirmViewHolder) {
            ((ContractConfirmViewHolder) holder).bind(getItem(position));
        } else if (holder instanceof ContractConfirmFooterViewHolder) {
            ((ContractConfirmFooterViewHolder) holder).bind(mineAddress);
        }
    }
}
