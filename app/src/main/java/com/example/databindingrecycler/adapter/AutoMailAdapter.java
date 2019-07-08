package com.example.databindingrecycler.adapter;

import androidx.databinding.DataBindingUtil;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.databindingrecycler.R;
import com.example.databindingrecycler.databinding.ItemBinding;
import com.example.databindingrecycler.entity.AutoMailEntity;

import java.util.List;

public class AutoMailAdapter extends BaseQuickAdapter<AutoMailEntity.DateBean, BaseViewHolder> {
    public AutoMailAdapter(List<AutoMailEntity.DateBean> data) {
        super(R.layout.item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, AutoMailEntity.DateBean item) {
        ItemBinding itemBinding = DataBindingUtil.bind(helper.itemView);
        itemBinding.setMail(item);
        itemBinding.executePendingBindings();
    }
}
