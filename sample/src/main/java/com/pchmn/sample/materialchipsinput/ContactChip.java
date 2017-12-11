package com.pchmn.sample.materialchipsinput;


import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.pchmn.materialchips.model.ChipAvatarUpdatable;
import com.pchmn.materialchips.model.ChipInterface;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactChip implements ChipInterface, ChipAvatarUpdatable {

    private String id;
    private Uri avatarUri;
    private String name;
    private String phoneNumber;

    public ContactChip(String id, Uri avatarUri, String name, String phoneNumber) {
        this.id = id;
        this.avatarUri = avatarUri;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public Uri getAvatarUri() {
        return avatarUri;
    }

    @Override
    public Drawable getAvatarDrawable() {
        return null;
    }

    @Override
    public String getLabel() {
        return name;
    }

    @Override
    public String getInfo() {
        return phoneNumber;
    }

    @Override
    public void currentImageView(CircleImageView avatarImage) {
        Glide.with(avatarImage.getContext())
                .asBitmap()
                .load(avatarUri)
                .into(avatarImage);
        Log.d("UpdateImage", "***************** UPDATE IMAGE Called *****************");
    }
}
