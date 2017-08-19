package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
public void search(View view) {

        EditText searchTextField = (EditText) findViewById(R.id.search_text_view);
        String searchText = searchTextField.getText().toString();

    displaySearchResult("No search results for "+searchText);
}


    //    Displays the answer to the screen
    public void displaySearchResult(String result) {

        TextView searchTextView = (TextView) findViewById(R.id.search_result);

        searchTextView.setText(result);
    }
}