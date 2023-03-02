package com.improve10x.recepies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class WhatsAppAdapter extends ArrayAdapter<WhatsappItems> {
    public WhatsAppAdapter(@NonNull Context context, int resource, @NonNull WhatsappItems[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        WhatsappItems chat = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.whatsappitems, parent, false);
        TextView chatnameTxt = view.findViewById(R.id.chatname_txt);
        chatnameTxt.setText(chat.mainHeading);
        TextView chattingTxt = view.findViewById(R.id.chatting_txt);
        chattingTxt.setText(chat.subHeading);
        TextView unreadTxt = view.findViewById(R.id.unread_txt);
        unreadTxt.setText(chat.unReadMessage);
        TextView dayandtimeTxt = view.findViewById(R.id.dayandtime_txt);
        dayandtimeTxt.setText(chat.timeAndDay);
        ImageView dpIv = view.findViewById(R.id.dp_iv);
        Picasso.get().load(chat.imageUrl).into(dpIv);
        return view;
    }
}

