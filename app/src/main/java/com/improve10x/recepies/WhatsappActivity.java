package com.improve10x.recepies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class WhatsappActivity extends AppCompatActivity {
    public WhatsappItems[] whatsappItems;
    public WhatsAppAdapter WhatsAppAdapter;
    ListView whatsappListviewLv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);
        inItViews();
        whatsAppChatData();
        setUpAdapter();
        connectAdapter();
    }

    private void inItViews() {
        whatsappListviewLv = findViewById(R.id.whatsapp_listview_lv);
    }

    private void connectAdapter() {
        whatsappListviewLv.setAdapter(WhatsAppAdapter);

    }

    private void setUpAdapter() {
        WhatsAppAdapter = new WhatsAppAdapter(this,R.layout.whatsappitems,whatsappItems);
    }

    public void whatsAppChatData(){
        whatsappItems = new WhatsappItems[4];

        WhatsappItems chat1 = new WhatsappItems();
        chat1.imageUrl = "https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        chat1.mainHeading = "Whitmans Chat";
        chat1.subHeading = "Ned: Yeah,I think I know what....";
        chat1.timeAndDay = "11:45 AM";
        chat1.unReadMessage = "3";
        whatsappItems[0] = chat1;

        WhatsappItems chat2 = new WhatsappItems();
        chat2.imageUrl = "https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        chat2.mainHeading = "Stewart Family";
        chat2.subHeading = "Steve: Great, thanks!";
        chat2.timeAndDay = "11:39 AM";
        chat2.unReadMessage = "1";
        whatsappItems[1] = chat2;

        WhatsappItems chat3 = new WhatsappItems();
        chat3.imageUrl = "https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        chat3.mainHeading = "Alice Whitan";
        chat3.subHeading = "Image";
        chat3.timeAndDay = "YESTERDAY";
        chat3.unReadMessage = "";
        whatsappItems[2] = chat3;

        WhatsappItems chat4 = new WhatsappItems();
        chat4.imageUrl = "https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        chat4.mainHeading = "Jack Whitan";
        chat4.subHeading = "0:07";
        chat4.timeAndDay = "FRIDAY";
        chat4.unReadMessage = "";
        whatsappItems[3] = chat4;
    }
}