package com.improve10x.recepies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class RecepiesActivity extends AppCompatActivity {

    public RecipeItem[] recipeItems;
    public RecipeItemsAdpater recipeItemsAdpater;
    ListView listLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepies);
        addRecipeData();
        handleInitViews();
        setUpAdapter();
        connectAdapter();
    }

    private void handleInitViews() {
        listLv = findViewById(R.id.list_lv);
    }

    private void connectAdapter() {
        listLv.setAdapter(recipeItemsAdpater);


    }

    private void setUpAdapter() {
        recipeItemsAdpater = new RecipeItemsAdpater(this, R.layout.recepie_item, recipeItems);
    }

    private void addRecipeData() {
        recipeItems = new RecipeItem[6];
        RecipeItem item = new RecipeItem();
        item.imageUrl = "https://www.tastingtable.com/img/gallery/the-12-biggest-mistakes-youre-making-with-croissants/l-intro-1674236683.jpg";
        item.heading = "Crunchy Croissants";
        item.subHeading = "Butter,flaky pastry named for its crescent shape";
        item.serialNumber = "01";
        recipeItems[0] = item;

        RecipeItem item1 = new RecipeItem();
        item1.imageUrl = "https://cookingontheweekends.com/wp-content/uploads/2014/06/June-1-Herb-Grilled-Elephant-Garlic-Recipe1.jpg";
        item1.heading = "Grilled Eggplant";
        item1.subHeading = "Tender with a rich, complex flavor when cooked";
        item1.serialNumber = "02";
        recipeItems[1] = item1;

        RecipeItem item2 = new RecipeItem();
        item2.imageUrl = "https://thedinnerbell.recipes/wp-content/uploads/2020/06/Spinach-Salad-with-Mandarin-Oranges-4.jpg";
        item2.heading = "Tangerine salad";
        item2.subHeading = "Peak tangerine season lasts from autumn to spring";
        item2.serialNumber = "03";
        recipeItems[2] = item2;

        RecipeItem item3 = new RecipeItem();
        item3.imageUrl = "https://www.verywellhealth.com/thmb/ma6xLUqQNYhLJkn9ut40Z2madrM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/pomegranate-2cb572289dc44d08a97e33b32df8b967.jpg";
        item3.heading = "Pomegranate Juice";
        item3.subHeading = "A superfood for good skin, hair and health";
        item3.serialNumber = "04";
        recipeItems[3] = item3;

        RecipeItem item4 = new RecipeItem();
        item4.imageUrl = "https://www.muydelish.com/wp-content/uploads/2022/01/easy-salsa-recipe-480x270.jpg";
        item4.heading = "Chili Salsa";
        item4.subHeading = "Heat up any taco night with minimal preparation";
        item4.serialNumber = "05";
        recipeItems[4] = item4;

        RecipeItem item5 = new RecipeItem();
        item5.imageUrl = "https://www.sufficientself.com/attachments/immo-wegmann-8cyl4wgzsq4-unsplash-jpg.18697/";
        item5.heading = "Flour from scratch";
        item5.subHeading = "Grind grains, nuts, or beans in your coffeegrinder.";
        item5.serialNumber = "06";
        recipeItems[5] = item5;
    }
}


