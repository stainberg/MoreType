package com.werb.moretype.main

import android.app.Activity
import android.view.View
import com.werb.library.MoreViewHolder
import com.werb.moretype.anim.AnimActivity
import com.werb.moretype.click.ItemClickActivity
import com.werb.moretype.complete.CompleteActivity
import com.werb.moretype.me.AboutMeActivity
import com.werb.moretype.multi.MultiRegisterActivity
import com.werb.moretype.single.SingleRegisterActivity
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_view_main.*

/**
 * Created by wanbo on 2017/7/14.
 */
class MainCardViewHolder(containerView: View) : MoreViewHolder<MainCard>(containerView), LayoutContainer {

    override fun bindData(data: MainCard, payloads: List<Any>) {

        card_playLoad.tag = false

        // user payloads we can update any view we want
        if (payloads.isNotEmpty()) {
            payloads.forEach {
                if (it is PayLoadOne) {
                    if (it.load) {
                        card_title.text = "PayLoadOne any view you want"
                        card_desc.text = "Payloads will be empty"

                    } else {
                        card_title.text = data.cardTitle
                        card_desc.text = data.cardDesc
                        card_playLoad.tag = true
                    }
                }
            }
        } else {
            card_title.text = data.cardTitle
            card_desc.text = data.cardDesc
        }

        addOnClickListener(card_playLoad)

        main_card_layout.setOnClickListener {
            when (layoutPosition) {
                0 -> {
                    SingleRegisterActivity.startActivity(containerView.context as Activity)
                }
                1 -> {
                    MultiRegisterActivity.startActivity(containerView.context as Activity)
                }
                2 -> {
                    AnimActivity.startActivity(containerView.context as Activity)
                }
                3 -> {
                    ItemClickActivity.startActivity(containerView.context as Activity)
                }
                4 -> {
                    CompleteActivity.startActivity(containerView.context as Activity)
                }
                5 -> {
                    AboutMeActivity.startActivity(containerView.context as Activity)
                }
                else -> {

                }
            }
        }
    }
}