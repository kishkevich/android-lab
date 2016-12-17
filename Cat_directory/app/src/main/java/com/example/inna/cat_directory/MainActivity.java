package com.example.inna.cat_directory;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList cat_details = getListData();
        final ListView lv = (ListView) findViewById(R.id.listCat);
        lv.setAdapter(new ListAdapter(this, cat_details));
        lv.getAdapter();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                 (position == 0){
                intent.putExtra("CatsInfo", new CatsInfo ("Экзотическая кошка", getResources().getString(R.string.catInfo_1) , getResources().getString(R.string.catCharacter_1)));
                startActivity(intent);}
                if (position == 1){
                    intent.putExtra("CatsInfo", new CatsInfo ("Персидиские кошки",getResources().getString(R.string.catInfo_2), getResources().getString(R.string.catCharacter_2)));
                    startActivity(intent);}
                if (position == 2){
                    intent.putExtra("CatsInfo", new CatsInfo ("Мейн-кун", getResources().getString(R.string.catInfo_3), getResources().getString(R.string.catCharacter_3)));
                    startActivity(intent);}
                if (position == 3){
                    intent.putExtra("CatsInfo", new CatsInfo ("Рэгдолл", getResources().getString(R.string.catInfo_4), getResources().getString(R.string.catCharacter_4)));
                    startActivity(intent);}
                if (position == 4){
                    intent.putExtra("CatsInfo", new CatsInfo ("Британская короткошерстная", getResources().getString(R.string.catInfo_5), getResources().getString(R.string.catCharacter_5)));
                    startActivity(intent);}
                if (position == 5){
                    intent.putExtra("CatsInfo", new CatsInfo ("Американская короткошерстная", getResources().getString(R.string.catInfo_6), getResources().getString(R.string.catCharacter_6)));
                    startActivity(intent);}
                if (position == 6){
                    intent.putExtra("CatsInfo", new CatsInfo ("Шотладская вислоухая", getResources().getString(R.string.catInfo_7),  getResources().getString(R.string.catCharacter_7)));
                    startActivity(intent);}
                if (position == 7){
                    intent.putExtra("CatsInfo", new CatsInfo ("Абиссинская кошка", getResources().getString(R.string.catInfo_8), getResources().getString(R.string.catCharacter_8)));
                    startActivity(intent);}
                if (position == 8){
                    intent.putExtra("CatsInfo", new CatsInfo ("Ориентальная кошка", getResources().getString(R.string.catInfo_9), getResources().getString(R.string.catCharacter_9)));
                    startActivity(intent);}
                if (position == 9){
                    intent.putExtra("CatsInfo", new CatsInfo ("Девон-рекс", getResources().getString(R.string.catInfo_10), getResources().getString(R.string.catCharacter_10)));
                    startActivity(intent);}
                if (position == 10){
                    intent.putExtra("CatsInfo", new CatsInfo ("Сиамская", getResources().getString(R.string.catInfo_11), getResources().getString(R.string.catCharacter_11)));
                    startActivity(intent);}
                if (position == 11){
                    intent.putExtra("CatsInfo", new CatsInfo ("Корниш-рекс", getResources().getString(R.string.catInfo_12), getResources().getString(R.string.catCharacter_12)));
                    startActivity(intent);}
                if (position == 12){
                    intent.putExtra("CatsInfo", new CatsInfo ("Норвежская лесная", getResources().getString(R.string.catInfo_13), getResources().getString(R.string.catCharacter_13)));
                    startActivity(intent);}
                if (position == 13){
                    intent.putExtra("CatsInfo", new CatsInfo ("Бирманская", getResources().getString(R.string.catInfo_14), getResources().getString(R.string.catCharacter_14)));
                    startActivity(intent);}
                if (position == 14){
                    intent.putExtra("CatsInfo", new CatsInfo ("Русская голубая", getResources().getString(R.string.catInfo_15), getResources().getString(R.string.catCharacter_15)));
                    startActivity(intent);}
                if (position == 15){
                    intent.putExtra("CatsInfo", new CatsInfo ("Тонкинская", getResources().getString(R.string.catInfo_16), getResources().getString(R.string.catCharacter_16)));
                    startActivity(intent);}
                if (position == 16){
                    intent.putExtra("CatsInfo", new CatsInfo ("Сибирская", getResources().getString(R.string.catInfo_17), getResources().getString(R.string.catCharacter_17)));
                    startActivity(intent);}
                if (position == 17){
                    intent.putExtra("CatsInfo", new CatsInfo ("Бурманская", getResources().getString(R.string.catInfo_18), getResources().getString(R.string.catCharacter_18)));
                    startActivity(intent);}
                if (position == 18){
                    intent.putExtra("CatsInfo", new CatsInfo ("Оцикет", getResources().getString(R.string.catInfo_19), getResources().getString(R.string.catCharacter_19)));
                    startActivity(intent);}
            }
        });
    }


 /*   private ArrayList<String> getListOfdescription(){
        ArrayList<String> catInfo = new ArrayList<>();
        catInfo.add(getResources().getString(R.string.catInfo_1));
        catInfo.add(getResources().getString(R.string.catInfo_2));
        catInfo.add(getResources().getString(R.string.catInfo_3));
        catInfo.add(getResources().getString(R.string.catInfo_4));
        catInfo.add(getResources().getString(R.string.catInfo_5));
        catInfo.add(getResources().getString(R.string.catInfo_6));
        catInfo.add(getResources().getString(R.string.catInfo_7));
        catInfo.add(getResources().getString(R.string.catInfo_8));
        catInfo.add(getResources().getString(R.string.catInfo_9));
        catInfo.add(getResources().getString(R.string.catInfo_10));
        catInfo.add(getResources().getString(R.string.catInfo_11));
        catInfo.add(getResources().getString(R.string.catInfo_12));
        catInfo.add(getResources().getString(R.string.catInfo_13));
        catInfo.add(getResources().getString(R.string.catInfo_14));
        catInfo.add(getResources().getString(R.string.catInfo_15));
        catInfo.add(getResources().getString(R.string.catInfo_16));
        catInfo.add(getResources().getString(R.string.catInfo_17));
        catInfo.add(getResources().getString(R.string.catInfo_18));
        catInfo.add(getResources().getString(R.string.catInfo_19));
        return catInfo;}
    private ArrayList<String> getListdescription(){
        ArrayList<String> catCharacter = new ArrayList<>();
        catCharacter.add(getResources().getString(R.string.catCharacter_1));
        catCharacter.add(getResources().getString(R.string.catCharacter_2));
        catCharacter.add(getResources().getString(R.string.catCharacter_3));
        catCharacter.add(getResources().getString(R.string.catCharacter_4));
        catCharacter.add(getResources().getString(R.string.catCharacter_5));
        catCharacter.add(getResources().getString(R.string.catCharacter_6));
        catCharacter.add(getResources().getString(R.string.catCharacter_7));
        catCharacter.add(getResources().getString(R.string.catCharacter_8));
        catCharacter.add(getResources().getString(R.string.catCharacter_9));
        catCharacter.add(getResources().getString(R.string.catCharacter_10));
        catCharacter.add(getResources().getString(R.string.catCharacter_11));
        catCharacter.add(getResources().getString(R.string.catCharacter_12));
        catCharacter.add(getResources().getString(R.string.catCharacter_13));
        catCharacter.add(getResources().getString(R.string.catCharacter_14));
        catCharacter.add(getResources().getString(R.string.catCharacter_15));
        catCharacter.add(getResources().getString(R.string.catCharacter_16));
        catCharacter.add(getResources().getString(R.string.catCharacter_17));
        catCharacter.add(getResources().getString(R.string.catCharacter_18));
        catCharacter.add(getResources().getString(R.string.catCharacter_19));
        return catCharacter;}*/
    private ArrayList getListData() {
        ArrayList<ListItem> results = new ArrayList<ListItem>();
        ListItem catsData = new ListItem();
        catsData.setCatName("Экзотическая кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Персидская кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Мейн-кун");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Рэгдолл");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Британская короткошёрстная кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Американская короткошёрстная кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Шотландская вислоухая");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Абиссинская кошка ");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Ориентальная кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Девон-рекс");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Сиамская кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Корниш-рекс");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Норвежская лесная кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Бирманская кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Русская голубая");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Тонкинская кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Сибирская кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Бурманская кошка");
        results.add(catsData);

        catsData = new ListItem();
        catsData.setCatName("Оцикет");
        results.add(catsData);

        return results;
    }

}

