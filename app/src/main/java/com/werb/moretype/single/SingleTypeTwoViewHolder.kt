package com.werb.moretype.single

import android.view.View
import com.werb.library.MoreViewHolder
import kotlinx.android.synthetic.main.item_view_single_type_two.*

/**
 * Created by wanbo on 2017/7/14.
 */
class SingleTypeTwoViewHolder(containerView: View) : MoreViewHolder<SingleImage>(containerView) {

    override fun bindData(data: SingleImage, payloads: List<Any>) {
        title.text = data.title
        icon.setImageURI(data.url)
    }
}